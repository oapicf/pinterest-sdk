package org.openapitools.server.model


/**
 * Request object to update catalogs creative assets items
 *
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog for example: ''2680059592705''
 * @param catalogType  for example: ''null''
 * @param country  for example: ''null''
 * @param items Array with creative assets item operations for example: ''null''
 * @param language We recommend using the CatalogsLocale values. for example: ''null''
*/
final case class CatalogsCreativeAssetsBatchRequest (
  catalogId: Option[String] = None,
  catalogType: String,
  country: Country,
  items: Seq[CatalogsCreativeAssetsBatchItem],
  language: String
)

