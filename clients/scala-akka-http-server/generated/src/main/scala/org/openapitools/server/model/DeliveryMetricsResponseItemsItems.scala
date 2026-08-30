package org.openapitools.server.model


/**
 * @param category Category name for example: ''null''
 * @param definition How the metric is defined. for example: ''null''
 * @param displayName Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. for example: ''null''
 * @param name Metric's name. for example: ''null''
*/
final case class DeliveryMetricsResponseItemsItems (
  category: Option[String] = None,
  definition: Option[String] = None,
  displayName: Option[String] = None,
  name: Option[String] = None
)

