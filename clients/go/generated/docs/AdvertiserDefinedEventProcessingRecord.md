# AdvertiserDefinedEventProcessingRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exceptions** | Pointer to **[]string** | List of exception messages if the operation failed | [optional] 
**Name** | **string** | Name of the advertiser defined event | 
**Status** | **string** | Processing status (success or failure) | 

## Methods

### NewAdvertiserDefinedEventProcessingRecord

`func NewAdvertiserDefinedEventProcessingRecord(name string, status string, ) *AdvertiserDefinedEventProcessingRecord`

NewAdvertiserDefinedEventProcessingRecord instantiates a new AdvertiserDefinedEventProcessingRecord object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvertiserDefinedEventProcessingRecordWithDefaults

`func NewAdvertiserDefinedEventProcessingRecordWithDefaults() *AdvertiserDefinedEventProcessingRecord`

NewAdvertiserDefinedEventProcessingRecordWithDefaults instantiates a new AdvertiserDefinedEventProcessingRecord object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExceptions

`func (o *AdvertiserDefinedEventProcessingRecord) GetExceptions() []string`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *AdvertiserDefinedEventProcessingRecord) GetExceptionsOk() (*[]string, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *AdvertiserDefinedEventProcessingRecord) SetExceptions(v []string)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *AdvertiserDefinedEventProcessingRecord) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.

### GetName

`func (o *AdvertiserDefinedEventProcessingRecord) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdvertiserDefinedEventProcessingRecord) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdvertiserDefinedEventProcessingRecord) SetName(v string)`

SetName sets Name field to given value.


### GetStatus

`func (o *AdvertiserDefinedEventProcessingRecord) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AdvertiserDefinedEventProcessingRecord) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AdvertiserDefinedEventProcessingRecord) SetStatus(v string)`

SetStatus sets Status field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


