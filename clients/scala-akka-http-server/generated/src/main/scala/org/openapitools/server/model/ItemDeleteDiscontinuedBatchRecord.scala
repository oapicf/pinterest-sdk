package org.openapitools.server.model


/**
 * Object describing an item batch record to discontinue items
 *
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
*/
final case class ItemDeleteDiscontinuedBatchRecord (
  itemId: Option[String] = None
)

