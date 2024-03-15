package org.openapitools.server.model


/**
 * = catalogs_product_group_filters =
 *
 * Object holding a group of filters for a hotel product group
 *
 * @param anyOf  for example: ''null''
 * @param allOf  for example: ''null''
*/
final case class CatalogsHotelProductGroupFilters (
  anyOf: Seq[CatalogsHotelProductGroupFilterKeys],
  allOf: Seq[CatalogsHotelProductGroupFilterKeys]
)

