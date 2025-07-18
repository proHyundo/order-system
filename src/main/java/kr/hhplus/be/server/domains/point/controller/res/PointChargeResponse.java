package kr.hhplus.be.server.domains.point.controller.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "포인트 충전 응답")
public class PointChargeResponse {

    @Schema(description = "사용자 ID", example = "1")
    private Long userId;

    @Schema(description = "충전된 포인트", example = "10000")
    private Long chargedAmount;

    @Schema(description = "충전 후 총 포인트", example = "15000")
    private Long totalPoint;


}
