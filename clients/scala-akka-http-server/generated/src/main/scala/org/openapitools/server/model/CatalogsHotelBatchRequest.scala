package org.openapitools.server.model


/**
 * Request object to update catalogs hotel items
 *
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param language  for example: ''null''
 * @param items Array with catalogs item operations for example: ''null''
 * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog for example: ''2680059592705''
*/
final case class CatalogsHotelBatchRequest (
  catalogType: CatalogsType,
  country: Country,
  language: Language,
  items: Seq[CatalogsHotelBatchItem],
  catalogId: Option[String] = None
)

