# ScheduleUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityId** | **String** |  | [optional] 
**EntityType** | **String** | Entity type | [optional] 
**Id** | **String** | Schedule ID. | 
**DeltaValue** | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | [optional] 
**EndTimestamp** | **Int32** | Schedule end time. Unix timestamp in seconds. | [optional] 
**Name** | **String** |  | [optional] 
**ScheduleAction** | [**ScheduleAction**](ScheduleAction.md) |  | [optional] 
**ScheduleStatus** | [**ScheduleStatus**](ScheduleStatus.md) |  | [optional] 
**ScheduleType** | [**ScheduleType**](ScheduleType.md) |  | [optional] 
**StartTimestamp** | **Int32** | Schedule start time. Unix timestamp in seconds. | [optional] 

## Examples

- Prepare the resource
```powershell
$ScheduleUpdateRequest = Initialize-PSOpenAPIToolsScheduleUpdateRequest  -EntityId null `
 -EntityType null `
 -Id null `
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
$ScheduleUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

