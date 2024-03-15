package model

import play.api.libs.json._

/**
  * An item to be created
  * @param itemId The catalog item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsCreateRetailItem(
  itemId: String,
  operation: CatalogsCreateRetailItem.Operation.Value,
  attributes: ItemAttributes
)

object CatalogsCreateRetailItem {
  implicit lazy val catalogsCreateRetailItemJsonFormat: Format[CatalogsCreateRetailItem] = Json.format[CatalogsCreateRetailItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val CREATE = Value("CREATE")
    val UPDATE = Value("UPDATE")
    val UPSERT = Value("UPSERT")
    val DELETE = Value("DELETE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

