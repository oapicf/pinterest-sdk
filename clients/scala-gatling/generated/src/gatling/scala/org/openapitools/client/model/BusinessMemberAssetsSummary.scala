
package org.openapitools.client.model


case class BusinessMemberAssetsSummary (
    /* List of ad account IDs and respective permission levels. */
    _adAccounts: Option[List[BusinessMemberAssetsSummaryAdAccountsInner]],
    /* List of profile IDs and respective permission levels. */
    _profiles: Option[List[BusinessMemberAssetsSummaryProfilesInner]]
)
object BusinessMemberAssetsSummary {
    def toStringBody(var_adAccounts: Object, var_profiles: Object) =
        s"""
        | {
        | "adAccounts":$var_adAccounts,"profiles":$var_profiles
        | }
        """.stripMargin
}
