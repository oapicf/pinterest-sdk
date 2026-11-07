package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeliveryMetricsResponseItemsItems.
  * @param category Category name
  * @param definition How the metric is defined.
  * @param displayName Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
  * @param name Metric's name.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DeliveryMetricsResponseItemsItems(
  category: Option[DeliveryMetricsResponseItemsItems.Category.Value],
  definition: Option[String],
  displayName: Option[String],
  name: Option[String]
)

object DeliveryMetricsResponseItemsItems {
  implicit lazy val deliveryMetricsResponseItemsItemsJsonFormat: Format[DeliveryMetricsResponseItemsItems] = Json.format[DeliveryMetricsResponseItemsItems]

  // noinspection TypeAnnotation
  object Category extends Enumeration {
    val ADS = Value("ADS")
    val ORGANIC = Value("ORGANIC")

    type Category = Value
    implicit lazy val CategoryJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

