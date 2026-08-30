
package org.openapitools.client.model


case class BusinessMemberAssetsSummary (
    /* List of ad account IDs and respective permission levels. */
    _adAccounts: Option[List[AssetIdWithPermissions]],
    /* List of profile IDs and respective permission levels. */
    _profiles: Option[List[AssetIdWithPermissions]]
)
object BusinessMemberAssetsSummary {
    def toStringBody(var_adAccounts: Object, var_profiles: Object) =
        s"""
        | {
        | "adAccounts":$var_adAccounts,"profiles":$var_profiles
        | }
        """.stripMargin
}
