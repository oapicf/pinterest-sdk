# CatalogsFeedProcessingSchedule
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Time** | **String** | A time in format HH:MM with leading 0 (zero) | 
**Timezone** | **String** | The timezone considered for the processing schedule time. | 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedProcessingSchedule = Initialize-PSOpenAPIToolsCatalogsFeedProcessingSchedule  -Time 02:59 `
 -Timezone null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedProcessingSchedule | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

