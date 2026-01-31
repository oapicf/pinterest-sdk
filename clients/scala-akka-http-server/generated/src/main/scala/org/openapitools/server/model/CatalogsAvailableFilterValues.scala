package org.openapitools.server.model


/**
 * = catalogs_available_filter_values =
 *
 * Object holding available filter values for each filter key
 *
 * @param catalogType  for example: ''null''
 * @param filterValues  for example: ''null''
*/
final case class CatalogsAvailableFilterValues (
  catalogType: String,
  filterValues: CatalogsCreativeAssetsFilterValuesMap
)

