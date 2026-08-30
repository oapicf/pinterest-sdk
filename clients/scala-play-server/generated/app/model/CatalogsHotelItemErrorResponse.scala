package model

import play.api.libs.json._

/**
  * Object describing a hotel item error
  * @param errors Array with the errors for the item id requested
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelItemErrorResponse(
  catalogType: CatalogsHotelItemErrorResponse.CatalogType.Value,
  errors: List[ItemValidationEvent],
  hotelId: Option[String],
  itemResponseKind: CatalogsHotelItemErrorResponse.ItemResponseKind.Value
)

object CatalogsHotelItemErrorResponse {
  implicit lazy val catalogsHotelItemErrorResponseJsonFormat: Format[CatalogsHotelItemErrorResponse] = Json.format[CatalogsHotelItemErrorResponse]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ItemResponseKind extends Enumeration {
    val HotelItemError = Value("hotel_item_error")

    type ItemResponseKind = Value
    implicit lazy val ItemResponseKindJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

