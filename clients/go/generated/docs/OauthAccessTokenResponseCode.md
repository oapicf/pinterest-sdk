# OauthAccessTokenResponseCode

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResponseType** | Pointer to **string** |  | [optional] 
**AccessToken** | **string** |  | 
**TokenType** | **string** |  | [default to "bearer"]
**ExpiresIn** | **int32** |  | 
**Scope** | **string** |  | 
**RefreshToken** | **string** |  | 
**RefreshTokenExpiresIn** | **int32** |  | 

## Methods

### NewOauthAccessTokenResponseCode

`func NewOauthAccessTokenResponseCode(accessToken string, tokenType string, expiresIn int32, scope string, refreshToken string, refreshTokenExpiresIn int32, ) *OauthAccessTokenResponseCode`

NewOauthAccessTokenResponseCode instantiates a new OauthAccessTokenResponseCode object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOauthAccessTokenResponseCodeWithDefaults

`func NewOauthAccessTokenResponseCodeWithDefaults() *OauthAccessTokenResponseCode`

NewOauthAccessTokenResponseCodeWithDefaults instantiates a new OauthAccessTokenResponseCode object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResponseType

`func (o *OauthAccessTokenResponseCode) GetResponseType() string`

GetResponseType returns the ResponseType field if non-nil, zero value otherwise.

### GetResponseTypeOk

`func (o *OauthAccessTokenResponseCode) GetResponseTypeOk() (*string, bool)`

GetResponseTypeOk returns a tuple with the ResponseType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseType

`func (o *OauthAccessTokenResponseCode) SetResponseType(v string)`

SetResponseType sets ResponseType field to given value.

### HasResponseType

`func (o *OauthAccessTokenResponseCode) HasResponseType() bool`

HasResponseType returns a boolean if a field has been set.

### GetAccessToken

`func (o *OauthAccessTokenResponseCode) GetAccessToken() string`

GetAccessToken returns the AccessToken field if non-nil, zero value otherwise.

### GetAccessTokenOk

`func (o *OauthAccessTokenResponseCode) GetAccessTokenOk() (*string, bool)`

GetAccessTokenOk returns a tuple with the AccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccessToken

`func (o *OauthAccessTokenResponseCode) SetAccessToken(v string)`

SetAccessToken sets AccessToken field to given value.


### GetTokenType

`func (o *OauthAccessTokenResponseCode) GetTokenType() string`

GetTokenType returns the TokenType field if non-nil, zero value otherwise.

### GetTokenTypeOk

`func (o *OauthAccessTokenResponseCode) GetTokenTypeOk() (*string, bool)`

GetTokenTypeOk returns a tuple with the TokenType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokenType

`func (o *OauthAccessTokenResponseCode) SetTokenType(v string)`

SetTokenType sets TokenType field to given value.


### GetExpiresIn

`func (o *OauthAccessTokenResponseCode) GetExpiresIn() int32`

GetExpiresIn returns the ExpiresIn field if non-nil, zero value otherwise.

### GetExpiresInOk

`func (o *OauthAccessTokenResponseCode) GetExpiresInOk() (*int32, bool)`

GetExpiresInOk returns a tuple with the ExpiresIn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresIn

`func (o *OauthAccessTokenResponseCode) SetExpiresIn(v int32)`

SetExpiresIn sets ExpiresIn field to given value.


### GetScope

`func (o *OauthAccessTokenResponseCode) GetScope() string`

GetScope returns the Scope field if non-nil, zero value otherwise.

### GetScopeOk

`func (o *OauthAccessTokenResponseCode) GetScopeOk() (*string, bool)`

GetScopeOk returns a tuple with the Scope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScope

`func (o *OauthAccessTokenResponseCode) SetScope(v string)`

SetScope sets Scope field to given value.


### GetRefreshToken

`func (o *OauthAccessTokenResponseCode) GetRefreshToken() string`

GetRefreshToken returns the RefreshToken field if non-nil, zero value otherwise.

### GetRefreshTokenOk

`func (o *OauthAccessTokenResponseCode) GetRefreshTokenOk() (*string, bool)`

GetRefreshTokenOk returns a tuple with the RefreshToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshToken

`func (o *OauthAccessTokenResponseCode) SetRefreshToken(v string)`

SetRefreshToken sets RefreshToken field to given value.


### GetRefreshTokenExpiresIn

`func (o *OauthAccessTokenResponseCode) GetRefreshTokenExpiresIn() int32`

GetRefreshTokenExpiresIn returns the RefreshTokenExpiresIn field if non-nil, zero value otherwise.

### GetRefreshTokenExpiresInOk

`func (o *OauthAccessTokenResponseCode) GetRefreshTokenExpiresInOk() (*int32, bool)`

GetRefreshTokenExpiresInOk returns a tuple with the RefreshTokenExpiresIn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshTokenExpiresIn

`func (o *OauthAccessTokenResponseCode) SetRefreshTokenExpiresIn(v int32)`

SetRefreshTokenExpiresIn sets RefreshTokenExpiresIn field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


