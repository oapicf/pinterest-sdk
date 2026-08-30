# FrequencyGoalMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Frequency** | Pointer to **int32** |  | [optional] 
**Timerange** | Pointer to [**FrequencyGoalMetadataTimerange**](FrequencyGoalMetadataTimerange.md) |  | [optional] 

## Methods

### NewFrequencyGoalMetadata

`func NewFrequencyGoalMetadata() *FrequencyGoalMetadata`

NewFrequencyGoalMetadata instantiates a new FrequencyGoalMetadata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFrequencyGoalMetadataWithDefaults

`func NewFrequencyGoalMetadataWithDefaults() *FrequencyGoalMetadata`

NewFrequencyGoalMetadataWithDefaults instantiates a new FrequencyGoalMetadata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFrequency

`func (o *FrequencyGoalMetadata) GetFrequency() int32`

GetFrequency returns the Frequency field if non-nil, zero value otherwise.

### GetFrequencyOk

`func (o *FrequencyGoalMetadata) GetFrequencyOk() (*int32, bool)`

GetFrequencyOk returns a tuple with the Frequency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrequency

`func (o *FrequencyGoalMetadata) SetFrequency(v int32)`

SetFrequency sets Frequency field to given value.

### HasFrequency

`func (o *FrequencyGoalMetadata) HasFrequency() bool`

HasFrequency returns a boolean if a field has been set.

### GetTimerange

`func (o *FrequencyGoalMetadata) GetTimerange() FrequencyGoalMetadataTimerange`

GetTimerange returns the Timerange field if non-nil, zero value otherwise.

### GetTimerangeOk

`func (o *FrequencyGoalMetadata) GetTimerangeOk() (*FrequencyGoalMetadataTimerange, bool)`

GetTimerangeOk returns a tuple with the Timerange field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimerange

`func (o *FrequencyGoalMetadata) SetTimerange(v FrequencyGoalMetadataTimerange)`

SetTimerange sets Timerange field to given value.

### HasTimerange

`func (o *FrequencyGoalMetadata) HasTimerange() bool`

HasTimerange returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


