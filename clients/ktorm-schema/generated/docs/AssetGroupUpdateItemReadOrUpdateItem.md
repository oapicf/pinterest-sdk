
# Table `AssetGroupUpdateItemReadOrUpdateItem`
(mapped from: AssetGroupUpdateItemReadOrUpdateItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetGroupId** | asset_group_id | text NOT NULL |  | **kotlin.String** | Unique identifier of the asset group to update. | 
**assetGroupTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetGroupType&gt;**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. |  [optional]
**assetsToAdd** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of asset ids to add to the asset group. |  [optional]
**assetsToRemove** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of asset ids to remove from the asset group. |  [optional]
**description** | description | text |  | **kotlin.String** | Asset group description. |  [optional]
**name** | name | text |  | **kotlin.String** | Asset Group name. |  [optional]



# **Table `AssetGroupUpdateItemReadOrUpdateItemAssetGroupType`**
(mapped from: AssetGroupUpdateItemReadOrUpdateItemAssetGroupType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupUpdateItemReadOrUpdateItem | assetGroupUpdateItemReadOrUpdateItem | long | | kotlin.Long | Primary Key | *one*
assetGroupType | assetGroupType | long | | kotlin.Long | Foreign Key | *many*



# **Table `AssetGroupUpdateItemReadOrUpdateItemAssetsToAdd`**
(mapped from: AssetGroupUpdateItemReadOrUpdateItemAssetsToAdd)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupUpdateItemReadOrUpdateItem | assetGroupUpdateItemReadOrUpdateItem | long | | kotlin.Long | Primary Key | *one*
assetsToAdd | assetsToAdd | text | | kotlin.String | Foreign Key | *many*



# **Table `AssetGroupUpdateItemReadOrUpdateItemAssetsToRemove`**
(mapped from: AssetGroupUpdateItemReadOrUpdateItemAssetsToRemove)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupUpdateItemReadOrUpdateItem | assetGroupUpdateItemReadOrUpdateItem | long | | kotlin.Long | Primary Key | *one*
assetsToRemove | assetsToRemove | text | | kotlin.String | Foreign Key | *many*





