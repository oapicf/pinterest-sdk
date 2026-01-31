package model

import play.api.libs.json._

/**
  * An item to be upserted
  * @param itemId The catalog item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

