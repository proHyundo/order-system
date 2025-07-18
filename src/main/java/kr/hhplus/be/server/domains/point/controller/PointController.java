package kr.hhplus.be.server.domains.point.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
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

@Tag(name = "Point", description = "포인트 관리 API")
@RestController
@RequestMapping("/api/point")
public class PointController {

    @Operation(summary = "포인트 충전", description = "사용자의 포인트을 충전합니다.")
    @PostMapping("/charge")
    public ResponseEntity<PointChargeResponse> chargePoint(
            @Valid @RequestBody PointChargeRequest request) {

        // TODO: Service 레이어에서 비즈니스 로직 처리
        PointChargeResponse response = PointChargeResponse.builder()
                .userId(request.getUserId())
                .chargedAmount(request.getAmount())
                .totalPoint(request.getAmount()) // 임시 값
                .build();

        return ResponseEntity.ok(response);
    }

    @Operation(summary = "포인트 조회", description = "사용자의 현재 포인트을 조회합니다.")
    @GetMapping("/{userId}")
    public ResponseEntity<PointGetResponse> getPoint(
            @Parameter(description = "사용자 ID", required = true)
            @PathVariable Long userId) {

        // TODO: Service 레이어에서 비즈니스 로직 처리
        PointGetResponse response = PointGetResponse.builder()
                .userId(userId)
                .point(0L) // 임시 값
                .build();

        return ResponseEntity.ok(response);
    }
}
