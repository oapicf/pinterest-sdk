
# Table `OrderLineMutationError`
(mapped from: OrderLineMutationError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | data | long |  | [**OrderLine**](OrderLine.md) |  |  [optional] [foreignkey]
**errorMessages** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Error messages. |  [optional]



# **Table `OrderLineMutationErrorErrorMessages`**
(mapped from: OrderLineMutationErrorErrorMessages)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderLineMutationError | orderLineMutationError | long | | kotlin.Long | Primary Key | *one*
errorMessages | errorMessages | text | | kotlin.String | Foreign Key | *many*



