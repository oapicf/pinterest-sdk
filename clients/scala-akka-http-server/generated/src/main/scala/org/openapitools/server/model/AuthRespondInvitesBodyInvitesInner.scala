package org.openapitools.server.model


/**
 * @param action  for example: ''null''
 * @param inviteId Unique identifier of an invite. for example: ''null''
*/
final case class AuthRespondInvitesBodyInvitesInner (
  action: AuthRespondInvitesBodyInvitesInnerAction,
  inviteId: String
)

