
package org.openapitools.client.model


case class EntityLabel (
    /* Entity ID to apply label to. */
    _entityId: String,
    _entityType: Option[LabelParentType],
    /* Label ID. */
    _labelId: String,
    _status: Option[EntityLabelStatus]
)
object EntityLabel {
    def toStringBody(var_entityId: Object, var_entityType: Object, var_labelId: Object, var_status: Object) =
        s"""
        | {
        | "entityId":$var_entityId,"entityType":$var_entityType,"labelId":$var_labelId,"status":$var_status
        | }
        """.stripMargin
}
