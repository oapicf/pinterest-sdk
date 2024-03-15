package model

import play.api.libs.json._

/**
  * Object describing an hotel item batch record
  * @param hotelId The catalog hotel item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

