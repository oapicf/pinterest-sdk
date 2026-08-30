package model

import play.api.libs.json._

/**
  * Object describing a hotel record
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  * @param pins The pins mapped to the item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelItemResponse(
  attributes: Option[CatalogsHotelAttributes],
  catalogType: CatalogsHotelItemResponse.CatalogType.Value,
  hotelId: Option[String],
  itemResponseKind: CatalogsHotelItemResponse.ItemResponseKind.Value,
  pins: Option[List[Pin]]
)

object CatalogsHotelItemResponse {
  implicit lazy val catalogsHotelItemResponseJsonFormat: Format[CatalogsHotelItemResponse] = Json.format[CatalogsHotelItemResponse]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ItemResponseKind extends Enumeration {
    val HotelItem = Value("hotel_item")

    type ItemResponseKind = Value
    implicit lazy val ItemResponseKindJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

