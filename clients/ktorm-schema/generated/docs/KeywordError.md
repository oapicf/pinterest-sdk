
# Table `KeywordError`
(mapped from: KeywordError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | data | long |  | [**Keyword**](Keyword.md) |  |  [optional] [foreignkey]
**errorMessages** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]



# **Table `KeywordErrorErrorMessages`**
(mapped from: KeywordErrorErrorMessages)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keywordError | keywordError | long | | kotlin.Long | Primary Key | *one*
errorMessages | errorMessages | text | | kotlin.String | Foreign Key | *many*



