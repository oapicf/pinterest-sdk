
# Table `AssetGroupModificationReadOrUpdate`
(mapped from: AssetGroupModificationReadOrUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetGroupsToUpdate** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetGroupUpdateItemReadOrUpdateItem&gt;**](AssetGroupUpdateItemReadOrUpdateItem.md) | A list of asset groups and the data that will be used to update them. |  [optional]
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetGroupUpdateError&gt;**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. |  [optional] [readonly]
**updatedAssetGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetGroupBinding&gt;**](AssetGroupBinding.md) | A list of successfully edited asset groups. |  [optional] [readonly]


# **Table `AssetGroupModificationReadOrUpdateAssetGroupUpdateItemReadOrUpdateItem`**
(mapped from: AssetGroupModificationReadOrUpdateAssetGroupUpdateItemReadOrUpdateItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupModificationReadOrUpdate | assetGroupModificationReadOrUpdate | long | | kotlin.Long | Primary Key | *one*
assetGroupUpdateItemReadOrUpdateItem | assetGroupUpdateItemReadOrUpdateItem | long | | kotlin.Long | Foreign Key | *many*



# **Table `AssetGroupModificationReadOrUpdateAssetGroupUpdateError`**
(mapped from: AssetGroupModificationReadOrUpdateAssetGroupUpdateError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupModificationReadOrUpdate | assetGroupModificationReadOrUpdate | long | | kotlin.Long | Primary Key | *one*
assetGroupUpdateError | assetGroupUpdateError | long | | kotlin.Long | Foreign Key | *many*



# **Table `AssetGroupModificationReadOrUpdateAssetGroupBinding`**
(mapped from: AssetGroupModificationReadOrUpdateAssetGroupBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupModificationReadOrUpdate | assetGroupModificationReadOrUpdate | long | | kotlin.Long | Primary Key | *one*
assetGroupBinding | assetGroupBinding | long | | kotlin.Long | Foreign Key | *many*



