package org.openapitools.server.model


/**
 * @param items List asset permissions the given member was granted. for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class BusinessMemberAssetsGet200Response (
  items: Seq[AssetIdPermissions],
  bookmark: Option[String] = None
)

