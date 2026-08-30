package org.openapitools.server.model


/**
 * = hotel_product_group =
 *
 * @param catalogId Catalog ID pertaining to the product group. for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param createdAt Unix timestamp in seconds of when catalog product group was created. for example: ''1621350033000''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param id ID of the catalog product group. for example: ''443727193917''
 * @param name Name of catalog product group for example: ''Most Popular''
 * @param `type`  for example: ''null''
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated. for example: ''1622742155000''
*/
final case class CatalogsHotelProductGroup (
  catalogId: String,
  catalogType: String,
  createdAt: Option[Int] = None,
  description: Option[String] = None,
  filters: CatalogsHotelProductGroupFilters,
  id: String,
  name: Option[String] = None,
  `type`: CatalogsHotelProductGroupType,
  updatedAt: Option[Int] = None
)

