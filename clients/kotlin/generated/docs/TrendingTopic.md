
# TrendingTopic

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | **kotlin.String** | Description of the trending topic |  |
| **id** | **kotlin.String** | Unique identifier for the trending topic |  |
| **pins** | [**kotlin.collections.List&lt;TrendingPin&gt;**](TrendingPin.md) | Array of pin images related to this trend (up to 6) |  |
| **relatedInterests** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of related interest categories |  |
| **relatedSearches** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of related search terms |  |
| **timeSeries** | [**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | Time series data showing trend values over time, with dates as keys and values as numeric |  |
| **title** | **kotlin.String** | Title of the trending topic |  |
| **percentGrowthMom** | **kotlin.Int** | Month-over-month growth percentage |  [optional] |



