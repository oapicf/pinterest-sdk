
package org.openapitools.client.model


case class LabelBulkCreateRequest (
    /* Labels that you are applying to the campaign. */
    _labels: List[LabelCreateItem],
    /* Unique identifier of the asset you are labelling. Currently, you can only label campaigns. */
    _parentId: String
)
object LabelBulkCreateRequest {
    def toStringBody(var_labels: Object, var_parentId: Object) =
        s"""
        | {
        | "labels":$var_labels,"parentId":$var_parentId
        | }
        """.stripMargin
}
