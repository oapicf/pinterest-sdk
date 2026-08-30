
# Table `EntityLabelError`
(mapped from: EntityLabelError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | data | long |  | [**EntityLabel**](EntityLabel.md) |  |  [optional] [foreignkey]
**errorMessages** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]



# **Table `EntityLabelErrorErrorMessages`**
(mapped from: EntityLabelErrorErrorMessages)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
entityLabelError | entityLabelError | long | | kotlin.Long | Primary Key | *one*
errorMessages | errorMessages | text | | kotlin.String | Foreign Key | *many*



