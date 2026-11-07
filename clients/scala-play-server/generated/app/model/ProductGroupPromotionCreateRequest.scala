package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductGroupPromotionCreateRequest.
  * @param adGroupId ID of the Ad Group the Product Group Promotion belongs to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProductGroupPromotionCreateRequest(
  adGroupId: String,
  productGroupPromotion: List[ProductGroupPromotion]
)

object ProductGroupPromotionCreateRequest {
  implicit lazy val productGroupPromotionCreateRequestJsonFormat: Format[ProductGroupPromotionCreateRequest] = Json.format[ProductGroupPromotionCreateRequest]
}

