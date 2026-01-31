# TRENDING_TOPIC

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | [**STRING_32**](STRING_32.md) | Description of the trending topic | [default to null]
**percent_growth_mom** | **INTEGER_32** | Month-over-month growth percentage | [default to null]
**pins** | [**LIST [TRENDING_PIN]**](TrendingPin.md) | Array of pin images related to this trend (up to 6) | [default to null]
**related_interests** | [**LIST [STRING_32]**](STRING_32.md) | List of related interest categories | [default to null]
**related_searches** | [**LIST [STRING_32]**](STRING_32.md) | List of related search terms | [default to null]
**time_series** | **STRING_TABLE [REAL_32]** | Time series data showing trend values over time, with dates as keys and values as numeric | [default to null]
**title** | [**STRING_32**](STRING_32.md) | Title of the trending topic | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


