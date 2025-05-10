package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_accounts_list_200_response.
  * @param items Ad accounts
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdAccountsList200Response(
  items: List[AdAccount],
  bookmark: Option[String]
)

object AdAccountsList200Response {
  implicit lazy val adAccountsList200ResponseJsonFormat: Format[AdAccountsList200Response] = Json.format[AdAccountsList200Response]
}

