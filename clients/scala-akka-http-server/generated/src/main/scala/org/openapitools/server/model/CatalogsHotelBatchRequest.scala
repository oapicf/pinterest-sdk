package org.openapitools.server.model


/**
 * Request object to update catalogs hotel items
 *
 * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param items Array with catalogs item operations for example: ''null''
 * @param language We recommend using the CatalogsLocale values. for example: ''null''
*/
final case class CatalogsHotelBatchRequest (
  catalogId: Option[String] = None,
  catalogType: String,
  country: Country,
  items: Seq[CatalogsHotelBatchItem],
  language: String
)

