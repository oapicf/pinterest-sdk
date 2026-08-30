# MetricsResponseDataItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metrics** | **map[string]interface{}** | Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers). | 
**TargetingType** | **string** | The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER) | 
**TargetingValue** | **string** | The targeting value for this data item (e.g., &#39;christmas decor ideas&#39;, &#39;iphone&#39;, &#39;female&#39;) | 

## Methods

### NewMetricsResponseDataItems

`func NewMetricsResponseDataItems(metrics map[string]interface{}, targetingType string, targetingValue string, ) *MetricsResponseDataItems`

NewMetricsResponseDataItems instantiates a new MetricsResponseDataItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMetricsResponseDataItemsWithDefaults

`func NewMetricsResponseDataItemsWithDefaults() *MetricsResponseDataItems`

NewMetricsResponseDataItemsWithDefaults instantiates a new MetricsResponseDataItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMetrics

`func (o *MetricsResponseDataItems) GetMetrics() map[string]interface{}`

GetMetrics returns the Metrics field if non-nil, zero value otherwise.

### GetMetricsOk

`func (o *MetricsResponseDataItems) GetMetricsOk() (*map[string]interface{}, bool)`

GetMetricsOk returns a tuple with the Metrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetrics

`func (o *MetricsResponseDataItems) SetMetrics(v map[string]interface{})`

SetMetrics sets Metrics field to given value.


### GetTargetingType

`func (o *MetricsResponseDataItems) GetTargetingType() string`

GetTargetingType returns the TargetingType field if non-nil, zero value otherwise.

### GetTargetingTypeOk

`func (o *MetricsResponseDataItems) GetTargetingTypeOk() (*string, bool)`

GetTargetingTypeOk returns a tuple with the TargetingType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingType

`func (o *MetricsResponseDataItems) SetTargetingType(v string)`

SetTargetingType sets TargetingType field to given value.


### GetTargetingValue

`func (o *MetricsResponseDataItems) GetTargetingValue() string`

GetTargetingValue returns the TargetingValue field if non-nil, zero value otherwise.

### GetTargetingValueOk

`func (o *MetricsResponseDataItems) GetTargetingValueOk() (*string, bool)`

GetTargetingValueOk returns a tuple with the TargetingValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingValue

`func (o *MetricsResponseDataItems) SetTargetingValue(v string)`

SetTargetingValue sets TargetingValue field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


