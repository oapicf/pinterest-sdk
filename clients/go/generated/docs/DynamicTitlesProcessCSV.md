# DynamicTitlesProcessCSV

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | Pointer to [**[]DynamicTitlesProcessCSVError**](DynamicTitlesProcessCSVError.md) | List of validation errors. Empty on success. | [optional] [readonly] 
**Status** | Pointer to **string** | Processing status. Present on success. | [optional] [readonly] 

## Methods

### NewDynamicTitlesProcessCSV

`func NewDynamicTitlesProcessCSV() *DynamicTitlesProcessCSV`

NewDynamicTitlesProcessCSV instantiates a new DynamicTitlesProcessCSV object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDynamicTitlesProcessCSVWithDefaults

`func NewDynamicTitlesProcessCSVWithDefaults() *DynamicTitlesProcessCSV`

NewDynamicTitlesProcessCSVWithDefaults instantiates a new DynamicTitlesProcessCSV object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *DynamicTitlesProcessCSV) GetErrors() []DynamicTitlesProcessCSVError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *DynamicTitlesProcessCSV) GetErrorsOk() (*[]DynamicTitlesProcessCSVError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *DynamicTitlesProcessCSV) SetErrors(v []DynamicTitlesProcessCSVError)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *DynamicTitlesProcessCSV) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetStatus

`func (o *DynamicTitlesProcessCSV) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *DynamicTitlesProcessCSV) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *DynamicTitlesProcessCSV) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *DynamicTitlesProcessCSV) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


