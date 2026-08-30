
# Table `AssetAccessRequestError`
(mapped from: AssetAccessRequestError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**code** | code | int |  | **kotlin.Int** | Error code associated with the error in requesting asset access. |  [optional]
**messages** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]



# **Table `AssetAccessRequestErrorMessages`**
(mapped from: AssetAccessRequestErrorMessages)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetAccessRequestError | assetAccessRequestError | long | | kotlin.Long | Primary Key | *one*
messages | messages | text | | kotlin.String | Foreign Key | *many*



