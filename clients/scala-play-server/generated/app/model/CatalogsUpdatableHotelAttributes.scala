package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsUpdatableHotelAttributes.
  * @param basePrice Base price of the hotel room per night followed by the ISO currency code
  * @param brand The brand to which this hotel belongs to.
  * @param category The type of property. The category can be any type of internal description desired.
  * @param customLabel0 Custom grouping of hotels
  * @param customLabel1 Custom grouping of hotels
  * @param customLabel2 Custom grouping of hotels
  * @param customLabel3 Custom grouping of hotels
  * @param customLabel4 Custom grouping of hotels
  * @param description Brief description of the hotel.
  * @param latitude Latitude of the hotel.
  * @param link Link to the product page
  * @param longitude Longitude of the hotel.
  * @param name The hotel's name.
  * @param neighborhood A list of neighborhoods where the hotel is located
  * @param salePrice Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsUpdatableHotelAttributes(
  address: Option[CatalogsHotelAddress],
  basePrice: Option[String],
  brand: Option[String],
  category: Option[String],
  customLabel0: Option[String],
  customLabel1: Option[String],
  customLabel2: Option[String],
  customLabel3: Option[String],
  customLabel4: Option[String],
  description: Option[String],
  guestRatings: Option[CatalogsHotelGuestRatings],
  latitude: Option[BigDecimal],
  link: Option[String],
  longitude: Option[BigDecimal],
  name: Option[String],
  neighborhood: Option[List[String]],
  salePrice: Option[String]
)

object CatalogsUpdatableHotelAttributes {
  implicit lazy val catalogsUpdatableHotelAttributesJsonFormat: Format[CatalogsUpdatableHotelAttributes] = Json.format[CatalogsUpdatableHotelAttributes]
}

