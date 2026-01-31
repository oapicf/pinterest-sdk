package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductGroupPromotionCreateRequest.
  * @param adGroupId ID of the Ad Group the Product Group Promotion belongs to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProductGroupPromotionCreateRequest(
  adGroupId: String,
  productGroupPromotion: List[ProductGroupPromotion]
)

object ProductGroupPromotionCreateRequest {
  implicit lazy val productGroupPromotionCreateRequestJsonFormat: Format[ProductGroupPromotionCreateRequest] = Json.format[ProductGroupPromotionCreateRequest]
}

