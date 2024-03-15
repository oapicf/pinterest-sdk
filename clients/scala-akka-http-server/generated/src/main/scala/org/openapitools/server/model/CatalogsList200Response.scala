package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class CatalogsList200Response (
  items: Seq[Catalog],
  bookmark: Option[String] = None
)

