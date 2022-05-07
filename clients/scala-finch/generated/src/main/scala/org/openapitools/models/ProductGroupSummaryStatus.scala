package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Summary status for product group
 */
case class ProductGroupSummaryStatus()

object ProductGroupSummaryStatus {
    /**
     * Creates the codec for converting ProductGroupSummaryStatus from and to JSON.
     */
    implicit val decoder: Decoder[ProductGroupSummaryStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductGroupSummaryStatus] = deriveEncoder
}
