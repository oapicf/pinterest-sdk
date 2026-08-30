package org.openapitools.server.model


/**
 * = catalog based =
 *
 * Request object for updating a catalog based product group.
 *
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param locale  for example: ''null''
 * @param name Name of catalog product group for example: ''Most Popular''
*/
final case class CatalogsVerticalProductGroupUpdateRequest (
  catalogType: Option[String] = None,
  country: Option[Country] = None,
  description: Option[String] = None,
  filters: Option[CatalogsCreativeAssetsProductGroupFilters] = None,
  locale: Option[CatalogsLocale] = None,
  name: Option[String] = None
)

