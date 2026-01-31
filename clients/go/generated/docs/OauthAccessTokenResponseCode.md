# OauthAccessTokenResponseCode

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RefreshToken** | Pointer to **string** |  | [optional] 
**RefreshTokenExpiresAt** | Pointer to **int32** |  | [optional] 
**RefreshTokenExpiresIn** | Pointer to **int32** |  | [optional] 
**AccessToken** | **string** |  | 
**ExpiresIn** | **int32** |  | 
**ResponseType** | Pointer to **string** |  | [optional] 
**Scope** | **string** |  | 
**TokenType** | **string** |  | [default to "bearer"]

## Methods

### NewOauthAccessTokenResponseCode

`func NewOauthAccessTokenResponseCode(accessToken string, expiresIn int32, scope string, tokenType string, ) *OauthAccessTokenResponseCode`

NewOauthAccessTokenResponseCode instantiates a new OauthAccessTokenResponseCode object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOauthAccessTokenResponseCodeWithDefaults

`func NewOauthAccessTokenResponseCodeWithDefaults() *OauthAccessTokenResponseCode`

NewOauthAccessTokenResponseCodeWithDefaults instantiates a new OauthAccessTokenResponseCode object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

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

### HasRefreshToken

`func (o *OauthAccessTokenResponseCode) HasRefreshToken() bool`

HasRefreshToken returns a boolean if a field has been set.

### GetRefreshTokenExpiresAt

`func (o *OauthAccessTokenResponseCode) GetRefreshTokenExpiresAt() int32`

GetRefreshTokenExpiresAt returns the RefreshTokenExpiresAt field if non-nil, zero value otherwise.

### GetRefreshTokenExpiresAtOk

`func (o *OauthAccessTokenResponseCode) GetRefreshTokenExpiresAtOk() (*int32, bool)`

GetRefreshTokenExpiresAtOk returns a tuple with the RefreshTokenExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshTokenExpiresAt

`func (o *OauthAccessTokenResponseCode) SetRefreshTokenExpiresAt(v int32)`

SetRefreshTokenExpiresAt sets RefreshTokenExpiresAt field to given value.

### HasRefreshTokenExpiresAt

`func (o *OauthAccessTokenResponseCode) HasRefreshTokenExpiresAt() bool`

HasRefreshTokenExpiresAt returns a boolean if a field has been set.

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

### HasRefreshTokenExpiresIn

`func (o *OauthAccessTokenResponseCode) HasRefreshTokenExpiresIn() bool`

HasRefreshTokenExpiresIn returns a boolean if a field has been set.

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



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


