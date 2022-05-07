
package org.openapitools.client.model


case class AdAccountOwner (
    /* Public username for the user account */
    _username: Option[String]
)
object AdAccountOwner {
    def toStringBody(var_username: Object) =
        s"""
        | {
        | "username":$var_username
        | }
        """.stripMargin
}
