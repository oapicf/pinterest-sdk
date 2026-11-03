package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for media_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MediaList200Response(
  bookmark: Option[String],
  items: List[Media]
)

object MediaList200Response {
  implicit lazy val mediaList200ResponseJsonFormat: Format[MediaList200Response] = Json.format[MediaList200Response]
}

