# ItemValidationEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attribute** | Pointer to **string** | The attribute that the item validation event references | [optional] 
**Code** | Pointer to **int32** | The event code that the item validation event references | [optional] 
**Message** | Pointer to **string** | Title message describing the item validation event | [optional] 

## Methods

### NewItemValidationEvent

`func NewItemValidationEvent() *ItemValidationEvent`

NewItemValidationEvent instantiates a new ItemValidationEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemValidationEventWithDefaults

`func NewItemValidationEventWithDefaults() *ItemValidationEvent`

NewItemValidationEventWithDefaults instantiates a new ItemValidationEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttribute

`func (o *ItemValidationEvent) GetAttribute() string`

GetAttribute returns the Attribute field if non-nil, zero value otherwise.

### GetAttributeOk

`func (o *ItemValidationEvent) GetAttributeOk() (*string, bool)`

GetAttributeOk returns a tuple with the Attribute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttribute

`func (o *ItemValidationEvent) SetAttribute(v string)`

SetAttribute sets Attribute field to given value.

### HasAttribute

`func (o *ItemValidationEvent) HasAttribute() bool`

HasAttribute returns a boolean if a field has been set.

### GetCode

`func (o *ItemValidationEvent) GetCode() int32`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *ItemValidationEvent) GetCodeOk() (*int32, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *ItemValidationEvent) SetCode(v int32)`

SetCode sets Code field to given value.

### HasCode

`func (o *ItemValidationEvent) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetMessage

`func (o *ItemValidationEvent) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ItemValidationEvent) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ItemValidationEvent) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ItemValidationEvent) HasMessage() bool`

HasMessage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


