# BulkDownloadRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityTypes** | [**BulkEntityType[]**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**EntityIds** | **String[]** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**UpdatedSince** | **String** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 
**CampaignFilter** | [**BulkDownloadRequestCampaignFilter**](BulkDownloadRequestCampaignFilter.md) |  | [optional] 
**OutputFormat** | [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] [default to "JSON"]

## Examples

- Prepare the resource
```powershell
$BulkDownloadRequest = Initialize-PSOpenAPIToolsBulkDownloadRequest  -EntityTypes [&quot;CAMPAIGN&quot;,&quot;AD_GROUP&quot;] `
 -EntityIds null `
 -UpdatedSince 1622848072 `
 -CampaignFilter null `
 -OutputFormat null
```

- Convert the resource to JSON
```powershell
$BulkDownloadRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

