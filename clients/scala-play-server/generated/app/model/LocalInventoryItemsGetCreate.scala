package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param itemFilters Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LocalInventoryItemsGetCreate(
  itemFilters: List[ItemIdStoreCodePair]
)

object LocalInventoryItemsGetCreate {
  implicit lazy val localInventoryItemsGetCreateJsonFormat: Format[LocalInventoryItemsGetCreate] = Json.format[LocalInventoryItemsGetCreate]
}

