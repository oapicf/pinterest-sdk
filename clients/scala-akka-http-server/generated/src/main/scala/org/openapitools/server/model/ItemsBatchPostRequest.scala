package org.openapitools.server.model


/**
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param language  for example: ''null''
 * @param items Array with catalogs items for example: ''null''
 * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog for example: ''2680059592705''
 * @param operation  for example: ''null''
*/
final case class ItemsBatchPostRequest (
  catalogType: CatalogsType,
  country: Country,
  language: Language,
  items: Seq[ItemDeleteBatchRecord],
  catalogId: Option[String] = None,
  operation: BatchOperation
)

