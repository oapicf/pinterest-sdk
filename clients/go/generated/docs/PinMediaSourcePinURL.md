# PinMediaSourcePinURL

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SourceType** | **string** |  | 
**IsAffiliateLink** | Pointer to **bool** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]

## Methods

### NewPinMediaSourcePinURL

`func NewPinMediaSourcePinURL(sourceType string, ) *PinMediaSourcePinURL`

NewPinMediaSourcePinURL instantiates a new PinMediaSourcePinURL object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinMediaSourcePinURLWithDefaults

`func NewPinMediaSourcePinURLWithDefaults() *PinMediaSourcePinURL`

NewPinMediaSourcePinURLWithDefaults instantiates a new PinMediaSourcePinURL object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSourceType

`func (o *PinMediaSourcePinURL) GetSourceType() string`

GetSourceType returns the SourceType field if non-nil, zero value otherwise.

### GetSourceTypeOk

`func (o *PinMediaSourcePinURL) GetSourceTypeOk() (*string, bool)`

GetSourceTypeOk returns a tuple with the SourceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceType

`func (o *PinMediaSourcePinURL) SetSourceType(v string)`

SetSourceType sets SourceType field to given value.


### GetIsAffiliateLink

`func (o *PinMediaSourcePinURL) GetIsAffiliateLink() bool`

GetIsAffiliateLink returns the IsAffiliateLink field if non-nil, zero value otherwise.

### GetIsAffiliateLinkOk

`func (o *PinMediaSourcePinURL) GetIsAffiliateLinkOk() (*bool, bool)`

GetIsAffiliateLinkOk returns a tuple with the IsAffiliateLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAffiliateLink

`func (o *PinMediaSourcePinURL) SetIsAffiliateLink(v bool)`

SetIsAffiliateLink sets IsAffiliateLink field to given value.

### HasIsAffiliateLink

`func (o *PinMediaSourcePinURL) HasIsAffiliateLink() bool`

HasIsAffiliateLink returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


