
package org.openapitools.client.model


case class AssetGroupInputCreate (
    _assetGroup: Option[AssetGroupBinding],
    /* Asset group description. */
    _assetGroupDescription: String,
    /* Asset Group name. */
    _assetGroupName: String,
    /* Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */
    _assetGroupTypes: List[AssetGroupType]
)
object AssetGroupInputCreate {
    def toStringBody(var_assetGroup: Object, var_assetGroupDescription: Object, var_assetGroupName: Object, var_assetGroupTypes: Object) =
        s"""
        | {
        | "assetGroup":$var_assetGroup,"assetGroupDescription":$var_assetGroupDescription,"assetGroupName":$var_assetGroupName,"assetGroupTypes":$var_assetGroupTypes
        | }
        """.stripMargin
}
