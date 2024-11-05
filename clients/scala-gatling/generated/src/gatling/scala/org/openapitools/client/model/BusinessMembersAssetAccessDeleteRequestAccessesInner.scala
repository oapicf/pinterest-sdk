
package org.openapitools.client.model


case class BusinessMembersAssetAccessDeleteRequestAccessesInner (
    /* Id of the asset on which to remove member permissions. */
    _assetId: String,
    /* Unique identifier of the member on which to perform the asset permission removal */
    _memberId: String
)
object BusinessMembersAssetAccessDeleteRequestAccessesInner {
    def toStringBody(var_assetId: Object, var_memberId: Object) =
        s"""
        | {
        | "assetId":$var_assetId,"memberId":$var_memberId
        | }
        """.stripMargin
}
