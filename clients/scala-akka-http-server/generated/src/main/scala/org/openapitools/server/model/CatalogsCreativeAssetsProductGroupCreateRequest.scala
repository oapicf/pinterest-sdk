package org.openapitools.server.model


/**
 * = creative_assets_product_groups_create_request =
 *
 * Request object for creating a creative assets product group.
 *
 * @param catalogType  for example: ''null''
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param catalogId Catalog id pertaining to the creative assets product group. for example: ''2680059592705''
*/
final case class CatalogsCreativeAssetsProductGroupCreateRequest (
  catalogType: String,
  name: String,
  description: Option[String] = None,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  catalogId: String
)

