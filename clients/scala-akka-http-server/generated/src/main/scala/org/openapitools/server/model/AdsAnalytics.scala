package org.openapitools.server.model

import java.time.LocalDate

/**
 * @param AD_ID  for example: ''null''
 * @param DATE  for example: ''null''
*/
final case class AdsAnalytics (
  AD_ID: String,
  DATE: Option[LocalDate] = None
)

