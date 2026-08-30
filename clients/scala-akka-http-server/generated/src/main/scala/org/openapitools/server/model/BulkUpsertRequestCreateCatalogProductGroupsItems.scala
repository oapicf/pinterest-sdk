package org.openapitools.server.model


/**
 * @param description  for example: ''null''
 * @param feedId Catalog Feed id pertaining to the catalog product group. for example: ''2680059592705''
 * @param filters  for example: ''null''
 * @param isFeatured boolean indicator of whether the product group is being featured or not for example: ''null''
 * @param name  for example: ''null''
 * @param catalogId Catalog ID pertaining to the product group. for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param locale  for example: ''null''
*/
final case class BulkUpsertRequestCreateCatalogProductGroupsItems (
  description: Option[String] = None,
  feedId: String,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  isFeatured: Option[Boolean] = None,
  name: String,
  catalogId: String,
  catalogType: String,
  country: Option[Country] = None,
  locale: Option[CatalogsLocale] = None
)

