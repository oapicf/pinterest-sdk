package model

import play.api.libs.json._

/**
  * A hotel item to be upserted.
  * @param hotelId The catalog hotel id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsUpsertHotelItem(
  attributes: CatalogsHotelAttributes,
  hotelId: String,
  operation: CatalogsUpsertHotelItem.Operation.Value
)

object CatalogsUpsertHotelItem {
  implicit lazy val catalogsUpsertHotelItemJsonFormat: Format[CatalogsUpsertHotelItem] = Json.format[CatalogsUpsertHotelItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val UPSERT = Value("UPSERT")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

