
# Table `OrderLineError`
(mapped from: OrderLineError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | data | long |  | [**OrderLine**](.md) |  |  [optional] [foreignkey]
**errorMessages** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]



# **Table `OrderLineErrorErrorMessages`**
(mapped from: OrderLineErrorErrorMessages)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderLineError | orderLineError | long | | kotlin.Long | Primary Key | *one*
errorMessages | errorMessages | text | | kotlin.String | Foreign Key | *many*



