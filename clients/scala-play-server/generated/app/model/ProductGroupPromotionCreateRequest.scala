package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductGroupPromotionCreateRequest.
  * @param adGroupId ID of the Ad Group the Product Group Promotion belongs to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ProductGroupPromotionCreateRequest(
  adGroupId: String,
  productGroupPromotion: List[ProductGroupPromotionCreateRequestElement]
)

object ProductGroupPromotionCreateRequest {
  implicit lazy val productGroupPromotionCreateRequestJsonFormat: Format[ProductGroupPromotionCreateRequest] = Json.format[ProductGroupPromotionCreateRequest]
}

