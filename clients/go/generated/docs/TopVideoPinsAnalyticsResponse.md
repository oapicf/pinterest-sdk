# TopVideoPinsAnalyticsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateAvailability** | Pointer to [**TopPinsAnalyticsResponseDateAvailability**](TopPinsAnalyticsResponseDateAvailability.md) |  | [optional] 
**Pins** | Pointer to [**[]TopVideoPinsAnalyticsResponsePinsInner**](TopVideoPinsAnalyticsResponsePinsInner.md) |  | [optional] 
**SortBy** | Pointer to **string** |  | [optional] 

## Methods

### NewTopVideoPinsAnalyticsResponse

`func NewTopVideoPinsAnalyticsResponse() *TopVideoPinsAnalyticsResponse`

NewTopVideoPinsAnalyticsResponse instantiates a new TopVideoPinsAnalyticsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTopVideoPinsAnalyticsResponseWithDefaults

`func NewTopVideoPinsAnalyticsResponseWithDefaults() *TopVideoPinsAnalyticsResponse`

NewTopVideoPinsAnalyticsResponseWithDefaults instantiates a new TopVideoPinsAnalyticsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDateAvailability

`func (o *TopVideoPinsAnalyticsResponse) GetDateAvailability() TopPinsAnalyticsResponseDateAvailability`

GetDateAvailability returns the DateAvailability field if non-nil, zero value otherwise.

### GetDateAvailabilityOk

`func (o *TopVideoPinsAnalyticsResponse) GetDateAvailabilityOk() (*TopPinsAnalyticsResponseDateAvailability, bool)`

GetDateAvailabilityOk returns a tuple with the DateAvailability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateAvailability

`func (o *TopVideoPinsAnalyticsResponse) SetDateAvailability(v TopPinsAnalyticsResponseDateAvailability)`

SetDateAvailability sets DateAvailability field to given value.

### HasDateAvailability

`func (o *TopVideoPinsAnalyticsResponse) HasDateAvailability() bool`

HasDateAvailability returns a boolean if a field has been set.

### GetPins

`func (o *TopVideoPinsAnalyticsResponse) GetPins() []TopVideoPinsAnalyticsResponsePinsInner`

GetPins returns the Pins field if non-nil, zero value otherwise.

### GetPinsOk

`func (o *TopVideoPinsAnalyticsResponse) GetPinsOk() (*[]TopVideoPinsAnalyticsResponsePinsInner, bool)`

GetPinsOk returns a tuple with the Pins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPins

`func (o *TopVideoPinsAnalyticsResponse) SetPins(v []TopVideoPinsAnalyticsResponsePinsInner)`

SetPins sets Pins field to given value.

### HasPins

`func (o *TopVideoPinsAnalyticsResponse) HasPins() bool`

HasPins returns a boolean if a field has been set.

### GetSortBy

`func (o *TopVideoPinsAnalyticsResponse) GetSortBy() string`

GetSortBy returns the SortBy field if non-nil, zero value otherwise.

### GetSortByOk

`func (o *TopVideoPinsAnalyticsResponse) GetSortByOk() (*string, bool)`

GetSortByOk returns a tuple with the SortBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortBy

`func (o *TopVideoPinsAnalyticsResponse) SetSortBy(v string)`

SetSortBy sets SortBy field to given value.

### HasSortBy

`func (o *TopVideoPinsAnalyticsResponse) HasSortBy() bool`

HasSortBy returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


