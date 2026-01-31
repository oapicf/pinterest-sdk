package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items List of business members. for example: ''null''
*/
final case class GetBusinessMembers200Response (
  bookmark: Option[String] = None,
  items: Seq[UserBusinessRoleBinding]
)

