# CatalogsLocalStoresDelete200ResponseInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of the local store. | 
**Status** | [**CampaignAdPreviewDelete200ResponseInnerStatus**](CampaignAdPreviewDelete200ResponseInnerStatus.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsLocalStoresDelete200ResponseInner = Initialize-PSOpenAPIToolsCatalogsLocalStoresDelete200ResponseInner  -Id 1234567890 `
 -Status null
```

- Convert the resource to JSON
```powershell
$CatalogsLocalStoresDelete200ResponseInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

