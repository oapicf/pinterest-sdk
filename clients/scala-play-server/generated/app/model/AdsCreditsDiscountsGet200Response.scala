package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ads_credits_discounts_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdsCreditsDiscountsGet200Response(
  items: List[AdsCreditDiscountsResponse],
  bookmark: Option[String]
)

object AdsCreditsDiscountsGet200Response {
  implicit lazy val adsCreditsDiscountsGet200ResponseJsonFormat: Format[AdsCreditsDiscountsGet200Response] = Json.format[AdsCreditsDiscountsGet200Response]
}

