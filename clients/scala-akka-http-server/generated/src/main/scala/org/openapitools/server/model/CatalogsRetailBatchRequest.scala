package org.openapitools.server.model


/**
 * A request object that can have multiple operations on a single retail batch
 *
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param language We recommend using the CatalogsLocale values. for example: ''null''
 * @param items Array with catalogs item operations for example: ''null''
*/
final case class CatalogsRetailBatchRequest (
  catalogType: String,
  country: Country,
  language: String,
  items: Seq[CatalogsRetailBatchRequestItemsInner]
)

