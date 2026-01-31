package org.openapitools.server.model


/**
 * = retail_product_group =
 *
 * @param catalogId Catalog id pertaining to the retail product group. for example: ''null''
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param createdAt Unix timestamp in seconds of when catalog product group was created. for example: ''1621350033000''
 * @param description  for example: ''null''
 * @param feedId id of the catalogs feed belonging to this catalog product group for example: ''2680059592705''
 * @param filters  for example: ''null''
 * @param id ID of the catalog product group. for example: ''443727193917''
 * @param isFeatured boolean indicator of whether the product group is being featured or not for example: ''null''
 * @param locale  for example: ''null''
 * @param name Name of catalog product group for example: ''Most Popular''
 * @param status  for example: ''null''
 * @param `type`  for example: ''null''
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated. for example: ''1622742155000''
*/
final case class CatalogsRetailProductGroup (
  catalogId: String,
  catalogType: String,
  country: Option[String] = None,
  createdAt: Option[Int] = None,
  description: Option[String] = None,
  feedId: String,
  filters: CatalogsProductGroupFilters,
  id: String,
  isFeatured: Option[Boolean] = None,
  locale: Option[String] = None,
  name: Option[String] = None,
  status: Option[CatalogsProductGroupStatus] = None,
  `type`: CatalogsProductGroupType,
  updatedAt: Option[Int] = None
)

