package org.openapitools.server.model


/**
 * @param changedFieldId A string identifier representing the changed field on the entity for example: ''null''
 * @param changedFieldName The human readable name of the changed field on the entity for example: ''null''
 * @param dataType Specifies the type of the field's data values for example: ''null''
 * @param newDataValue A string representation of the value of the changed field, after the change for example: ''null''
 * @param oldDataValue A string representation of the value of the changed field, before the change for example: ''null''
*/
final case class EntityDataChangeHistory (
  changedFieldId: Option[String] = None,
  changedFieldName: Option[String] = None,
  dataType: Option[ChangeHistoryDataType] = None,
  newDataValue: Option[String] = None,
  oldDataValue: Option[String] = None
)

