# CampaignDeliveryEstimatesDerivedMetrics
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cpc** | **Double** | Estimated cost per click. | [optional] 
**CpcLower** | **Double** | Lower estimate of the cost per click. | [optional] 
**CpcUpper** | **Double** | Upper estimate of the cost per click. | [optional] 
**Cpm** | **Double** | Estimated cost per thousand impressions. | [optional] 
**CpmLower** | **Double** | Lower estimate of cost per thousand impressions. | [optional] 
**CpmUpper** | **Double** | Upper estimate of cost per thousand impressions. | [optional] 
**LifetimeFrequency** | **Double** | Estimated lifetime frequency. | [optional] 
**LifetimeFrequencyLower** | **Double** | Lower estimate of lifetime frequency. | [optional] 
**LifetimeFrequencyUpper** | **Double** | Upper estimate of lifetime frequency. | [optional] 
**LifetimeImpression** | **Double** | Estimated lifetime impressions. | [optional] 
**LifetimeImpressionLower** | **Double** | Lower estimate of lifetime impressions. | [optional] 
**LifetimeImpressionUpper** | **Double** | Upper estimate of lifetime impressions. | [optional] 
**LifetimeReach** | **Double** | Estimated lifetime reach. | [optional] 
**LifetimeReachLower** | **Double** | Lower estimate of lifetime reach. | [optional] 
**LifetimeReachUpper** | **Double** | Upper estimate of lifetime reach. | [optional] 
**WeeklyClick** | **Double** | Estimated weekly clicks. | [optional] 
**WeeklyClickLower** | **Double** | Lower estimate of weekly clicks. | [optional] 
**WeeklyClickUpper** | **Double** | Upper estimate of weekly clicks. | [optional] 
**WeeklyFrequency** | **Double** | Estimated weekly frequency. | [optional] 
**WeeklyFrequencyLower** | **Double** | Lower estimate of weekly frequency. | [optional] 
**WeeklyFrequencyUpper** | **Double** | Upper estimate of weekly frequency. | [optional] 
**WeeklyImpression** | **Double** | Estimated weekly impressions. | [optional] 
**WeeklyImpressionLower** | **Double** | Lower estimate of weekly impressions. | [optional] 
**WeeklyImpressionUpper** | **Double** | Upper estimate of weekly impressions. | [optional] 
**WeeklyReach** | **Double** | Estimated weekly reach. | [optional] 
**WeeklyReachLower** | **Double** | Lower estimate of weekly reach. | [optional] 
**WeeklyReachUpper** | **Double** | Upper estimate of weekly reach. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignDeliveryEstimatesDerivedMetrics = Initialize-PSOpenAPIToolsCampaignDeliveryEstimatesDerivedMetrics  -Cpc 0.56 `
 -CpcLower 0.47 `
 -CpcUpper 0.65 `
 -Cpm 10 `
 -CpmLower 8 `
 -CpmUpper 12 `
 -LifetimeFrequency null `
 -LifetimeFrequencyLower null `
 -LifetimeFrequencyUpper null `
 -LifetimeImpression null `
 -LifetimeImpressionLower null `
 -LifetimeImpressionUpper null `
 -LifetimeReach null `
 -LifetimeReachLower null `
 -LifetimeReachUpper null `
 -WeeklyClick 1000 `
 -WeeklyClickLower 800 `
 -WeeklyClickUpper 1200 `
 -WeeklyFrequency 3 `
 -WeeklyFrequencyLower 2.5 `
 -WeeklyFrequencyUpper 3.5 `
 -WeeklyImpression 400000 `
 -WeeklyImpressionLower 350000 `
 -WeeklyImpressionUpper 450000 `
 -WeeklyReach 102074.85050444445 `
 -WeeklyReachLower 90000 `
 -WeeklyReachUpper 150000
```

- Convert the resource to JSON
```powershell
$CampaignDeliveryEstimatesDerivedMetrics | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

