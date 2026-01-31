
package org.openapitools.client.model


case class SystemUserUpdateRequest (
    /* New system user name */
    _name: String
)
object SystemUserUpdateRequest {
    def toStringBody(var_name: Object) =
        s"""
        | {
        | "name":$var_name
        | }
        """.stripMargin
}
