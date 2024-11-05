package org.openapitools.server.model


/**
 * = retail feed based =
 *
 * Request object for updating a product group.
 *
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param isFeatured boolean indicator of whether the product group is being featured or not for example: ''null''
 * @param filters  for example: ''null''
*/
final case class CatalogsProductGroupUpdateRequest (
  name: Option[String] = None,
  description: Option[String] = None,
  isFeatured: Option[Boolean] = None,
  filters: Option[CatalogsProductGroupFiltersRequest] = None
)

