# SchedulesCreate200ResponseInnerDataOneOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**ScheduleId** | **String** | Schedule ID. | 
**Exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | 

## Examples

- Prepare the resource
```powershell
$SchedulesCreate200ResponseInnerDataOneOf = Initialize-PSOpenAPIToolsSchedulesCreate200ResponseInnerDataOneOf  -Id null `
 -ScheduleId null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$SchedulesCreate200ResponseInnerDataOneOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

