package kr.hhplus.be.server.domains.order.controller.res;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "주문 상품 응답")
public class OrderItemResponse {

    @Schema(description = "상품 ID", example = "1")
    private Long productId;

    @Schema(description = "상품명", example = "아이폰 16 Pro")
    private String productName;

    @Schema(description = "주문 수량", example = "2")
    private Integer quantity;

    @Schema(description = "상품 단가", example = "10000")
    private Long unitPrice;

    @Schema(description = "총 상품 금액", example = "20000")
    private Long totalPrice;
}
