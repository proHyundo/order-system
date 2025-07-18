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
@Schema(description = "인기 상품 응답")
public class TopProductResponse {

    @Schema(description = "인기 상품 목록 (상위 5개)")
    private List<ProductGetResponse> products;

    @Schema(description = "조회 기간", example = "최근 3일")
    private String period;
}
