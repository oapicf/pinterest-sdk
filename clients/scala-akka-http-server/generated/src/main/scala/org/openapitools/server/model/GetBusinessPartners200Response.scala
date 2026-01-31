package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items List of business partners. for example: ''null''
*/
final case class GetBusinessPartners200Response (
  bookmark: Option[String] = None,
  items: Seq[UserBusinessRoleBinding]
)

