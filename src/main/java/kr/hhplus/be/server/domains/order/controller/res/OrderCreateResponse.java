package kr.hhplus.be.server.domains.order.controller.res;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "주문 생성 응답")
public class OrderCreateResponse {

    @Schema(description = "주문 ID", example = "1")
    private Long orderId;

    @Schema(description = "사용자 ID", example = "1")
    private Long userId;

    @Schema(description = "총 주문 금액", example = "20000")
    private Long totalAmount;

    @Schema(description = "할인 금액", example = "5000")
    private Long discountAmount;

    @Schema(description = "최종 결제 금액", example = "15000")
    private Long finalAmount;

    @Schema(description = "주문 상태", example = "COMPLETED")
    private String orderStatus;

    @Schema(description = "주문 생성 시간", example = "2024-01-01T12:00:00")
    private LocalDateTime createdAt;

    @Schema(description = "주문 결과 메시지", example = "주문이 성공적으로 완료되었습니다.")
    private String message;

    @Schema(description = "주문 상품 목록")
    private List<OrderItemResponse> orderItems;
}
