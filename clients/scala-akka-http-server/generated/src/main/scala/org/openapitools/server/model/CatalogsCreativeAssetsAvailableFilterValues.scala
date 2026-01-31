package org.openapitools.server.model


/**
 * = catalogs_creative_assets_available_filter_values =
 *
 * @param catalogType  for example: ''null''
 * @param filterValues  for example: ''null''
*/
final case class CatalogsCreativeAssetsAvailableFilterValues (
  catalogType: String,
  filterValues: CatalogsCreativeAssetsFilterValuesMap
)

