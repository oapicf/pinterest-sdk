
package org.openapitools.client.model


case class UserSummary (
    /* Username */
    _username: Option[String],
    /* Always \"user\" */
    _type: Option[String]
)
object UserSummary {
    def toStringBody(var_username: Object, var_type: Object) =
        s"""
        | {
        | "username":$var_username,"type":$var_type
        | }
        """.stripMargin
}
