package org.openapitools.server.model


/**
 * = catalog based =
 *
 * Request object for creating a catalog based product group.
 *
 * @param catalogId Catalog ID pertaining to the product group. for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param locale  for example: ''null''
 * @param name  for example: ''null''
*/
final case class CatalogsVerticalProductGroupCreateRequest (
  catalogId: String,
  catalogType: String,
  country: Option[Country] = None,
  description: Option[String] = None,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  locale: Option[CatalogsLocale] = None,
  name: String
)

