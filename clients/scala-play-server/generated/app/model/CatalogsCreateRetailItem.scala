package model

import play.api.libs.json._

/**
  * An item to be created
  * @param itemId The catalog item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreateRetailItem(
  attributes: ItemAttributesRequest,
  itemId: String,
  operation: CatalogsCreateRetailItem.Operation.Value
)

object CatalogsCreateRetailItem {
  implicit lazy val catalogsCreateRetailItemJsonFormat: Format[CatalogsCreateRetailItem] = Json.format[CatalogsCreateRetailItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val CREATE = Value("CREATE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

