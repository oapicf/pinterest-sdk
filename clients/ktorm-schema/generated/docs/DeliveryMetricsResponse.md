
# Table `DeliveryMetricsResponse`
(mapped from: DeliveryMetricsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DeliveryMetricsResponseItemsInner&gt;**](DeliveryMetricsResponseItemsInner.md) |  |  [optional]


# **Table `DeliveryMetricsResponseDeliveryMetricsResponseItemsInner`**
(mapped from: DeliveryMetricsResponseDeliveryMetricsResponseItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deliveryMetricsResponse | deliveryMetricsResponse | long | | kotlin.Long | Primary Key | *one*
deliveryMetricsResponseItemsInner | deliveryMetricsResponseItemsInner | long | | kotlin.Long | Foreign Key | *many*



