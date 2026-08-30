

# AssetIdPermissions

An object containing the permissions a business member has on the asset.

The class is defined in **[AssetIdPermissions.java](../../src/main/java/org/openapitools/model/AssetIdPermissions.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetGroupInfo** | [`AssetGroupBinding`](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. |  [optional property]
**assetId** | `String` | Unique identifier of a business asset. | 
**assetType** | `AssetTypeResponse` |  | 
**permissions** | `List&lt;String&gt;` | Permission levels member or partner has on an asset. | 






