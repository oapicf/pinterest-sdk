package org.openapitools.server.model


/**
 * @param id Unique identifier of a business ad account. for example: ''549755885175''
 * @param permissions Permission levels member or partner has on an asset. for example: ''["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]''
*/
final case class InviteAssetsSummaryAdAccountsInner (
  id: Option[String] = None,
  permissions: Option[Seq[String]] = None
)

