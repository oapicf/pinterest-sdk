package model

import play.api.libs.json._

/**
  * An item to be updated
  * @param itemId The catalog item id in the merchant namespace
  * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsUpdateRetailItem(
  itemId: String,
  operation: CatalogsUpdateRetailItem.Operation.Value,
  attributes: UpdatableItemAttributes,
  updateMask: Option[List[UpdateMaskFieldType]]
)

object CatalogsUpdateRetailItem {
  implicit lazy val catalogsUpdateRetailItemJsonFormat: Format[CatalogsUpdateRetailItem] = Json.format[CatalogsUpdateRetailItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val UPDATE = Value("UPDATE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

