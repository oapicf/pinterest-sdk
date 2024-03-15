package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for user_websites_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class UserWebsitesGet200Response(
  items: List[UserWebsiteSummary],
  bookmark: Option[String]
)

object UserWebsitesGet200Response {
  implicit lazy val userWebsitesGet200ResponseJsonFormat: Format[UserWebsitesGet200Response] = Json.format[UserWebsitesGet200Response]
}

