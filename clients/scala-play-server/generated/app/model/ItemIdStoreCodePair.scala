package model

import play.api.libs.json._

/**
  * A pair of item_id and store_code that uniquely identifies a local inventory item
  * @param itemId Catalog item id in the merchant namespace
  * @param storeCode Store code for the local inventory item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ItemIdStoreCodePair(
  itemId: String,
  storeCode: String
)

object ItemIdStoreCodePair {
  implicit lazy val itemIdStoreCodePairJsonFormat: Format[ItemIdStoreCodePair] = Json.format[ItemIdStoreCodePair]
}

