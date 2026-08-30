package org.openapitools.server.model


/**
 * = hotel_product_groups_create_request =
 *
 * Request object for creating a hotel product group.
 *
 * @param catalogId Catalog ID pertaining to the product group. for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param name  for example: ''null''
*/
final case class CatalogsHotelProductGroupCreateRequest (
  catalogId: String,
  catalogType: String,
  description: Option[String] = None,
  filters: CatalogsHotelProductGroupFilters,
  name: String
)

