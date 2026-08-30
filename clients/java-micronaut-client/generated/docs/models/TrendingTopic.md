

# TrendingTopic

Individual trending topic within an interest category

The class is defined in **[TrendingTopic.java](../../src/main/java/org/openapitools/model/TrendingTopic.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | `String` | Description of the trending topic | 
**id** | `String` | Unique identifier for the trending topic | 
**percentGrowthMom** | `Integer` | Month-over-month growth percentage |  [optional property]
**pins** | [`List&lt;TrendingPin&gt;`](TrendingPin.md) | Array of pin images related to this trend (up to 6) | 
**relatedInterests** | `List&lt;String&gt;` | List of related interest categories | 
**relatedSearches** | `List&lt;String&gt;` | List of related search terms | 
**timeSeries** | `Map&lt;String, BigDecimal&gt;` | Time series data showing trend values over time, with dates as keys and values as numeric | 
**title** | `String` | Title of the trending topic | 










