package org.openapitools.server.model


/**
 * @param items List of business partners. for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class GetBusinessPartners200Response (
  items: Seq[UserBusinessRoleBinding],
  bookmark: Option[String] = None
)

