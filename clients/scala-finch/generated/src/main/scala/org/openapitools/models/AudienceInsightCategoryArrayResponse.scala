package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AudienceInsightCategoryCommon
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class AudienceInsightCategoryArrayResponse(items: Option[Seq[AudienceInsightCategoryCommon]]
                )

object AudienceInsightCategoryArrayResponse {
    /**
     * Creates the codec for converting AudienceInsightCategoryArrayResponse from and to JSON.
     */
    implicit val decoder: Decoder[AudienceInsightCategoryArrayResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceInsightCategoryArrayResponse] = deriveEncoder
}
