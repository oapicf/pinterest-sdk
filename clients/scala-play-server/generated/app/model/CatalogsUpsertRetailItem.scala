package model

import play.api.libs.json._

/**
  * An item to be upserted
  * @param itemId The catalog item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsUpsertRetailItem(
  itemId: String,
  operation: CatalogsUpsertRetailItem.Operation.Value,
  attributes: ItemAttributesRequest
)

object CatalogsUpsertRetailItem {
  implicit lazy val catalogsUpsertRetailItemJsonFormat: Format[CatalogsUpsertRetailItem] = Json.format[CatalogsUpsertRetailItem]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val UPSERT = Value("UPSERT")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

