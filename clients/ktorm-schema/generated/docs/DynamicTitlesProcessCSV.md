
# Table `DynamicTitlesProcessCSV`
(mapped from: DynamicTitlesProcessCSV)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DynamicTitlesProcessCSVError&gt;**](DynamicTitlesProcessCSVError.md) | List of validation errors. Empty on success. |  [optional] [readonly]
**status** | status | text |  | **kotlin.String** | Processing status. Present on success. |  [optional] [readonly]


# **Table `DynamicTitlesProcessCSVDynamicTitlesProcessCSVError`**
(mapped from: DynamicTitlesProcessCSVDynamicTitlesProcessCSVError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
dynamicTitlesProcessCSV | dynamicTitlesProcessCSV | long | | kotlin.Long | Primary Key | *one*
dynamicTitlesProcessCSVError | dynamicTitlesProcessCSVError | long | | kotlin.Long | Foreign Key | *many*




