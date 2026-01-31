package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.Currency

/**
 * 
 * @param amount Numeric value.
 * @param currencyUnderscorecode 
 * @param customUnderscoretext Custom text.
 * @param percent Percent value.
 */
case class PromotionTemplateValue(amount: Option[BigDecimal],
                currencyUnderscorecode: Option[Currency],
                customUnderscoretext: Option[String],
                percent: Option[BigDecimal]
                )

object PromotionTemplateValue {
    /**
     * Creates the codec for converting PromotionTemplateValue from and to JSON.
     */
    implicit val decoder: Decoder[PromotionTemplateValue] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromotionTemplateValue] = deriveEncoder
}
