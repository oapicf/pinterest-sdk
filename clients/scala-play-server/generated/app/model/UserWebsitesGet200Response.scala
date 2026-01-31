package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for user_websites_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UserWebsitesGet200Response(
  items: List[UserWebsiteSummary],
  bookmark: Option[String]
)

object UserWebsitesGet200Response {
  implicit lazy val userWebsitesGet200ResponseJsonFormat: Format[UserWebsitesGet200Response] = Json.format[UserWebsitesGet200Response]
}

