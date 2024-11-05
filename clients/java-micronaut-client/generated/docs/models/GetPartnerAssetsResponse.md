

# GetPartnerAssetsResponse

An object containing the permissions a you/your business partner has on the asset.

The class is defined in **[GetPartnerAssetsResponse.java](../../src/main/java/org/openapitools/model/GetPartnerAssetsResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetId** | `String` | Unique identifier of a business asset. |  [optional property]
**assetType** | `String` | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. |  [optional property]
**permissions** | `List&lt;String&gt;` | The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset. |  [optional property]
**assetGroupInfo** | [`AssetGroupBinding`](AssetGroupBinding.md) |  |  [optional property]






