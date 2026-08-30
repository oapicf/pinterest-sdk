
# Table `EntityDataChangeHistory`
(mapped from: EntityDataChangeHistory)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**changedFieldId** | changed_field_id | text |  | **kotlin.String** | A string identifier representing the changed field on the entity |  [optional]
**changedFieldName** | changed_field_name | text |  | **kotlin.String** | The human readable name of the changed field on the entity |  [optional]
**dataType** | data_type | long |  | [**ChangeHistoryDataType**](ChangeHistoryDataType.md) | Specifies the type of the field&#39;s data values |  [optional] [foreignkey]
**newDataValue** | new_data_value | text |  | **kotlin.String** | A string representation of the value of the changed field, after the change |  [optional]
**oldDataValue** | old_data_value | text |  | **kotlin.String** | A string representation of the value of the changed field, before the change |  [optional]







