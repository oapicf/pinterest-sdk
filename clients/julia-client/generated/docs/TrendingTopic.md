# TrendingTopic


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`description`** | **`String`** | Description of the trending topic | [default to nothing]
**`id`** | **`String`** | Unique identifier for the trending topic | [default to nothing]
**`percent_growth_mom`** | **`Int64`** | Month-over-month growth percentage | [optional] [default to nothing]
**`pins`** | [**`Vector{TrendingPin}`**](TrendingPin.md) | Array of pin images related to this trend (up to 6) | [default to nothing]
**`related_interests`** | **`Vector{String}`** | List of related interest categories | [default to nothing]
**`related_searches`** | **`Vector{String}`** | List of related search terms | [default to nothing]
**`time_series`** | **`Dict{String, Float64}`** | Time series data showing trend values over time, with dates as keys and values as numeric | [default to nothing]
**`title`** | **`String`** | Title of the trending topic | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


