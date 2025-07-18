package kr.hhplus.be.server.domains.coupon.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import kr.hhplus.be.server.domains.coupon.controller.req.CouponIssueRequest;
import kr.hhplus.be.server.domains.coupon.controller.res.CouponIssueResponse;
import kr.hhplus.be.server.domains.coupon.controller.res.CouponListResponse;
import kr.hhplus.be.server.domains.coupon.controller.res.CouponResponse;
import kr.hhplus.be.server.domains.point.controller.req.PointChargeRequest;
import kr.hhplus.be.server.domains.point.controller.res.PointChargeResponse;
import kr.hhplus.be.server.domains.point.controller.res.PointGetResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Coupon", description = "쿠폰 관리 API")
@RestController
@RequestMapping("/api/coupons")
public class CouponController {

    @Operation(summary = "선착순 쿠폰 발급", description = "선착순으로 할인 쿠폰을 발급받습니다.")
    @PostMapping("/issue")
    public ResponseEntity<CouponIssueResponse> issueCoupon(
            @Valid @RequestBody CouponIssueRequest request) {

        // TODO: Service 레이어에서 비즈니스 로직 처리
        CouponIssueResponse response = CouponIssueResponse.builder()
                .userId(request.getUserId())
                .couponId(request.getCouponId())
                .userCouponId(1L) // 임시 값
                .discountAmount(5000L) // 임시 값
                .message("쿠폰이 성공적으로 발급되었습니다.")
                .build();

        return ResponseEntity.ok(response);
    }

    @Operation(summary = "보유 쿠폰 목록 조회", description = "사용자가 보유한 쿠폰 목록을 조회합니다.")
    @GetMapping("/users/{userId}")
    public ResponseEntity<CouponListResponse> getUserCoupons(
            @Parameter(description = "사용자 ID", required = true)
            @PathVariable Long userId) {

        // TODO: Service 레이어에서 비즈니스 로직 처리
        List<CouponResponse> coupons = new ArrayList<>();

        CouponListResponse response = CouponListResponse.builder()
                .userId(userId)
                .coupons(coupons)
                .totalCount(0)
                .build();

        return ResponseEntity.ok(response);
    }

}
