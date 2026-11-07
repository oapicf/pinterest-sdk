package model

import play.api.libs.json._

/**
  * A hotel item to be created.
  * @param hotelId The catalog hotel id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsCreateHotelItem(
  attributes: CatalogsHotelAttributes,
  hotelId: String,
  operation: CatalogsCreateHotelItem.Operation.Value
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

