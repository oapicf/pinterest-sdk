package org.openapitools.server.model


/**
 * = creative_assets_list_products_by_catalog_based_filter_request =
 *
 * Request object to list products for a given creative assets catalog_id and product group filter.
 *
 * @param catalogId Catalog id pertaining to the creative assets product group. for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param filters  for example: ''null''
*/
final case class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest (
  catalogId: String,
  catalogType: String,
  filters: CatalogsCreativeAssetsProductGroupFilters
)

