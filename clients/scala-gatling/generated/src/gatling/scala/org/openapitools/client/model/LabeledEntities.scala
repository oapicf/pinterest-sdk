
package org.openapitools.client.model


case class LabeledEntities (
    _entitiesLabels: Option[List[EntityLabel]],
    /* Labels that were not successfully applied. */
    _errors: Option[List[EntityLabelError]]
)
object LabeledEntities {
    def toStringBody(var_entitiesLabels: Object, var_errors: Object) =
        s"""
        | {
        | "entitiesLabels":$var_entitiesLabels,"errors":$var_errors
        | }
        """.stripMargin
}
