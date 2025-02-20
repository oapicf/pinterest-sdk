package org.openapitools.server.model

import java.time.LocalDate

/**
 * @param PRODUCT_GROUP_ID The ID of the product group that this metrics belongs to. for example: ''null''
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) for example: ''null''
*/
final case class ProductGroupAnalyticsResponseInner (
  PRODUCT_GROUP_ID: String,
  DATE: Option[LocalDate] = None
)

