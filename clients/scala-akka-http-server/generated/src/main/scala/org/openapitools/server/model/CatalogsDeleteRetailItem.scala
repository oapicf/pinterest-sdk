package org.openapitools.server.model


/**
 * An item to be deleted
 *
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param lastUpdatedTime The millisecond timestamp when the item was lastly modified by the merchant. for example: ''1641483432072''
 * @param operation  for example: ''null''
*/
final case class CatalogsDeleteRetailItem (
  itemId: String,
  lastUpdatedTime: Option[Long] = None,
  operation: String
)

