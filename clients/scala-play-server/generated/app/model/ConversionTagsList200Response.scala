package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for conversion_tags_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionTagsList200Response(
  items: List[ConversionTag]
)

object ConversionTagsList200Response {
  implicit lazy val conversionTagsList200ResponseJsonFormat: Format[ConversionTagsList200Response] = Json.format[ConversionTagsList200Response]
}

