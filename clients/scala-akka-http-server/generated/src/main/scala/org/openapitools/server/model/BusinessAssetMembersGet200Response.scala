package org.openapitools.server.model


/**
 * @param items List of members with permissions to the asset. for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class BusinessAssetMembersGet200Response (
  items: Seq[UserSingleAssetBinding],
  bookmark: Option[String] = None
)

