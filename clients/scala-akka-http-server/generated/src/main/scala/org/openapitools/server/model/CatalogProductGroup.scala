package org.openapitools.server.model


/**
 * = CatalogProductGroup =
 *
 * non-promoted catalog product group entity
 *
 * @param id ID of the catalog product group. for example: ''2680059592705''
 * @param merchantId Merchant ID pertaining to the owner of the catalog product group. for example: ''2680059592705''
 * @param name Name of catalog product group for example: ''Most Popular''
 * @param filters Object holding a list of filters for example: ''{"1":["123chars_title"]}''
 * @param filterV2 Object holding a list of filters for example: ''{"1":["123chars_title"]}''
 * @param `type`  for example: ''null''
 * @param status  for example: ''null''
 * @param feedProfileId id of the feed profile belonging to this catalog product group for example: ''null''
 * @param createdAt Unix timestamp in seconds of when catalog product group was created. for example: ''1621350033000''
 * @param lastUpdate Unix timestamp in seconds of last time catalog product group was updated. for example: ''1622742155000''
 * @param productCount Amount of products in the catalog product group for example: ''6''
 * @param featuredPosition index of the featured position of the catalog product group for example: ''2''
*/
final case class CatalogProductGroup (
  id: Option[String] = None,
  merchantId: Option[String] = None,
  name: Option[String] = None,
  filters: Option[Any] = None,
  filterV2: Option[Any] = None,
  `type`: Option[Board] = None,
  status: Option[EntityStatus] = None,
  feedProfileId: Option[String] = None,
  createdAt: Option[Int] = None,
  lastUpdate: Option[Int] = None,
  productCount: Option[Int] = None,
  featuredPosition: Option[Int] = None
)

