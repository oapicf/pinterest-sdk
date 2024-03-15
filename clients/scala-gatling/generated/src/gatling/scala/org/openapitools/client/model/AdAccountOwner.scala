
package org.openapitools.client.model


case class AdAccountOwner (
    /* Public username for the user account */
    _username: Option[String],
    /* The owning account's user ID. */
    _id: Option[String]
)
object AdAccountOwner {
    def toStringBody(var_username: Object, var_id: Object) =
        s"""
        | {
        | "username":$var_username,"id":$var_id
        | }
        """.stripMargin
}
