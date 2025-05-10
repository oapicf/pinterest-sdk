package model

import play.api.libs.json._

/**
  * Sections help organize pins within a board.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BoardSection(
  id: Option[String],
  name: String
)

object BoardSection {
  implicit lazy val boardSectionJsonFormat: Format[BoardSection] = Json.format[BoardSection]
}

