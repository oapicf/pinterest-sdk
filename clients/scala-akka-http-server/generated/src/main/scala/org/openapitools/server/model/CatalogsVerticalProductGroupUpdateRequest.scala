package org.openapitools.server.model


/**
 * = catalog based =
 *
 * Request object for updating a catalog based product group.
 *
 * @param catalogType  for example: ''null''
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param country  for example: ''null''
 * @param locale  for example: ''null''
*/
final case class CatalogsVerticalProductGroupUpdateRequest (
  catalogType: Option[String] = None,
  name: Option[String] = None,
  description: Option[String] = None,
  filters: Option[CatalogsCreativeAssetsProductGroupFilters] = None,
  country: Option[Country] = None,
  locale: Option[CatalogsLocale] = None
)

