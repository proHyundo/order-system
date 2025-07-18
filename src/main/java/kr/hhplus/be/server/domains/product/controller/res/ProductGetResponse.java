package kr.hhplus.be.server.domains.product.controller.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "상품 정보 응답")
public class ProductGetResponse {

    @Schema(description = "상품 ID", example = "1")
    private Long id;

    @Schema(description = "상품명", example = "아이폰 16 Pro")
    private String name;

    @Schema(description = "가격", example = "1200000")
    private Long price;

    @Schema(description = "재고 수량", example = "10")
    private Integer stock;
}
