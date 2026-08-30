package org.openapitools.server.model


/**
 * @param changeTimestamp A Unix timestamp representing the time of the change in seconds for example: ''null''
 * @param dataChanges Properties associated with a particular change to an entity's data for example: ''null''
 * @param entityId The id of the entity that was changed for example: ''null''
 * @param entityName The name of the entity that was changed for example: ''null''
 * @param ldap The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users for example: ''null''
 * @param operation The type of operation that caused the change for example: ''null''
 * @param userId The id of the user who initiated the change for example: ''null''
*/
final case class EntityHistory (
  changeTimestamp: Option[Int] = None,
  dataChanges: Option[Seq[EntityDataChangeHistory]] = None,
  entityId: Option[String] = None,
  entityName: Option[String] = None,
  ldap: Option[String] = None,
  operation: Option[ChangeHistoryOperationType] = None,
  userId: Option[String] = None
)

