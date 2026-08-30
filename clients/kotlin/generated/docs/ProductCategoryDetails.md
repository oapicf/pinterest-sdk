
# ProductCategoryDetails

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **hasPrediction** | **kotlin.Boolean** |     Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response. |  |
| **productCategory** | [**ProductCategoryEnum**](ProductCategoryEnum.md) |  |  |
| **demographics** | [**ProductCategoriesDemographic**](ProductCategoriesDemographic.md) |  |  [optional] |
| **metricsHighlights** | [**ProductCategoriesMetricsHighlights**](ProductCategoriesMetricsHighlights.md) |  |  [optional] |
| **predictedTimeSeries** | [**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**](java.math.BigDecimal.md) |     A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07. |  [optional] |
| **relatedSearches** | **kotlin.collections.List&lt;kotlin.String&gt;** | Related search terms for this product category |  [optional] |
| **timeSeries** | [**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | Time series data showing trend values over time, indexed between 0 and 100 |  [optional] |



