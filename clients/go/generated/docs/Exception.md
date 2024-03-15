# Exception

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | Pointer to **int32** | Exception error code. | [optional] 
**Message** | Pointer to **string** | Exception message. | [optional] 

## Methods

### NewException

`func NewException() *Exception`

NewException instantiates a new Exception object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewExceptionWithDefaults

`func NewExceptionWithDefaults() *Exception`

NewExceptionWithDefaults instantiates a new Exception object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *Exception) GetCode() int32`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *Exception) GetCodeOk() (*int32, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *Exception) SetCode(v int32)`

SetCode sets Code field to given value.

### HasCode

`func (o *Exception) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetMessage

`func (o *Exception) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *Exception) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *Exception) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *Exception) HasMessage() bool`

HasMessage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


