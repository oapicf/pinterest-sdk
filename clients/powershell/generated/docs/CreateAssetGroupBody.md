# CreateAssetGroupBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupName** | **String** | Asset Group name | 
**AssetGroupDescription** | **String** | Asset group description | 
**AssetGroupTypes** | [**AssetGroupType[]**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | 

## Examples

- Prepare the resource
```powershell
$CreateAssetGroupBody = Initialize-PSOpenAPIToolsCreateAssetGroupBody  -AssetGroupName Canada Ad Accounts `
 -AssetGroupDescription Asset groups that has ad accounts shared in Canada `
 -AssetGroupTypes [&quot;BRAND&quot;,&quot;LOCATION_OR_LANGUAGE&quot;,&quot;PRODUCT_LINE&quot;,&quot;OTHER&quot;]
```

- Convert the resource to JSON
```powershell
$CreateAssetGroupBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

