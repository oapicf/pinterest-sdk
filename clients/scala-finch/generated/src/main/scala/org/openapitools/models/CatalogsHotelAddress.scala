package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param addr1 Primary street address of hotel.
 * @param city City where the hotel is located.
 * @param region State, county, province, where the hotel is located.
 * @param country Country where the hotel is located.
 * @param postalUnderscorecode Required for countries with a postal code system. Postal or zip code of the hotel.
 */
case class CatalogsHotelAddress(addr1: Option[String],
                city: Option[String],
                region: Option[String],
                country: Option[String],
                postalUnderscorecode: Option[String]
                )

object CatalogsHotelAddress {
    /**
     * Creates the codec for converting CatalogsHotelAddress from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelAddress] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelAddress] = deriveEncoder
}
