package org.openapitools.server.model


/**
 * @param errorType The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED. for example: ''ROW_VALIDATION_FAILED''
 * @param rowNumber The row number with a validation error. -1 indicates a file-level error. for example: ''15''
*/
final case class DynamicTitlesProcessCSVError (
  errorType: Option[String] = None,
  rowNumber: Option[Int] = None
)

