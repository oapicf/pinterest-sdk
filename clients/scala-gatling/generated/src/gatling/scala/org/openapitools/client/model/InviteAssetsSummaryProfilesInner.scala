
package org.openapitools.client.model


case class InviteAssetsSummaryProfilesInner (
    /* Unique identifier of a business profile. */
    _id: Option[String],
    /* Permission levels member or partner has on an asset. */
    _permissions: Option[List[String]]
)
object InviteAssetsSummaryProfilesInner {
    def toStringBody(var_id: Object, var_permissions: Object) =
        s"""
        | {
        | "id":$var_id,"permissions":$var_permissions
        | }
        """.stripMargin
}
