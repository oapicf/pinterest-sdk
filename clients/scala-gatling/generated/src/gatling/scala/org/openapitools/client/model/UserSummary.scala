
package org.openapitools.client.model


case class UserSummary (
    /* Always \"user\" */
    _type: Option[String],
    /* Username */
    _username: Option[String]
)
object UserSummary {
    def toStringBody(var_type: Object, var_username: Object) =
        s"""
        | {
        | "type":$var_type,"username":$var_username
        | }
        """.stripMargin
}
