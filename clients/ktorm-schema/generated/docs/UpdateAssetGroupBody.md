
# Table `UpdateAssetGroupBody`
(mapped from: UpdateAssetGroupBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetGroupsToUpdate** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateAssetGroupBodyAssetGroupsToUpdateInner&gt;**](UpdateAssetGroupBodyAssetGroupsToUpdateInner.md) | A list of asset groups and the data that will be used to update them. |  [optional]


# **Table `UpdateAssetGroupBodyUpdateAssetGroupBodyAssetGroupsToUpdateInner`**
(mapped from: UpdateAssetGroupBodyUpdateAssetGroupBodyAssetGroupsToUpdateInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateAssetGroupBody | updateAssetGroupBody | long | | kotlin.Long | Primary Key | *one*
updateAssetGroupBodyAssetGroupsToUpdateInner | updateAssetGroupBodyAssetGroupsToUpdateInner | long | | kotlin.Long | Foreign Key | *many*



