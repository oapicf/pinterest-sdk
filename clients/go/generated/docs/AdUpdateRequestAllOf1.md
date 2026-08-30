# AdUpdateRequestAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The ID of this ad. | 
**PinId** | Pointer to **NullableString** | Pin ID. This field may only be updated for draft ads. | [optional] 

## Methods

### NewAdUpdateRequestAllOf1

`func NewAdUpdateRequestAllOf1(id string, ) *AdUpdateRequestAllOf1`

NewAdUpdateRequestAllOf1 instantiates a new AdUpdateRequestAllOf1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdUpdateRequestAllOf1WithDefaults

`func NewAdUpdateRequestAllOf1WithDefaults() *AdUpdateRequestAllOf1`

NewAdUpdateRequestAllOf1WithDefaults instantiates a new AdUpdateRequestAllOf1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AdUpdateRequestAllOf1) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdUpdateRequestAllOf1) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdUpdateRequestAllOf1) SetId(v string)`

SetId sets Id field to given value.


### GetPinId

`func (o *AdUpdateRequestAllOf1) GetPinId() string`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *AdUpdateRequestAllOf1) GetPinIdOk() (*string, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *AdUpdateRequestAllOf1) SetPinId(v string)`

SetPinId sets PinId field to given value.

### HasPinId

`func (o *AdUpdateRequestAllOf1) HasPinId() bool`

HasPinId returns a boolean if a field has been set.

### SetPinIdNil

`func (o *AdUpdateRequestAllOf1) SetPinIdNil(b bool)`

 SetPinIdNil sets the value for PinId to be an explicit nil

### UnsetPinId
`func (o *AdUpdateRequestAllOf1) UnsetPinId()`

UnsetPinId ensures that no value is present for PinId, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


