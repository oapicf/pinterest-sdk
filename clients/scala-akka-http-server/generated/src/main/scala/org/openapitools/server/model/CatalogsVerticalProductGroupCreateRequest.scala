package org.openapitools.server.model


/**
 * = catalog based =
 *
 * Request object for creating a catalog based product group.
 *
 * @param catalogType  for example: ''null''
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param catalogId Catalog id pertaining to the creative assets product group. for example: ''2680059592705''
 * @param country  for example: ''null''
 * @param locale  for example: ''null''
*/
final case class CatalogsVerticalProductGroupCreateRequest (
  catalogType: String,
  name: String,
  description: Option[String] = None,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  catalogId: String,
  country: Country,
  locale: CatalogsLocale
)

