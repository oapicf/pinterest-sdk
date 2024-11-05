package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param title The name of the creative assets.
 * @param description Brief description of the creative assets.
 * @param link Link to the creative assets page.
 * @param iosUnderscoredeepUnderscorelink IOS deep link to the creative assets page.
 * @param androidUnderscoredeepUnderscorelink Link to the creative assets page.
 * @param googleUnderscoreproductUnderscorecategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
 * @param customUnderscorelabelUnderscore0 Custom grouping of creative assets.
 * @param customUnderscorelabelUnderscore1 Custom grouping of creative assets.
 * @param customUnderscorelabelUnderscore2 Custom grouping of creative assets.
 * @param customUnderscorelabelUnderscore3 Custom grouping of creative assets.
 * @param customUnderscorelabelUnderscore4 Custom grouping of creative assets.
 * @param visibility Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
 * @param imageUnderscorelink The creative assets image.
 * @param videoUnderscorelink The creative assets video.
 */
case class CatalogsCreativeAssetsAttributes(title: Option[String],
                description: Option[String],
                link: Option[String],
                iosUnderscoredeepUnderscorelink: Option[String],
                androidUnderscoredeepUnderscorelink: Option[String],
                googleUnderscoreproductUnderscorecategory: Option[String],
                customUnderscorelabelUnderscore0: Option[String],
                customUnderscorelabelUnderscore1: Option[String],
                customUnderscorelabelUnderscore2: Option[String],
                customUnderscorelabelUnderscore3: Option[String],
                customUnderscorelabelUnderscore4: Option[String],
                visibility: Option[String],
                imageUnderscorelink: Option[String],
                videoUnderscorelink: Option[String]
                )

object CatalogsCreativeAssetsAttributes {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsAttributes from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsAttributes] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsAttributes] = deriveEncoder
}
