
package org.openapitools.client.model


case class AssetGroupBinding (
    /* A list of ad account IDs under the asset group */
    _adAccountsIds: List[String],
    /* Asset group description */
    _assetGroupDescription: String,
    /* Asset Group name */
    _assetGroupName: String,
    /* Asset group types */
    _assetGroupTypes: List[String],
    /* A list of catalog IDs under asset group */
    _catalogsIds: List[String],
    /* The data of the user that created the asset group. */
    _createdBy: BusinessAccessUserSummary,
    /* The creation time of the asset group */
    _createdTime: Integer,
    /* Asset Group ID. */
    _id: String,
    /* The data of the business that owns the asset group. */
    _owner: BusinessAccessUserSummary,
    /* A list of profile IDs under asset group */
    _profilesIds: List[String],
    /* The last update time of the asset group */
    _updatedTime: Integer
)
object AssetGroupBinding {
    def toStringBody(var_adAccountsIds: Object, var_assetGroupDescription: Object, var_assetGroupName: Object, var_assetGroupTypes: Object, var_catalogsIds: Object, var_createdBy: Object, var_createdTime: Object, var_id: Object, var_owner: Object, var_profilesIds: Object, var_updatedTime: Object) =
        s"""
        | {
        | "adAccountsIds":$var_adAccountsIds,"assetGroupDescription":$var_assetGroupDescription,"assetGroupName":$var_assetGroupName,"assetGroupTypes":$var_assetGroupTypes,"catalogsIds":$var_catalogsIds,"createdBy":$var_createdBy,"createdTime":$var_createdTime,"id":$var_id,"owner":$var_owner,"profilesIds":$var_profilesIds,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
