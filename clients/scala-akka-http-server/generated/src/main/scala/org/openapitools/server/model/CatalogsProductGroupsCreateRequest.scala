package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param isFeatured boolean indicator of whether the product group is being featured or not for example: ''null''
 * @param filters  for example: ''null''
 * @param feedId Catalog Feed id pertaining to the catalog product group. for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param catalogId Catalog id pertaining to the hotel product group. for example: ''2680059592705''
*/
final case class CatalogsProductGroupsCreateRequest (
  name: String,
  description: Option[String] = None,
  isFeatured: Option[Boolean] = None,
  filters: CatalogsHotelProductGroupFilters,
  feedId: String,
  catalogType: String,
  catalogId: String
)

