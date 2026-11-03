package model

import play.api.libs.json._

/**
  * Resource create operation model.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BoardSectionCreate(
  id: Option[String],
  name: String
)

object BoardSectionCreate {
  implicit lazy val boardSectionCreateJsonFormat: Format[BoardSectionCreate] = Json.format[BoardSectionCreate]
}

