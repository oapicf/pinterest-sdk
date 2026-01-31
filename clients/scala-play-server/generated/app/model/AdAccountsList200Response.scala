package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_accounts_list_200_response.
  * @param items Ad accounts
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdAccountsList200Response(
  items: List[AdAccount],
  bookmark: Option[String]
)

object AdAccountsList200Response {
  implicit lazy val adAccountsList200ResponseJsonFormat: Format[AdAccountsList200Response] = Json.format[AdAccountsList200Response]
}

