package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Summary status for ad group
 */
case class AdGroupSummaryStatus()

object AdGroupSummaryStatus {
    /**
     * Creates the codec for converting AdGroupSummaryStatus from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupSummaryStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupSummaryStatus] = deriveEncoder
}
