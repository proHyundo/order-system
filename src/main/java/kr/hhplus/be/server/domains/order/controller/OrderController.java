package kr.hhplus.be.server.domains.order.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.hhplus.be.server.domains.order.controller.req.OrderCreateRequest;
import kr.hhplus.be.server.domains.order.controller.res.OrderCreateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import java.util.List;

@Tag(name = "Order", description = "주문 관리 API")
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Operation(summary = "주문", description = "상품을 주문합니다.")
    @PostMapping
    public ResponseEntity<OrderCreateResponse> createOrder(
            @Valid @RequestBody OrderCreateRequest request) {

        // TODO: Service 레이어에서 비즈니스 로직 처리
        // 1. 주문 생성
        // 2. 재고 차감
        // 3. 쿠폰 적용 (옵션)
        // 4. 결제 처리 (잔액 차감)
        // 5. 주문 정보 데이터 플랫폼 전송

        OrderCreateResponse response = OrderCreateResponse.builder()
                .orderId(1L) // 임시 값
                .userId(request.getUserId())
                .totalAmount(request.getOrderItems().stream()
                        .mapToLong(item -> item.getPrice() * item.getQuantity())
                        .sum())
                .discountAmount(0L) // 임시 값
                .finalAmount(request.getOrderItems().stream()
                        .mapToLong(item -> item.getPrice() * item.getQuantity())
                        .sum())
                .orderStatus("COMPLETED")
                .createdAt(LocalDateTime.now())
                .message("주문이 성공적으로 완료되었습니다.")
                .build();

        return ResponseEntity.ok(response);
    }

}
