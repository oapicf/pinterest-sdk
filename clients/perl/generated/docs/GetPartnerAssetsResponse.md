# WWW::OpenAPIClient::Object::GetPartnerAssetsResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GetPartnerAssetsResponse;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **string** | Unique identifier of a business asset. | [optional] 
**asset_type** | **string** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**permissions** | **ARRAY[string]** | The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset. | [optional] 
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


