package org.openapitools.server.model


/**
 * Request object of catalogs items
 *
 * @param country  for example: ''null''
 * @param language We recommend using the CatalogsLocale values. for example: ''null''
 * @param filters  for example: ''null''
*/
final case class CatalogsItemsRequest (
  country: Country,
  language: String,
  filters: CatalogsItemsPostFilters
)

