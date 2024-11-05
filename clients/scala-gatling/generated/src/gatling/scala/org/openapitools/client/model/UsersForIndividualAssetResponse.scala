
package org.openapitools.client.model


case class UsersForIndividualAssetResponse (
    /* Unique identifier of a business asset. */
    _assetId: Option[String],
    /* Unique identifier of the business member with asset access. */
    _memberId: Option[String],
    /* Permission levels member or partner has on an asset. */
    _permissions: Option[List[String]]
)
object UsersForIndividualAssetResponse {
    def toStringBody(var_assetId: Object, var_memberId: Object, var_permissions: Object) =
        s"""
        | {
        | "assetId":$var_assetId,"memberId":$var_memberId,"permissions":$var_permissions
        | }
        """.stripMargin
}
