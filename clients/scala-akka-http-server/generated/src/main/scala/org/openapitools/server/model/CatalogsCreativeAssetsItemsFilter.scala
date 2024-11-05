package org.openapitools.server.model


/**
 * @param catalogType  for example: ''null''
 * @param creativeAssetsIds  for example: ''null''
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog for example: ''null''
*/
final case class CatalogsCreativeAssetsItemsFilter (
  catalogType: String,
  creativeAssetsIds: Seq[String],
  catalogId: Option[String] = None
)

