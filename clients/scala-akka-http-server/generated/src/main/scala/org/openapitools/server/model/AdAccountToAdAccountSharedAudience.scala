package org.openapitools.server.model


/**
 * = AdAccountToAdAccountSharedAudience =
 *
 * @param audienceId Unique identifier of an audience for example: ''2542621871096''
 * @param permissions Permissions granted to the recipients. for example: ''["RESOURCE_PINNER_LIST_READER","RESOURCE_PINNER_LIST_OWNER"]''
 * @param recipientAccountIds Ad account IDs to share with or revoke from (request) / that received the audience (response). for example: ''null''
*/
final case class AdAccountToAdAccountSharedAudience (
  audienceId: String,
  permissions: Option[Seq[Role]] = None,
  recipientAccountIds: Seq[String]
)

