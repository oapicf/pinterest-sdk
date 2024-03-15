
# Table `TopPinsAnalyticsResponse`
(mapped from: TopPinsAnalyticsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dateAvailability** | date_availability | long |  | [**TopPinsAnalyticsResponseDateAvailability**](TopPinsAnalyticsResponseDateAvailability.md) |  |  [optional] [foreignkey]
**pins** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TopPinsAnalyticsResponsePinsInner&gt;**](TopPinsAnalyticsResponsePinsInner.md) |  |  [optional]
**sortBy** | sort_by | text |  | [**sort_by**](#SortBy) |  |  [optional]



# **Table `TopPinsAnalyticsResponseTopPinsAnalyticsResponsePinsInner`**
(mapped from: TopPinsAnalyticsResponseTopPinsAnalyticsResponsePinsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
topPinsAnalyticsResponse | topPinsAnalyticsResponse | long | | kotlin.Long | Primary Key | *one*
topPinsAnalyticsResponsePinsInner | topPinsAnalyticsResponsePinsInner | long | | kotlin.Long | Foreign Key | *many*




