
package org.openapitools.client.model


case class LabelUpdateRequest (
    /* Labels that you are applying to the campaign. */
    _labels: List[LabelUpdateItem]
)
object LabelUpdateRequest {
    def toStringBody(var_labels: Object) =
        s"""
        | {
        | "labels":$var_labels
        | }
        """.stripMargin
}
