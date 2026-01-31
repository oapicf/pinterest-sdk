
package org.openapitools.client.model


case class LabelsResponse (
    /* Labels that were not successfully applied. */
    _errors: Option[List[LabelError]],
    _labels: Option[List[Label]]
)
object LabelsResponse {
    def toStringBody(var_errors: Object, var_labels: Object) =
        s"""
        | {
        | "errors":$var_errors,"labels":$var_labels
        | }
        """.stripMargin
}
