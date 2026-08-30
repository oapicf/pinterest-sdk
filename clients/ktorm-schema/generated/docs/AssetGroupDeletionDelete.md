
# Table `AssetGroupDeletionDelete`
(mapped from: AssetGroupDeletionDelete)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetGroupsToDelete** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 


# **Table `AssetGroupDeletionDeleteAssetGroupsToDelete`**
(mapped from: AssetGroupDeletionDeleteAssetGroupsToDelete)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupDeletionDelete | assetGroupDeletionDelete | long | | kotlin.Long | Primary Key | *one*
assetGroupsToDelete | assetGroupsToDelete | text | | kotlin.String | Foreign Key | *many*



