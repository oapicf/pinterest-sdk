package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for pins_save_request.
  * @param boardId Unique identifier of the board to which the pin will be saved.
  * @param boardSectionId Unique identifier of the board section to which the pin will be saved.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class PinsSaveRequest(
  boardId: Option[String],
  boardSectionId: Option[String]
)

object PinsSaveRequest {
  implicit lazy val pinsSaveRequestJsonFormat: Format[PinsSaveRequest] = Json.format[PinsSaveRequest]
}

