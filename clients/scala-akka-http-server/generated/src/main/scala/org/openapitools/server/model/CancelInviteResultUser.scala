package org.openapitools.server.model


/**
 * Metadata of the member/partner that has access to the asset.
 *
 * @param email Email of the business member/partner. for example: ''null''
 * @param id Unique identifier of the business member/partner. for example: ''null''
 * @param username Username of the business member/partner. for example: ''null''
*/
final case class CancelInviteResultUser (
  email: Option[String] = None,
  id: Option[String] = None,
  username: Option[String] = None
)

