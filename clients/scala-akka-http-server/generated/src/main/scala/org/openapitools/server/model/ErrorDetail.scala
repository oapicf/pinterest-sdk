package org.openapitools.server.model


/**
 * = ErrorDetail =
 *
 * @param count Number of records with this error for example: ''null''
 * @param errorCode Numeric error code for example: ''null''
 * @param message Error message description for example: ''null''
*/
final case class ErrorDetail (
  count: Int,
  errorCode: Int,
  message: String
)

