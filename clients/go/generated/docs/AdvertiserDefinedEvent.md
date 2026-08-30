# AdvertiserDefinedEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MappedConversionType** | Pointer to [**ConversionTagTypeOptimal**](ConversionTagTypeOptimal.md) | Standard type mapped to ADE for optimization | [optional] 
**Name** | Pointer to **string** | Raw string name of the event, usually logged as raw_event_name in our dataset | [optional] 

## Methods

### NewAdvertiserDefinedEvent

`func NewAdvertiserDefinedEvent() *AdvertiserDefinedEvent`

NewAdvertiserDefinedEvent instantiates a new AdvertiserDefinedEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvertiserDefinedEventWithDefaults

`func NewAdvertiserDefinedEventWithDefaults() *AdvertiserDefinedEvent`

NewAdvertiserDefinedEventWithDefaults instantiates a new AdvertiserDefinedEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMappedConversionType

`func (o *AdvertiserDefinedEvent) GetMappedConversionType() ConversionTagTypeOptimal`

GetMappedConversionType returns the MappedConversionType field if non-nil, zero value otherwise.

### GetMappedConversionTypeOk

`func (o *AdvertiserDefinedEvent) GetMappedConversionTypeOk() (*ConversionTagTypeOptimal, bool)`

GetMappedConversionTypeOk returns a tuple with the MappedConversionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMappedConversionType

`func (o *AdvertiserDefinedEvent) SetMappedConversionType(v ConversionTagTypeOptimal)`

SetMappedConversionType sets MappedConversionType field to given value.

### HasMappedConversionType

`func (o *AdvertiserDefinedEvent) HasMappedConversionType() bool`

HasMappedConversionType returns a boolean if a field has been set.

### GetName

`func (o *AdvertiserDefinedEvent) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdvertiserDefinedEvent) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdvertiserDefinedEvent) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdvertiserDefinedEvent) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


