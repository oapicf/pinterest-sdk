package org.openapitools.server.model


/**
 * = retail_list_products_by_catalog_based_filter_request =
 *
 * Request object to list products for a given retail catalog_id and product group filter.
 *
 * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. for example: ''null''
 * @param catalogId Catalog id pertaining to the retail product group. for example: ''2680059592705''
 * @param filters  for example: ''null''
 * @param country  for example: ''null''
 * @param locale  for example: ''null''
*/
final case class CatalogsRetailListProductsByCatalogBasedFilterRequest (
  catalogType: String,
  catalogId: String,
  filters: CatalogsProductGroupFilters,
  country: Country,
  locale: CatalogsLocale
)

