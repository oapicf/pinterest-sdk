package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MetricsResponseDataItems.
  * @param metrics Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
  * @param targetingType The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
  * @param targetingValue The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MetricsResponseDataItems(
  metrics: JsObject,
  targetingType: String,
  targetingValue: String
)

object MetricsResponseDataItems {
  implicit lazy val metricsResponseDataItemsJsonFormat: Format[MetricsResponseDataItems] = Json.format[MetricsResponseDataItems]
}

