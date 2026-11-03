package model

import play.api.libs.json._

/**
  * A pair of item_id and store_code that uniquely identifies a local inventory item
  * @param itemId Catalog item id in the merchant namespace
  * @param storeCode Store code for the local inventory item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemIdStoreCodePair(
  itemId: String,
  storeCode: String
)

object ItemIdStoreCodePair {
  implicit lazy val itemIdStoreCodePairJsonFormat: Format[ItemIdStoreCodePair] = Json.format[ItemIdStoreCodePair]
}

