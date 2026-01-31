package org.openapitools.server.model

import java.time.LocalDate

/**
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) for example: ''null''
 * @param PIN_ID The ID of the pin that the metric belongs to. for example: ''null''
*/
final case class AdPinAnalytics (
  DATE: Option[LocalDate] = None,
  PIN_ID: String
)

