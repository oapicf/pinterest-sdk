# ConversionApiResponseEventsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **string** | Whether the event was processed successfully. | 
**ErrorMessage** | Pointer to **NullableString** | Error message containing more information about why the event failed to be processed. | [optional] 
**WarningMessage** | Pointer to **NullableString** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. | [optional] 

## Methods

### NewConversionApiResponseEventsInner

`func NewConversionApiResponseEventsInner(status string, ) *ConversionApiResponseEventsInner`

NewConversionApiResponseEventsInner instantiates a new ConversionApiResponseEventsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionApiResponseEventsInnerWithDefaults

`func NewConversionApiResponseEventsInnerWithDefaults() *ConversionApiResponseEventsInner`

NewConversionApiResponseEventsInnerWithDefaults instantiates a new ConversionApiResponseEventsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *ConversionApiResponseEventsInner) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ConversionApiResponseEventsInner) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ConversionApiResponseEventsInner) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetErrorMessage

`func (o *ConversionApiResponseEventsInner) GetErrorMessage() string`

GetErrorMessage returns the ErrorMessage field if non-nil, zero value otherwise.

### GetErrorMessageOk

`func (o *ConversionApiResponseEventsInner) GetErrorMessageOk() (*string, bool)`

GetErrorMessageOk returns a tuple with the ErrorMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrorMessage

`func (o *ConversionApiResponseEventsInner) SetErrorMessage(v string)`

SetErrorMessage sets ErrorMessage field to given value.

### HasErrorMessage

`func (o *ConversionApiResponseEventsInner) HasErrorMessage() bool`

HasErrorMessage returns a boolean if a field has been set.

### SetErrorMessageNil

`func (o *ConversionApiResponseEventsInner) SetErrorMessageNil(b bool)`

 SetErrorMessageNil sets the value for ErrorMessage to be an explicit nil

### UnsetErrorMessage
`func (o *ConversionApiResponseEventsInner) UnsetErrorMessage()`

UnsetErrorMessage ensures that no value is present for ErrorMessage, not even an explicit nil
### GetWarningMessage

`func (o *ConversionApiResponseEventsInner) GetWarningMessage() string`

GetWarningMessage returns the WarningMessage field if non-nil, zero value otherwise.

### GetWarningMessageOk

`func (o *ConversionApiResponseEventsInner) GetWarningMessageOk() (*string, bool)`

GetWarningMessageOk returns a tuple with the WarningMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarningMessage

`func (o *ConversionApiResponseEventsInner) SetWarningMessage(v string)`

SetWarningMessage sets WarningMessage field to given value.

### HasWarningMessage

`func (o *ConversionApiResponseEventsInner) HasWarningMessage() bool`

HasWarningMessage returns a boolean if a field has been set.

### SetWarningMessageNil

`func (o *ConversionApiResponseEventsInner) SetWarningMessageNil(b bool)`

 SetWarningMessageNil sets the value for WarningMessage to be an explicit nil

### UnsetWarningMessage
`func (o *ConversionApiResponseEventsInner) UnsetWarningMessage()`

UnsetWarningMessage ensures that no value is present for WarningMessage, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


