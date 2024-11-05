package org.openapitools.server.model


/**
 * Request body for updating asset roles for existing invites.
 *
 * @param invites  for example: ''null''
*/
final case class CreateAssetInvitesRequest (
  invites: Seq[CreateAssetInvitesRequestItem]
)

