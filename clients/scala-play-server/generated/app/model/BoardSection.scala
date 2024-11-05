package model

import play.api.libs.json._

/**
  * Sections help organize pins within a board.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BoardSection(
  id: Option[String],
  name: String
)

object BoardSection {
  implicit lazy val boardSectionJsonFormat: Format[BoardSection] = Json.format[BoardSection]
}

