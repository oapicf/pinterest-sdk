
package org.openapitools.client.model


case class AssetGroupBinding (
    /* Asset Group ID. */
    _id: Option[String],
    /* Asset Group name */
    _assetGroupName: Option[String],
    /* Asset group description */
    _assetGroupDescription: Option[String],
    /* Asset group types */
    _assetGroupTypes: Option[List[String]],
    /* A list of ad account IDs under the asset group */
    _adAccountsIds: Option[List[String]],
    /* A list of profile IDs under asset group */
    _profilesIds: Option[List[String]],
    /* The creation time of the asset group */
    _createdTime: Option[Integer],
    /* The last update time of the asset group */
    _updatedTime: Option[Integer],
    /* The data of the business that owns the asset group. */
    _owner: Option[BusinessAccessUserSummary],
    /* The data of the user that created the asset group. */
    _createdBy: Option[BusinessAccessUserSummary]
)
object AssetGroupBinding {
    def toStringBody(var_id: Object, var_assetGroupName: Object, var_assetGroupDescription: Object, var_assetGroupTypes: Object, var_adAccountsIds: Object, var_profilesIds: Object, var_createdTime: Object, var_updatedTime: Object, var_owner: Object, var_createdBy: Object) =
        s"""
        | {
        | "id":$var_id,"assetGroupName":$var_assetGroupName,"assetGroupDescription":$var_assetGroupDescription,"assetGroupTypes":$var_assetGroupTypes,"adAccountsIds":$var_adAccountsIds,"profilesIds":$var_profilesIds,"createdTime":$var_createdTime,"updatedTime":$var_updatedTime,"owner":$var_owner,"createdBy":$var_createdBy
        | }
        """.stripMargin
}
