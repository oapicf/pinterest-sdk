package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadsExports.
  * @param leadsExportId ID for the leads export job.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LeadsExports(
  leadsExportId: Option[String]
)

object LeadsExports {
  implicit lazy val leadsExportsJsonFormat: Format[LeadsExports] = Json.format[LeadsExports]
}

