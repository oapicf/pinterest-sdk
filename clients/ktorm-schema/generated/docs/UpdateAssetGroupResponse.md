
# Table `UpdateAssetGroupResponse`
(mapped from: UpdateAssetGroupResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**updatedAssetGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetGroupBinding&gt;**](AssetGroupBinding.md) | A list of successfully edited asset groups. |  [optional]
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateAssetGroupResponseExceptionsInner&gt;**](UpdateAssetGroupResponseExceptionsInner.md) | A list of errors associated with the asset groups. Will be returned if there is an error. |  [optional]


# **Table `UpdateAssetGroupResponseAssetGroupBinding`**
(mapped from: UpdateAssetGroupResponseAssetGroupBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateAssetGroupResponse | updateAssetGroupResponse | long | | kotlin.Long | Primary Key | *one*
assetGroupBinding | assetGroupBinding | long | | kotlin.Long | Foreign Key | *many*



# **Table `UpdateAssetGroupResponseUpdateAssetGroupResponseExceptionsInner`**
(mapped from: UpdateAssetGroupResponseUpdateAssetGroupResponseExceptionsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateAssetGroupResponse | updateAssetGroupResponse | long | | kotlin.Long | Primary Key | *one*
updateAssetGroupResponseExceptionsInner | updateAssetGroupResponseExceptionsInner | long | | kotlin.Long | Foreign Key | *many*



