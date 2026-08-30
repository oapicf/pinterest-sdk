
package org.openapitools.client.model


case class AssetIdWithPermissions (
    /* Unique identifier of a business asset. */
    _id: Option[String],
    /* Permission levels member or partner has on an asset. */
    _permissions: Option[List[String]]
)
object AssetIdWithPermissions {
    def toStringBody(var_id: Object, var_permissions: Object) =
        s"""
        | {
        | "id":$var_id,"permissions":$var_permissions
        | }
        """.stripMargin
}
