# WWW::OpenAPIClient::Object::UpdateAssetGroupBodyAssetGroupsToUpdateInner

## Load the model package
```perl
use WWW::OpenAPIClient::Object::UpdateAssetGroupBodyAssetGroupsToUpdateInner;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | **string** | Unique identifier of the asset group to update. | 
**asset_group_types** | [**ARRAY[AssetGroupType]**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] 
**assets_to_add** | **ARRAY[string]** | A list of asset ids to add to the asset group. | [optional] 
**assets_to_remove** | **ARRAY[string]** | A list of asset ids to remove from the asset group. | [optional] 
**description** | **string** | Asset group description | [optional] 
**name** | **string** | Asset Group name | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


