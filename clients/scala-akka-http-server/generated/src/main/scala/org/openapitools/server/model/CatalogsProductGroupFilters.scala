package org.openapitools.server.model


/**
 * = catalogs_product_group_filters =
 *
 * Object holding a group of filters for a catalog product group
 *
 * @param anyOf  for example: ''null''
 * @param allOf  for example: ''null''
*/
final case class CatalogsProductGroupFilters (
  anyOf: Option[Seq[CatalogsProductGroupFilterKeys]],
  allOf: Option[Seq[CatalogsProductGroupFilterKeys]]
)

