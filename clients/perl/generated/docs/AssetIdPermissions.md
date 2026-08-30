# WWW::OpenAPIClient::Object::AssetIdPermissions

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AssetIdPermissions;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 
**asset_id** | **string** | Unique identifier of a business asset. | 
**asset_type** | [**AssetTypeResponse**](AssetTypeResponse.md) |  | 
**permissions** | **ARRAY[string]** | Permission levels member or partner has on an asset. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


