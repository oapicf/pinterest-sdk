package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * A map of filter attributes to their available values.
 * @param adUnderscoreimageUnderscoretags 
 * @param adUnderscorevideoUnderscoretags 
 * @param availability 
 * @param brand 
 * @param condition 
 * @param customUnderscorelabelUnderscore0 
 * @param customUnderscorelabelUnderscore1 
 * @param customUnderscorelabelUnderscore2 
 * @param customUnderscorelabelUnderscore3 
 * @param customUnderscorelabelUnderscore4 
 * @param gender 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore0 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore1 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore2 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore3 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore4 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore5 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore6 
 * @param mediaUnderscoretype 
 * @param productUnderscoretypeUnderscore0 
 * @param productUnderscoretypeUnderscore1 
 * @param productUnderscoretypeUnderscore2 
 * @param productUnderscoretypeUnderscore3 
 * @param productUnderscoretypeUnderscore4 
 */
case class CatalogsRetailFilterValuesMap(adUnderscoreimageUnderscoretags: Option[Seq[String]],
                adUnderscorevideoUnderscoretags: Option[Seq[String]],
                availability: Option[Seq[String]],
                brand: Option[Seq[String]],
                condition: Option[Seq[String]],
                customUnderscorelabelUnderscore0: Option[Seq[String]],
                customUnderscorelabelUnderscore1: Option[Seq[String]],
                customUnderscorelabelUnderscore2: Option[Seq[String]],
                customUnderscorelabelUnderscore3: Option[Seq[String]],
                customUnderscorelabelUnderscore4: Option[Seq[String]],
                gender: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore0: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore1: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore2: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore3: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore4: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore5: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore6: Option[Seq[String]],
                mediaUnderscoretype: Option[Seq[String]],
                productUnderscoretypeUnderscore0: Option[Seq[String]],
                productUnderscoretypeUnderscore1: Option[Seq[String]],
                productUnderscoretypeUnderscore2: Option[Seq[String]],
                productUnderscoretypeUnderscore3: Option[Seq[String]],
                productUnderscoretypeUnderscore4: Option[Seq[String]]
                )

object CatalogsRetailFilterValuesMap {
    /**
     * Creates the codec for converting CatalogsRetailFilterValuesMap from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailFilterValuesMap] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailFilterValuesMap] = deriveEncoder
}
