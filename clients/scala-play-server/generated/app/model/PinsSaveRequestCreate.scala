package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param boardId Unique identifier of the board to which the pin will be saved.
  * @param boardSectionId Unique identifier of the board section to which the pin will be saved.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PinsSaveRequestCreate(
  boardId: Option[String],
  boardSectionId: Option[String]
)

object PinsSaveRequestCreate {
  implicit lazy val pinsSaveRequestCreateJsonFormat: Format[PinsSaveRequestCreate] = Json.format[PinsSaveRequestCreate]
}

