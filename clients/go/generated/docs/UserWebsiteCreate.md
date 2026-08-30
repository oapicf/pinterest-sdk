# UserWebsiteCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VerificationMethod** | Pointer to [**WebsiteVerificationMethod**](WebsiteVerificationMethod.md) | Method used to verify website ownership. | [optional] [default to METATAG]
**Website** | Pointer to **string** | Website with path or domain only | [optional] 

## Methods

### NewUserWebsiteCreate

`func NewUserWebsiteCreate() *UserWebsiteCreate`

NewUserWebsiteCreate instantiates a new UserWebsiteCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserWebsiteCreateWithDefaults

`func NewUserWebsiteCreateWithDefaults() *UserWebsiteCreate`

NewUserWebsiteCreateWithDefaults instantiates a new UserWebsiteCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVerificationMethod

`func (o *UserWebsiteCreate) GetVerificationMethod() WebsiteVerificationMethod`

GetVerificationMethod returns the VerificationMethod field if non-nil, zero value otherwise.

### GetVerificationMethodOk

`func (o *UserWebsiteCreate) GetVerificationMethodOk() (*WebsiteVerificationMethod, bool)`

GetVerificationMethodOk returns a tuple with the VerificationMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVerificationMethod

`func (o *UserWebsiteCreate) SetVerificationMethod(v WebsiteVerificationMethod)`

SetVerificationMethod sets VerificationMethod field to given value.

### HasVerificationMethod

`func (o *UserWebsiteCreate) HasVerificationMethod() bool`

HasVerificationMethod returns a boolean if a field has been set.

### GetWebsite

`func (o *UserWebsiteCreate) GetWebsite() string`

GetWebsite returns the Website field if non-nil, zero value otherwise.

### GetWebsiteOk

`func (o *UserWebsiteCreate) GetWebsiteOk() (*string, bool)`

GetWebsiteOk returns a tuple with the Website field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebsite

`func (o *UserWebsiteCreate) SetWebsite(v string)`

SetWebsite sets Website field to given value.

### HasWebsite

`func (o *UserWebsiteCreate) HasWebsite() bool`

HasWebsite returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


