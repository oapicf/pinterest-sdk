package org.openapitools.server.model


/**
 * = product_groups_update_request =
 *
 * Request object for updating a product group.
 *
 * @param feedId Catalog Feed id pertaining to the catalog product group. for example: ''2680059592705''
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
*/
final case class CatalogsProductGroupUpdateRequest (
  feedId: String,
  name: String,
  description: Option[String],
  filters: CatalogsProductGroupFilters
)

