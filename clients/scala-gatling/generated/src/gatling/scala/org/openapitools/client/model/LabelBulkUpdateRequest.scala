
package org.openapitools.client.model


case class LabelBulkUpdateRequest (
    /* Label ID. */
    _id: String,
    /* Set status to `ARCHIVED` to remove the label from the parent entity. */
    _status: Option[String],
    /* </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit. */
    _value: Option[String]
)
object LabelBulkUpdateRequest {
    def toStringBody(var_id: Object, var_status: Object, var_value: Object) =
        s"""
        | {
        | "id":$var_id,"status":$var_status,"value":$var_value
        | }
        """.stripMargin
}
