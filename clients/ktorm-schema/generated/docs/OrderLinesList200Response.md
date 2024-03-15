
# Table `order_lines_list_200_response`
(mapped from: OrderLinesList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderLine&gt;**](OrderLine.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `OrderLinesList200ResponseOrderLine`**
(mapped from: OrderLinesList200ResponseOrderLine)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderLinesList200Response | orderLinesList200Response | long | | kotlin.Long | Primary Key | *one*
orderLine | orderLine | long | | kotlin.Long | Foreign Key | *many*




