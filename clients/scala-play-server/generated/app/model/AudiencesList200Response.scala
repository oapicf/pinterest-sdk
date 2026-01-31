package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for audiences_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudiencesList200Response(
  items: List[Audience],
  bookmark: Option[String]
)

object AudiencesList200Response {
  implicit lazy val audiencesList200ResponseJsonFormat: Format[AudiencesList200Response] = Json.format[AudiencesList200Response]
}

