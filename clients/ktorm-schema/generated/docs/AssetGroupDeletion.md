
# Table `AssetGroupDeletion`
(mapped from: AssetGroupDeletion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**deletedAssetGroups** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional] [readonly]
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetGroupDeleteError&gt;**](AssetGroupDeleteError.md) |  |  [optional]


# **Table `AssetGroupDeletionDeletedAssetGroups`**
(mapped from: AssetGroupDeletionDeletedAssetGroups)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupDeletion | assetGroupDeletion | long | | kotlin.Long | Primary Key | *one*
deletedAssetGroups | deletedAssetGroups | text | | kotlin.String | Foreign Key | *many*



# **Table `AssetGroupDeletionAssetGroupDeleteError`**
(mapped from: AssetGroupDeletionAssetGroupDeleteError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupDeletion | assetGroupDeletion | long | | kotlin.Long | Primary Key | *one*
assetGroupDeleteError | assetGroupDeleteError | long | | kotlin.Long | Foreign Key | *many*



