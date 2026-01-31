package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items List of employers. for example: ''null''
*/
final case class GetBusinessEmployers200Response (
  bookmark: Option[String] = None,
  items: Seq[UserBusinessRoleBinding]
)

