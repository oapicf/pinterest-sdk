package org.openapitools.server.model


/**
 * = product_group =
 *
 * @param catalogType  for example: ''null''
 * @param id ID of the creative assets product group. for example: ''443727193917''
 * @param name Name of creative assets product group for example: ''Most Popular''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param isFeatured boolean indicator of whether the product group is being featured or not for example: ''null''
 * @param `type`  for example: ''null''
 * @param status  for example: ''null''
 * @param createdAt Unix timestamp in seconds of when catalog product group was created. for example: ''1621350033000''
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated. for example: ''1622742155000''
 * @param catalogId Catalog id pertaining to the creative assets product group. for example: ''null''
 * @param feedId id of the catalogs feed belonging to this catalog product group for example: ''2680059592705''
 * @param country  for example: ''null''
 * @param locale  for example: ''null''
*/
final case class CatalogsVerticalProductGroup (
  catalogType: String,
  id: String,
  name: Option[String] = None,
  description: Option[String] = None,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  isFeatured: Option[Boolean] = None,
  `type`: Option[CatalogsProductGroupType] = None,
  status: Option[CatalogsProductGroupStatus] = None,
  createdAt: Option[Int] = None,
  updatedAt: Option[Int] = None,
  catalogId: String,
  feedId: String,
  country: Option[String] = None,
  locale: Option[String] = None
)

