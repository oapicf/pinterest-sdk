package org.openapitools.server.model


/**
 * = creative_assets_product_group =
 *
 * @param catalogType  for example: ''null''
 * @param id ID of the creative assets product group. for example: ''443727193917''
 * @param name Name of creative assets product group for example: ''Most Popular''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param createdAt Unix timestamp in seconds of when catalog product group was created. for example: ''1621350033000''
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated. for example: ''1622742155000''
 * @param catalogId Catalog id pertaining to the creative assets product group. for example: ''null''
*/
final case class CatalogsCreativeAssetsProductGroup (
  catalogType: String,
  id: String,
  name: Option[String] = None,
  description: Option[String] = None,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  createdAt: Option[Int] = None,
  updatedAt: Option[Int] = None,
  catalogId: String
)

