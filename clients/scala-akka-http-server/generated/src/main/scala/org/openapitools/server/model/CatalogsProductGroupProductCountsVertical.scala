package org.openapitools.server.model


/**
 * Product counts for a CatalogsProductGroup
 *
 * @param catalogType  for example: ''null''
 * @param inStock  for example: ''null''
 * @param outOfStock  for example: ''null''
 * @param preorder  for example: ''null''
 * @param total  for example: ''null''
 * @param videos  for example: ''null''
 * @param appLinks  for example: ''null''
 * @param images  for example: ''null''
*/
final case class CatalogsProductGroupProductCountsVertical (
  catalogType: String,
  inStock: Double,
  outOfStock: Double,
  preorder: Double,
  total: Double,
  videos: Double,
  appLinks: Double,
  images: Double
)

