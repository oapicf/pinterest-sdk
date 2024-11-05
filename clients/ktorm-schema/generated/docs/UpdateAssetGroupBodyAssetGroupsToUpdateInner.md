
# Table `UpdateAssetGroupBody_asset_groups_to_update_inner`
(mapped from: UpdateAssetGroupBodyAssetGroupsToUpdateInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetGroupId** | asset_group_id | text NOT NULL |  | **kotlin.String** | Unique identifier of the asset group to update. | 
**name** | name | text |  | **kotlin.String** | Asset Group name |  [optional]
**description** | description | text |  | **kotlin.String** | Asset group description |  [optional]
**assetGroupTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetGroupType&gt;**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. |  [optional]
**assetsToAdd** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of asset ids to add to the asset group. |  [optional]
**assetsToRemove** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of asset ids to remove from the asset group. |  [optional]





# **Table `UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetGroupType`**
(mapped from: UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetGroupType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateAssetGroupBodyAssetGroupsToUpdateInner | updateAssetGroupBodyAssetGroupsToUpdateInner | long | | kotlin.Long | Primary Key | *one*
assetGroupType | assetGroupType | long | | kotlin.Long | Foreign Key | *many*



# **Table `UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToAdd`**
(mapped from: UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToAdd)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateAssetGroupBodyAssetGroupsToUpdateInner | updateAssetGroupBodyAssetGroupsToUpdateInner | long | | kotlin.Long | Primary Key | *one*
assetsToAdd | assetsToAdd | text | | kotlin.String | Foreign Key | *many*



# **Table `UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToRemove`**
(mapped from: UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToRemove)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateAssetGroupBodyAssetGroupsToUpdateInner | updateAssetGroupBodyAssetGroupsToUpdateInner | long | | kotlin.Long | Primary Key | *one*
assetsToRemove | assetsToRemove | text | | kotlin.String | Foreign Key | *many*



