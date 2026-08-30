# OrderLine


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_account_id`** | **`String`** | Ad account ID. | [default to nothing]
**`budget`** | **`Float64`** | Order line budget in micro currency. | [optional] [default to nothing]
**`campaign_ids`** | **`Vector{String}`** | Associated List of campaign IDs. | [default to nothing]
**`end_time`** | **`Float64`** | End time. Unix timestamp. | [optional] [default to nothing]
**`id`** | **`String`** | Order line ID. | [default to nothing]
**`name`** | **`String`** | Order line name. | [optional] [default to nothing]
**`paid_budget`** | **`Float64`** | Order line paid budget in micro currency. | [optional] [default to nothing]
**`paid_type`** | [**`*OrderLinePaidType`**](OrderLinePaidType.md) | Order line paid type. | [optional] [default to nothing]
**`purchase_order_id`** | **`String`** | Purchase order ID. | [optional] [default to nothing]
**`start_time`** | **`Float64`** | Start time. Unix timestamp. | [optional] [default to nothing]
**`status`** | [**`*OrderLineStatus`**](OrderLineStatus.md) | Order line status. | [default to nothing]
**`type`** | **`String`** | Always \&quot;orderline\&quot;. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


