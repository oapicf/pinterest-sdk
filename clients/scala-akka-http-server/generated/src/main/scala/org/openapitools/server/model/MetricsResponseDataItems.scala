package org.openapitools.server.model


/**
 * @param metrics Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers). for example: ''null''
 * @param targetingType The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER) for example: ''null''
 * @param targetingValue The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female') for example: ''null''
*/
final case class MetricsResponseDataItems (
  metrics: Any,
  targetingType: String,
  targetingValue: String
)

