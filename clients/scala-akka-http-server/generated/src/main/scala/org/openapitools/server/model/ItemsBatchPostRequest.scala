package org.openapitools.server.model


/**
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param items Array with catalogs items for example: ''null''
 * @param language We recommend using the CatalogsLocale values. for example: ''null''
 * @param operation  for example: ''null''
*/
final case class ItemsBatchPostRequest (
  catalogId: Option[String] = None,
  catalogType: String,
  country: Country,
  items: Seq[ItemDeleteBatchRecord],
  language: String,
  operation: BatchOperation
)

