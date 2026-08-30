# WWW::OpenAPIClient::Object::EntityDataChangeHistory

## Load the model package
```perl
use WWW::OpenAPIClient::Object::EntityDataChangeHistory;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changed_field_id** | **string** | A string identifier representing the changed field on the entity | [optional] 
**changed_field_name** | **string** | The human readable name of the changed field on the entity | [optional] 
**data_type** | [**ChangeHistoryDataType**](ChangeHistoryDataType.md) | Specifies the type of the field&#39;s data values | [optional] 
**new_data_value** | **string** | A string representation of the value of the changed field, after the change | [optional] 
**old_data_value** | **string** | A string representation of the value of the changed field, before the change | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


