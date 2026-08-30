# OauthAccessToken

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessToken** | **string** |  | [readonly] 
**ExpiresIn** | **int32** |  | [readonly] 
**RefreshToken** | Pointer to **string** |  | [optional] 
**RefreshTokenExpiresAt** | Pointer to **int32** |  | [optional] [readonly] 
**RefreshTokenExpiresIn** | Pointer to **int32** |  | [optional] [readonly] 
**ResponseType** | Pointer to [**TokenGrantType**](TokenGrantType.md) |  | [optional] [readonly] 
**Scope** | Pointer to **string** |  | [optional] 
**TokenType** | **string** |  | [readonly] [default to "bearer"]

## Methods

### NewOauthAccessToken

`func NewOauthAccessToken(accessToken string, expiresIn int32, tokenType string, ) *OauthAccessToken`

NewOauthAccessToken instantiates a new OauthAccessToken object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOauthAccessTokenWithDefaults

`func NewOauthAccessTokenWithDefaults() *OauthAccessToken`

NewOauthAccessTokenWithDefaults instantiates a new OauthAccessToken object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccessToken

`func (o *OauthAccessToken) GetAccessToken() string`

GetAccessToken returns the AccessToken field if non-nil, zero value otherwise.

### GetAccessTokenOk

`func (o *OauthAccessToken) GetAccessTokenOk() (*string, bool)`

GetAccessTokenOk returns a tuple with the AccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccessToken

`func (o *OauthAccessToken) SetAccessToken(v string)`

SetAccessToken sets AccessToken field to given value.


### GetExpiresIn

`func (o *OauthAccessToken) GetExpiresIn() int32`

GetExpiresIn returns the ExpiresIn field if non-nil, zero value otherwise.

### GetExpiresInOk

`func (o *OauthAccessToken) GetExpiresInOk() (*int32, bool)`

GetExpiresInOk returns a tuple with the ExpiresIn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresIn

`func (o *OauthAccessToken) SetExpiresIn(v int32)`

SetExpiresIn sets ExpiresIn field to given value.


### GetRefreshToken

`func (o *OauthAccessToken) GetRefreshToken() string`

GetRefreshToken returns the RefreshToken field if non-nil, zero value otherwise.

### GetRefreshTokenOk

`func (o *OauthAccessToken) GetRefreshTokenOk() (*string, bool)`

GetRefreshTokenOk returns a tuple with the RefreshToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshToken

`func (o *OauthAccessToken) SetRefreshToken(v string)`

SetRefreshToken sets RefreshToken field to given value.

### HasRefreshToken

`func (o *OauthAccessToken) HasRefreshToken() bool`

HasRefreshToken returns a boolean if a field has been set.

### GetRefreshTokenExpiresAt

`func (o *OauthAccessToken) GetRefreshTokenExpiresAt() int32`

GetRefreshTokenExpiresAt returns the RefreshTokenExpiresAt field if non-nil, zero value otherwise.

### GetRefreshTokenExpiresAtOk

`func (o *OauthAccessToken) GetRefreshTokenExpiresAtOk() (*int32, bool)`

GetRefreshTokenExpiresAtOk returns a tuple with the RefreshTokenExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshTokenExpiresAt

`func (o *OauthAccessToken) SetRefreshTokenExpiresAt(v int32)`

SetRefreshTokenExpiresAt sets RefreshTokenExpiresAt field to given value.

### HasRefreshTokenExpiresAt

`func (o *OauthAccessToken) HasRefreshTokenExpiresAt() bool`

HasRefreshTokenExpiresAt returns a boolean if a field has been set.

### GetRefreshTokenExpiresIn

`func (o *OauthAccessToken) GetRefreshTokenExpiresIn() int32`

GetRefreshTokenExpiresIn returns the RefreshTokenExpiresIn field if non-nil, zero value otherwise.

### GetRefreshTokenExpiresInOk

`func (o *OauthAccessToken) GetRefreshTokenExpiresInOk() (*int32, bool)`

GetRefreshTokenExpiresInOk returns a tuple with the RefreshTokenExpiresIn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshTokenExpiresIn

`func (o *OauthAccessToken) SetRefreshTokenExpiresIn(v int32)`

SetRefreshTokenExpiresIn sets RefreshTokenExpiresIn field to given value.

### HasRefreshTokenExpiresIn

`func (o *OauthAccessToken) HasRefreshTokenExpiresIn() bool`

HasRefreshTokenExpiresIn returns a boolean if a field has been set.

### GetResponseType

`func (o *OauthAccessToken) GetResponseType() TokenGrantType`

GetResponseType returns the ResponseType field if non-nil, zero value otherwise.

### GetResponseTypeOk

`func (o *OauthAccessToken) GetResponseTypeOk() (*TokenGrantType, bool)`

GetResponseTypeOk returns a tuple with the ResponseType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseType

`func (o *OauthAccessToken) SetResponseType(v TokenGrantType)`

SetResponseType sets ResponseType field to given value.

### HasResponseType

`func (o *OauthAccessToken) HasResponseType() bool`

HasResponseType returns a boolean if a field has been set.

### GetScope

`func (o *OauthAccessToken) GetScope() string`

GetScope returns the Scope field if non-nil, zero value otherwise.

### GetScopeOk

`func (o *OauthAccessToken) GetScopeOk() (*string, bool)`

GetScopeOk returns a tuple with the Scope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScope

`func (o *OauthAccessToken) SetScope(v string)`

SetScope sets Scope field to given value.

### HasScope

`func (o *OauthAccessToken) HasScope() bool`

HasScope returns a boolean if a field has been set.

### GetTokenType

`func (o *OauthAccessToken) GetTokenType() string`

GetTokenType returns the TokenType field if non-nil, zero value otherwise.

### GetTokenTypeOk

`func (o *OauthAccessToken) GetTokenTypeOk() (*string, bool)`

GetTokenTypeOk returns a tuple with the TokenType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokenType

`func (o *OauthAccessToken) SetTokenType(v string)`

SetTokenType sets TokenType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


