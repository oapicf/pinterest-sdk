# OAIGetPartnerAssetsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetGroupInfo** | [**OAIAssetGroupBinding***](OAIAssetGroupBinding.md) |  | [optional] 
**assetId** | **NSString*** | Unique identifier of a business asset. | [optional] 
**assetType** | **NSString*** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] 
**permissions** | **NSArray&lt;NSString*&gt;*** | The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


