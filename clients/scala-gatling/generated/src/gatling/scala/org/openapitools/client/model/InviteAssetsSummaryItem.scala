
package org.openapitools.client.model


case class InviteAssetsSummaryItem (
    /* Unique identifier of the asset. */
    _id: Option[String],
    /* Permission levels member or partner has on an asset. */
    _permissions: Option[List[String]]
)
object InviteAssetsSummaryItem {
    def toStringBody(var_id: Object, var_permissions: Object) =
        s"""
        | {
        | "id":$var_id,"permissions":$var_permissions
        | }
        """.stripMargin
}
