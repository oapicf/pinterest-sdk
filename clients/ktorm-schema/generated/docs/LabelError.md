
# Table `LabelError`
(mapped from: LabelError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | data | long |  | [**LabelErrorData**](LabelErrorData.md) |  |  [optional] [foreignkey]
**errorMessages** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]



# **Table `LabelErrorErrorMessages`**
(mapped from: LabelErrorErrorMessages)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labelError | labelError | long | | kotlin.Long | Primary Key | *one*
errorMessages | errorMessages | text | | kotlin.String | Foreign Key | *many*



