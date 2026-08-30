# SchedulesCreate200ResponseInnerData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeltaValue** | [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  | [optional] 
**EndTimestamp** | **Int32** | Schedule end time. Unix timestamp in seconds. | [optional] 
**EntityId** | **String** | entity ID. | 
**EntityType** | [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] 
**Name** | **String** | Schedule name. | [optional] 
**ScheduleAction** | [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] 
**ScheduleId** | **String** | Schedule ID. | 
**ScheduleStatus** | [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] 
**ScheduleType** | [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] 
**StartTimestamp** | **Int32** | Schedule start time. Unix timestamp in seconds. | [optional] 
**Id** | **String** |  | 
**Exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | 

## Examples

- Prepare the resource
```powershell
$SchedulesCreate200ResponseInnerData = Initialize-PSOpenAPIToolsSchedulesCreate200ResponseInnerData  -DeltaValue null `
 -EndTimestamp null `
 -EntityId null `
 -EntityType null `
 -Name null `
 -ScheduleAction null `
 -ScheduleId null `
 -ScheduleStatus null `
 -ScheduleType null `
 -StartTimestamp null `
 -Id null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$SchedulesCreate200ResponseInnerData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

