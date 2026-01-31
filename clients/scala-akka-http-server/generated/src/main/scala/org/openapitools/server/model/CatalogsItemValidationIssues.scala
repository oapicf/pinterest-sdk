package org.openapitools.server.model


/**
 * @param errors  for example: ''null''
 * @param itemId The merchant-created unique ID that represents the product. for example: ''DS0294-L''
 * @param itemNumber Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. for example: ''0''
 * @param warnings  for example: ''null''
*/
final case class CatalogsItemValidationIssues (
  errors: CatalogsItemValidationErrors,
  itemId: String,
  itemNumber: Int,
  warnings: CatalogsItemValidationWarnings
)

