
package org.openapitools.client.model


case class AdAccountOwner (
    /* The owning account's user ID. */
    _id: Option[String],
    /* Public username for the user account */
    _username: Option[String]
)
object AdAccountOwner {
    def toStringBody(var_id: Object, var_username: Object) =
        s"""
        | {
        | "id":$var_id,"username":$var_username
        | }
        """.stripMargin
}
