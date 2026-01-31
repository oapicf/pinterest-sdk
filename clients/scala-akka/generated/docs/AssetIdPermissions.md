

# AssetIdPermissions

An object containing the permissions a business member has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) |  |  [optional]
**assetId** | **String** | Unique identifier of a business asset. |  [optional]
**assetType** | **String** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. |  [optional]
**permissions** | **Seq&lt;String&gt;** | Permission levels member or partner has on an asset. |  [optional]



