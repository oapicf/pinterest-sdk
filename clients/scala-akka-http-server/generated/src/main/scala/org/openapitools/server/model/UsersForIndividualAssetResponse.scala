package org.openapitools.server.model


/**
 * An object containing the permissions a business member has on the asset.
 *
 * @param assetId Unique identifier of a business asset. for example: ''549755885175''
 * @param memberId Unique identifier of the business member with asset access. for example: ''140943737684417''
 * @param permissions Permission levels member or partner has on an asset. for example: ''["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]''
*/
final case class UsersForIndividualAssetResponse (
  assetId: Option[String] = None,
  memberId: Option[String] = None,
  permissions: Option[Seq[String]] = None
)

