package model

import play.api.libs.json._

/**
  * Whether to first sort the report by date or by ID
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PrimarySort(
)

object PrimarySort {
  implicit lazy val primarySortJsonFormat: Format[PrimarySort] = Json.format[PrimarySort]
}

