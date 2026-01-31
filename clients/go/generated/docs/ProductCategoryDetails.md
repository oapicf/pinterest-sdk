# ProductCategoryDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Demographics** | Pointer to [**ProductCategoriesDemographic**](ProductCategoriesDemographic.md) |  | [optional] 
**HasPrediction** | **bool** |      Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response. | 
**MetricsHighlights** | Pointer to [**ProductCategoriesMetricsHighlights**](ProductCategoriesMetricsHighlights.md) |  | [optional] 
**PredictedTimeSeries** | Pointer to **map[string]float32** |      A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07. | [optional] 
**ProductCategory** | [**ProductCategoryEnum**](ProductCategoryEnum.md) |  | 
**RelatedSearches** | Pointer to **[]string** | Related search terms for this product category | [optional] 
**TimeSeries** | Pointer to **map[string]float32** | Time series data showing trend values over time, indexed between 0 and 100 | [optional] 

## Methods

### NewProductCategoryDetails

`func NewProductCategoryDetails(hasPrediction bool, productCategory ProductCategoryEnum, ) *ProductCategoryDetails`

NewProductCategoryDetails instantiates a new ProductCategoryDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProductCategoryDetailsWithDefaults

`func NewProductCategoryDetailsWithDefaults() *ProductCategoryDetails`

NewProductCategoryDetailsWithDefaults instantiates a new ProductCategoryDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDemographics

`func (o *ProductCategoryDetails) GetDemographics() ProductCategoriesDemographic`

GetDemographics returns the Demographics field if non-nil, zero value otherwise.

### GetDemographicsOk

`func (o *ProductCategoryDetails) GetDemographicsOk() (*ProductCategoriesDemographic, bool)`

GetDemographicsOk returns a tuple with the Demographics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDemographics

`func (o *ProductCategoryDetails) SetDemographics(v ProductCategoriesDemographic)`

SetDemographics sets Demographics field to given value.

### HasDemographics

`func (o *ProductCategoryDetails) HasDemographics() bool`

HasDemographics returns a boolean if a field has been set.

### GetHasPrediction

`func (o *ProductCategoryDetails) GetHasPrediction() bool`

GetHasPrediction returns the HasPrediction field if non-nil, zero value otherwise.

### GetHasPredictionOk

`func (o *ProductCategoryDetails) GetHasPredictionOk() (*bool, bool)`

GetHasPredictionOk returns a tuple with the HasPrediction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasPrediction

`func (o *ProductCategoryDetails) SetHasPrediction(v bool)`

SetHasPrediction sets HasPrediction field to given value.


### GetMetricsHighlights

`func (o *ProductCategoryDetails) GetMetricsHighlights() ProductCategoriesMetricsHighlights`

GetMetricsHighlights returns the MetricsHighlights field if non-nil, zero value otherwise.

### GetMetricsHighlightsOk

`func (o *ProductCategoryDetails) GetMetricsHighlightsOk() (*ProductCategoriesMetricsHighlights, bool)`

GetMetricsHighlightsOk returns a tuple with the MetricsHighlights field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetricsHighlights

`func (o *ProductCategoryDetails) SetMetricsHighlights(v ProductCategoriesMetricsHighlights)`

SetMetricsHighlights sets MetricsHighlights field to given value.

### HasMetricsHighlights

`func (o *ProductCategoryDetails) HasMetricsHighlights() bool`

HasMetricsHighlights returns a boolean if a field has been set.

### GetPredictedTimeSeries

`func (o *ProductCategoryDetails) GetPredictedTimeSeries() map[string]float32`

GetPredictedTimeSeries returns the PredictedTimeSeries field if non-nil, zero value otherwise.

### GetPredictedTimeSeriesOk

`func (o *ProductCategoryDetails) GetPredictedTimeSeriesOk() (*map[string]float32, bool)`

GetPredictedTimeSeriesOk returns a tuple with the PredictedTimeSeries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPredictedTimeSeries

`func (o *ProductCategoryDetails) SetPredictedTimeSeries(v map[string]float32)`

SetPredictedTimeSeries sets PredictedTimeSeries field to given value.

### HasPredictedTimeSeries

`func (o *ProductCategoryDetails) HasPredictedTimeSeries() bool`

HasPredictedTimeSeries returns a boolean if a field has been set.

### GetProductCategory

`func (o *ProductCategoryDetails) GetProductCategory() ProductCategoryEnum`

GetProductCategory returns the ProductCategory field if non-nil, zero value otherwise.

### GetProductCategoryOk

`func (o *ProductCategoryDetails) GetProductCategoryOk() (*ProductCategoryEnum, bool)`

GetProductCategoryOk returns a tuple with the ProductCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductCategory

`func (o *ProductCategoryDetails) SetProductCategory(v ProductCategoryEnum)`

SetProductCategory sets ProductCategory field to given value.


### GetRelatedSearches

`func (o *ProductCategoryDetails) GetRelatedSearches() []string`

GetRelatedSearches returns the RelatedSearches field if non-nil, zero value otherwise.

### GetRelatedSearchesOk

`func (o *ProductCategoryDetails) GetRelatedSearchesOk() (*[]string, bool)`

GetRelatedSearchesOk returns a tuple with the RelatedSearches field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelatedSearches

`func (o *ProductCategoryDetails) SetRelatedSearches(v []string)`

SetRelatedSearches sets RelatedSearches field to given value.

### HasRelatedSearches

`func (o *ProductCategoryDetails) HasRelatedSearches() bool`

HasRelatedSearches returns a boolean if a field has been set.

### GetTimeSeries

`func (o *ProductCategoryDetails) GetTimeSeries() map[string]float32`

GetTimeSeries returns the TimeSeries field if non-nil, zero value otherwise.

### GetTimeSeriesOk

`func (o *ProductCategoryDetails) GetTimeSeriesOk() (*map[string]float32, bool)`

GetTimeSeriesOk returns a tuple with the TimeSeries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeSeries

`func (o *ProductCategoryDetails) SetTimeSeries(v map[string]float32)`

SetTimeSeries sets TimeSeries field to given value.

### HasTimeSeries

`func (o *ProductCategoryDetails) HasTimeSeries() bool`

HasTimeSeries returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


