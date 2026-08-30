package org.openapitools.server.model


/**
 * Request body for bulk deleting product tags from a pin.
 *
 * @param productTags List of product tags to delete. for example: ''null''
*/
final case class ProductTagsBulkDeleteRequest (
  productTags: Seq[ProductTagItem]
)

