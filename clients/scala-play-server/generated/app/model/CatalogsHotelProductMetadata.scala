package model

import play.api.libs.json._

/**
  * Hotel product metadata entity
  * @param hotelId The user-created unique ID that represents the hotel item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelProductMetadata(
  hotelId: String
)

object CatalogsHotelProductMetadata {
  implicit lazy val catalogsHotelProductMetadataJsonFormat: Format[CatalogsHotelProductMetadata] = Json.format[CatalogsHotelProductMetadata]
}

