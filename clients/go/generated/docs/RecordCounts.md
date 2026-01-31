# RecordCounts

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Invalid** | **int32** | Number of invalid records processed | 
**Processed** | **int32** | Number of records processed | 
**Valid** | **int32** | Number of valid records processed | 

## Methods

### NewRecordCounts

`func NewRecordCounts(invalid int32, processed int32, valid int32, ) *RecordCounts`

NewRecordCounts instantiates a new RecordCounts object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRecordCountsWithDefaults

`func NewRecordCountsWithDefaults() *RecordCounts`

NewRecordCountsWithDefaults instantiates a new RecordCounts object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInvalid

`func (o *RecordCounts) GetInvalid() int32`

GetInvalid returns the Invalid field if non-nil, zero value otherwise.

### GetInvalidOk

`func (o *RecordCounts) GetInvalidOk() (*int32, bool)`

GetInvalidOk returns a tuple with the Invalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvalid

`func (o *RecordCounts) SetInvalid(v int32)`

SetInvalid sets Invalid field to given value.


### GetProcessed

`func (o *RecordCounts) GetProcessed() int32`

GetProcessed returns the Processed field if non-nil, zero value otherwise.

### GetProcessedOk

`func (o *RecordCounts) GetProcessedOk() (*int32, bool)`

GetProcessedOk returns a tuple with the Processed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessed

`func (o *RecordCounts) SetProcessed(v int32)`

SetProcessed sets Processed field to given value.


### GetValid

`func (o *RecordCounts) GetValid() int32`

GetValid returns the Valid field if non-nil, zero value otherwise.

### GetValidOk

`func (o *RecordCounts) GetValidOk() (*int32, bool)`

GetValidOk returns a tuple with the Valid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValid

`func (o *RecordCounts) SetValid(v int32)`

SetValid sets Valid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


