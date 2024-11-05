package org.openapitools.server.model


/**
 * = catalog based product group =
 *
 * Request object to list products for a given catalog_id and product group filter.
 *
 * @param catalogType  for example: ''null''
 * @param catalogId Catalog id pertaining to the creative assets product group. for example: ''2680059592705''
 * @param filters  for example: ''null''
 * @param country  for example: ''null''
 * @param locale  for example: ''null''
*/
final case class CatalogsVerticalsListProductsByCatalogBasedFilterRequest (
  catalogType: String,
  catalogId: String,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  country: Country,
  locale: CatalogsLocale
)

