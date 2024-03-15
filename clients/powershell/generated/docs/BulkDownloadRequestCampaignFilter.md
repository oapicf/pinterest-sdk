# BulkDownloadRequestCampaignFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartTime** | **String** | Unix UTC timestamp. | [optional] 
**EndTime** | **String** | Unix UTC timestamp. | [optional] 
**Name** | **String** | Campaign name | [optional] 
**CampaignStatus** | [**CampaignSummaryStatus[]**](CampaignSummaryStatus.md) |  | [optional] 
**ObjectiveType** | [**ObjectiveType[]**](ObjectiveType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BulkDownloadRequestCampaignFilter = Initialize-PSOpenAPIToolsBulkDownloadRequestCampaignFilter  -StartTime 1622848072 `
 -EndTime 1622848072 `
 -Name campaign name `
 -CampaignStatus null `
 -ObjectiveType null
```

- Convert the resource to JSON
```powershell
$BulkDownloadRequestCampaignFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

