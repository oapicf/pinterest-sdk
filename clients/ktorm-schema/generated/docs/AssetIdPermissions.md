
# Table `AssetIdPermissions`
(mapped from: AssetIdPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetId** | asset_id | text |  | **kotlin.String** | Unique identifier of a business asset. |  [optional]
**assetType** | asset_type | text |  | **kotlin.String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. |  [optional]
**permissions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Permission levels member or partner has on an asset. |  [optional]
**assetGroupInfo** | asset_group_info | long |  | [**AssetGroupBinding**](AssetGroupBinding.md) |  |  [optional] [foreignkey]




# **Table `AssetIdPermissionsPermissions`**
(mapped from: AssetIdPermissionsPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetIdPermissions | assetIdPermissions | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | text | | kotlin.String | Foreign Key | *many*




