
# Table `MetricsResponse`
(mapped from: MetricsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]


# **Table `MetricsResponseData`**
(mapped from: MetricsResponseData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
metricsResponse | metricsResponse | long | | kotlin.Long | Primary Key | *one*
data | data | blob | | kotlin.Any | Foreign Key | *many*



