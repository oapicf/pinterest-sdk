package model

import play.api.libs.json._

/**
  * Bulk campaign delivery estimates response.
  * @param data Per-campaign delivery estimate results, in the same order as the request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BulkCampaignDeliveryEstimatesResponse(
  data: List[BulkCampaignDeliveryEstimatesItem]
)

object BulkCampaignDeliveryEstimatesResponse {
  implicit lazy val bulkCampaignDeliveryEstimatesResponseJsonFormat: Format[BulkCampaignDeliveryEstimatesResponse] = Json.format[BulkCampaignDeliveryEstimatesResponse]
}

