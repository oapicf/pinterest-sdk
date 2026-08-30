
package org.openapitools.client.model


case class BoardSectionCreate (
    _id: Option[String],
    _name: String
)
object BoardSectionCreate {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}
