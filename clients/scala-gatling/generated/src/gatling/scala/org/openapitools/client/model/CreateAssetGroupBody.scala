
package org.openapitools.client.model


case class CreateAssetGroupBody (
    /* Asset Group name */
    _assetGroupName: String,
    /* Asset group description */
    _assetGroupDescription: String,
    /* Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */
    _assetGroupTypes: List[AssetGroupType]
)
object CreateAssetGroupBody {
    def toStringBody(var_assetGroupName: Object, var_assetGroupDescription: Object, var_assetGroupTypes: Object) =
        s"""
        | {
        | "assetGroupName":$var_assetGroupName,"assetGroupDescription":$var_assetGroupDescription,"assetGroupTypes":$var_assetGroupTypes
        | }
        """.stripMargin
}
