package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsUpdatableHotelAttributes.
  * @param name The hotel's name.
  * @param link Link to the product page
  * @param description Brief description of the hotel.
  * @param brand The brand to which this hotel belongs to.
  * @param latitude Latitude of the hotel.
  * @param longitude Longitude of the hotel.
  * @param neighborhood A list of neighborhoods where the hotel is located
  * @param customLabel0 Custom grouping of hotels
  * @param customLabel1 Custom grouping of hotels
  * @param customLabel2 Custom grouping of hotels
  * @param customLabel3 Custom grouping of hotels
  * @param customLabel4 Custom grouping of hotels
  * @param category The type of property. The category can be any type of internal description desired.
  * @param basePrice Base price of the hotel room per night followed by the ISO currency code
  * @param salePrice Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsUpdatableHotelAttributes(
  name: Option[String],
  link: Option[String],
  description: Option[String],
  brand: Option[String],
  latitude: Option[BigDecimal],
  longitude: Option[BigDecimal],
  neighborhood: Option[List[String]],
  address: Option[CatalogsHotelAddress],
  customLabel0: Option[String],
  customLabel1: Option[String],
  customLabel2: Option[String],
  customLabel3: Option[String],
  customLabel4: Option[String],
  category: Option[String],
  basePrice: Option[String],
  salePrice: Option[String],
  guestRatings: Option[CatalogsHotelGuestRatings]
)

object CatalogsUpdatableHotelAttributes {
  implicit lazy val catalogsUpdatableHotelAttributesJsonFormat: Format[CatalogsUpdatableHotelAttributes] = Json.format[CatalogsUpdatableHotelAttributes]
}

