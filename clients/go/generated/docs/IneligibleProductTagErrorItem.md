# IneligibleProductTagErrorItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ErrorMessage** | [**IneligibleProductTagReason**](IneligibleProductTagReason.md) | Reason why the pin is ineligible for tagging. | 
**PinId** | **string** | Pin ID that failed eligibility check. | 

## Methods

### NewIneligibleProductTagErrorItem

`func NewIneligibleProductTagErrorItem(errorMessage IneligibleProductTagReason, pinId string, ) *IneligibleProductTagErrorItem`

NewIneligibleProductTagErrorItem instantiates a new IneligibleProductTagErrorItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIneligibleProductTagErrorItemWithDefaults

`func NewIneligibleProductTagErrorItemWithDefaults() *IneligibleProductTagErrorItem`

NewIneligibleProductTagErrorItemWithDefaults instantiates a new IneligibleProductTagErrorItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrorMessage

`func (o *IneligibleProductTagErrorItem) GetErrorMessage() IneligibleProductTagReason`

GetErrorMessage returns the ErrorMessage field if non-nil, zero value otherwise.

### GetErrorMessageOk

`func (o *IneligibleProductTagErrorItem) GetErrorMessageOk() (*IneligibleProductTagReason, bool)`

GetErrorMessageOk returns a tuple with the ErrorMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrorMessage

`func (o *IneligibleProductTagErrorItem) SetErrorMessage(v IneligibleProductTagReason)`

SetErrorMessage sets ErrorMessage field to given value.


### GetPinId

`func (o *IneligibleProductTagErrorItem) GetPinId() string`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *IneligibleProductTagErrorItem) GetPinIdOk() (*string, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *IneligibleProductTagErrorItem) SetPinId(v string)`

SetPinId sets PinId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


