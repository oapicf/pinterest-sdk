
package org.openapitools.client.model


case class TargetingTemplateUpdateRequestReadOrUpdate (
    /* Targeting template ID */
    _id: String,
    _operationType: AudienceUpdateOperationType,
    /* targeting profile attributes */
    _targetingAttributes: Option[TargetingSpecOptimal]
)
object TargetingTemplateUpdateRequestReadOrUpdate {
    def toStringBody(var_id: Object, var_operationType: Object, var_targetingAttributes: Object) =
        s"""
        | {
        | "id":$var_id,"operationType":$var_operationType,"targetingAttributes":$var_targetingAttributes
        | }
        """.stripMargin
}
