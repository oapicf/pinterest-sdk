package org.openapitools.server.model


/**
 * Object describing an item batch record
 *
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param attributes  for example: ''null''
*/
final case class ItemBatchRecord (
  itemId: Option[String],
  attributes: Option[ItemAttributes]
)

