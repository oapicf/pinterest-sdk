package org.openapitools.server.model


/**
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog for example: ''null''
 * @param catalogType  for example: ''null''
 * @param creativeAssetsIds  for example: ''null''
*/
final case class CatalogsCreativeAssetsItemsFilter (
  catalogId: Option[String] = None,
  catalogType: String,
  creativeAssetsIds: Seq[String]
)

