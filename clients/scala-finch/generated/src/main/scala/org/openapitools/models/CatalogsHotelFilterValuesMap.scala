package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * A map of filter attributes to their available values.
 * @param brand 
 * @param customUnderscorelabelUnderscore0 
 * @param customUnderscorelabelUnderscore1 
 * @param customUnderscorelabelUnderscore2 
 * @param customUnderscorelabelUnderscore3 
 * @param customUnderscorelabelUnderscore4 
 */
case class CatalogsHotelFilterValuesMap(brand: Option[Seq[String]],
                customUnderscorelabelUnderscore0: Option[Seq[String]],
                customUnderscorelabelUnderscore1: Option[Seq[String]],
                customUnderscorelabelUnderscore2: Option[Seq[String]],
                customUnderscorelabelUnderscore3: Option[Seq[String]],
                customUnderscorelabelUnderscore4: Option[Seq[String]]
                )

object CatalogsHotelFilterValuesMap {
    /**
     * Creates the codec for converting CatalogsHotelFilterValuesMap from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelFilterValuesMap] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelFilterValuesMap] = deriveEncoder
}
