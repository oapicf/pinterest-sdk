
# Table `AssetIdPermissions`
(mapped from: AssetIdPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetId** | asset_id | text NOT NULL |  | **kotlin.String** | Unique identifier of a business asset. | 
**assetType** | asset_type | long NOT NULL |  | [**AssetTypeResponse**](AssetTypeResponse.md) |  |  [foreignkey]
**permissions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Permission levels member or partner has on an asset. | 
**assetGroupInfo** | asset_group_info | long |  | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. |  [optional] [foreignkey]




# **Table `AssetIdPermissionsPermissions`**
(mapped from: AssetIdPermissionsPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetIdPermissions | assetIdPermissions | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | text | | kotlin.String | Foreign Key | *many*




