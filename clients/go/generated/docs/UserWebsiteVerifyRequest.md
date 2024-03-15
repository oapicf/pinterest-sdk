# UserWebsiteVerifyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Website** | Pointer to **string** |  | [optional] 
**VerificationMethod** | Pointer to **string** |  | [optional] [default to "METATAG"]

## Methods

### NewUserWebsiteVerifyRequest

`func NewUserWebsiteVerifyRequest() *UserWebsiteVerifyRequest`

NewUserWebsiteVerifyRequest instantiates a new UserWebsiteVerifyRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserWebsiteVerifyRequestWithDefaults

`func NewUserWebsiteVerifyRequestWithDefaults() *UserWebsiteVerifyRequest`

NewUserWebsiteVerifyRequestWithDefaults instantiates a new UserWebsiteVerifyRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWebsite

`func (o *UserWebsiteVerifyRequest) GetWebsite() string`

GetWebsite returns the Website field if non-nil, zero value otherwise.

### GetWebsiteOk

`func (o *UserWebsiteVerifyRequest) GetWebsiteOk() (*string, bool)`

GetWebsiteOk returns a tuple with the Website field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebsite

`func (o *UserWebsiteVerifyRequest) SetWebsite(v string)`

SetWebsite sets Website field to given value.

### HasWebsite

`func (o *UserWebsiteVerifyRequest) HasWebsite() bool`

HasWebsite returns a boolean if a field has been set.

### GetVerificationMethod

`func (o *UserWebsiteVerifyRequest) GetVerificationMethod() string`

GetVerificationMethod returns the VerificationMethod field if non-nil, zero value otherwise.

### GetVerificationMethodOk

`func (o *UserWebsiteVerifyRequest) GetVerificationMethodOk() (*string, bool)`

GetVerificationMethodOk returns a tuple with the VerificationMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVerificationMethod

`func (o *UserWebsiteVerifyRequest) SetVerificationMethod(v string)`

SetVerificationMethod sets VerificationMethod field to given value.

### HasVerificationMethod

`func (o *UserWebsiteVerifyRequest) HasVerificationMethod() bool`

HasVerificationMethod returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


