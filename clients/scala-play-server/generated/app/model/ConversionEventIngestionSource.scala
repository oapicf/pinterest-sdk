package model

import play.api.libs.json._

/**
  * The source of conversion events ingestion
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ConversionEventIngestionSource(
)

object ConversionEventIngestionSource {
  implicit lazy val conversionEventIngestionSourceJsonFormat: Format[ConversionEventIngestionSource] = Json.format[ConversionEventIngestionSource]
}

