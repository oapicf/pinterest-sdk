# openapi::TrendingTopic

Individual trending topic within an interest category

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **character** | Description of the trending topic | 
**percent_growth_mom** | **integer** | Month-over-month growth percentage | 
**pins** | [**array[TrendingPin]**](TrendingPin.md) | Array of pin images related to this trend (up to 6) | [Max. items: 6] 
**related_interests** | **array[character]** | List of related interest categories | 
**related_searches** | **array[character]** | List of related search terms | 
**time_series** | **map(numeric)** | Time series data showing trend values over time, with dates as keys and values as numeric | 
**title** | **character** | Title of the trending topic | 


