package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PromotionTemplateValue
import org.openapitools.models.PromotionType
import scala.collection.immutable.Seq

/**
 * 
 * @param discountUnderscorestatus Discount status based on the current time and start and end time of discount
 * @param endUnderscoretime Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
 * @param externalUnderscoreid Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
 * @param platformUnderscoretype The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
 * @param promotionUnderscorecode Code that can be used to redeem a promotion.
 * @param promotionUnderscorecustomUnderscoreid An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
 * @param promotionUnderscoretitle Internal name for the promotion.
 * @param promotionUnderscoretype 
 * @param startUnderscoretime Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
 * @param templateUnderscorevalues List of values to be inserted in the promotion type-specific template.
 */
case class PromotionCommon(discountUnderscorestatus: Option[String],
                endUnderscoretime: Option[Int],
                externalUnderscoreid: Option[String],
                platformUnderscoretype: Option[String],
                promotionUnderscorecode: Option[String],
                promotionUnderscorecustomUnderscoreid: Option[String],
                promotionUnderscoretitle: Option[String],
                promotionUnderscoretype: Option[PromotionType],
                startUnderscoretime: Option[Int],
                templateUnderscorevalues: Option[Seq[PromotionTemplateValue]]
                )

object PromotionCommon {
    /**
     * Creates the codec for converting PromotionCommon from and to JSON.
     */
    implicit val decoder: Decoder[PromotionCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromotionCommon] = deriveEncoder
}
