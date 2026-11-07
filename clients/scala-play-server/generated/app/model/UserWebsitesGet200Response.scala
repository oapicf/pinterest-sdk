package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for user_websites_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UserWebsitesGet200Response(
  bookmark: Option[String],
  items: List[UserWebsite]
)

object UserWebsitesGet200Response {
  implicit lazy val userWebsitesGet200ResponseJsonFormat: Format[UserWebsitesGet200Response] = Json.format[UserWebsitesGet200Response]
}

