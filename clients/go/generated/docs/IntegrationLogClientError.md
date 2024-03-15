# IntegrationLogClientError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cause** | Pointer to **string** | Original cause of the error. | [optional] 
**ColumnNumber** | Pointer to **int32** | Column number in the line of the file that raised the error. | [optional] 
**FileName** | Pointer to **string** | Filename where the error happened. | [optional] 
**LineNumber** | Pointer to **int32** | Line number where the error happened. | [optional] 
**Message** | Pointer to **string** | Human-readable description of the error. | [optional] 
**MessageDetail** | Pointer to **string** | More detail about the message. | [optional] 
**Name** | Pointer to **string** | Filename where the error happened. | [optional] 
**Number** | Pointer to **int32** | Integer that specifies the error code. | [optional] 
**StackTrace** | Pointer to **string** | Stack trace of where the error happened. | [optional] 

## Methods

### NewIntegrationLogClientError

`func NewIntegrationLogClientError() *IntegrationLogClientError`

NewIntegrationLogClientError instantiates a new IntegrationLogClientError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIntegrationLogClientErrorWithDefaults

`func NewIntegrationLogClientErrorWithDefaults() *IntegrationLogClientError`

NewIntegrationLogClientErrorWithDefaults instantiates a new IntegrationLogClientError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCause

`func (o *IntegrationLogClientError) GetCause() string`

GetCause returns the Cause field if non-nil, zero value otherwise.

### GetCauseOk

`func (o *IntegrationLogClientError) GetCauseOk() (*string, bool)`

GetCauseOk returns a tuple with the Cause field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCause

`func (o *IntegrationLogClientError) SetCause(v string)`

SetCause sets Cause field to given value.

### HasCause

`func (o *IntegrationLogClientError) HasCause() bool`

HasCause returns a boolean if a field has been set.

### GetColumnNumber

`func (o *IntegrationLogClientError) GetColumnNumber() int32`

GetColumnNumber returns the ColumnNumber field if non-nil, zero value otherwise.

### GetColumnNumberOk

`func (o *IntegrationLogClientError) GetColumnNumberOk() (*int32, bool)`

GetColumnNumberOk returns a tuple with the ColumnNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColumnNumber

`func (o *IntegrationLogClientError) SetColumnNumber(v int32)`

SetColumnNumber sets ColumnNumber field to given value.

### HasColumnNumber

`func (o *IntegrationLogClientError) HasColumnNumber() bool`

HasColumnNumber returns a boolean if a field has been set.

### GetFileName

`func (o *IntegrationLogClientError) GetFileName() string`

GetFileName returns the FileName field if non-nil, zero value otherwise.

### GetFileNameOk

`func (o *IntegrationLogClientError) GetFileNameOk() (*string, bool)`

GetFileNameOk returns a tuple with the FileName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileName

`func (o *IntegrationLogClientError) SetFileName(v string)`

SetFileName sets FileName field to given value.

### HasFileName

`func (o *IntegrationLogClientError) HasFileName() bool`

HasFileName returns a boolean if a field has been set.

### GetLineNumber

`func (o *IntegrationLogClientError) GetLineNumber() int32`

GetLineNumber returns the LineNumber field if non-nil, zero value otherwise.

### GetLineNumberOk

`func (o *IntegrationLogClientError) GetLineNumberOk() (*int32, bool)`

GetLineNumberOk returns a tuple with the LineNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLineNumber

`func (o *IntegrationLogClientError) SetLineNumber(v int32)`

SetLineNumber sets LineNumber field to given value.

### HasLineNumber

`func (o *IntegrationLogClientError) HasLineNumber() bool`

HasLineNumber returns a boolean if a field has been set.

### GetMessage

`func (o *IntegrationLogClientError) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *IntegrationLogClientError) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *IntegrationLogClientError) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *IntegrationLogClientError) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetMessageDetail

`func (o *IntegrationLogClientError) GetMessageDetail() string`

GetMessageDetail returns the MessageDetail field if non-nil, zero value otherwise.

### GetMessageDetailOk

`func (o *IntegrationLogClientError) GetMessageDetailOk() (*string, bool)`

GetMessageDetailOk returns a tuple with the MessageDetail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageDetail

`func (o *IntegrationLogClientError) SetMessageDetail(v string)`

SetMessageDetail sets MessageDetail field to given value.

### HasMessageDetail

`func (o *IntegrationLogClientError) HasMessageDetail() bool`

HasMessageDetail returns a boolean if a field has been set.

### GetName

`func (o *IntegrationLogClientError) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *IntegrationLogClientError) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *IntegrationLogClientError) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *IntegrationLogClientError) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNumber

`func (o *IntegrationLogClientError) GetNumber() int32`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *IntegrationLogClientError) GetNumberOk() (*int32, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *IntegrationLogClientError) SetNumber(v int32)`

SetNumber sets Number field to given value.

### HasNumber

`func (o *IntegrationLogClientError) HasNumber() bool`

HasNumber returns a boolean if a field has been set.

### GetStackTrace

`func (o *IntegrationLogClientError) GetStackTrace() string`

GetStackTrace returns the StackTrace field if non-nil, zero value otherwise.

### GetStackTraceOk

`func (o *IntegrationLogClientError) GetStackTraceOk() (*string, bool)`

GetStackTraceOk returns a tuple with the StackTrace field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStackTrace

`func (o *IntegrationLogClientError) SetStackTrace(v string)`

SetStackTrace sets StackTrace field to given value.

### HasStackTrace

`func (o *IntegrationLogClientError) HasStackTrace() bool`

HasStackTrace returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


