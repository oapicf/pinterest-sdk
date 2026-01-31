package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items List asset permissions the given member was granted. for example: ''null''
*/
final case class BusinessMemberAssetsGet200Response (
  bookmark: Option[String] = None,
  items: Seq[AssetIdPermissions]
)

