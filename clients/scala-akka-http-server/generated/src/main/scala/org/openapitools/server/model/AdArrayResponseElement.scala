package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param exceptions  for example: ''null''
*/
final case class AdArrayResponseElement (
  data: Option[AdResponse] = None,
  exceptions: Option[Exception] = None
)

