package org.openapitools.server.model


/**
 * @param audienceId Audience ID that was shared for example: ''2542621871096''
 * @param permissions  for example: ''[RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER]''
 * @param recipientAccountIds Account IDs that received the audience for example: ''["549755885175"]''
*/
final case class SharedAudienceResponse (
  audienceId: Option[String] = None,
  permissions: Option[Seq[Role]] = None,
  recipientAccountIds: Option[Seq[String]] = None
)

