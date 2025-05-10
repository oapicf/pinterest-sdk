package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductGroupPromotionCreateRequest.
  * @param adGroupId ID of the Ad Group the Product Group Promotion belongs to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class ProductGroupPromotionCreateRequest(
  adGroupId: String,
  productGroupPromotion: List[ProductGroupPromotionCreateRequestElement]
)

object ProductGroupPromotionCreateRequest {
  implicit lazy val productGroupPromotionCreateRequestJsonFormat: Format[ProductGroupPromotionCreateRequest] = Json.format[ProductGroupPromotionCreateRequest]
}

