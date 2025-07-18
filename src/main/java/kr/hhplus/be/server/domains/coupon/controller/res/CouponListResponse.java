package kr.hhplus.be.server.domains.coupon.controller.res;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "사용자 쿠폰 목록 응답")
public class CouponListResponse {

    @Schema(description = "사용자 ID", example = "1")
    private Long userId;

    @Schema(description = "보유 쿠폰 목록")
    private List<CouponResponse> coupons;

    @Schema(description = "총 쿠폰 개수", example = "3")
    private Integer totalCount;
}
