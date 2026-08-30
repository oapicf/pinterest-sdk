
# Table `OrderLineMutationResult`
(mapped from: OrderLineMutationResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderLineMutationError&gt;**](OrderLineMutationError.md) | Error list if update(s) fail. |  [optional]
**orderLine** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderLine&gt;**](OrderLine.md) | Order Line object array. |  [optional]


# **Table `OrderLineMutationResultOrderLineMutationError`**
(mapped from: OrderLineMutationResultOrderLineMutationError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderLineMutationResult | orderLineMutationResult | long | | kotlin.Long | Primary Key | *one*
orderLineMutationError | orderLineMutationError | long | | kotlin.Long | Foreign Key | *many*



# **Table `OrderLineMutationResultOrderLine`**
(mapped from: OrderLineMutationResultOrderLine)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderLineMutationResult | orderLineMutationResult | long | | kotlin.Long | Primary Key | *one*
orderLine | orderLine | long | | kotlin.Long | Foreign Key | *many*



