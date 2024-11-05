
# Table `DeletePartnerAssetsResult`
(mapped from: DeletePartnerAssetsResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetId** | asset_id | text |  | **kotlin.String** | Unique identifier of a business asset. |  [optional]
**assetType** | asset_type | text |  | **kotlin.String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. |  [optional]
**permissions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Permission levels member or partner has on an asset. |  [optional]
**isSharedPartner** | is_shared_partner | boolean |  | **kotlin.Boolean** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. |  [optional]
**partnerId** | partner_id | text |  | **kotlin.String** | Unique identifier of a business partner. |  [optional]




# **Table `DeletePartnerAssetsResultPermissions`**
(mapped from: DeletePartnerAssetsResultPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deletePartnerAssetsResult | deletePartnerAssetsResult | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | text | | kotlin.String | Foreign Key | *many*





