# ConversionEvents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Events** | [**[]ConversionApiResponseEventsItems**](ConversionApiResponseEventsItems.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | [readonly] 
**NumEventsProcessed** | **int32** | Number of events that were successfully processed from the events. | [readonly] 
**NumEventsReceived** | **int32** | Total number of events received in the request. | [readonly] 

## Methods

### NewConversionEvents

`func NewConversionEvents(events []ConversionApiResponseEventsItems, numEventsProcessed int32, numEventsReceived int32, ) *ConversionEvents`

NewConversionEvents instantiates a new ConversionEvents object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventsWithDefaults

`func NewConversionEventsWithDefaults() *ConversionEvents`

NewConversionEventsWithDefaults instantiates a new ConversionEvents object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvents

`func (o *ConversionEvents) GetEvents() []ConversionApiResponseEventsItems`

GetEvents returns the Events field if non-nil, zero value otherwise.

### GetEventsOk

`func (o *ConversionEvents) GetEventsOk() (*[]ConversionApiResponseEventsItems, bool)`

GetEventsOk returns a tuple with the Events field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvents

`func (o *ConversionEvents) SetEvents(v []ConversionApiResponseEventsItems)`

SetEvents sets Events field to given value.


### GetNumEventsProcessed

`func (o *ConversionEvents) GetNumEventsProcessed() int32`

GetNumEventsProcessed returns the NumEventsProcessed field if non-nil, zero value otherwise.

### GetNumEventsProcessedOk

`func (o *ConversionEvents) GetNumEventsProcessedOk() (*int32, bool)`

GetNumEventsProcessedOk returns a tuple with the NumEventsProcessed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumEventsProcessed

`func (o *ConversionEvents) SetNumEventsProcessed(v int32)`

SetNumEventsProcessed sets NumEventsProcessed field to given value.


### GetNumEventsReceived

`func (o *ConversionEvents) GetNumEventsReceived() int32`

GetNumEventsReceived returns the NumEventsReceived field if non-nil, zero value otherwise.

### GetNumEventsReceivedOk

`func (o *ConversionEvents) GetNumEventsReceivedOk() (*int32, bool)`

GetNumEventsReceivedOk returns a tuple with the NumEventsReceived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumEventsReceived

`func (o *ConversionEvents) SetNumEventsReceived(v int32)`

SetNumEventsReceived sets NumEventsReceived field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


