package org.openapitools.server.model


/**
 * @param items List of business members. for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class GetBusinessMembers200Response (
  items: Seq[UserBusinessRoleBinding],
  bookmark: Option[String] = None
)

