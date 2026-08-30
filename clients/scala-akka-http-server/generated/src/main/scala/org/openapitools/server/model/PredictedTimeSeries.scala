package org.openapitools.server.model

import java.time.LocalDate

/**
 * = PredictedTimeSeries =
 *
 * @param date  for example: ''null''
*/
final case class PredictedTimeSeries (
  date: Option[LocalDate] = None
)

