package org.openapitools.server.model


/**
 * = ErrorDetail =
 *
 * @param count Number of records with this error for example: ''20''
 * @param errorCode Numeric error code for example: ''42''
 * @param message Error message description for example: ''Invalid email''
*/
final case class ErrorDetail (
  count: Int,
  errorCode: Int,
  message: String
)

