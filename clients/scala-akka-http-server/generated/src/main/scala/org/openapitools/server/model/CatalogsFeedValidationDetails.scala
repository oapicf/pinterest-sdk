package org.openapitools.server.model


/**
 * @param errors  for example: ''null''
 * @param warnings  for example: ''null''
*/
final case class CatalogsFeedValidationDetails (
  errors: CatalogsFeedValidationErrors,
  warnings: CatalogsFeedValidationWarnings
)

