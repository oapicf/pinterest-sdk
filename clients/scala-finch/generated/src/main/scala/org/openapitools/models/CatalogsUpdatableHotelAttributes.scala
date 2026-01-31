package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CatalogsHotelAddress
import org.openapitools.models.CatalogsHotelGuestRatings
import scala.collection.immutable.Seq

/**
 * 
 * @param address 
 * @param baseUnderscoreprice Base price of the hotel room per night followed by the ISO currency code
 * @param brand The brand to which this hotel belongs to.
 * @param category The type of property. The category can be any type of internal description desired.
 * @param customUnderscorelabelUnderscore0 Custom grouping of hotels
 * @param customUnderscorelabelUnderscore1 Custom grouping of hotels
 * @param customUnderscorelabelUnderscore2 Custom grouping of hotels
 * @param customUnderscorelabelUnderscore3 Custom grouping of hotels
 * @param customUnderscorelabelUnderscore4 Custom grouping of hotels
 * @param description Brief description of the hotel.
 * @param guestUnderscoreratings 
 * @param latitude Latitude of the hotel.
 * @param link Link to the product page
 * @param longitude Longitude of the hotel.
 * @param name The hotel's name.
 * @param neighborhood A list of neighborhoods where the hotel is located
 * @param saleUnderscoreprice Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
 */
case class CatalogsUpdatableHotelAttributes(address: Option[CatalogsHotelAddress],
                baseUnderscoreprice: Option[String],
                brand: Option[String],
                category: Option[String],
                customUnderscorelabelUnderscore0: Option[String],
                customUnderscorelabelUnderscore1: Option[String],
                customUnderscorelabelUnderscore2: Option[String],
                customUnderscorelabelUnderscore3: Option[String],
                customUnderscorelabelUnderscore4: Option[String],
                description: Option[String],
                guestUnderscoreratings: Option[CatalogsHotelGuestRatings],
                latitude: Option[BigDecimal],
                link: Option[String],
                longitude: Option[BigDecimal],
                name: Option[String],
                neighborhood: Option[Seq[String]],
                saleUnderscoreprice: Option[String]
                )

object CatalogsUpdatableHotelAttributes {
    /**
     * Creates the codec for converting CatalogsUpdatableHotelAttributes from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsUpdatableHotelAttributes] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsUpdatableHotelAttributes] = deriveEncoder
}
