package org.openapitools.server.model


/**
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param isFeatured boolean indicator of whether the product group is being featured or not for example: ''null''
 * @param name Name of catalog product group for example: ''Most Popular''
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param locale  for example: ''null''
*/
final case class CatalogsProductGroupsUpdateRequestSchema (
  description: Option[String] = None,
  filters: Option[CatalogsCreativeAssetsProductGroupFilters] = None,
  isFeatured: Option[Boolean] = None,
  name: Option[String] = None,
  catalogType: Option[String] = None,
  country: Option[Country] = None,
  locale: Option[CatalogsLocale] = None
)

