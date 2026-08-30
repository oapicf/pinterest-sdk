

# EntityHistory

The class is defined in **[EntityHistory.java](../../src/main/java/org/openapitools/model/EntityHistory.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changeTimestamp** | `Integer` | A Unix timestamp representing the time of the change in seconds |  [optional property]
**dataChanges** | [`List&lt;EntityDataChangeHistory&gt;`](EntityDataChangeHistory.md) | Properties associated with a particular change to an entity&#39;s data |  [optional property]
**entityId** | `String` | The id of the entity that was changed |  [optional property]
**entityName** | `String` | The name of the entity that was changed |  [optional property]
**ldap** | `String` | The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users |  [optional property]
**operation** | `ChangeHistoryOperationType` | The type of operation that caused the change |  [optional property]
**userId** | `String` | The id of the user who initiated the change |  [optional property]









