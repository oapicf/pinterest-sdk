package org.openapitools.server.model


/**
 * = catalog based product group =
 *
 * Request object to list products for a given catalog_id and product group filter.
 *
 * @param catalogId Catalog ID pertaining to the product group. for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param filters  for example: ''null''
 * @param locale  for example: ''null''
*/
final case class CatalogsVerticalsListProductsByCatalogBasedFilterRequest (
  catalogId: String,
  catalogType: String,
  country: Country,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  locale: CatalogsLocale
)

