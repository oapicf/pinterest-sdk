package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param boardId Unique identifier of the board to which the pin will be saved.
  * @param boardSectionId Unique identifier of the board section to which the pin will be saved.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PinsSaveRequestCreate(
  boardId: Option[String],
  boardSectionId: Option[String]
)

object PinsSaveRequestCreate {
  implicit lazy val pinsSaveRequestCreateJsonFormat: Format[PinsSaveRequestCreate] = Json.format[PinsSaveRequestCreate]
}

