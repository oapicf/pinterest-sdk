package org.openapitools.server.model


/**
 * Request object to update catalogs creative assets items
 *
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param language  for example: ''null''
 * @param items Array with creative assets item operations for example: ''null''
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog for example: ''2680059592705''
*/
final case class CatalogsCreativeAssetsBatchRequest (
  catalogType: String,
  country: Country,
  language: CatalogsItemsRequestLanguage,
  items: Seq[CatalogsCreativeAssetsBatchItem],
  catalogId: Option[String] = None
)

