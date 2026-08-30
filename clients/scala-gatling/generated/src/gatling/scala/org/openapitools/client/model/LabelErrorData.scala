
package org.openapitools.client.model


case class LabelErrorData (
    /* Label ID. */
    _id: Option[String],
    _labelType: Option[NullableLabelType],
    _status: Option[NullableLabelStatus],
    /* Label name. 100-character limit. */
    _value: Option[String]
)
object LabelErrorData {
    def toStringBody(var_id: Object, var_labelType: Object, var_status: Object, var_value: Object) =
        s"""
        | {
        | "id":$var_id,"labelType":$var_labelType,"status":$var_status,"value":$var_value
        | }
        """.stripMargin
}
