package org.openapitools.server.model


/**
 * A request object that can have multiple operations on a single retail batch
 *
 * @param catalogId Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param items Array with catalogs item operations for example: ''null''
 * @param language We recommend using the CatalogsLocale values. for example: ''null''
*/
final case class CatalogsRetailBatchRequest (
  catalogId: Option[String] = None,
  catalogType: String,
  country: Country,
  items: Seq[CatalogsRetailBatchRequestItemsInner],
  language: String
)

