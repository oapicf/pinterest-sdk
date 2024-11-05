
# Table `UpdateMemberAssetsResultsResponseArray`
(mapped from: UpdateMemberAssetsResultsResponseArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateMemberAssetsResultsResponseArrayItemsInner&gt;**](UpdateMemberAssetsResultsResponseArrayItemsInner.md) | List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned. |  [optional]


# **Table `UpdateMemberAssetsResultsResponseArrayUpdateMemberAssetsResultsResponseArrayItemsInner`**
(mapped from: UpdateMemberAssetsResultsResponseArrayUpdateMemberAssetsResultsResponseArrayItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateMemberAssetsResultsResponseArray | updateMemberAssetsResultsResponseArray | long | | kotlin.Long | Primary Key | *one*
updateMemberAssetsResultsResponseArrayItemsInner | updateMemberAssetsResultsResponseArrayItemsInner | long | | kotlin.Long | Foreign Key | *many*



