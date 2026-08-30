
package org.openapitools.client.model


case class EntityDataChangeHistory (
    /* A string identifier representing the changed field on the entity */
    _changedFieldId: Option[String],
    /* The human readable name of the changed field on the entity */
    _changedFieldName: Option[String],
    /* Specifies the type of the field's data values */
    _dataType: Option[ChangeHistoryDataType],
    /* A string representation of the value of the changed field, after the change */
    _newDataValue: Option[String],
    /* A string representation of the value of the changed field, before the change */
    _oldDataValue: Option[String]
)
object EntityDataChangeHistory {
    def toStringBody(var_changedFieldId: Object, var_changedFieldName: Object, var_dataType: Object, var_newDataValue: Object, var_oldDataValue: Object) =
        s"""
        | {
        | "changedFieldId":$var_changedFieldId,"changedFieldName":$var_changedFieldName,"dataType":$var_dataType,"newDataValue":$var_newDataValue,"oldDataValue":$var_oldDataValue
        | }
        """.stripMargin
}
