# EntityDataChangeHistory
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChangedFieldId** | **String** | A string identifier representing the changed field on the entity | [optional] 
**ChangedFieldName** | **String** | The human readable name of the changed field on the entity | [optional] 
**DataType** | [**ChangeHistoryDataType**](ChangeHistoryDataType.md) | Specifies the type of the field&#39;s data values | [optional] 
**NewDataValue** | **String** | A string representation of the value of the changed field, after the change | [optional] 
**OldDataValue** | **String** | A string representation of the value of the changed field, before the change | [optional] 

## Examples

- Prepare the resource
```powershell
$EntityDataChangeHistory = Initialize-PSOpenAPIToolsEntityDataChangeHistory  -ChangedFieldId null `
 -ChangedFieldName null `
 -DataType null `
 -NewDataValue null `
 -OldDataValue null
```

- Convert the resource to JSON
```powershell
$EntityDataChangeHistory | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

