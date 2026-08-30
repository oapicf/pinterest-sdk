
# Table `delivery_metrics_get_200_response`
(mapped from: DeliveryMetricsGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DeliveryMetricsResponseItemsItems&gt;**](DeliveryMetricsResponseItemsItems.md) |  | 


# **Table `DeliveryMetricsGet200ResponseDeliveryMetricsResponseItemsItems`**
(mapped from: DeliveryMetricsGet200ResponseDeliveryMetricsResponseItemsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deliveryMetricsGet200Response | deliveryMetricsGet200Response | long | | kotlin.Long | Primary Key | *one*
deliveryMetricsResponseItemsItems | deliveryMetricsResponseItemsItems | long | | kotlin.Long | Foreign Key | *many*



