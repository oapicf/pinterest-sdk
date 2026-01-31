package model

import play.api.libs.json._

/**
  * Object describing an hotel item batch record
  * @param hotelId The catalog hotel item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsUpdateHotelItem(
  hotelId: String,
  operation: CatalogsUpdateHotelItem.Operation.Value,
  attributes: CatalogsUpdatableHotelAttributes
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

