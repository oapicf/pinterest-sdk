# WWW::OpenAPIClient::Object::BaseBusinessAssets

## Load the model package
```perl
use WWW::OpenAPIClient::Object::BaseBusinessAssets;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 
**asset_id** | **string** | Unique identifier of a business asset. | [optional] 
**asset_type** | [**AssetTypeResponse**](AssetTypeResponse.md) |  | [optional] 
**permissions** | **ARRAY[string]** | Permission levels the requesting business has on an asset. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


