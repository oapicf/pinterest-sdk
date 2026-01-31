package model

import play.api.libs.json._

/**
  * A hotel item to be created.
  * @param hotelId The catalog hotel id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreateHotelItem(
  hotelId: String,
  operation: CatalogsCreateHotelItem.Operation.Value,
  attributes: CatalogsHotelAttributes
)

object CatalogsCreateHotelItem {
  implicit lazy val catalogsCreateHotelItemJsonFormat: Format[CatalogsCreateHotelItem] = Json.format[CatalogsCreateHotelItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val CREATE = Value("CREATE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

