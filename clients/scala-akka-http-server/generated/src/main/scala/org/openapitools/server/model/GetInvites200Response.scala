package org.openapitools.server.model


/**
 * @param items List of invite and request data. for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class GetInvites200Response (
  items: Seq[InviteResponse],
  bookmark: Option[String] = None
)

