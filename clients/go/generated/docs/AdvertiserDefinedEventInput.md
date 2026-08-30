# AdvertiserDefinedEventInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MappedConversionType** | [**AdvertiserDefinedEventMappingType**](AdvertiserDefinedEventMappingType.md) | Pinterest standard event type to map this custom event to for campaign optimization and reporting | 
**Name** | **string** | Raw string name of the event | 

## Methods

### NewAdvertiserDefinedEventInput

`func NewAdvertiserDefinedEventInput(mappedConversionType AdvertiserDefinedEventMappingType, name string, ) *AdvertiserDefinedEventInput`

NewAdvertiserDefinedEventInput instantiates a new AdvertiserDefinedEventInput object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvertiserDefinedEventInputWithDefaults

`func NewAdvertiserDefinedEventInputWithDefaults() *AdvertiserDefinedEventInput`

NewAdvertiserDefinedEventInputWithDefaults instantiates a new AdvertiserDefinedEventInput object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMappedConversionType

`func (o *AdvertiserDefinedEventInput) GetMappedConversionType() AdvertiserDefinedEventMappingType`

GetMappedConversionType returns the MappedConversionType field if non-nil, zero value otherwise.

### GetMappedConversionTypeOk

`func (o *AdvertiserDefinedEventInput) GetMappedConversionTypeOk() (*AdvertiserDefinedEventMappingType, bool)`

GetMappedConversionTypeOk returns a tuple with the MappedConversionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMappedConversionType

`func (o *AdvertiserDefinedEventInput) SetMappedConversionType(v AdvertiserDefinedEventMappingType)`

SetMappedConversionType sets MappedConversionType field to given value.


### GetName

`func (o *AdvertiserDefinedEventInput) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdvertiserDefinedEventInput) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdvertiserDefinedEventInput) SetName(v string)`

SetName sets Name field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


