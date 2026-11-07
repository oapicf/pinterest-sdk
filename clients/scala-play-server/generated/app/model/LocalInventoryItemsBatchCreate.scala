package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param operations Array of inventory operations. Up to 1000 items per request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LocalInventoryItemsBatchCreate(
  operations: List[LocalInventoryOperation]
)

object LocalInventoryItemsBatchCreate {
  implicit lazy val localInventoryItemsBatchCreateJsonFormat: Format[LocalInventoryItemsBatchCreate] = Json.format[LocalInventoryItemsBatchCreate]
}

