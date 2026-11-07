package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for pins_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PinsList200Response(
  bookmark: Option[String],
  items: List[Pin]
)

object PinsList200Response {
  implicit lazy val pinsList200ResponseJsonFormat: Format[PinsList200Response] = Json.format[PinsList200Response]
}

