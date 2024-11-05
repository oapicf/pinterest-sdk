package model

import play.api.libs.json._

/**
  * A hotel item to be deleted
  * @param hotelId The catalog hotel id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

