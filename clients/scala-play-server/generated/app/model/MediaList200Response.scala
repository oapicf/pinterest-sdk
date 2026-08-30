package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for media_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MediaList200Response(
  bookmark: Option[String],
  items: List[Media]
)

object MediaList200Response {
  implicit lazy val mediaList200ResponseJsonFormat: Format[MediaList200Response] = Json.format[MediaList200Response]
}

