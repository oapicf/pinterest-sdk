package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param key Interest unique key (same as ID).
 * @param name Subinterest name.
 * @param ratio Subinterest's percent of category's total audience.
 * @param index Subinterest affinity index.
 * @param id Subinterest ID.
 */
case class AudienceSubcategory(key: Option[String],
                name: Option[String],
                ratio: Option[BigDecimal],
                index: Option[BigDecimal],
                id: Option[String]
                )

object AudienceSubcategory {
    /**
     * Creates the codec for converting AudienceSubcategory from and to JSON.
     */
    implicit val decoder: Decoder[AudienceSubcategory] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceSubcategory] = deriveEncoder
}
