package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items List of invite and request data. for example: ''null''
*/
final case class GetInvites200Response (
  bookmark: Option[String] = None,
  items: Seq[InviteResponse]
)

