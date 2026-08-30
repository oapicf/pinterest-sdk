
package org.openapitools.client.model


case class InviteAssetsSummary (
    /* List of ad account IDs and respective permission levels that will be assigned. */
    _adAccounts: Option[List[InviteAssetsSummaryItem]],
    /* List of profile IDs and respective permission levels that will be assigned. */
    _profiles: Option[List[InviteAssetsSummaryItem]]
)
object InviteAssetsSummary {
    def toStringBody(var_adAccounts: Object, var_profiles: Object) =
        s"""
        | {
        | "adAccounts":$var_adAccounts,"profiles":$var_profiles
        | }
        """.stripMargin
}
