package org.openapitools.server.model


/**
 * @param field  for example: ''null''
 * @param operator  for example: ''null''
 * @param values List of values for filtering for example: ''null''
*/
final case class AdsAnalyticsMetricsFilter (
  field: Option[AdsAnalyticsFilterColumn],
  operator: Option[AdsAnalyticsFilterOperator],
  values: Option[Seq[Double]]
)

