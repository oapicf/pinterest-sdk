package org.openapitools.server.model


/**
 * @param errors  for example: ''null''
 * @param info  for example: ''null''
 * @param warnings  for example: ''null''
*/
final case class CatalogsFeedIngestionDetails (
  errors: CatalogsFeedIngestionErrors,
  info: CatalogsFeedIngestionInfo,
  warnings: CatalogsFeedIngestionWarnings
)

