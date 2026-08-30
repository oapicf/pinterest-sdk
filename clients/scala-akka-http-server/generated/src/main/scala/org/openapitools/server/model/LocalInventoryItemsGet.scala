package org.openapitools.server.model


/**
 * Model for getting local inventory items
 *
 * @param items Array of local inventory items for example: ''null''
*/
final case class LocalInventoryItemsGet (
  items: Seq[LocalInventoryItemResponse]
)

