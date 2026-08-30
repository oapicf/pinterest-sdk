package org.openapitools.server.model


/**
 * Response containing a list of product tags for a pin.
 *
 * @param productTags List of product tags on the pin. for example: ''null''
*/
final case class ProductTagsResponse (
  productTags: Seq[ProductTagItem]
)

