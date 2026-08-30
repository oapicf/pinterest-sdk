package org.openapitools.server.model

import java.time.LocalDate

/**
 * @param AD_ACCOUNT_ID  for example: ''null''
 * @param DATE  for example: ''null''
*/
final case class AdAccountAnalyticsItems (
  AD_ACCOUNT_ID: String,
  DATE: Option[LocalDate] = None
)

