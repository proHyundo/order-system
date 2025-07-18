package kr.hhplus.be.server.domains.coupon.controller.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "쿠폰 발급 요청")
public class CouponIssueRequest {

    @Schema(description = "사용자 ID",  example = "1")
    @NotNull(message = "사용자 ID는 필수입니다.")
    private Long userId;

    @Schema(description = "쿠폰 ID",  example = "1")
    @NotNull(message = "쿠폰 ID는 필수입니다.")
    private Long couponId;
}
