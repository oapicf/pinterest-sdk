package org.openapitools.server.model


/**
 * @param customEventMetricsType  for example: ''null''
 * @param customEventName Name of the advertiser-defined custom conversion event for example: ''null''
*/
final case class CustomConversionEventMetrics (
  customEventMetricsType: AdeColumnType,
  customEventName: String
)

