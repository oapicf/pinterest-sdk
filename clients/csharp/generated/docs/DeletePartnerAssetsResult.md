# Org.OpenAPITools.Model.DeletePartnerAssetsResult
The terminated asset access.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **string** | Unique identifier of a business asset. | [optional] 
**AssetType** | **string** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**Permissions** | **List&lt;string&gt;** | Permission levels member or partner has on an asset. | [optional] 
**IsSharedPartner** | **bool** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional] 
**PartnerId** | **string** | Unique identifier of a business partner. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

