package org.openapitools.server.model


/**
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param isFeatured boolean indicator of whether the product group is being featured or not for example: ''null''
 * @param name  for example: ''null''
 * @param id ID of the product group. for example: ''null''
*/
final case class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 (
  description: Option[String] = None,
  filters: Option[CatalogsProductGroupFiltersRequest] = None,
  isFeatured: Option[Boolean] = None,
  name: Option[String] = None,
  id: String
)

