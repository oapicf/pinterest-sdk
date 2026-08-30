# CampaignDeliveryEstimatesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Curves** | [**CampaignPlanningCurveEstimate[]**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] 
**DerivedMetrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**MaxPotentialSpend** | **Int32** | Maximum potential spend estimate. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignDeliveryEstimatesResponse = Initialize-PSOpenAPIToolsCampaignDeliveryEstimatesResponse  -Curves null `
 -DerivedMetrics null `
 -MaxPotentialSpend 50000000
```

- Convert the resource to JSON
```powershell
$CampaignDeliveryEstimatesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

