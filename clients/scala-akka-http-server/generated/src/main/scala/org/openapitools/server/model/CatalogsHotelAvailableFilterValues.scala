package org.openapitools.server.model


/**
 * = catalogs_hotel_available_filter_values =
 *
 * @param catalogType  for example: ''null''
 * @param filterValues  for example: ''null''
*/
final case class CatalogsHotelAvailableFilterValues (
  catalogType: String,
  filterValues: CatalogsHotelFilterValuesMap
)

