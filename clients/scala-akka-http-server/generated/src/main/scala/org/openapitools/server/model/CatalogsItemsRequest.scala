package org.openapitools.server.model


/**
 * = catalogs_items_request =
 *
 * Request object of catalogs items
 *
 * @param country  for example: ''null''
 * @param filters  for example: ''null''
 * @param language We recommend using the CatalogsLocale values. for example: ''null''
*/
final case class CatalogsItemsRequest (
  country: Country,
  filters: CatalogsItemsPostFilters,
  language: String
)

