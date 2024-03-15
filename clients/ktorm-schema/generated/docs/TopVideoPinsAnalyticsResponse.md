
# Table `TopVideoPinsAnalyticsResponse`
(mapped from: TopVideoPinsAnalyticsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dateAvailability** | date_availability | long |  | [**TopPinsAnalyticsResponseDateAvailability**](TopPinsAnalyticsResponseDateAvailability.md) |  |  [optional] [foreignkey]
**pins** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TopVideoPinsAnalyticsResponsePinsInner&gt;**](TopVideoPinsAnalyticsResponsePinsInner.md) |  |  [optional]
**sortBy** | sort_by | text |  | [**sort_by**](#SortBy) |  |  [optional]



# **Table `TopVideoPinsAnalyticsResponseTopVideoPinsAnalyticsResponsePinsInner`**
(mapped from: TopVideoPinsAnalyticsResponseTopVideoPinsAnalyticsResponsePinsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
topVideoPinsAnalyticsResponse | topVideoPinsAnalyticsResponse | long | | kotlin.Long | Primary Key | *one*
topVideoPinsAnalyticsResponsePinsInner | topVideoPinsAnalyticsResponsePinsInner | long | | kotlin.Long | Foreign Key | *many*




