

# BaseBusinessAssets

An object containing the permissions a business has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. |  [optional]
**assetId** | **String** | Unique identifier of a business asset. |  [optional]
**assetType** | **AssetTypeResponse** |  |  [optional]
**permissions** | **Seq&lt;String&gt;** | Permission levels the requesting business has on an asset. |  [optional]



