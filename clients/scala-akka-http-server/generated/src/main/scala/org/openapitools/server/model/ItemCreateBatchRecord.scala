package org.openapitools.server.model


/**
 * Object describing an item batch record to create items
 *
 * @param attributes  for example: ''null''
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
*/
final case class ItemCreateBatchRecord (
  attributes: Option[ItemAttributesRequest] = None,
  itemId: Option[String] = None
)

