
package org.openapitools.client.model


case class TargetingTemplateUpdateRequest (
    /* Targeting template ID */
    _id: String,
    _operationType: String,
    _targetingAttributes: Option[TargetingSpec]
)
object TargetingTemplateUpdateRequest {
    def toStringBody(var_id: Object, var_operationType: Object, var_targetingAttributes: Object) =
        s"""
        | {
        | "id":$var_id,"operationType":$var_operationType,"targetingAttributes":$var_targetingAttributes
        | }
        """.stripMargin
}
