package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class AdAccountsAudiencesSharedAccountsList200Response (
  items: Seq[SharedAudienceAccount],
  bookmark: Option[String] = None
)

