package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param operations Array of inventory operations. Up to 1000 items per request. for example: ''null''
*/
final case class LocalInventoryItemsBatchCreate (
  operations: Seq[LocalInventoryOperation]
)

