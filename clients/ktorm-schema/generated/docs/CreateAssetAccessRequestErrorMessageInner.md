
# Table `CreateAssetAccessRequestErrorMessage_inner`
(mapped from: CreateAssetAccessRequestErrorMessageInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**code** | code | int |  | **kotlin.Int** | Error code associated with the error in requesting asset access. |  [optional]
**messages** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]



# **Table `CreateAssetAccessRequestErrorMessageInnerMessages`**
(mapped from: CreateAssetAccessRequestErrorMessageInnerMessages)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createAssetAccessRequestErrorMessageInner | createAssetAccessRequestErrorMessageInner | long | | kotlin.Long | Primary Key | *one*
messages | messages | text | | kotlin.String | Foreign Key | *many*



