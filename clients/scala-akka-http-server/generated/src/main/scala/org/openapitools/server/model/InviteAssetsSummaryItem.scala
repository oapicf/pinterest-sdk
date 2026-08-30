package org.openapitools.server.model


/**
 * @param id Unique identifier of the asset. for example: ''null''
 * @param permissions Permission levels member or partner has on an asset. for example: ''["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]''
*/
final case class InviteAssetsSummaryItem (
  id: Option[String] = None,
  permissions: Option[Seq[String]] = None
)

