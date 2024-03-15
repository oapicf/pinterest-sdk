# PinMediaSourceImageBase64

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SourceType** | **string** |  | 
**ContentType** | **string** |  | 
**Data** | **string** |  | 
**IsStandard** | Pointer to **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]

## Methods

### NewPinMediaSourceImageBase64

`func NewPinMediaSourceImageBase64(sourceType string, contentType string, data string, ) *PinMediaSourceImageBase64`

NewPinMediaSourceImageBase64 instantiates a new PinMediaSourceImageBase64 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinMediaSourceImageBase64WithDefaults

`func NewPinMediaSourceImageBase64WithDefaults() *PinMediaSourceImageBase64`

NewPinMediaSourceImageBase64WithDefaults instantiates a new PinMediaSourceImageBase64 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSourceType

`func (o *PinMediaSourceImageBase64) GetSourceType() string`

GetSourceType returns the SourceType field if non-nil, zero value otherwise.

### GetSourceTypeOk

`func (o *PinMediaSourceImageBase64) GetSourceTypeOk() (*string, bool)`

GetSourceTypeOk returns a tuple with the SourceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceType

`func (o *PinMediaSourceImageBase64) SetSourceType(v string)`

SetSourceType sets SourceType field to given value.


### GetContentType

`func (o *PinMediaSourceImageBase64) GetContentType() string`

GetContentType returns the ContentType field if non-nil, zero value otherwise.

### GetContentTypeOk

`func (o *PinMediaSourceImageBase64) GetContentTypeOk() (*string, bool)`

GetContentTypeOk returns a tuple with the ContentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentType

`func (o *PinMediaSourceImageBase64) SetContentType(v string)`

SetContentType sets ContentType field to given value.


### GetData

`func (o *PinMediaSourceImageBase64) GetData() string`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *PinMediaSourceImageBase64) GetDataOk() (*string, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *PinMediaSourceImageBase64) SetData(v string)`

SetData sets Data field to given value.


### GetIsStandard

`func (o *PinMediaSourceImageBase64) GetIsStandard() bool`

GetIsStandard returns the IsStandard field if non-nil, zero value otherwise.

### GetIsStandardOk

`func (o *PinMediaSourceImageBase64) GetIsStandardOk() (*bool, bool)`

GetIsStandardOk returns a tuple with the IsStandard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStandard

`func (o *PinMediaSourceImageBase64) SetIsStandard(v bool)`

SetIsStandard sets IsStandard field to given value.

### HasIsStandard

`func (o *PinMediaSourceImageBase64) HasIsStandard() bool`

HasIsStandard returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


