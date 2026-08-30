
# Table `AssetGroupModification`
(mapped from: AssetGroupModification)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetGroupUpdateError&gt;**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. |  [optional] [readonly]
**updatedAssetGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetGroupBinding&gt;**](AssetGroupBinding.md) | A list of successfully edited asset groups. |  [optional] [readonly]


# **Table `AssetGroupModificationAssetGroupUpdateError`**
(mapped from: AssetGroupModificationAssetGroupUpdateError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupModification | assetGroupModification | long | | kotlin.Long | Primary Key | *one*
assetGroupUpdateError | assetGroupUpdateError | long | | kotlin.Long | Foreign Key | *many*



# **Table `AssetGroupModificationAssetGroupBinding`**
(mapped from: AssetGroupModificationAssetGroupBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupModification | assetGroupModification | long | | kotlin.Long | Primary Key | *one*
assetGroupBinding | assetGroupBinding | long | | kotlin.Long | Foreign Key | *many*



