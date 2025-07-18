package kr.hhplus.be.server.domains.product.controller.res;

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
@Schema(description = "상품 목록 응답")
public class ProductListResponse {

    @Schema(description = "상품 목록")
    private List<ProductGetResponse> products;

    @Schema(description = "총 상품 개수", example = "10")
    private Integer totalCount;
}
