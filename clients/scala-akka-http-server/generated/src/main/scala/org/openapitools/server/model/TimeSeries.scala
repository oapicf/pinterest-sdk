package org.openapitools.server.model

import java.time.LocalDate

/**
 * = TimeSeries =
 *
 * @param date  for example: ''null''
*/
final case class TimeSeries (
  date: Option[LocalDate] = None
)

