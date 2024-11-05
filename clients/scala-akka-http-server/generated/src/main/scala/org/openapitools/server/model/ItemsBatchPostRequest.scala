package org.openapitools.server.model


/**
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param language  for example: ''null''
 * @param items Array with catalogs items for example: ''null''
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog for example: ''2680059592705''
 * @param operation  for example: ''null''
*/
final case class ItemsBatchPostRequest (
  catalogType: String,
  country: Country,
  language: CatalogsItemsRequestLanguage,
  items: Seq[ItemDeleteBatchRecord],
  catalogId: Option[String] = None,
  operation: BatchOperation
)

