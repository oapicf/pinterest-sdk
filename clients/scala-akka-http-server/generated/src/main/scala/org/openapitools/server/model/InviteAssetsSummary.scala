package org.openapitools.server.model


/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 *
 * @param adAccounts List of ad account IDs and respective permission levels that will be assigned. for example: ''null''
 * @param profiles List of profile IDs and respective permission levels that will be assigned. for example: ''null''
*/
final case class InviteAssetsSummary (
  adAccounts: Option[Seq[InviteAssetsSummaryAdAccountsInner]] = None,
  profiles: Option[Seq[InviteAssetsSummaryProfilesInner]] = None
)

