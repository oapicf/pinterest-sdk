
# Table `MetricsResponse`
(mapped from: MetricsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MetricsResponseDataItems&gt;**](MetricsResponseDataItems.md) |  |  [optional]


# **Table `MetricsResponseMetricsResponseDataItems`**
(mapped from: MetricsResponseMetricsResponseDataItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
metricsResponse | metricsResponse | long | | kotlin.Long | Primary Key | *one*
metricsResponseDataItems | metricsResponseDataItems | long | | kotlin.Long | Foreign Key | *many*



