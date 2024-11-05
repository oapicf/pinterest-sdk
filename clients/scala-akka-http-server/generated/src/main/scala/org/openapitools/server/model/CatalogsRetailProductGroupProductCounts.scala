package org.openapitools.server.model


/**
 * = catalogs_retail_product_group_product_counts =
 *
 * Product counts for a Retail CatalogsProductGroup
 *
 * @param catalogType  for example: ''null''
 * @param inStock  for example: ''null''
 * @param outOfStock  for example: ''null''
 * @param preorder  for example: ''null''
 * @param total  for example: ''null''
 * @param videos  for example: ''null''
*/
final case class CatalogsRetailProductGroupProductCounts (
  catalogType: String,
  inStock: Double,
  outOfStock: Double,
  preorder: Double,
  total: Double,
  videos: Option[Double] = None
)

