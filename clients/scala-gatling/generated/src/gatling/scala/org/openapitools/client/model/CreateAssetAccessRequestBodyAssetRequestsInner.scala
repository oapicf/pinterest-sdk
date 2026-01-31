
package org.openapitools.client.model


case class CreateAssetAccessRequestBodyAssetRequestsInner (
    /* An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  */
    _assetIdToPermissions: Map[String, List[Permissions]],
    /* Unique identifier of a business partner to request asset access to. */
    _partnerId: String
)
object CreateAssetAccessRequestBodyAssetRequestsInner {
    def toStringBody(var_assetIdToPermissions: Object, var_partnerId: Object) =
        s"""
        | {
        | "assetIdToPermissions":$var_assetIdToPermissions,"partnerId":$var_partnerId
        | }
        """.stripMargin
}
