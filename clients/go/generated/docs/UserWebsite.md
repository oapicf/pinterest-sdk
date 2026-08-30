# UserWebsite

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to **string** | Status of the verification process | [optional] [readonly] 
**VerifiedAt** | Pointer to **string** | UTC timestamp when the verification happened - sometimes missing | [optional] [readonly] 
**Website** | Pointer to **string** | Website with path or domain only | [optional] 

## Methods

### NewUserWebsite

`func NewUserWebsite() *UserWebsite`

NewUserWebsite instantiates a new UserWebsite object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserWebsiteWithDefaults

`func NewUserWebsiteWithDefaults() *UserWebsite`

NewUserWebsiteWithDefaults instantiates a new UserWebsite object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *UserWebsite) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *UserWebsite) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *UserWebsite) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *UserWebsite) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetVerifiedAt

`func (o *UserWebsite) GetVerifiedAt() string`

GetVerifiedAt returns the VerifiedAt field if non-nil, zero value otherwise.

### GetVerifiedAtOk

`func (o *UserWebsite) GetVerifiedAtOk() (*string, bool)`

GetVerifiedAtOk returns a tuple with the VerifiedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVerifiedAt

`func (o *UserWebsite) SetVerifiedAt(v string)`

SetVerifiedAt sets VerifiedAt field to given value.

### HasVerifiedAt

`func (o *UserWebsite) HasVerifiedAt() bool`

HasVerifiedAt returns a boolean if a field has been set.

### GetWebsite

`func (o *UserWebsite) GetWebsite() string`

GetWebsite returns the Website field if non-nil, zero value otherwise.

### GetWebsiteOk

`func (o *UserWebsite) GetWebsiteOk() (*string, bool)`

GetWebsiteOk returns a tuple with the Website field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebsite

`func (o *UserWebsite) SetWebsite(v string)`

SetWebsite sets Website field to given value.

### HasWebsite

`func (o *UserWebsite) HasWebsite() bool`

HasWebsite returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


