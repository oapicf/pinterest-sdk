# BulkDownloadRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignFilter** | [**BulkDownloadRequestCampaignFilter**](BulkDownloadRequestCampaignFilter.md) |  | [optional] 
**EntityIds** | **String[]** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**EntityTypes** | [**BulkEntityType[]**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**OutputFormat** | [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to "JSON"]
**UpdatedSince** | **String** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 

## Examples

- Prepare the resource
```powershell
$BulkDownloadRequest = Initialize-PSOpenAPIToolsBulkDownloadRequest  -CampaignFilter null `
 -EntityIds null `
 -EntityTypes [&quot;CAMPAIGN&quot;,&quot;AD_GROUP&quot;] `
 -OutputFormat null `
 -UpdatedSince 1622848072
```

- Convert the resource to JSON
```powershell
$BulkDownloadRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

