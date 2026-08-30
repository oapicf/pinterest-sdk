package org.openapitools.server.model


/**
 * = creative_assets_product_groups_update_request =
 *
 * Request object for updating a creative assets product group.
 *
 * @param catalogType  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param name Name of catalog product group for example: ''Most Popular''
*/
final case class CatalogsCreativeAssetsProductGroupUpdateRequest (
  catalogType: Option[String] = None,
  description: Option[String] = None,
  filters: Option[CatalogsCreativeAssetsProductGroupFilters] = None,
  name: Option[String] = None
)

