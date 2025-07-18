package kr.hhplus.be.server.domains.product.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.hhplus.be.server.domains.product.controller.res.ProductGetResponse;
import kr.hhplus.be.server.domains.product.controller.res.ProductListResponse;
import kr.hhplus.be.server.domains.product.controller.res.TopProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Tag(name = "Product", description = "상품 관리 API")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Operation(summary = "상품 목록 조회", description = "전체 상품 목록을 조회합니다.")
    @GetMapping
    public ResponseEntity<ProductListResponse> getProducts() {
        
        // TODO: Service 레이어에서 비즈니스 로직 처리
        List<ProductGetResponse> products = new ArrayList<>();
        
        ProductListResponse response = ProductListResponse.builder()
                .products(products)
                .totalCount(0)
                .build();
        
        return ResponseEntity.ok(response);
    }

    @Operation(summary = "상품 상세 조회", description = "상품 ID로 상품 정보를 조회합니다.")
    @GetMapping("/{productId}")
    public ResponseEntity<ProductGetResponse> getProduct(
            @Parameter(description = "상품 ID", required = true)
            @PathVariable Long productId) {
        
        // TODO: Service 레이어에서 비즈니스 로직 처리
        ProductGetResponse response = ProductGetResponse.builder()
                .id(productId)
                .name("상품명")
                .price(10000L)
                .stock(100)
                .build();
        
        return ResponseEntity.ok(response);
    }

    @Operation(summary = "인기 상품 조회", description = "최근 3일간 가장 많이 팔린 상위 5개 상품을 조회합니다.")
    @GetMapping("/top")
    public ResponseEntity<TopProductResponse> getTopProducts() {
        
        // TODO: Service 레이어에서 비즈니스 로직 처리
        List<ProductGetResponse> topProducts = new ArrayList<>();
        
        TopProductResponse response = TopProductResponse.builder()
                .products(topProducts)
                .period("최근 3일")
                .build();
        
        return ResponseEntity.ok(response);
    }

}
