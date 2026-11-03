package model

import play.api.libs.json._

/**
  * Model for getting local inventory items
  * @param items Array of local inventory items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LocalInventoryItemsGet(
  items: List[LocalInventoryItemResponse]
)

object LocalInventoryItemsGet {
  implicit lazy val localInventoryItemsGetJsonFormat: Format[LocalInventoryItemsGet] = Json.format[LocalInventoryItemsGet]
}

