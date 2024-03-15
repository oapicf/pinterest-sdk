package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for media_list_200_response.
  * @param items Media
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MediaList200Response(
  items: List[MediaUploadDetails],
  bookmark: Option[String]
)

object MediaList200Response {
  implicit lazy val mediaList200ResponseJsonFormat: Format[MediaList200Response] = Json.format[MediaList200Response]
}

