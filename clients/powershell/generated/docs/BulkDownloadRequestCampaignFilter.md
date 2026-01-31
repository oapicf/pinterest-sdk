# BulkDownloadRequestCampaignFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignStatus** | [**CampaignSummaryStatus[]**](CampaignSummaryStatus.md) |  | [optional] 
**EndTime** | **String** | Unix UTC timestamp. | [optional] 
**Name** | **String** | Campaign name | [optional] 
**ObjectiveType** | [**ObjectiveType[]**](ObjectiveType.md) |  | [optional] 
**StartTime** | **String** | Unix UTC timestamp. | [optional] 

## Examples

- Prepare the resource
```powershell
$BulkDownloadRequestCampaignFilter = Initialize-PSOpenAPIToolsBulkDownloadRequestCampaignFilter  -CampaignStatus null `
 -EndTime 1622848072 `
 -Name campaign name `
 -ObjectiveType null `
 -StartTime 1622848072
```

- Convert the resource to JSON
```powershell
$BulkDownloadRequestCampaignFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

