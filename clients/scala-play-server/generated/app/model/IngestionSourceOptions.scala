package model

import play.api.libs.json._

/**
  * List of ingestion sources for a conversion event.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IngestionSourceOptions(
)

object IngestionSourceOptions {
  implicit lazy val ingestionSourceOptionsJsonFormat: Format[IngestionSourceOptions] = Json.format[IngestionSourceOptions]
}

