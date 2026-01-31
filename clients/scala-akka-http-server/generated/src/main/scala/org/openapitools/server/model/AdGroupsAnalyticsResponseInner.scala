package org.openapitools.server.model

import java.time.LocalDate

/**
 * @param AD_GROUP_ID The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true. for example: ''null''
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) for example: ''null''
*/
final case class AdGroupsAnalyticsResponseInner (
  AD_GROUP_ID: Option[String] = None,
  DATE: Option[LocalDate] = None
)

