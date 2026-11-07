package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DynamicTitlesDownloadCSV.
  * @param downloadUrl Pre-signed S3 URL to download the CSV file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DynamicTitlesDownloadCSV(
  downloadUrl: Option[String]
)

object DynamicTitlesDownloadCSV {
  implicit lazy val dynamicTitlesDownloadCSVJsonFormat: Format[DynamicTitlesDownloadCSV] = Json.format[DynamicTitlesDownloadCSV]
}

