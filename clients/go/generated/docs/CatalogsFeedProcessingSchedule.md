# CatalogsFeedProcessingSchedule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Time** | **string** | A time in format HH:MM with leading 0 (zero) | 
**Timezone** | **NullableString** | The timezone considered for the processing schedule time. | 

## Methods

### NewCatalogsFeedProcessingSchedule

`func NewCatalogsFeedProcessingSchedule(time string, timezone NullableString, ) *CatalogsFeedProcessingSchedule`

NewCatalogsFeedProcessingSchedule instantiates a new CatalogsFeedProcessingSchedule object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsFeedProcessingScheduleWithDefaults

`func NewCatalogsFeedProcessingScheduleWithDefaults() *CatalogsFeedProcessingSchedule`

NewCatalogsFeedProcessingScheduleWithDefaults instantiates a new CatalogsFeedProcessingSchedule object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTime

`func (o *CatalogsFeedProcessingSchedule) GetTime() string`

GetTime returns the Time field if non-nil, zero value otherwise.

### GetTimeOk

`func (o *CatalogsFeedProcessingSchedule) GetTimeOk() (*string, bool)`

GetTimeOk returns a tuple with the Time field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTime

`func (o *CatalogsFeedProcessingSchedule) SetTime(v string)`

SetTime sets Time field to given value.


### GetTimezone

`func (o *CatalogsFeedProcessingSchedule) GetTimezone() string`

GetTimezone returns the Timezone field if non-nil, zero value otherwise.

### GetTimezoneOk

`func (o *CatalogsFeedProcessingSchedule) GetTimezoneOk() (*string, bool)`

GetTimezoneOk returns a tuple with the Timezone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezone

`func (o *CatalogsFeedProcessingSchedule) SetTimezone(v string)`

SetTimezone sets Timezone field to given value.


### SetTimezoneNil

`func (o *CatalogsFeedProcessingSchedule) SetTimezoneNil(b bool)`

 SetTimezoneNil sets the value for Timezone to be an explicit nil

### UnsetTimezone
`func (o *CatalogsFeedProcessingSchedule) UnsetTimezone()`

UnsetTimezone ensures that no value is present for Timezone, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


