package org.openapitools.server.model


/**
 * Request object to list products for a given product group filter.
 *
 * @param feedId Catalog Feed id pertaining to the catalog product group filter. for example: ''2680059592705''
 * @param filters  for example: ''null''
 * @param catalogId Catalog ID pertaining to the product group. for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param locale  for example: ''null''
*/
final case class CatalogsListProductsByFilterRequest (
  feedId: String,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  catalogId: String,
  catalogType: String,
  country: Country,
  locale: CatalogsLocale
)

