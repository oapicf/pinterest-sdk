
# Table `GetPartnerAssetsResponse`
(mapped from: GetPartnerAssetsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetId** | asset_id | text |  | **kotlin.String** | Unique identifier of a business asset. |  [optional]
**assetType** | asset_type | text |  | **kotlin.String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. |  [optional]
**permissions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset. |  [optional]
**assetGroupInfo** | asset_group_info | long |  | [**AssetGroupBinding**](AssetGroupBinding.md) |  |  [optional] [foreignkey]




# **Table `GetPartnerAssetsResponsePermissions`**
(mapped from: GetPartnerAssetsResponsePermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getPartnerAssetsResponse | getPartnerAssetsResponse | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | text | | kotlin.String | Foreign Key | *many*




