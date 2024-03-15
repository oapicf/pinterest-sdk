# KeywordMetrics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AvgCpcInMicroCurrency** | Pointer to **float32** | Average cost per click | [optional] 
**KeywordQueryVolume** | Pointer to **string** | Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response | [optional] 

## Methods

### NewKeywordMetrics

`func NewKeywordMetrics() *KeywordMetrics`

NewKeywordMetrics instantiates a new KeywordMetrics object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewKeywordMetricsWithDefaults

`func NewKeywordMetricsWithDefaults() *KeywordMetrics`

NewKeywordMetricsWithDefaults instantiates a new KeywordMetrics object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAvgCpcInMicroCurrency

`func (o *KeywordMetrics) GetAvgCpcInMicroCurrency() float32`

GetAvgCpcInMicroCurrency returns the AvgCpcInMicroCurrency field if non-nil, zero value otherwise.

### GetAvgCpcInMicroCurrencyOk

`func (o *KeywordMetrics) GetAvgCpcInMicroCurrencyOk() (*float32, bool)`

GetAvgCpcInMicroCurrencyOk returns a tuple with the AvgCpcInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvgCpcInMicroCurrency

`func (o *KeywordMetrics) SetAvgCpcInMicroCurrency(v float32)`

SetAvgCpcInMicroCurrency sets AvgCpcInMicroCurrency field to given value.

### HasAvgCpcInMicroCurrency

`func (o *KeywordMetrics) HasAvgCpcInMicroCurrency() bool`

HasAvgCpcInMicroCurrency returns a boolean if a field has been set.

### GetKeywordQueryVolume

`func (o *KeywordMetrics) GetKeywordQueryVolume() string`

GetKeywordQueryVolume returns the KeywordQueryVolume field if non-nil, zero value otherwise.

### GetKeywordQueryVolumeOk

`func (o *KeywordMetrics) GetKeywordQueryVolumeOk() (*string, bool)`

GetKeywordQueryVolumeOk returns a tuple with the KeywordQueryVolume field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeywordQueryVolume

`func (o *KeywordMetrics) SetKeywordQueryVolume(v string)`

SetKeywordQueryVolume sets KeywordQueryVolume field to given value.

### HasKeywordQueryVolume

`func (o *KeywordMetrics) HasKeywordQueryVolume() bool`

HasKeywordQueryVolume returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


