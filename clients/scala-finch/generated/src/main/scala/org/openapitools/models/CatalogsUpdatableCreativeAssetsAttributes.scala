package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param androidUnderscoredeepUnderscorelink Link to the creative assets page.
 * @param customUnderscorelabelUnderscore0 Custom grouping of creative assets.
 * @param customUnderscorelabelUnderscore1 Custom grouping of creative assets.
 * @param customUnderscorelabelUnderscore2 Custom grouping of creative assets.
 * @param customUnderscorelabelUnderscore3 Custom grouping of creative assets.
 * @param customUnderscorelabelUnderscore4 Custom grouping of creative assets.
 * @param description Brief description of the creative assets.
 * @param googleUnderscoreproductUnderscorecategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
 * @param iosUnderscoredeepUnderscorelink IOS deep link to the creative assets page.
 * @param link Link to the creative assets page.
 * @param title The name of the creative assets.
 * @param visibility Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
 */
case class CatalogsUpdatableCreativeAssetsAttributes(androidUnderscoredeepUnderscorelink: Option[String],
                customUnderscorelabelUnderscore0: Option[String],
                customUnderscorelabelUnderscore1: Option[String],
                customUnderscorelabelUnderscore2: Option[String],
                customUnderscorelabelUnderscore3: Option[String],
                customUnderscorelabelUnderscore4: Option[String],
                description: Option[String],
                googleUnderscoreproductUnderscorecategory: Option[String],
                iosUnderscoredeepUnderscorelink: Option[String],
                link: Option[String],
                title: Option[String],
                visibility: Option[String]
                )

object CatalogsUpdatableCreativeAssetsAttributes {
    /**
     * Creates the codec for converting CatalogsUpdatableCreativeAssetsAttributes from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsUpdatableCreativeAssetsAttributes] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsUpdatableCreativeAssetsAttributes] = deriveEncoder
}
