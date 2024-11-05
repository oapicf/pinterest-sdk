
package org.openapitools.client.model


case class TargetingTemplateUpdateRequest (
    _operationType: String,
    /* Targeting template ID */
    _id: String
)
object TargetingTemplateUpdateRequest {
    def toStringBody(var_operationType: Object, var_id: Object) =
        s"""
        | {
        | "operationType":$var_operationType,"id":$var_id
        | }
        """.stripMargin
}
