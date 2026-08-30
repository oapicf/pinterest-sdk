# ScheduleCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityId** | **String** |  | 
**EntityType** | **String** | Entity type | 
**DeltaValue** | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | 
**EndTimestamp** | **Int32** | Schedule end time. Unix timestamp in seconds. | 
**Name** | **String** |  | 
**ScheduleAction** | [**ScheduleAction**](ScheduleAction.md) |  | 
**ScheduleStatus** | [**ScheduleStatus**](ScheduleStatus.md) |  | 
**ScheduleType** | [**ScheduleType**](ScheduleType.md) |  | 
**StartTimestamp** | **Int32** | Schedule start time. Unix timestamp in seconds. | 

## Examples

- Prepare the resource
```powershell
$ScheduleCreateRequest = Initialize-PSOpenAPIToolsScheduleCreateRequest  -EntityId null `
 -EntityType null `
 -DeltaValue null `
 -EndTimestamp null `
 -Name null `
 -ScheduleAction null `
 -ScheduleStatus null `
 -ScheduleType null `
 -StartTimestamp null
```

- Convert the resource to JSON
```powershell
$ScheduleCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

