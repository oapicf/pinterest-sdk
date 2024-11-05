# OauthAccessTokenRequestCode

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GrantType** | **string** |  | 
**Code** | **string** |  | 
**RedirectUri** | **string** |  | 

## Methods

### NewOauthAccessTokenRequestCode

`func NewOauthAccessTokenRequestCode(grantType string, code string, redirectUri string, ) *OauthAccessTokenRequestCode`

NewOauthAccessTokenRequestCode instantiates a new OauthAccessTokenRequestCode object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOauthAccessTokenRequestCodeWithDefaults

`func NewOauthAccessTokenRequestCodeWithDefaults() *OauthAccessTokenRequestCode`

NewOauthAccessTokenRequestCodeWithDefaults instantiates a new OauthAccessTokenRequestCode object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGrantType

`func (o *OauthAccessTokenRequestCode) GetGrantType() string`

GetGrantType returns the GrantType field if non-nil, zero value otherwise.

### GetGrantTypeOk

`func (o *OauthAccessTokenRequestCode) GetGrantTypeOk() (*string, bool)`

GetGrantTypeOk returns a tuple with the GrantType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrantType

`func (o *OauthAccessTokenRequestCode) SetGrantType(v string)`

SetGrantType sets GrantType field to given value.


### GetCode

`func (o *OauthAccessTokenRequestCode) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *OauthAccessTokenRequestCode) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *OauthAccessTokenRequestCode) SetCode(v string)`

SetCode sets Code field to given value.


### GetRedirectUri

`func (o *OauthAccessTokenRequestCode) GetRedirectUri() string`

GetRedirectUri returns the RedirectUri field if non-nil, zero value otherwise.

### GetRedirectUriOk

`func (o *OauthAccessTokenRequestCode) GetRedirectUriOk() (*string, bool)`

GetRedirectUriOk returns a tuple with the RedirectUri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRedirectUri

`func (o *OauthAccessTokenRequestCode) SetRedirectUri(v string)`

SetRedirectUri sets RedirectUri field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


