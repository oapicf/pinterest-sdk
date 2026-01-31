package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ads_credits_discounts_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdsCreditsDiscountsGet200Response(
  items: List[AdsCreditDiscountsResponse],
  bookmark: Option[String]
)

object AdsCreditsDiscountsGet200Response {
  implicit lazy val adsCreditsDiscountsGet200ResponseJsonFormat: Format[AdsCreditsDiscountsGet200Response] = Json.format[AdsCreditsDiscountsGet200Response]
}

