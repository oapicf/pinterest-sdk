
# Table `EntityHistory`
(mapped from: EntityHistory)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**changeTimestamp** | change_timestamp | int |  | **kotlin.Int** | A Unix timestamp representing the time of the change in seconds |  [optional]
**dataChanges** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EntityDataChangeHistory&gt;**](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data |  [optional]
**entityId** | entity_id | text |  | **kotlin.String** | The id of the entity that was changed |  [optional]
**entityName** | entity_name | text |  | **kotlin.String** | The name of the entity that was changed |  [optional]
**ldap** | ldap | text |  | **kotlin.String** | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users |  [optional]
**operation** | operation | long |  | [**ChangeHistoryOperationType**](ChangeHistoryOperationType.md) | The type of operation that caused the change |  [optional] [foreignkey]
**userId** | user_id | text |  | **kotlin.String** | The id of the user who initiated the change |  [optional]



# **Table `EntityHistoryEntityDataChangeHistory`**
(mapped from: EntityHistoryEntityDataChangeHistory)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
entityHistory | entityHistory | long | | kotlin.Long | Primary Key | *one*
entityDataChangeHistory | entityDataChangeHistory | long | | kotlin.Long | Foreign Key | *many*








