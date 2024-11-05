package org.openapitools.server.model


/**
 * @param audienceId Audience ID that was shared for example: ''2542621871096''
 * @param permissions  for example: ''["RESOURCE_PINNER_LIST_READER","RESOURCE_PINNER_LIST_OWNER"]''
*/
final case class SharedAudienceResponseCommon (
  audienceId: Option[String] = None,
  permissions: Option[Seq[Role]] = None
)

