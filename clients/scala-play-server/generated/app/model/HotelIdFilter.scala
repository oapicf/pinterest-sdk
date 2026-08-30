package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for HotelIdFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class HotelIdFilter(
  HOTEL_ID: CatalogsProductGroupMultipleStringCriteria
)

object HotelIdFilter {
  implicit lazy val hotelIdFilterJsonFormat: Format[HotelIdFilter] = Json.format[HotelIdFilter]
}

