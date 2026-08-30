package org.openapitools.server.model


/**
 * Information about a catalog asset.
 *
 * @param catalogType Catalog type for example: ''null''
 * @param id Catalog ID. for example: ''null''
 * @param name Catalog name for example: ''null''
*/
final case class CatalogBinding (
  catalogType: Option[String] = None,
  id: Option[String] = None,
  name: Option[String] = None
)

