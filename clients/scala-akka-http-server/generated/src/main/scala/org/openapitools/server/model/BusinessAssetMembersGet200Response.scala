package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items List of members with permissions to the asset. for example: ''null''
*/
final case class BusinessAssetMembersGet200Response (
  bookmark: Option[String] = None,
  items: Seq[UserSingleAssetBinding]
)

