# RecordCounts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Invalid** | **Int32** | Number of invalid records processed | 
**Processed** | **Int32** | Number of records processed | 
**Valid** | **Int32** | Number of valid records processed | 

## Examples

- Prepare the resource
```powershell
$RecordCounts = Initialize-PSOpenAPIToolsRecordCounts  -Invalid null `
 -Processed null `
 -Valid null
```

- Convert the resource to JSON
```powershell
$RecordCounts | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

