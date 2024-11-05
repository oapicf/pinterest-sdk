package org.openapitools.server.model


/**
 * = catalogs_creative_assets_product_group_product_counts =
 *
 * Product counts for a Creative Assets CatalogsProductGroup
 *
 * @param catalogType  for example: ''null''
 * @param total  for example: ''null''
 * @param videos  for example: ''null''
*/
final case class CatalogsCreativeAssetsProductGroupProductCounts (
  catalogType: String,
  total: Double,
  videos: Double
)

