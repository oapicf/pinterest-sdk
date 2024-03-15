# ConversionApiResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NumEventsReceived** | **int32** | Total number of events received in the request. | 
**NumEventsProcessed** | **int32** | Number of events that were successfully processed from the events. | 
**Events** | [**[]ConversionApiResponseEventsInner**](ConversionApiResponseEventsInner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | 

## Methods

### NewConversionApiResponse

`func NewConversionApiResponse(numEventsReceived int32, numEventsProcessed int32, events []ConversionApiResponseEventsInner, ) *ConversionApiResponse`

NewConversionApiResponse instantiates a new ConversionApiResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionApiResponseWithDefaults

`func NewConversionApiResponseWithDefaults() *ConversionApiResponse`

NewConversionApiResponseWithDefaults instantiates a new ConversionApiResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNumEventsReceived

`func (o *ConversionApiResponse) GetNumEventsReceived() int32`

GetNumEventsReceived returns the NumEventsReceived field if non-nil, zero value otherwise.

### GetNumEventsReceivedOk

`func (o *ConversionApiResponse) GetNumEventsReceivedOk() (*int32, bool)`

GetNumEventsReceivedOk returns a tuple with the NumEventsReceived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumEventsReceived

`func (o *ConversionApiResponse) SetNumEventsReceived(v int32)`

SetNumEventsReceived sets NumEventsReceived field to given value.


### GetNumEventsProcessed

`func (o *ConversionApiResponse) GetNumEventsProcessed() int32`

GetNumEventsProcessed returns the NumEventsProcessed field if non-nil, zero value otherwise.

### GetNumEventsProcessedOk

`func (o *ConversionApiResponse) GetNumEventsProcessedOk() (*int32, bool)`

GetNumEventsProcessedOk returns a tuple with the NumEventsProcessed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumEventsProcessed

`func (o *ConversionApiResponse) SetNumEventsProcessed(v int32)`

SetNumEventsProcessed sets NumEventsProcessed field to given value.


### GetEvents

`func (o *ConversionApiResponse) GetEvents() []ConversionApiResponseEventsInner`

GetEvents returns the Events field if non-nil, zero value otherwise.

### GetEventsOk

`func (o *ConversionApiResponse) GetEventsOk() (*[]ConversionApiResponseEventsInner, bool)`

GetEventsOk returns a tuple with the Events field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvents

`func (o *ConversionApiResponse) SetEvents(v []ConversionApiResponseEventsInner)`

SetEvents sets Events field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


