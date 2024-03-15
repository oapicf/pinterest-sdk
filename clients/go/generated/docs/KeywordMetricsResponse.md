# KeywordMetricsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Keyword** | Pointer to **string** | Keyword name, e.g., \&quot;keyword\&quot;:\&quot;fashion outfits\&quot; | [optional] 
**Metrics** | Pointer to [**KeywordMetrics**](KeywordMetrics.md) |  | [optional] 

## Methods

### NewKeywordMetricsResponse

`func NewKeywordMetricsResponse() *KeywordMetricsResponse`

NewKeywordMetricsResponse instantiates a new KeywordMetricsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordMetricsResponseWithDefaults

`func NewKeywordMetricsResponseWithDefaults() *KeywordMetricsResponse`

NewKeywordMetricsResponseWithDefaults instantiates a new KeywordMetricsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKeyword

`func (o *KeywordMetricsResponse) GetKeyword() string`

GetKeyword returns the Keyword field if non-nil, zero value otherwise.

### GetKeywordOk

`func (o *KeywordMetricsResponse) GetKeywordOk() (*string, bool)`

GetKeywordOk returns a tuple with the Keyword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeyword

`func (o *KeywordMetricsResponse) SetKeyword(v string)`

SetKeyword sets Keyword field to given value.

### HasKeyword

`func (o *KeywordMetricsResponse) HasKeyword() bool`

HasKeyword returns a boolean if a field has been set.

### GetMetrics

`func (o *KeywordMetricsResponse) GetMetrics() KeywordMetrics`

GetMetrics returns the Metrics field if non-nil, zero value otherwise.

### GetMetricsOk

`func (o *KeywordMetricsResponse) GetMetricsOk() (*KeywordMetrics, bool)`

GetMetricsOk returns a tuple with the Metrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetrics

`func (o *KeywordMetricsResponse) SetMetrics(v KeywordMetrics)`

SetMetrics sets Metrics field to given value.

### HasMetrics

`func (o *KeywordMetricsResponse) HasMetrics() bool`

HasMetrics returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


