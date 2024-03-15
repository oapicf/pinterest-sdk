package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param key 
 * @param name 
 * @param ratio 
 * @param index 
 * @param id 
 */
case class AudienceInsightCategoryCommon(key: Option[String],
                name: Option[String],
                ratio: Option[BigDecimal],
                index: Option[BigDecimal],
                id: Option[String]
                )

object AudienceInsightCategoryCommon {
    /**
     * Creates the codec for converting AudienceInsightCategoryCommon from and to JSON.
     */
    implicit val decoder: Decoder[AudienceInsightCategoryCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceInsightCategoryCommon] = deriveEncoder
}
