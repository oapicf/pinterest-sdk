
package org.openapitools.client.model


case class LabelCreateRequest (
    /* Labels that you are applying to the campaign. */
    _labels: List[LabelCreateItem]
)
object LabelCreateRequest {
    def toStringBody(var_labels: Object) =
        s"""
        | {
        | "labels":$var_labels
        | }
        """.stripMargin
}
