package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items  for example: ''null''
*/
final case class CatalogsList200Response (
  bookmark: Option[String] = None,
  items: Seq[Catalog]
)

