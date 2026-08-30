package org.openapitools.server.model


/**
 * Asset ID with permission levels.
 *
 * @param id Unique identifier of a business asset. for example: ''549755885175''
 * @param permissions Permission levels member or partner has on an asset. for example: ''["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]''
*/
final case class AssetIdWithPermissions (
  id: Option[String] = None,
  permissions: Option[Seq[String]] = None
)

