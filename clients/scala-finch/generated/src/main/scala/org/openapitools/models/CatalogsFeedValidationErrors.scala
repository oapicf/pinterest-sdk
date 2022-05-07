package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param fetchUnderscoreerror 
 * @param fetchUnderscoreinactiveUnderscorefeedUnderscoreerror 
 * @param encodingUnderscoreerror 
 * @param delimiterUnderscoreerror 
 * @param requiredUnderscorecolumnsUnderscoremissing 
 * @param imageUnderscorelinkUnderscoreinvalid 
 * @param itemidUnderscoremissing 
 * @param titleUnderscoremissing 
 * @param descriptionUnderscoremissing 
 * @param productUnderscorecategoryUnderscoreinvalid 
 * @param productUnderscorelinkUnderscoremissing 
 * @param imageUnderscorelinkUnderscoremissing 
 * @param availabilityUnderscoreinvalid 
 * @param productUnderscorepriceUnderscoreinvalid 
 * @param linkUnderscoreformatUnderscoreinvalid 
 * @param parseUnderscorelineUnderscoreerror 
 * @param adwordsUnderscoreformatUnderscoreinvalid 
 * @param productUnderscorecategoryUnderscoremissing 
 * @param internalUnderscoreserviceUnderscoreerror 
 * @param noUnderscoreverifiedUnderscoredomain 
 * @param adultUnderscoreinvalid 
 * @param invalidUnderscoredomain 
 * @param feedUnderscorelengthUnderscoretooUnderscorelong 
 * @param linkUnderscorelengthUnderscoretooUnderscorelong 
 * @param malformedUnderscorexml 
 * @param redirectUnderscoreinvalid 
 * @param priceUnderscoremissing 
 * @param feedUnderscoretooUnderscoresmall 
 * @param conditionUnderscoreinvalid 
 * @param shopifyUnderscorenoUnderscoreproducts 
 * @param maxUnderscoreitemsUnderscoreperUnderscoreitemUnderscoregroupUnderscoreexceeded 
 * @param itemUnderscoremainUnderscoreimageUnderscoredownloadUnderscorefailure 
 * @param pinjoinUnderscorecontentUnderscoreunsafe 
 * @param blocklistedUnderscoreimageUnderscoresignature 
 */
case class CatalogsFeedValidationErrors(fetchUnderscoreerror: Option[Int],
                fetchUnderscoreinactiveUnderscorefeedUnderscoreerror: Option[Int],
                encodingUnderscoreerror: Option[Int],
                delimiterUnderscoreerror: Option[Int],
                requiredUnderscorecolumnsUnderscoremissing: Option[Int],
                imageUnderscorelinkUnderscoreinvalid: Option[Int],
                itemidUnderscoremissing: Option[Int],
                titleUnderscoremissing: Option[Int],
                descriptionUnderscoremissing: Option[Int],
                productUnderscorecategoryUnderscoreinvalid: Option[Int],
                productUnderscorelinkUnderscoremissing: Option[Int],
                imageUnderscorelinkUnderscoremissing: Option[Int],
                availabilityUnderscoreinvalid: Option[Int],
                productUnderscorepriceUnderscoreinvalid: Option[Int],
                linkUnderscoreformatUnderscoreinvalid: Option[Int],
                parseUnderscorelineUnderscoreerror: Option[Int],
                adwordsUnderscoreformatUnderscoreinvalid: Option[Int],
                productUnderscorecategoryUnderscoremissing: Option[Int],
                internalUnderscoreserviceUnderscoreerror: Option[Int],
                noUnderscoreverifiedUnderscoredomain: Option[Int],
                adultUnderscoreinvalid: Option[Int],
                invalidUnderscoredomain: Option[Int],
                feedUnderscorelengthUnderscoretooUnderscorelong: Option[Int],
                linkUnderscorelengthUnderscoretooUnderscorelong: Option[Int],
                malformedUnderscorexml: Option[Int],
                redirectUnderscoreinvalid: Option[Int],
                priceUnderscoremissing: Option[Int],
                feedUnderscoretooUnderscoresmall: Option[Int],
                conditionUnderscoreinvalid: Option[Int],
                shopifyUnderscorenoUnderscoreproducts: Option[Int],
                maxUnderscoreitemsUnderscoreperUnderscoreitemUnderscoregroupUnderscoreexceeded: Option[Int],
                itemUnderscoremainUnderscoreimageUnderscoredownloadUnderscorefailure: Option[Int],
                pinjoinUnderscorecontentUnderscoreunsafe: Option[Int],
                blocklistedUnderscoreimageUnderscoresignature: Option[Int]
                )

object CatalogsFeedValidationErrors {
    /**
     * Creates the codec for converting CatalogsFeedValidationErrors from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedValidationErrors] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedValidationErrors] = deriveEncoder
}
