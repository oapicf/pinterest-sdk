
package org.openapitools.client.model


case class InviteAssetsSummaryAdAccountsInner (
    /* Unique identifier of a business ad account. */
    _id: Option[String],
    /* Permission levels member or partner has on an asset. */
    _permissions: Option[List[String]]
)
object InviteAssetsSummaryAdAccountsInner {
    def toStringBody(var_id: Object, var_permissions: Object) =
        s"""
        | {
        | "id":$var_id,"permissions":$var_permissions
        | }
        """.stripMargin
}
