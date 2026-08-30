# openapi::EntityDataChangeHistory


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changed_field_id** | **character** | A string identifier representing the changed field on the entity | [optional] 
**changed_field_name** | **character** | The human readable name of the changed field on the entity | [optional] 
**data_type** | [**ChangeHistoryDataType**](ChangeHistoryDataType.md) | Specifies the type of the field&#39;s data values | [optional] [Enum: ] 
**new_data_value** | **character** | A string representation of the value of the changed field, after the change | [optional] 
**old_data_value** | **character** | A string representation of the value of the changed field, before the change | [optional] 


