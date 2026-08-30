# BulkDownloadCampaignFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignStatus** | [**SummaryStatus[]**](SummaryStatus.md) |  | [optional] 
**EndTime** | **String** | Unix UTC timestamp. | [optional] 
**Name** | **String** | Campaign name | [optional] 
**ObjectiveType** | [**ConversionObjectiveType[]**](ConversionObjectiveType.md) |  | [optional] 
**StartTime** | **String** | Unix UTC timestamp. | [optional] 

## Examples

- Prepare the resource
```powershell
$BulkDownloadCampaignFilter = Initialize-PSOpenAPIToolsBulkDownloadCampaignFilter  -CampaignStatus null `
 -EndTime 1622848072 `
 -Name campaign name `
 -ObjectiveType null `
 -StartTime 1622848072
```

- Convert the resource to JSON
```powershell
$BulkDownloadCampaignFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

