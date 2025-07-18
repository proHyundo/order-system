package kr.hhplus.be.server.domains.order.controller.req;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "주문 생성 요청")
public class OrderCreateRequest {

    @Schema(description = "사용자 ID", required = true, example = "1")
    @NotNull(message = "사용자 ID는 필수입니다.")
    private Long userId;

    @Schema(description = "주문 상품 목록", required = true)
    @Valid
    @NotEmpty(message = "주문 상품 목록은 필수입니다.")
    private List<OrderItemRequest> orderItems;

    @Schema(description = "사용할 쿠폰 ID (선택사항)", example = "1")
    private Long couponId;
}
