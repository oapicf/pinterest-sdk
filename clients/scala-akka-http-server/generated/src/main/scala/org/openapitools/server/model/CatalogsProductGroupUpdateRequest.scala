package org.openapitools.server.model


/**
 * = retail feed based =
 *
 * Request object for updating a product group.
 *
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param isFeatured boolean indicator of whether the product group is being featured or not for example: ''null''
 * @param name  for example: ''null''
*/
final case class CatalogsProductGroupUpdateRequest (
  description: Option[String] = None,
  filters: Option[CatalogsProductGroupFiltersRequest] = None,
  isFeatured: Option[Boolean] = None,
  name: Option[String] = None
)

