package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductGroupPromotionUpdateRequest.
  * @param adGroupId ID of the ad group the product group belongs to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProductGroupPromotionUpdateRequest(
  adGroupId: String,
  productGroupPromotion: List[ProductGroupPromotion]
)

object ProductGroupPromotionUpdateRequest {
  implicit lazy val productGroupPromotionUpdateRequestJsonFormat: Format[ProductGroupPromotionUpdateRequest] = Json.format[ProductGroupPromotionUpdateRequest]
}

