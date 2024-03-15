package org.openapitools.server.model


/**
 * = catalogs_product_group_product_counts =
 *
 * Product counts for a CatalogsProductGroup
 *
 * @param inStock  for example: ''null''
 * @param outOfStock  for example: ''null''
 * @param preorder  for example: ''null''
 * @param total  for example: ''null''
*/
final case class CatalogsProductGroupProductCounts (
  inStock: Double,
  outOfStock: Double,
  preorder: Double,
  total: Double
)

