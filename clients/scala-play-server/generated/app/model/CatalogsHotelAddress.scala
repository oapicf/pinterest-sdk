package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelAddress.
  * @param addr1 Primary street address of hotel.
  * @param city City where the hotel is located.
  * @param region State, county, province, where the hotel is located.
  * @param country Country where the hotel is located.
  * @param postalCode Required for countries with a postal code system. Postal or zip code of the hotel.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsHotelAddress(
  addr1: Option[String],
  city: Option[String],
  region: Option[String],
  country: Option[String],
  postalCode: Option[String]
)

object CatalogsHotelAddress {
  implicit lazy val catalogsHotelAddressJsonFormat: Format[CatalogsHotelAddress] = Json.format[CatalogsHotelAddress]
}

