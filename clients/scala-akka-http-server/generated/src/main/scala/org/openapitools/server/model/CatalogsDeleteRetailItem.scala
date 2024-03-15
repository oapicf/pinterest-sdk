package org.openapitools.server.model


/**
 * An item to be deleted
 *
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
*/
final case class CatalogsDeleteRetailItem (
  itemId: String,
  operation: String
)

