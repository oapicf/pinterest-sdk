package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param titleUnderscorelengthUnderscoretooUnderscorelong 
 * @param descriptionUnderscorelengthUnderscoretooUnderscorelong 
 * @param genderUnderscoreinvalid 
 * @param ageUnderscoregroupUnderscoreinvalid 
 * @param sizeUnderscoretypeUnderscoreinvalid 
 * @param linkUnderscoreformatUnderscorewarning 
 * @param duplicateUnderscoreproducts 
 * @param duplicateUnderscorelinks 
 * @param salesUnderscorepriceUnderscoreinvalid 
 * @param productUnderscorecategoryUnderscoredepthUnderscorewarning 
 * @param adwordsUnderscoresameUnderscoreasUnderscorelink 
 * @param duplicateUnderscoreheaders 
 * @param fetchUnderscoresameUnderscoresignature 
 * @param adwordsUnderscoreformatUnderscorewarning 
 * @param additionalUnderscoreimageUnderscorelinkUnderscorewarning 
 * @param imageUnderscorelinkUnderscorewarning 
 * @param shippingUnderscoreinvalid 
 * @param taxUnderscoreinvalid 
 * @param shippingUnderscoreweightUnderscoreinvalid 
 * @param expirationUnderscoredateUnderscoreinvalid 
 * @param availabilityUnderscoredateUnderscoreinvalid 
 * @param saleUnderscoredateUnderscoreinvalid 
 * @param weightUnderscoreunitUnderscoreinvalid 
 * @param isUnderscorebundleUnderscoreinvalid 
 * @param updatedUnderscoretimeUnderscoreinvalid 
 * @param customUnderscorelabelUnderscorelengthUnderscoretooUnderscorelong 
 * @param productUnderscoretypeUnderscorelengthUnderscoretooUnderscorelong 
 * @param tooUnderscoremanyUnderscoreadditionalUnderscoreimageUnderscorelinks 
 * @param multipackUnderscoreinvalid 
 * @param indexedUnderscoreproductUnderscorecountUnderscorelargeUnderscoredelta 
 * @param itemUnderscoreadditionalUnderscoreimageUnderscoredownloadUnderscorefailure 
 * @param optionalUnderscoreproductUnderscorecategoryUnderscoremissing 
 * @param optionalUnderscoreproductUnderscorecategoryUnderscoreinvalid 
 * @param optionalUnderscoreconditionUnderscoremissing 
 * @param optionalUnderscoreconditionUnderscoreinvalid 
 * @param iosUnderscoredeepUnderscorelinkUnderscoreinvalid 
 * @param androidUnderscoredeepUnderscorelinkUnderscoreinvalid 
 * @param availabilityUnderscorenormalized 
 * @param conditionUnderscorenormalized 
 * @param genderUnderscorenormalized 
 * @param sizeUnderscoretypeUnderscorenormalized 
 * @param ageUnderscoregroupUnderscorenormalized 
 * @param utmUnderscoresourceUnderscoreautoUnderscorecorrected 
 * @param countryUnderscoredoesUnderscorenotUnderscoremapUnderscoretoUnderscorecurrency 
 * @param minUnderscoreadUnderscorepriceUnderscoreinvalid 
 */
case class CatalogsFeedValidationWarnings(titleUnderscorelengthUnderscoretooUnderscorelong: Option[Int],
                descriptionUnderscorelengthUnderscoretooUnderscorelong: Option[Int],
                genderUnderscoreinvalid: Option[Int],
                ageUnderscoregroupUnderscoreinvalid: Option[Int],
                sizeUnderscoretypeUnderscoreinvalid: Option[Int],
                linkUnderscoreformatUnderscorewarning: Option[Int],
                duplicateUnderscoreproducts: Option[Int],
                duplicateUnderscorelinks: Option[Int],
                salesUnderscorepriceUnderscoreinvalid: Option[Int],
                productUnderscorecategoryUnderscoredepthUnderscorewarning: Option[Int],
                adwordsUnderscoresameUnderscoreasUnderscorelink: Option[Int],
                duplicateUnderscoreheaders: Option[Int],
                fetchUnderscoresameUnderscoresignature: Option[Int],
                adwordsUnderscoreformatUnderscorewarning: Option[Int],
                additionalUnderscoreimageUnderscorelinkUnderscorewarning: Option[Int],
                imageUnderscorelinkUnderscorewarning: Option[Int],
                shippingUnderscoreinvalid: Option[Int],
                taxUnderscoreinvalid: Option[Int],
                shippingUnderscoreweightUnderscoreinvalid: Option[Int],
                expirationUnderscoredateUnderscoreinvalid: Option[Int],
                availabilityUnderscoredateUnderscoreinvalid: Option[Int],
                saleUnderscoredateUnderscoreinvalid: Option[Int],
                weightUnderscoreunitUnderscoreinvalid: Option[Int],
                isUnderscorebundleUnderscoreinvalid: Option[Int],
                updatedUnderscoretimeUnderscoreinvalid: Option[Int],
                customUnderscorelabelUnderscorelengthUnderscoretooUnderscorelong: Option[Int],
                productUnderscoretypeUnderscorelengthUnderscoretooUnderscorelong: Option[Int],
                tooUnderscoremanyUnderscoreadditionalUnderscoreimageUnderscorelinks: Option[Int],
                multipackUnderscoreinvalid: Option[Int],
                indexedUnderscoreproductUnderscorecountUnderscorelargeUnderscoredelta: Option[Int],
                itemUnderscoreadditionalUnderscoreimageUnderscoredownloadUnderscorefailure: Option[Int],
                optionalUnderscoreproductUnderscorecategoryUnderscoremissing: Option[Int],
                optionalUnderscoreproductUnderscorecategoryUnderscoreinvalid: Option[Int],
                optionalUnderscoreconditionUnderscoremissing: Option[Int],
                optionalUnderscoreconditionUnderscoreinvalid: Option[Int],
                iosUnderscoredeepUnderscorelinkUnderscoreinvalid: Option[Int],
                androidUnderscoredeepUnderscorelinkUnderscoreinvalid: Option[Int],
                availabilityUnderscorenormalized: Option[Int],
                conditionUnderscorenormalized: Option[Int],
                genderUnderscorenormalized: Option[Int],
                sizeUnderscoretypeUnderscorenormalized: Option[Int],
                ageUnderscoregroupUnderscorenormalized: Option[Int],
                utmUnderscoresourceUnderscoreautoUnderscorecorrected: Option[Int],
                countryUnderscoredoesUnderscorenotUnderscoremapUnderscoretoUnderscorecurrency: Option[Int],
                minUnderscoreadUnderscorepriceUnderscoreinvalid: Option[Int]
                )

object CatalogsFeedValidationWarnings {
    /**
     * Creates the codec for converting CatalogsFeedValidationWarnings from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedValidationWarnings] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedValidationWarnings] = deriveEncoder
}
