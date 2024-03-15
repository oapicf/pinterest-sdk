package org.openapitools.server.model


/**
 * Object describing an item batch record to upsert items
 *
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param attributes  for example: ''null''
*/
final case class ItemUpsertBatchRecord (
  itemId: Option[String] = None,
  attributes: Option[ItemAttributes] = None
)

