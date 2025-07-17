package kr.hhplus.be.server.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import kr.hhplus.be.server.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Product", description = "Product management APIs")
@RestController
public class ProductController {

    @GetMapping("/products")
    @Operation(summary = "코드 단건 조회", description = "코드 단건을 조회합니다.")
    @ApiResponse(responseCode = "200", description = "성공", content = @Content(schema = @Schema(implementation = Product.class)))
    public List<Product> getProducts() {
        // Logic to retrieve products
        return List.of(new Product(), new Product()); // Example products
    }
}
