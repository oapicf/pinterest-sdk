# TrendingTopic

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the trending topic | 
**id** | **String** | Unique identifier for the trending topic | 
**percent_growth_mom** | Option<**i32**> | Month-over-month growth percentage | [optional]
**pins** | [**Vec<models::TrendingPin>**](TrendingPin.md) | Array of pin images related to this trend (up to 6) | 
**related_interests** | **Vec<String>** | List of related interest categories | 
**related_searches** | **Vec<String>** | List of related search terms | 
**time_series** | **std::collections::HashMap<String, f64>** | Time series data showing trend values over time, with dates as keys and values as numeric | 
**title** | **String** | Title of the trending topic | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


