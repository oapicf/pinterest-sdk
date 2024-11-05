
# Table `DeleteAssetGroupBody`
(mapped from: DeleteAssetGroupBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetGroupsToDelete** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of ids of asset groups to be deleted | 


# **Table `DeleteAssetGroupBodyAssetGroupsToDelete`**
(mapped from: DeleteAssetGroupBodyAssetGroupsToDelete)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteAssetGroupBody | deleteAssetGroupBody | long | | kotlin.Long | Primary Key | *one*
assetGroupsToDelete | assetGroupsToDelete | text | | kotlin.String | Foreign Key | *many*



