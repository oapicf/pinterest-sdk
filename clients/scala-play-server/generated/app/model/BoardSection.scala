package model

import play.api.libs.json._

/**
  * Sections help organize pins within a board.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BoardSection(
  id: Option[String],
  name: String
)

object BoardSection {
  implicit lazy val boardSectionJsonFormat: Format[BoardSection] = Json.format[BoardSection]
}

