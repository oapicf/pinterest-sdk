# AdGroupAudienceSizing
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceSizeLowerBound** | **Decimal** | The lower confidence bound of the estimated potential audience size. &quot;&quot;Potential audience size&quot;&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. | [optional] [readonly] 
**AudienceSizeUpperBound** | **Decimal** | The upper confidence bound of the estimated potential audience size. &quot;&quot;Potential audience size&quot;&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$AdGroupAudienceSizing = Initialize-PSOpenAPIToolsAdGroupAudienceSizing  -AudienceSizeLowerBound null `
 -AudienceSizeUpperBound null
```

- Convert the resource to JSON
```powershell
$AdGroupAudienceSizing | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

