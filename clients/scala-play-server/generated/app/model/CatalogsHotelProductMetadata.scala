package model

import play.api.libs.json._

/**
  * Hotel product metadata entity
  * @param hotelId The user-created unique ID that represents the hotel item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsHotelProductMetadata(
  hotelId: String
)

object CatalogsHotelProductMetadata {
  implicit lazy val catalogsHotelProductMetadataJsonFormat: Format[CatalogsHotelProductMetadata] = Json.format[CatalogsHotelProductMetadata]
}

