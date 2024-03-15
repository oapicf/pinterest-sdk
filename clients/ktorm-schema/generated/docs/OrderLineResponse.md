
# Table `OrderLineResponse`
(mapped from: OrderLineResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderLineError&gt;**](OrderLineError.md) | Error list if update(s) fail. |  [optional]
**orderLine** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderLine&gt;**](OrderLine.md) | Order Line object array. |  [optional]


# **Table `OrderLineResponseOrderLineError`**
(mapped from: OrderLineResponseOrderLineError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderLineResponse | orderLineResponse | long | | kotlin.Long | Primary Key | *one*
orderLineError | orderLineError | long | | kotlin.Long | Foreign Key | *many*



# **Table `OrderLineResponseOrderLine`**
(mapped from: OrderLineResponseOrderLine)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderLineResponse | orderLineResponse | long | | kotlin.Long | Primary Key | *one*
orderLine | orderLine | long | | kotlin.Long | Foreign Key | *many*



