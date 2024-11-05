package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param isFeatured boolean indicator of whether the product group is being featured or not for example: ''null''
 * @param filters  for example: ''null''
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param locale  for example: ''null''
*/
final case class CatalogsProductGroupsUpdateRequest (
  name: Option[String] = None,
  description: Option[String] = None,
  isFeatured: Option[Boolean] = None,
  filters: Option[CatalogsCreativeAssetsProductGroupFilters] = None,
  catalogType: Option[String] = None,
  country: Option[Country] = None,
  locale: Option[CatalogsLocale] = None
)

