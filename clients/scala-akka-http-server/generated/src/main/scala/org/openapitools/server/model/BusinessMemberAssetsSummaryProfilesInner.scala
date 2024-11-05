package org.openapitools.server.model


/**
 * @param id Unique identifier of a business profile. for example: ''383791336903426391''
 * @param permissions Permission levels member or partner has on an asset. for example: ''["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]''
*/
final case class BusinessMemberAssetsSummaryProfilesInner (
  id: Option[String] = None,
  permissions: Option[Seq[String]] = None
)

