package org.openapitools.server.model


/**
 * @param audienceId Audience ID that was shared for example: ''2542621871096''
 * @param permissions  for example: ''[RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER]''
 * @param recipientBusinessIds Business IDs that received the audience for example: ''["549755885175"]''
*/
final case class BusinessSharedAudienceResponse (
  audienceId: Option[String] = None,
  permissions: Option[Seq[Role]] = None,
  recipientBusinessIds: Option[Seq[String]] = None
)

