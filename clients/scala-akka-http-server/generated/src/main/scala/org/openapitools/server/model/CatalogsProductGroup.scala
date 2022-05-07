package org.openapitools.server.model


/**
 * catalog product group entity
 *
 * @param id ID of the catalog product group. for example: ''2680059592705''
 * @param name Name of catalog product group for example: ''Most Popular''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param `type`  for example: ''null''
 * @param status  for example: ''null''
 * @param feedId id of the catalogs feed belonging to this catalog product group for example: ''null''
 * @param createdAt Unix timestamp in seconds of when catalog product group was created. for example: ''1621350033000''
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated. for example: ''1622742155000''
*/
final case class CatalogsProductGroup (
  id: String,
  name: Option[String],
  description: Option[String],
  filters: CatalogsProductGroupFilters,
  `type`: Option[CatalogsProductGroupType],
  status: Option[CatalogsProductGroupStatus],
  feedId: Option[String],
  createdAt: Option[Int],
  updatedAt: Option[Int]
)

