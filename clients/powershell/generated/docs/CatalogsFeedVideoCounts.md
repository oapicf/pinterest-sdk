# CatalogsFeedVideoCounts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IngestedVideos** | **Int32** | The number of videos successfully ingested from the feed file. | [optional] 
**NotIngestedVideos** | **Int32** | The number of videos that were not ingested from the feed file. | [optional] 
**TotalVideos** | **Int32** | The number of videos in the feed file. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedVideoCounts = Initialize-PSOpenAPIToolsCatalogsFeedVideoCounts  -IngestedVideos null `
 -NotIngestedVideos null `
 -TotalVideos null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedVideoCounts | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

