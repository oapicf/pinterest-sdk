package org.openapitools.server.model


/**
 * An object containing the permissions a business member/partner has on the asset.
 *
 * @param permissions Permission levels member or partner has on an asset. for example: ''["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]''
 * @param user  for example: ''null''
*/
final case class UserSingleAssetBinding (
  permissions: Option[Seq[String]] = None,
  user: Option[BusinessAccessUserSummary] = None
)

