package org.openapitools.server.model


/**
 * @param customEventMetricsType Metrics for custom defined conversion event. for example: ''ADE_COST_PER_ACTION''
 * @param customEventName Name of the advertiser-defined custom conversion event for example: ''null''
*/
final case class AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics (
  customEventMetricsType: String,
  customEventName: String
)

