package kr.hhplus.be.server.domains.coupon.controller.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "쿠폰 발급 응답")
public class CouponIssueResponse {

    @Schema(description = "사용자 ID", example = "1")
    private Long userId;

    @Schema(description = "쿠폰 ID", example = "1")
    private Long couponId;

    @Schema(description = "사용자 쿠폰 ID", example = "1")
    private Long userCouponId;

    @Schema(description = "할인 금액", example = "5000")
    private Long discountAmount;

    @Schema(description = "발급 결과 메시지", example = "쿠폰이 성공적으로 발급되었습니다.")
    private String message;
}
