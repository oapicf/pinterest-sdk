
package org.openapitools.client.model


case class EntityHistory (
    /* A Unix timestamp representing the time of the change in seconds */
    _changeTimestamp: Option[Integer],
    /* Properties associated with a particular change to an entity's data */
    _dataChanges: Option[List[EntityDataChangeHistory]],
    /* The id of the entity that was changed */
    _entityId: Option[String],
    /* The name of the entity that was changed */
    _entityName: Option[String],
    /* The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users */
    _ldap: Option[String],
    /* The type of operation that caused the change */
    _operation: Option[ChangeHistoryOperationType],
    /* The id of the user who initiated the change */
    _userId: Option[String]
)
object EntityHistory {
    def toStringBody(var_changeTimestamp: Object, var_dataChanges: Object, var_entityId: Object, var_entityName: Object, var_ldap: Object, var_operation: Object, var_userId: Object) =
        s"""
        | {
        | "changeTimestamp":$var_changeTimestamp,"dataChanges":$var_dataChanges,"entityId":$var_entityId,"entityName":$var_entityName,"ldap":$var_ldap,"operation":$var_operation,"userId":$var_userId
        | }
        """.stripMargin
}
