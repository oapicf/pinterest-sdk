# OauthAccessTokenResponseClientCredentials

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResponseType** | Pointer to **string** |  | [optional] 
**AccessToken** | **string** |  | 
**TokenType** | **string** |  | [default to "bearer"]
**ExpiresIn** | **int32** |  | 
**Scope** | **string** |  | 

## Methods

### NewOauthAccessTokenResponseClientCredentials

`func NewOauthAccessTokenResponseClientCredentials(accessToken string, tokenType string, expiresIn int32, scope string, ) *OauthAccessTokenResponseClientCredentials`

NewOauthAccessTokenResponseClientCredentials instantiates a new OauthAccessTokenResponseClientCredentials object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOauthAccessTokenResponseClientCredentialsWithDefaults

`func NewOauthAccessTokenResponseClientCredentialsWithDefaults() *OauthAccessTokenResponseClientCredentials`

NewOauthAccessTokenResponseClientCredentialsWithDefaults instantiates a new OauthAccessTokenResponseClientCredentials object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResponseType

`func (o *OauthAccessTokenResponseClientCredentials) GetResponseType() string`

GetResponseType returns the ResponseType field if non-nil, zero value otherwise.

### GetResponseTypeOk

`func (o *OauthAccessTokenResponseClientCredentials) GetResponseTypeOk() (*string, bool)`

GetResponseTypeOk returns a tuple with the ResponseType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseType

`func (o *OauthAccessTokenResponseClientCredentials) SetResponseType(v string)`

SetResponseType sets ResponseType field to given value.

### HasResponseType

`func (o *OauthAccessTokenResponseClientCredentials) HasResponseType() bool`

HasResponseType returns a boolean if a field has been set.

### GetAccessToken

`func (o *OauthAccessTokenResponseClientCredentials) GetAccessToken() string`

GetAccessToken returns the AccessToken field if non-nil, zero value otherwise.

### GetAccessTokenOk

`func (o *OauthAccessTokenResponseClientCredentials) GetAccessTokenOk() (*string, bool)`

GetAccessTokenOk returns a tuple with the AccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccessToken

`func (o *OauthAccessTokenResponseClientCredentials) SetAccessToken(v string)`

SetAccessToken sets AccessToken field to given value.


### GetTokenType

`func (o *OauthAccessTokenResponseClientCredentials) GetTokenType() string`

GetTokenType returns the TokenType field if non-nil, zero value otherwise.

### GetTokenTypeOk

`func (o *OauthAccessTokenResponseClientCredentials) GetTokenTypeOk() (*string, bool)`

GetTokenTypeOk returns a tuple with the TokenType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokenType

`func (o *OauthAccessTokenResponseClientCredentials) SetTokenType(v string)`

SetTokenType sets TokenType field to given value.


### GetExpiresIn

`func (o *OauthAccessTokenResponseClientCredentials) GetExpiresIn() int32`

GetExpiresIn returns the ExpiresIn field if non-nil, zero value otherwise.

### GetExpiresInOk

`func (o *OauthAccessTokenResponseClientCredentials) GetExpiresInOk() (*int32, bool)`

GetExpiresInOk returns a tuple with the ExpiresIn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresIn

`func (o *OauthAccessTokenResponseClientCredentials) SetExpiresIn(v int32)`

SetExpiresIn sets ExpiresIn field to given value.


### GetScope

`func (o *OauthAccessTokenResponseClientCredentials) GetScope() string`

GetScope returns the Scope field if non-nil, zero value otherwise.

### GetScopeOk

`func (o *OauthAccessTokenResponseClientCredentials) GetScopeOk() (*string, bool)`

GetScopeOk returns a tuple with the Scope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScope

`func (o *OauthAccessTokenResponseClientCredentials) SetScope(v string)`

SetScope sets Scope field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


