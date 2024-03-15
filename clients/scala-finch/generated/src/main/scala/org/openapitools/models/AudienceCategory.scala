package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AudienceSubcategory
import org.openapitools.models.BigDecimal
import scala.collection.immutable.Seq

/**
 * 
 * @param key Interest unique key (same as ID).
 * @param name Interest name.
 * @param ratio Interest's percent of category's total audience.
 * @param index Interest affinity index.
 * @param id Interest ID.
 * @param subcategories Subcategory interest distribution
 */
case class AudienceCategory(key: Option[String],
                name: Option[String],
                ratio: Option[BigDecimal],
                index: Option[BigDecimal],
                id: Option[String],
                subcategories: Option[Seq[AudienceSubcategory]]
                )

object AudienceCategory {
    /**
     * Creates the codec for converting AudienceCategory from and to JSON.
     */
    implicit val decoder: Decoder[AudienceCategory] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudienceCategory] = deriveEncoder
}
