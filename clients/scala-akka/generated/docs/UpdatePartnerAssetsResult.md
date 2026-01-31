

# UpdatePartnerAssetsResult

An object containing the permissions a business partner has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetId** | **String** | Unique identifier of a business asset. |  [optional]
**assetType** | **String** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. |  [optional]
**partnerId** | **String** | Unique identifier of a business partner. |  [optional]
**permissions** | **Seq&lt;String&gt;** | Permission levels member or partner has on an asset. |  [optional]



