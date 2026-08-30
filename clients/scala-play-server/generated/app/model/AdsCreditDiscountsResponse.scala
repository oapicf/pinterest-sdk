package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsCreditDiscountsResponse.
  * @param active True if the offer code is currently active.
  * @param advertiserId Advertiser ID the offer was applied to.
  * @param discountCurrency Currency value for the discount.
  * @param discountInMicroCurrency The discount applied in the offer's currency value.
  * @param discountType The type of discount of this credit
  * @param remainingDiscountInMicroCurrency The credits left to spend.
  * @param title Human readable title of the offer code.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdsCreditDiscountsResponse(
  active: Option[Boolean],
  advertiserId: Option[String],
  discountCurrency: Option[String],
  discountInMicroCurrency: Option[BigDecimal],
  discountType: Option[AdsCreditDiscountType],
  remainingDiscountInMicroCurrency: Option[BigDecimal],
  title: Option[String]
)

object AdsCreditDiscountsResponse {
  implicit lazy val adsCreditDiscountsResponseJsonFormat: Format[AdsCreditDiscountsResponse] = Json.format[AdsCreditDiscountsResponse]
}

