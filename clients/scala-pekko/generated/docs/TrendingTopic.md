

# TrendingTopic

Individual trending topic within an interest category

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the trending topic | 
**id** | **String** | Unique identifier for the trending topic | 
**percentGrowthMom** | **Int** | Month-over-month growth percentage |  [optional]
**pins** | [**Seq&lt;TrendingPin&gt;**](TrendingPin.md) | Array of pin images related to this trend (up to 6) | 
**relatedInterests** | **Seq&lt;String&gt;** | List of related interest categories | 
**relatedSearches** | **Seq&lt;String&gt;** | List of related search terms | 
**timeSeries** | **Map&lt;String, BigDecimal&gt;** | Time series data showing trend values over time, with dates as keys and values as numeric | 
**title** | **String** | Title of the trending topic | 



