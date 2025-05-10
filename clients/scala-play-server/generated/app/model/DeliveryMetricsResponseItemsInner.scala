package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeliveryMetricsResponse_items_inner.
  * @param name Metric's name.
  * @param category Category name
  * @param definition How the metric is defined.
  * @param displayName Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class DeliveryMetricsResponseItemsInner(
  name: Option[String],
  category: Option[DeliveryMetricsResponseItemsInner.Category.Value],
  definition: Option[String],
  displayName: Option[String]
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

