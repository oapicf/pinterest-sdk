

# DeletePartnerAssetsResult

The terminated asset access.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetId** | **String** | Unique identifier of a business asset. |  [optional]
**assetType** | **String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. |  [optional]
**permissions** | **Seq&lt;String&gt;** | Permission levels member or partner has on an asset. |  [optional]
**isSharedPartner** | **Boolean** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. |  [optional]
**partnerId** | **String** | Unique identifier of a business partner. |  [optional]



