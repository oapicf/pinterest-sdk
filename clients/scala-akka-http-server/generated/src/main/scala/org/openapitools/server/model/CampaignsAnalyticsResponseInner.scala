package org.openapitools.server.model

import java.time.LocalDate

/**
 * @param CAMPAIGN_ID The ID of the campaing that this metrics belongs to. for example: ''null''
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) for example: ''null''
*/
final case class CampaignsAnalyticsResponseInner (
  CAMPAIGN_ID: String,
  DATE: Option[LocalDate] = None
)

