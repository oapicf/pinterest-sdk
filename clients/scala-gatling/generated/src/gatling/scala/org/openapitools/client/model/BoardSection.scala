
package org.openapitools.client.model


case class BoardSection (
    _id: Option[String],
    _name: String
)
object BoardSection {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}
