
package org.openapitools.client.model


case class BoardUpdate (
    _name: Option[String],
    _description: Option[String],
    _privacy: Option[String]
)
object BoardUpdate {
    def toStringBody(var_name: Object, var_description: Object, var_privacy: Object) =
        s"""
        | {
        | "name":$var_name,"description":$var_description,"privacy":$var_privacy
        | }
        """.stripMargin
}
