# AdAccountCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | Pointer to [**Country**](Country.md) |  | [optional] 
**Name** | Pointer to **string** | Ad Account name. | [optional] 
**OwnerUserId** | Pointer to **string** | Advertiser&#39;s owning user ID. | [optional] 

## Methods

### NewAdAccountCreateRequest

`func NewAdAccountCreateRequest() *AdAccountCreateRequest`

NewAdAccountCreateRequest instantiates a new AdAccountCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdAccountCreateRequestWithDefaults

`func NewAdAccountCreateRequestWithDefaults() *AdAccountCreateRequest`

NewAdAccountCreateRequestWithDefaults instantiates a new AdAccountCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *AdAccountCreateRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AdAccountCreateRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AdAccountCreateRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *AdAccountCreateRequest) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetName

`func (o *AdAccountCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdAccountCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdAccountCreateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdAccountCreateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOwnerUserId

`func (o *AdAccountCreateRequest) GetOwnerUserId() string`

GetOwnerUserId returns the OwnerUserId field if non-nil, zero value otherwise.

### GetOwnerUserIdOk

`func (o *AdAccountCreateRequest) GetOwnerUserIdOk() (*string, bool)`

GetOwnerUserIdOk returns a tuple with the OwnerUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwnerUserId

`func (o *AdAccountCreateRequest) SetOwnerUserId(v string)`

SetOwnerUserId sets OwnerUserId field to given value.

### HasOwnerUserId

`func (o *AdAccountCreateRequest) HasOwnerUserId() bool`

HasOwnerUserId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


