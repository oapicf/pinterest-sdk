package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeliveryMetricsResponse_items_inner.
  * @param category Category name
  * @param definition How the metric is defined.
  * @param displayName Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
  * @param name Metric's name.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class DeliveryMetricsResponseItemsInner(
  category: Option[DeliveryMetricsResponseItemsInner.Category.Value],
  definition: Option[String],
  displayName: Option[String],
  name: Option[String]
)

object DeliveryMetricsResponseItemsInner {
  implicit lazy val deliveryMetricsResponseItemsInnerJsonFormat: Format[DeliveryMetricsResponseItemsInner] = Json.format[DeliveryMetricsResponseItemsInner]

  // noinspection TypeAnnotation
  object Category extends Enumeration {
    val ADS = Value("ADS")
    val ORGANIC = Value("ORGANIC")

    type Category = Value
    implicit lazy val CategoryJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

