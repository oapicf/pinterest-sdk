package org.openapitools.server.model


/**
 * @param items List of employers. for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class GetBusinessEmployers200Response (
  items: Seq[UserBusinessRoleBinding],
  bookmark: Option[String] = None
)

