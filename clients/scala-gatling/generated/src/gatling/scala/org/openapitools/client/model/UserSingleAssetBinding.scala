
package org.openapitools.client.model


case class UserSingleAssetBinding (
    /* Permission levels member or partner has on an asset. */
    _permissions: Option[List[String]],
    _user: Option[BusinessAccessUserSummary]
)
object UserSingleAssetBinding {
    def toStringBody(var_permissions: Object, var_user: Object) =
        s"""
        | {
        | "permissions":$var_permissions,"user":$var_user
        | }
        """.stripMargin
}
