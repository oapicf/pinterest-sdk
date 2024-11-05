package org.openapitools.server.model


/**
 * Metadata of the member/partner that has access to the asset.
 *
 * @param email Email of the business member/partner. for example: ''business0101@business.com''
 * @param id Unique identifier of the business member/partner. for example: ''383791336903426391''
 * @param username Username of the business member/partner. for example: ''business0101''
*/
final case class BusinessAccessUserSummary (
  email: Option[String] = None,
  id: Option[String] = None,
  username: Option[String] = None
)

