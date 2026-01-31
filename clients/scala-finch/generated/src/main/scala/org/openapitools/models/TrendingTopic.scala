package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.TrendingPin
import scala.collection.immutable.Seq

/**
 * Individual trending topic within an interest category
 * @param description Description of the trending topic
 * @param percentUnderscoregrowthUnderscoremom Month-over-month growth percentage
 * @param pins Array of pin images related to this trend (up to 6)
 * @param relatedUnderscoreinterests List of related interest categories
 * @param relatedUnderscoresearches List of related search terms
 * @param timeUnderscoreseries Time series data showing trend values over time, with dates as keys and values as numeric
 * @param title Title of the trending topic
 */
case class TrendingTopic(description: String,
                percentUnderscoregrowthUnderscoremom: Int,
                pins: Seq[TrendingPin],
                relatedUnderscoreinterests: Seq[String],
                relatedUnderscoresearches: Seq[String],
                timeUnderscoreseries: Map[String, BigDecimal],
                title: String
                )

object TrendingTopic {
    /**
     * Creates the codec for converting TrendingTopic from and to JSON.
     */
    implicit val decoder: Decoder[TrendingTopic] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrendingTopic] = deriveEncoder
}
