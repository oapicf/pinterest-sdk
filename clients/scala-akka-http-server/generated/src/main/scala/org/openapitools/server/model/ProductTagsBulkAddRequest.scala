package org.openapitools.server.model


/**
 * Request body for bulk adding product tags to a pin.
 *
 * @param productTags List of product tags to add. Maximum 24 items allowed. for example: ''null''
*/
final case class ProductTagsBulkAddRequest (
  productTags: Seq[ProductTagItem]
)

