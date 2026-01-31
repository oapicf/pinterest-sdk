package model

import play.api.libs.json._

/**
  * Object describing an hotel item batch record
  * @param hotelId The catalog hotel item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsUpdateHotelItem(
  attributes: CatalogsUpdatableHotelAttributes,
  hotelId: String,
  operation: CatalogsUpdateHotelItem.Operation.Value
)

object CatalogsUpdateHotelItem {
  implicit lazy val catalogsUpdateHotelItemJsonFormat: Format[CatalogsUpdateHotelItem] = Json.format[CatalogsUpdateHotelItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val UPDATE = Value("UPDATE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

