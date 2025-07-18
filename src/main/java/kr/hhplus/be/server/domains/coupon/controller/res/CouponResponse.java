package kr.hhplus.be.server.domains.coupon.controller.res;

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
@Schema(description = "사용자 쿠폰 정보")
public class CouponResponse {

    @Schema(description = "사용자 쿠폰 ID", example = "1")
    private Long userCouponId;

    @Schema(description = "쿠폰 ID", example = "1")
    private Long couponId;

    @Schema(description = "쿠폰명", example = "신규 가입 축하 쿠폰")
    private String couponName;

    @Schema(description = "할인 금액", example = "5000")
    private Long discountAmount;

    @Schema(description = "사용 여부", example = "false")
    private Boolean isUsed;

    @Schema(description = "만료일", example = "2026-01-18T00:00:00")
    private LocalDateTime expiredAt;

    @Schema(description = "발급일", example = "2025-07-18T23:59:59")
    private LocalDateTime issuedAt;
}
