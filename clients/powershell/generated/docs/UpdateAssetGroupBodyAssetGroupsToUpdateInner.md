# UpdateAssetGroupBodyAssetGroupsToUpdateInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupId** | **String** | Unique identifier of the asset group to update. | 
**Name** | **String** | Asset Group name | [optional] 
**Description** | **String** | Asset group description | [optional] 
**AssetGroupTypes** | [**AssetGroupType[]**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] 
**AssetsToAdd** | **String[]** | A list of asset ids to add to the asset group. | [optional] 
**AssetsToRemove** | **String[]** | A list of asset ids to remove from the asset group. | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateAssetGroupBodyAssetGroupsToUpdateInner = Initialize-PSOpenAPIToolsUpdateAssetGroupBodyAssetGroupsToUpdateInner  -AssetGroupId 666791336903426391 `
 -Name Canada Ad Accounts `
 -Description Asset groups that has ad accounts shared in Canada `
 -AssetGroupTypes [&quot;BRAND&quot;,&quot;LOCATION_OR_LANGUAGE&quot;,&quot;PRODUCT_LINE&quot;,&quot;OTHER&quot;] `
 -AssetsToAdd null `
 -AssetsToRemove null
```

- Convert the resource to JSON
```powershell
$UpdateAssetGroupBodyAssetGroupsToUpdateInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

