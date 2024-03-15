
package org.openapitools.client.model


case class BoardOwner (
    _username: Option[String]
)
object BoardOwner {
    def toStringBody(var_username: Object) =
        s"""
        | {
        | "username":$var_username
        | }
        """.stripMargin
}
