# SchedulesList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**Schedule[]**](Schedule.md) |  | 

## Examples

- Prepare the resource
```powershell
$SchedulesList200Response = Initialize-PSOpenAPIToolsSchedulesList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$SchedulesList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

