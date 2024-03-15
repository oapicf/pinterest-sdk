package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class CustomerListsList200Response (
  items: Seq[CustomerList],
  bookmark: Option[String] = None
)

