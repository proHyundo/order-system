package kr.hhplus.be.server.domains.order.controller.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "주문 상품 정보")
public class OrderItemRequest {

    @Schema(description = "상품 ID", required = true, example = "1")
    @NotNull(message = "상품 ID는 필수입니다.")
    private Long productId;

    @Schema(description = "주문 수량", required = true, example = "2")
    @NotNull(message = "주문 수량은 필수입니다.")
    @Min(value = 1, message = "주문 수량은 1개 이상이어야 합니다.")
    private Integer quantity;

    @Schema(description = "상품 가격", required = true, example = "10000")
    @NotNull(message = "상품 가격은 필수입니다.")
    @Min(value = 0, message = "상품 가격은 0원 이상이어야 합니다.")
    private Long price;
}
