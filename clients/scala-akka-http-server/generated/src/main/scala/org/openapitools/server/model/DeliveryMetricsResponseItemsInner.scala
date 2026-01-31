package org.openapitools.server.model


/**
 * @param category Category name for example: ''ADS''
 * @param definition How the metric is defined. for example: ''Unique ID for your ad group''
 * @param displayName Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. for example: ''Ad group ID''
 * @param name Metric's name. for example: ''AD_GROUP_ID''
*/
final case class DeliveryMetricsResponseItemsInner (
  category: Option[String] = None,
  definition: Option[String] = None,
  displayName: Option[String] = None,
  name: Option[String] = None
)

