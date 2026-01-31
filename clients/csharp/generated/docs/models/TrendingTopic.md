# Org.OpenAPITools.Model.TrendingTopic
Individual trending topic within an interest category

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **string** | Description of the trending topic | 
**PercentGrowthMom** | **int** | Month-over-month growth percentage | 
**Pins** | [**List&lt;TrendingPin&gt;**](TrendingPin.md) | Array of pin images related to this trend (up to 6) | 
**RelatedInterests** | **List&lt;string&gt;** | List of related interest categories | 
**RelatedSearches** | **List&lt;string&gt;** | List of related search terms | 
**TimeSeries** | **Dictionary&lt;string, decimal&gt;** | Time series data showing trend values over time, with dates as keys and values as numeric | 
**Title** | **string** | Title of the trending topic | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

