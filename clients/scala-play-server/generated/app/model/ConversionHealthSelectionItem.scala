package model

import play.api.libs.json._

/**
  * User selection of conversion health criteria for a single feature
  * @param conversionType Status for conversion types
  * @param criteria Status for criteria
  * @param ingestionSource Status for ingestion sources
  * @param status Overall status for this selection item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionHealthSelectionItem(
  conversionType: Option[JsObject],
  criteria: Option[JsObject],
  ingestionSource: Option[JsObject],
  status: OasAnyTypeNotMapped
)

object ConversionHealthSelectionItem {
  implicit lazy val conversionHealthSelectionItemJsonFormat: Format[ConversionHealthSelectionItem] = Json.format[ConversionHealthSelectionItem]
}

