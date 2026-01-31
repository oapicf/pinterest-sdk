
package org.openapitools.client.model


case class AssetGroupBinding (
    /* A list of ad account IDs under the asset group */
    _adAccountsIds: Option[List[String]],
    /* Asset group description */
    _assetGroupDescription: Option[String],
    /* Asset Group name */
    _assetGroupName: Option[String],
    /* Asset group types */
    _assetGroupTypes: Option[List[String]],
    /* A list of catalog IDs under asset group */
    _catalogsIds: Option[List[String]],
    /* The data of the user that created the asset group. */
    _createdBy: Option[BusinessAccessUserSummary],
    /* The creation time of the asset group */
    _createdTime: Option[Integer],
    /* Asset Group ID. */
    _id: Option[String],
    /* The data of the business that owns the asset group. */
    _owner: Option[BusinessAccessUserSummary],
    /* A list of profile IDs under asset group */
    _profilesIds: Option[List[String]],
    /* The last update time of the asset group */
    _updatedTime: Option[Integer]
)
object AssetGroupBinding {
    def toStringBody(var_adAccountsIds: Object, var_assetGroupDescription: Object, var_assetGroupName: Object, var_assetGroupTypes: Object, var_catalogsIds: Object, var_createdBy: Object, var_createdTime: Object, var_id: Object, var_owner: Object, var_profilesIds: Object, var_updatedTime: Object) =
        s"""
        | {
        | "adAccountsIds":$var_adAccountsIds,"assetGroupDescription":$var_assetGroupDescription,"assetGroupName":$var_assetGroupName,"assetGroupTypes":$var_assetGroupTypes,"catalogsIds":$var_catalogsIds,"createdBy":$var_createdBy,"createdTime":$var_createdTime,"id":$var_id,"owner":$var_owner,"profilesIds":$var_profilesIds,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
