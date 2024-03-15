package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CatalogsHotelAddress
import org.openapitools.models.CatalogsHotelAttributesAllOfMainImage
import org.openapitools.models.CatalogsHotelGuestRatings
import scala.collection.immutable.Seq

/**
 * 
 * @param name The hotel's name.
 * @param link Link to the product page
 * @param description Brief description of the hotel.
 * @param brand The brand to which this hotel belongs to.
 * @param latitude Latitude of the hotel.
 * @param longitude Longitude of the hotel.
 * @param neighborhood A list of neighborhoods where the hotel is located
 * @param address 
 * @param customUnderscorelabelUnderscore0 Custom grouping of hotels
 * @param customUnderscorelabelUnderscore1 Custom grouping of hotels
 * @param customUnderscorelabelUnderscore2 Custom grouping of hotels
 * @param customUnderscorelabelUnderscore3 Custom grouping of hotels
 * @param customUnderscorelabelUnderscore4 Custom grouping of hotels
 * @param category The type of property. The category can be any type of internal description desired.
 * @param baseUnderscoreprice Base price of the hotel room per night followed by the ISO currency code
 * @param saleUnderscoreprice Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
 * @param guestUnderscoreratings 
 * @param mainUnderscoreimage 
 * @param additionalUnderscoreimageUnderscorelink <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
 */
case class CatalogsHotelAttributes(name: Option[String],
                link: Option[String],
                description: Option[String],
                brand: Option[String],
                latitude: Option[BigDecimal],
                longitude: Option[BigDecimal],
                neighborhood: Option[Seq[String]],
                address: Option[CatalogsHotelAddress],
                customUnderscorelabelUnderscore0: Option[String],
                customUnderscorelabelUnderscore1: Option[String],
                customUnderscorelabelUnderscore2: Option[String],
                customUnderscorelabelUnderscore3: Option[String],
                customUnderscorelabelUnderscore4: Option[String],
                category: Option[String],
                baseUnderscoreprice: Option[String],
                saleUnderscoreprice: Option[String],
                guestUnderscoreratings: Option[CatalogsHotelGuestRatings],
                mainUnderscoreimage: Option[CatalogsHotelAttributesAllOfMainImage],
                additionalUnderscoreimageUnderscorelink: Option[Seq[String]]
                )

object CatalogsHotelAttributes {
    /**
     * Creates the codec for converting CatalogsHotelAttributes from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelAttributes] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelAttributes] = deriveEncoder
}
