# SupplementalItemValidationEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attribute** | **string** | The item attribute referenced by the validation event eg. price, availability, ad_link | 
**Code** | **int32** | The event code that the item validation event references | 
**Message** | **string** | Title message describing the item validation event | 

## Methods

### NewSupplementalItemValidationEvent

`func NewSupplementalItemValidationEvent(attribute string, code int32, message string, ) *SupplementalItemValidationEvent`

NewSupplementalItemValidationEvent instantiates a new SupplementalItemValidationEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSupplementalItemValidationEventWithDefaults

`func NewSupplementalItemValidationEventWithDefaults() *SupplementalItemValidationEvent`

NewSupplementalItemValidationEventWithDefaults instantiates a new SupplementalItemValidationEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttribute

`func (o *SupplementalItemValidationEvent) GetAttribute() string`

GetAttribute returns the Attribute field if non-nil, zero value otherwise.

### GetAttributeOk

`func (o *SupplementalItemValidationEvent) GetAttributeOk() (*string, bool)`

GetAttributeOk returns a tuple with the Attribute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttribute

`func (o *SupplementalItemValidationEvent) SetAttribute(v string)`

SetAttribute sets Attribute field to given value.


### GetCode

`func (o *SupplementalItemValidationEvent) GetCode() int32`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *SupplementalItemValidationEvent) GetCodeOk() (*int32, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *SupplementalItemValidationEvent) SetCode(v int32)`

SetCode sets Code field to given value.


### GetMessage

`func (o *SupplementalItemValidationEvent) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *SupplementalItemValidationEvent) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *SupplementalItemValidationEvent) SetMessage(v string)`

SetMessage sets Message field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


