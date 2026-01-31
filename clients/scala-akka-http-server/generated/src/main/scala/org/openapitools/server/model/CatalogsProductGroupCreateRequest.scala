package org.openapitools.server.model


/**
 * = retail feed based =
 *
 * Request object for creating a product group.
 *
 * @param description  for example: ''null''
 * @param feedId Catalog Feed id pertaining to the catalog product group. for example: ''2680059592705''
 * @param filters  for example: ''null''
 * @param isFeatured boolean indicator of whether the product group is being featured or not for example: ''null''
 * @param name  for example: ''null''
*/
final case class CatalogsProductGroupCreateRequest (
  description: Option[String] = None,
  feedId: String,
  filters: CatalogsProductGroupFiltersRequest,
  isFeatured: Option[Boolean] = None,
  name: String
)

