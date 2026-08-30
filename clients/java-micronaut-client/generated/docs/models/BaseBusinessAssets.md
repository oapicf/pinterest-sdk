

# BaseBusinessAssets

An object containing the permissions a business has on the asset.

The class is defined in **[BaseBusinessAssets.java](../../src/main/java/org/openapitools/model/BaseBusinessAssets.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetGroupInfo** | [`AssetGroupBinding`](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. |  [optional property]
**assetId** | `String` | Unique identifier of a business asset. |  [optional property]
**assetType** | `AssetTypeResponse` |  |  [optional property]
**permissions** | `List&lt;String&gt;` | Permission levels the requesting business has on an asset. |  [optional property]






