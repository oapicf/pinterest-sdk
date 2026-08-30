package org.openapitools.server.model


/**
 * Ad accounts and profiles the business member/partner has access to.
 *
 * @param adAccounts List of ad account IDs and respective permission levels. for example: ''null''
 * @param profiles List of profile IDs and respective permission levels. for example: ''null''
*/
final case class BusinessMemberAssetsSummary (
  adAccounts: Option[Seq[AssetIdWithPermissions]] = None,
  profiles: Option[Seq[AssetIdWithPermissions]] = None
)

