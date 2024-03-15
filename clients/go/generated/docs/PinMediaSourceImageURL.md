# PinMediaSourceImageURL

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SourceType** | **string** |  | 
**Url** | **string** |  | 
**IsStandard** | Pointer to **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]

## Methods

### NewPinMediaSourceImageURL

`func NewPinMediaSourceImageURL(sourceType string, url string, ) *PinMediaSourceImageURL`

NewPinMediaSourceImageURL instantiates a new PinMediaSourceImageURL object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinMediaSourceImageURLWithDefaults

`func NewPinMediaSourceImageURLWithDefaults() *PinMediaSourceImageURL`

NewPinMediaSourceImageURLWithDefaults instantiates a new PinMediaSourceImageURL object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSourceType

`func (o *PinMediaSourceImageURL) GetSourceType() string`

GetSourceType returns the SourceType field if non-nil, zero value otherwise.

### GetSourceTypeOk

`func (o *PinMediaSourceImageURL) GetSourceTypeOk() (*string, bool)`

GetSourceTypeOk returns a tuple with the SourceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceType

`func (o *PinMediaSourceImageURL) SetSourceType(v string)`

SetSourceType sets SourceType field to given value.


### GetUrl

`func (o *PinMediaSourceImageURL) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *PinMediaSourceImageURL) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *PinMediaSourceImageURL) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetIsStandard

`func (o *PinMediaSourceImageURL) GetIsStandard() bool`

GetIsStandard returns the IsStandard field if non-nil, zero value otherwise.

### GetIsStandardOk

`func (o *PinMediaSourceImageURL) GetIsStandardOk() (*bool, bool)`

GetIsStandardOk returns a tuple with the IsStandard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStandard

`func (o *PinMediaSourceImageURL) SetIsStandard(v bool)`

SetIsStandard sets IsStandard field to given value.

### HasIsStandard

`func (o *PinMediaSourceImageURL) HasIsStandard() bool`

HasIsStandard returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


