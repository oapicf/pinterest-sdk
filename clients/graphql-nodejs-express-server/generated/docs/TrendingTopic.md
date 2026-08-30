# TrendingTopic

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String!** | Description of the trending topic | [default to null]
**Id_** | **String!** | Unique identifier for the trending topic | [default to null]
**percentGrowthMom** | **Int!** | Month-over-month growth percentage | [optional] [default to null]
**pins** | [**TrendingPin**](TrendingPin.md) | Array of pin images related to this trend (up to 6) | [default to null]
**relatedInterests** | **String!** | List of related interest categories | [default to null]
**relatedSearches** | **String!** | List of related search terms | [default to null]
**timeSeries** | **Float!** | Time series data showing trend values over time, with dates as keys and values as numeric | [default to null]
**title** | **String!** | Title of the trending topic | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


