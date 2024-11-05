package model

import play.api.libs.json._

/**
  * An item to be deleted
  * @param itemId The catalog item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsDeleteRetailItem(
  itemId: String,
  operation: CatalogsDeleteRetailItem.Operation.Value
)

object CatalogsDeleteRetailItem {
  implicit lazy val catalogsDeleteRetailItemJsonFormat: Format[CatalogsDeleteRetailItem] = Json.format[CatalogsDeleteRetailItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val DELETE = Value("DELETE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

