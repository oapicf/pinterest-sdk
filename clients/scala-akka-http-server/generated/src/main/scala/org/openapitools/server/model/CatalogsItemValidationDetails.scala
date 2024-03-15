package org.openapitools.server.model


/**
 * @param attributeName  for example: ''null''
 * @param providedValue Provided value that caused the validation issue. for example: ''null''
*/
final case class CatalogsItemValidationDetails (
  attributeName: NullableCatalogsItemFieldType,
  providedValue: String
)

