package org.openapitools.server.model


/**
 * Array with metrics, status, and pin id for the requested metric
 *
 * @param metrics The metric name and daily value for each requested metric for example: ''{"IMPRESSION":7,"QUARTILE_95_PERCENT_VIEW":2,"SAVE":1,"VIDEO_10S_VIEW":5,"VIDEO_AVG_WATCH_TIME":86989,"VIDEO_MRC_VIEW":2,"VIDEO_START":2,"VIDEO_V50_WATCH_TIME":173979,"OUTBOUND_CLICK":2}''
 * @param dataStatus  for example: ''null''
 * @param pinId The pin id for example: ''642396334344813594''
*/
final case class TopVideoPinsAnalyticsResponsePinsInner (
  metrics: Option[Map[String, Double]] = None,
  dataStatus: Option[Map[String, DataStatus]] = None,
  pinId: Option[String] = None
)

