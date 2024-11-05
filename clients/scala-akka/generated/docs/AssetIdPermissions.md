

# AssetIdPermissions

An object containing the permissions a business member has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetId** | **String** | Unique identifier of a business asset. |  [optional]
**assetType** | **String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. |  [optional]
**permissions** | **Seq&lt;String&gt;** | Permission levels member or partner has on an asset. |  [optional]
**assetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) |  |  [optional]



