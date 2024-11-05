package org.openapitools.server.model


/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 *
 * @param invites  for example: ''null''
*/
final case class AuthRespondInvitesBody (
  invites: Seq[AuthRespondInvitesBodyInvitesInner]
)

