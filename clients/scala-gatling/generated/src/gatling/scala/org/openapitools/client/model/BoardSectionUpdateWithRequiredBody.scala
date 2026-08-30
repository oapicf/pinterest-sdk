
package org.openapitools.client.model


case class BoardSectionUpdateWithRequiredBody (
    _id: Option[String],
    _name: String
)
object BoardSectionUpdateWithRequiredBody {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}
