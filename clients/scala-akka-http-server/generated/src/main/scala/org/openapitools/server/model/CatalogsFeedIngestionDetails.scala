package org.openapitools.server.model


/**
 * @param errors  for example: ''null''
 * @param info  for example: ''null''
*/
final case class CatalogsFeedIngestionDetails (
  errors: CatalogsFeedIngestionErrors,
  info: CatalogsFeedIngestionInfo
)

