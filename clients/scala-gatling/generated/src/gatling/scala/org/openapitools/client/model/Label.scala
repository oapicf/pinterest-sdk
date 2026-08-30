
package org.openapitools.client.model


case class Label (
    /* Label ID. */
    _id: String,
    _labelType: NullableLabelType,
    _status: Option[NullableLabelStatus],
    /* Label name. 100-character limit. */
    _value: String
)
object Label {
    def toStringBody(var_id: Object, var_labelType: Object, var_status: Object, var_value: Object) =
        s"""
        | {
        | "id":$var_id,"labelType":$var_labelType,"status":$var_status,"value":$var_value
        | }
        """.stripMargin
}
