package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_accounts_list_200_response.
  * @param items Ad accounts
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdAccountsList200Response(
  items: List[AdAccount],
  bookmark: Option[String]
)

object AdAccountsList200Response {
  implicit lazy val adAccountsList200ResponseJsonFormat: Format[AdAccountsList200Response] = Json.format[AdAccountsList200Response]
}

