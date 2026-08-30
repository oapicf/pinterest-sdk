package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ads_credits_discounts_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdsCreditsDiscountsGet200Response(
  bookmark: Option[String],
  items: List[AdsCreditDiscountsResponse]
)

object AdsCreditsDiscountsGet200Response {
  implicit lazy val adsCreditsDiscountsGet200ResponseJsonFormat: Format[AdsCreditsDiscountsGet200Response] = Json.format[AdsCreditsDiscountsGet200Response]
}

