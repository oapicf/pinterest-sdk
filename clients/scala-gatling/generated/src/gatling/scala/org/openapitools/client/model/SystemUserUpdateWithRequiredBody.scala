
package org.openapitools.client.model


case class SystemUserUpdateWithRequiredBody (
    /* New system user name */
    _name: String
)
object SystemUserUpdateWithRequiredBody {
    def toStringBody(var_name: Object) =
        s"""
        | {
        | "name":$var_name
        | }
        """.stripMargin
}
