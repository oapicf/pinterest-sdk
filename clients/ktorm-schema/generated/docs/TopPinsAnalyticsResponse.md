
# Table `TopPinsAnalyticsResponse`
(mapped from: TopPinsAnalyticsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dateAvailability** | date_availability | long |  | [**TopPinsAnalyticsResponseDateAvailability**](TopPinsAnalyticsResponseDateAvailability.md) |  |  [optional] [foreignkey]
**pins** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TopPinsAnalyticsResponsePinsItems&gt;**](TopPinsAnalyticsResponsePinsItems.md) |  |  [optional]
**sortBy** | sort_by | long |  | [**TopPinsSortBy**](TopPinsSortBy.md) |  |  [optional] [foreignkey]



# **Table `TopPinsAnalyticsResponseTopPinsAnalyticsResponsePinsItems`**
(mapped from: TopPinsAnalyticsResponseTopPinsAnalyticsResponsePinsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
topPinsAnalyticsResponse | topPinsAnalyticsResponse | long | | kotlin.Long | Primary Key | *one*
topPinsAnalyticsResponsePinsItems | topPinsAnalyticsResponsePinsItems | long | | kotlin.Long | Foreign Key | *many*




