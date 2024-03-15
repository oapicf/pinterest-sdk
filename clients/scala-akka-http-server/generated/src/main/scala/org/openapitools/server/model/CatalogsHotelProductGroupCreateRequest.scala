package org.openapitools.server.model


/**
 * = hotel_product_groups_create_request =
 *
 * Request object for creating a hotel product group.
 *
 * @param catalogType  for example: ''null''
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param catalogId Catalog id pertaining to the hotel product group. for example: ''2680059592705''
*/
final case class CatalogsHotelProductGroupCreateRequest (
  catalogType: String,
  name: String,
  description: Option[String] = None,
  filters: CatalogsHotelProductGroupFilters,
  catalogId: String
)

