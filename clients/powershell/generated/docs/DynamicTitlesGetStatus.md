# DynamicTitlesGetStatus
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GeneratedCount** | **Int32** | The count of generated titles. | [optional] 
**IsReady** | **Boolean** | Whether dynamic titles have been generated and are ready to be reviewed for the ad group. | [optional] 
**ReviewedCount** | **Int32** | The count of advertiser reviewed titles. | [optional] 

## Examples

- Prepare the resource
```powershell
$DynamicTitlesGetStatus = Initialize-PSOpenAPIToolsDynamicTitlesGetStatus  -GeneratedCount 987 `
 -IsReady true `
 -ReviewedCount 456
```

- Convert the resource to JSON
```powershell
$DynamicTitlesGetStatus | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

