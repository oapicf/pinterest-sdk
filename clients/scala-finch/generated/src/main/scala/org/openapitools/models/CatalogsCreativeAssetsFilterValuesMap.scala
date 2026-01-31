package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * A map of filter attributes to their available values.
 * @param customUnderscorelabelUnderscore0 
 * @param customUnderscorelabelUnderscore1 
 * @param customUnderscorelabelUnderscore2 
 * @param customUnderscorelabelUnderscore3 
 * @param customUnderscorelabelUnderscore4 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore0 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore1 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore2 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore3 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore4 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore5 
 * @param googleUnderscoreproductUnderscorecategoryUnderscore6 
 * @param mediaUnderscoretype 
 */
case class CatalogsCreativeAssetsFilterValuesMap(customUnderscorelabelUnderscore0: Option[Seq[String]],
                customUnderscorelabelUnderscore1: Option[Seq[String]],
                customUnderscorelabelUnderscore2: Option[Seq[String]],
                customUnderscorelabelUnderscore3: Option[Seq[String]],
                customUnderscorelabelUnderscore4: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore0: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore1: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore2: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore3: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore4: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore5: Option[Seq[String]],
                googleUnderscoreproductUnderscorecategoryUnderscore6: Option[Seq[String]],
                mediaUnderscoretype: Option[Seq[String]]
                )

object CatalogsCreativeAssetsFilterValuesMap {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsFilterValuesMap from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsFilterValuesMap] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsFilterValuesMap] = deriveEncoder
}
