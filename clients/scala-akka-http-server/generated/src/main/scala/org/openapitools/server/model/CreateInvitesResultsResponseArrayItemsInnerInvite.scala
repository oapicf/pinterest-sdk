package org.openapitools.server.model


/**
 * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 *
 * @param id Unique identifier of the invite/request. for example: ''383791336903426391''
 * @param user Metadata for the member/partner that was sent the invite/request. for example: ''null''
*/
final case class CreateInvitesResultsResponseArrayItemsInnerInvite (
  id: Option[String] = None,
  user: Option[BusinessAccessUserSummary] = None
)

