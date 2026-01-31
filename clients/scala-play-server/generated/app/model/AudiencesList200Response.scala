package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for audiences_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudiencesList200Response(
  bookmark: Option[String],
  items: List[Audience]
)

object AudiencesList200Response {
  implicit lazy val audiencesList200ResponseJsonFormat: Format[AudiencesList200Response] = Json.format[AudiencesList200Response]
}

