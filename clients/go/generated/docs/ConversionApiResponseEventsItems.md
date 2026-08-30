# ConversionApiResponseEventsItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ErrorMessage** | Pointer to **NullableString** | Error message containing more information about why the event failed to be processed. | [optional] 
**Status** | [**EventProcessingStatus**](EventProcessingStatus.md) | Whether the event was processed successfully. | 
**WarningMessage** | Pointer to **NullableString** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. | [optional] 

## Methods

### NewConversionApiResponseEventsItems

`func NewConversionApiResponseEventsItems(status EventProcessingStatus, ) *ConversionApiResponseEventsItems`

NewConversionApiResponseEventsItems instantiates a new ConversionApiResponseEventsItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionApiResponseEventsItemsWithDefaults

`func NewConversionApiResponseEventsItemsWithDefaults() *ConversionApiResponseEventsItems`

NewConversionApiResponseEventsItemsWithDefaults instantiates a new ConversionApiResponseEventsItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrorMessage

`func (o *ConversionApiResponseEventsItems) GetErrorMessage() string`

GetErrorMessage returns the ErrorMessage field if non-nil, zero value otherwise.

### GetErrorMessageOk

`func (o *ConversionApiResponseEventsItems) GetErrorMessageOk() (*string, bool)`

GetErrorMessageOk returns a tuple with the ErrorMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrorMessage

`func (o *ConversionApiResponseEventsItems) SetErrorMessage(v string)`

SetErrorMessage sets ErrorMessage field to given value.

### HasErrorMessage

`func (o *ConversionApiResponseEventsItems) HasErrorMessage() bool`

HasErrorMessage returns a boolean if a field has been set.

### SetErrorMessageNil

`func (o *ConversionApiResponseEventsItems) SetErrorMessageNil(b bool)`

 SetErrorMessageNil sets the value for ErrorMessage to be an explicit nil

### UnsetErrorMessage
`func (o *ConversionApiResponseEventsItems) UnsetErrorMessage()`

UnsetErrorMessage ensures that no value is present for ErrorMessage, not even an explicit nil
### GetStatus

`func (o *ConversionApiResponseEventsItems) GetStatus() EventProcessingStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ConversionApiResponseEventsItems) GetStatusOk() (*EventProcessingStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ConversionApiResponseEventsItems) SetStatus(v EventProcessingStatus)`

SetStatus sets Status field to given value.


### GetWarningMessage

`func (o *ConversionApiResponseEventsItems) GetWarningMessage() string`

GetWarningMessage returns the WarningMessage field if non-nil, zero value otherwise.

### GetWarningMessageOk

`func (o *ConversionApiResponseEventsItems) GetWarningMessageOk() (*string, bool)`

GetWarningMessageOk returns a tuple with the WarningMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarningMessage

`func (o *ConversionApiResponseEventsItems) SetWarningMessage(v string)`

SetWarningMessage sets WarningMessage field to given value.

### HasWarningMessage

`func (o *ConversionApiResponseEventsItems) HasWarningMessage() bool`

HasWarningMessage returns a boolean if a field has been set.

### SetWarningMessageNil

`func (o *ConversionApiResponseEventsItems) SetWarningMessageNil(b bool)`

 SetWarningMessageNil sets the value for WarningMessage to be an explicit nil

### UnsetWarningMessage
`func (o *ConversionApiResponseEventsItems) UnsetWarningMessage()`

UnsetWarningMessage ensures that no value is present for WarningMessage, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


