package org.openapitools.server.model


/**
 * = catalogs_retail_available_filter_values =
 *
 * @param catalogType  for example: ''null''
 * @param filterValues  for example: ''null''
*/
final case class CatalogsRetailAvailableFilterValues (
  catalogType: String,
  filterValues: CatalogsRetailFilterValuesMap
)

