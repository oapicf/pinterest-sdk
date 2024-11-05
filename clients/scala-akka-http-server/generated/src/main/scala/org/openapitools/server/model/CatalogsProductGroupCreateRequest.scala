package org.openapitools.server.model


/**
 * = retail feed based =
 *
 * Request object for creating a product group.
 *
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param isFeatured boolean indicator of whether the product group is being featured or not for example: ''null''
 * @param filters  for example: ''null''
 * @param feedId Catalog Feed id pertaining to the catalog product group. for example: ''2680059592705''
*/
final case class CatalogsProductGroupCreateRequest (
  name: String,
  description: Option[String] = None,
  isFeatured: Option[Boolean] = None,
  filters: CatalogsProductGroupFiltersRequest,
  feedId: String
)

