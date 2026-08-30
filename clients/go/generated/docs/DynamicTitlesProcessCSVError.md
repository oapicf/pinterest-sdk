# DynamicTitlesProcessCSVError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ErrorType** | Pointer to **string** | The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED. | [optional] 
**RowNumber** | Pointer to **int32** | The row number with a validation error. -1 indicates a file-level error. | [optional] 

## Methods

### NewDynamicTitlesProcessCSVError

`func NewDynamicTitlesProcessCSVError() *DynamicTitlesProcessCSVError`

NewDynamicTitlesProcessCSVError instantiates a new DynamicTitlesProcessCSVError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDynamicTitlesProcessCSVErrorWithDefaults

`func NewDynamicTitlesProcessCSVErrorWithDefaults() *DynamicTitlesProcessCSVError`

NewDynamicTitlesProcessCSVErrorWithDefaults instantiates a new DynamicTitlesProcessCSVError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrorType

`func (o *DynamicTitlesProcessCSVError) GetErrorType() string`

GetErrorType returns the ErrorType field if non-nil, zero value otherwise.

### GetErrorTypeOk

`func (o *DynamicTitlesProcessCSVError) GetErrorTypeOk() (*string, bool)`

GetErrorTypeOk returns a tuple with the ErrorType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrorType

`func (o *DynamicTitlesProcessCSVError) SetErrorType(v string)`

SetErrorType sets ErrorType field to given value.

### HasErrorType

`func (o *DynamicTitlesProcessCSVError) HasErrorType() bool`

HasErrorType returns a boolean if a field has been set.

### GetRowNumber

`func (o *DynamicTitlesProcessCSVError) GetRowNumber() int32`

GetRowNumber returns the RowNumber field if non-nil, zero value otherwise.

### GetRowNumberOk

`func (o *DynamicTitlesProcessCSVError) GetRowNumberOk() (*int32, bool)`

GetRowNumberOk returns a tuple with the RowNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRowNumber

`func (o *DynamicTitlesProcessCSVError) SetRowNumber(v int32)`

SetRowNumber sets RowNumber field to given value.

### HasRowNumber

`func (o *DynamicTitlesProcessCSVError) HasRowNumber() bool`

HasRowNumber returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


