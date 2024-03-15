
# Table `OrderLinesArrayResponse`
(mapped from: OrderLinesArrayResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderLines&gt;**](OrderLines.md) |  |  [optional]


# **Table `OrderLinesArrayResponseOrderLines`**
(mapped from: OrderLinesArrayResponseOrderLines)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderLinesArrayResponse | orderLinesArrayResponse | long | | kotlin.Long | Primary Key | *one*
orderLines | orderLines | long | | kotlin.Long | Foreign Key | *many*



