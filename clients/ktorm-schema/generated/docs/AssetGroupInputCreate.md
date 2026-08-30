
# Table `AssetGroupInputCreate`
(mapped from: AssetGroupInputCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetGroupDescription** | asset_group_description | text NOT NULL |  | **kotlin.String** | Asset group description. | 
**assetGroupName** | asset_group_name | text NOT NULL |  | **kotlin.String** | Asset Group name. | 
**assetGroupTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetGroupType&gt;**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | 
**assetGroup** | asset_group | long |  | [**AssetGroupBinding**](AssetGroupBinding.md) |  |  [optional] [foreignkey]




# **Table `AssetGroupInputCreateAssetGroupType`**
(mapped from: AssetGroupInputCreateAssetGroupType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupInputCreate | assetGroupInputCreate | long | | kotlin.Long | Primary Key | *one*
assetGroupType | assetGroupType | long | | kotlin.Long | Foreign Key | *many*




