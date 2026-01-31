package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param id 
 * @param index 
 * @param key 
 * @param name 
 * @param ratio 
 */
case class AudienceInsightCategoryCommon(id: Option[String],
                index: Option[BigDecimal],
                key: Option[String],
                name: Option[String],
                ratio: Option[BigDecimal]
                )

object AudienceInsightCategoryCommon {
    /**
     * Creates the codec for converting AudienceInsightCategoryCommon from and to JSON.
     */
    implicit val decoder: Decoder[AudienceInsightCategoryCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceInsightCategoryCommon] = deriveEncoder
}
