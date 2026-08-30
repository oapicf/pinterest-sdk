package model

import play.api.libs.json._

/**
  * Sections help organize pins within a board.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BoardSection(
  id: Option[String],
  name: String
)

object BoardSection {
  implicit lazy val boardSectionJsonFormat: Format[BoardSection] = Json.format[BoardSection]
}

