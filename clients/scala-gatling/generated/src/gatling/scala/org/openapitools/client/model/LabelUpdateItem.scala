
package org.openapitools.client.model


case class LabelUpdateItem (
    /* Label ID. */
    _id: String,
    _status: Option[LabelStatus],
    /* Label name. 100-character limit. */
    _value: Option[String]
)
object LabelUpdateItem {
    def toStringBody(var_id: Object, var_status: Object, var_value: Object) =
        s"""
        | {
        | "id":$var_id,"status":$var_status,"value":$var_value
        | }
        """.stripMargin
}
