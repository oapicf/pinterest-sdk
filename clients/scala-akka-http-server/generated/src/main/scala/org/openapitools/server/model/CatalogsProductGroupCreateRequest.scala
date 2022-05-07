package org.openapitools.server.model


/**
 * = product_groups_create_request =
 *
 * Request object for creating a product group.
 *
 * @param feedId Catalog Feed id pertaining to the catalog product group. for example: ''2680059592705''
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
*/
final case class CatalogsProductGroupCreateRequest (
  feedId: String,
  name: String,
  description: Option[String],
  filters: CatalogsProductGroupFilters
)

