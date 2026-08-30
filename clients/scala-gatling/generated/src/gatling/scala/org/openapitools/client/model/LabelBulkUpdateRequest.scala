
package org.openapitools.client.model


case class LabelBulkUpdateRequest (
    /* Label ID. */
    _id: String,
    /* Unique identifier of the asset you are labelling. Currently, you can only label campaigns. */
    _parentId: String,
    _status: LabelStatusBulkUpdate
)
object LabelBulkUpdateRequest {
    def toStringBody(var_id: Object, var_parentId: Object, var_status: Object) =
        s"""
        | {
        | "id":$var_id,"parentId":$var_parentId,"status":$var_status
        | }
        """.stripMargin
}
