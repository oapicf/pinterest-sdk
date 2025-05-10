package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for pins_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class PinsList200Response(
  items: List[Pin],
  bookmark: Option[String]
)

object PinsList200Response {
  implicit lazy val pinsList200ResponseJsonFormat: Format[PinsList200Response] = Json.format[PinsList200Response]
}

