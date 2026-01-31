package org.openapitools.server.model


/**
 * = creative_assets_product_groups_create_request =
 *
 * Request object for creating a creative assets product group.
 *
 * @param catalogId Catalog id pertaining to the creative assets product group. for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param name  for example: ''null''
*/
final case class CatalogsCreativeAssetsProductGroupCreateRequest (
  catalogId: String,
  catalogType: String,
  description: Option[String] = None,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  name: String
)

