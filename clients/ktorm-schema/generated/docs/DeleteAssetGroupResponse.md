
# Table `DeleteAssetGroupResponse`
(mapped from: DeleteAssetGroupResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**deletedAssetGroups** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of ids of successfully deleted asset groups. |  [optional]
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DeleteAssetGroupResponseExceptionsInner&gt;**](DeleteAssetGroupResponseExceptionsInner.md) | A list of errors associated with the asset groups. Will be returned if there is an error. |  [optional]


# **Table `DeleteAssetGroupResponseDeletedAssetGroups`**
(mapped from: DeleteAssetGroupResponseDeletedAssetGroups)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteAssetGroupResponse | deleteAssetGroupResponse | long | | kotlin.Long | Primary Key | *one*
deletedAssetGroups | deletedAssetGroups | text | | kotlin.String | Foreign Key | *many*



# **Table `DeleteAssetGroupResponseDeleteAssetGroupResponseExceptionsInner`**
(mapped from: DeleteAssetGroupResponseDeleteAssetGroupResponseExceptionsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteAssetGroupResponse | deleteAssetGroupResponse | long | | kotlin.Long | Primary Key | *one*
deleteAssetGroupResponseExceptionsInner | deleteAssetGroupResponseExceptionsInner | long | | kotlin.Long | Foreign Key | *many*



