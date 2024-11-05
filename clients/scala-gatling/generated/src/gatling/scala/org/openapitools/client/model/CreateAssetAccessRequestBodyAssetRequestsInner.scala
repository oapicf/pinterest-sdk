
package org.openapitools.client.model


case class CreateAssetAccessRequestBodyAssetRequestsInner (
    /* Unique identifier of a business partner to request asset access to. */
    _partnerId: String,
    /* An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  */
    _assetIdToPermissions: Map[String, List[Permissions]]
)
object CreateAssetAccessRequestBodyAssetRequestsInner {
    def toStringBody(var_partnerId: Object, var_assetIdToPermissions: Object) =
        s"""
        | {
        | "partnerId":$var_partnerId,"assetIdToPermissions":$var_assetIdToPermissions
        | }
        """.stripMargin
}
