package org.openapitools.server.model


/**
 * @param dataStatus  for example: ''null''
 * @param date Metrics date (UTC): YYYY-MM-DD. for example: ''2019-12-01''
 * @param metrics The metric name and daily value for each requested metric for example: ''{"CLOSEUP":1,"CLOSEUP_RATE":0,"ENGAGEMENT":1,"ENGAGEMENT_RATE":0,"IMPRESSION":240,"OUTBOUND_CLICK":20,"OUTBOUND_CLICK_RATE":0.08,"PIN_CLICK":37,"PIN_CLICK_RATE":0.15,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031}''
*/
final case class AnalyticsDailyMetrics (
  dataStatus: Option[DataStatus] = None,
  date: Option[String] = None,
  metrics: Option[Map[String, Double]] = None
)

