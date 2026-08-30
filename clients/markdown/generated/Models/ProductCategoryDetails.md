# ProductCategoryDetails
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **demographics** | [**ProductCategoriesDemographic**](ProductCategoriesDemographic.md) |  | [optional] [default to null] |
| **has\_prediction** | **Boolean** |     Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response. | [default to null] |
| **metrics\_highlights** | [**ProductCategoriesMetricsHighlights**](ProductCategoriesMetricsHighlights.md) |  | [optional] [default to null] |
| **predicted\_time\_series** | **Map** |     A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07. | [optional] [default to null] |
| **product\_category** | [**ProductCategoryEnum**](ProductCategoryEnum.md) |  | [default to null] |
| **related\_searches** | **List** | Related search terms for this product category | [optional] [default to null] |
| **time\_series** | **Map** | Time series data showing trend values over time, indexed between 0 and 100 | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

