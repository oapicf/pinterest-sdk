package org.openapitools.server.model


/**
 * System error details included in the log sent by the client.
 *
 * @param cause Original cause of the error. for example: ''null''
 * @param columnNumber Column number in the line of the file that raised the error. for example: ''null''
 * @param fileName Filename where the error happened. for example: ''null''
 * @param lineNumber Line number where the error happened. for example: ''null''
 * @param message Human-readable description of the error. for example: ''null''
 * @param messageDetail More detail about the message. for example: ''null''
 * @param name Filename where the error happened. for example: ''null''
 * @param number Integer that specifies the error code. for example: ''null''
 * @param stackTrace Stack trace of where the error happened. for example: ''null''
*/
final case class IntegrationLogClientError (
  cause: Option[String] = None,
  columnNumber: Option[Int] = None,
  fileName: Option[String] = None,
  lineNumber: Option[Int] = None,
  message: Option[String] = None,
  messageDetail: Option[String] = None,
  name: Option[String] = None,
  number: Option[Int] = None,
  stackTrace: Option[String] = None
)

