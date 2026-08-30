
# Table `TopVideoPinsAnalyticsResponse`
(mapped from: TopVideoPinsAnalyticsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dateAvailability** | date_availability | long |  | [**TopVideoPinsAnalyticsResponseDateAvailability**](TopVideoPinsAnalyticsResponseDateAvailability.md) |  |  [optional] [foreignkey]
**pins** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TopVideoPinsAnalyticsResponsePinsItems&gt;**](TopVideoPinsAnalyticsResponsePinsItems.md) |  |  [optional]
**sortBy** | sort_by | long |  | [**TopVideoPinsSortBy**](TopVideoPinsSortBy.md) |  |  [optional] [foreignkey]



# **Table `TopVideoPinsAnalyticsResponseTopVideoPinsAnalyticsResponsePinsItems`**
(mapped from: TopVideoPinsAnalyticsResponseTopVideoPinsAnalyticsResponsePinsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
topVideoPinsAnalyticsResponse | topVideoPinsAnalyticsResponse | long | | kotlin.Long | Primary Key | *one*
topVideoPinsAnalyticsResponsePinsItems | topVideoPinsAnalyticsResponsePinsItems | long | | kotlin.Long | Foreign Key | *many*




