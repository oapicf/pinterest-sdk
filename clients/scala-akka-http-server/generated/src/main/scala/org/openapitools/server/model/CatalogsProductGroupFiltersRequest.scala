package org.openapitools.server.model


/**
 * = catalogs_product_group_filters =
 *
 * Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 *
 * @param anyOf  for example: ''null''
 * @param allOf  for example: ''null''
*/
final case class CatalogsProductGroupFiltersRequest (
  anyOf: Seq[CatalogsProductGroupFilterKeys],
  allOf: Seq[CatalogsProductGroupFilterKeys]
)

