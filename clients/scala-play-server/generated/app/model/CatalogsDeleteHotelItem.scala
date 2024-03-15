package model

import play.api.libs.json._

/**
  * A hotel item to be deleted
  * @param hotelId The catalog hotel id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsDeleteHotelItem(
  hotelId: String,
  operation: CatalogsDeleteHotelItem.Operation.Value
)

object CatalogsDeleteHotelItem {
  implicit lazy val catalogsDeleteHotelItemJsonFormat: Format[CatalogsDeleteHotelItem] = Json.format[CatalogsDeleteHotelItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val DELETE = Value("DELETE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

