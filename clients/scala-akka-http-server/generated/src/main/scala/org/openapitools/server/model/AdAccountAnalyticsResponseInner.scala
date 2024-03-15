package org.openapitools.server.model

import java.time.LocalDate

/**
 * @param AD_ACCOUNT_ID The ID of the advertiser that this metrics belongs to. for example: ''null''
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) for example: ''null''
*/
final case class AdAccountAnalyticsResponseInner (
  AD_ACCOUNT_ID: String,
  DATE: Option[LocalDate] = None
)

