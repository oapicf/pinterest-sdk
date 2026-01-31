# OauthAccessTokenResponseRefresh

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessToken** | **string** |  | 
**ExpiresIn** | **int32** |  | 
**ResponseType** | Pointer to **string** |  | [optional] 
**Scope** | **string** |  | 
**TokenType** | **string** |  | [default to "bearer"]
**RefreshToken** | **string** |  | 
**RefreshTokenExpiresAt** | **int32** |  | 
**RefreshTokenExpiresIn** | **int32** |  | 

## Methods

### NewOauthAccessTokenResponseRefresh

`func NewOauthAccessTokenResponseRefresh(accessToken string, expiresIn int32, scope string, tokenType string, refreshToken string, refreshTokenExpiresAt int32, refreshTokenExpiresIn int32, ) *OauthAccessTokenResponseRefresh`

NewOauthAccessTokenResponseRefresh instantiates a new OauthAccessTokenResponseRefresh object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOauthAccessTokenResponseRefreshWithDefaults

`func NewOauthAccessTokenResponseRefreshWithDefaults() *OauthAccessTokenResponseRefresh`

NewOauthAccessTokenResponseRefreshWithDefaults instantiates a new OauthAccessTokenResponseRefresh object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccessToken

`func (o *OauthAccessTokenResponseRefresh) GetAccessToken() string`

GetAccessToken returns the AccessToken field if non-nil, zero value otherwise.

### GetAccessTokenOk

`func (o *OauthAccessTokenResponseRefresh) GetAccessTokenOk() (*string, bool)`

GetAccessTokenOk returns a tuple with the AccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccessToken

`func (o *OauthAccessTokenResponseRefresh) SetAccessToken(v string)`

SetAccessToken sets AccessToken field to given value.


### GetExpiresIn

`func (o *OauthAccessTokenResponseRefresh) GetExpiresIn() int32`

GetExpiresIn returns the ExpiresIn field if non-nil, zero value otherwise.

### GetExpiresInOk

`func (o *OauthAccessTokenResponseRefresh) GetExpiresInOk() (*int32, bool)`

GetExpiresInOk returns a tuple with the ExpiresIn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresIn

`func (o *OauthAccessTokenResponseRefresh) SetExpiresIn(v int32)`

SetExpiresIn sets ExpiresIn field to given value.


### GetResponseType

`func (o *OauthAccessTokenResponseRefresh) GetResponseType() string`

GetResponseType returns the ResponseType field if non-nil, zero value otherwise.

### GetResponseTypeOk

`func (o *OauthAccessTokenResponseRefresh) GetResponseTypeOk() (*string, bool)`

GetResponseTypeOk returns a tuple with the ResponseType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseType

`func (o *OauthAccessTokenResponseRefresh) SetResponseType(v string)`

SetResponseType sets ResponseType field to given value.

### HasResponseType

`func (o *OauthAccessTokenResponseRefresh) HasResponseType() bool`

HasResponseType returns a boolean if a field has been set.

### GetScope

`func (o *OauthAccessTokenResponseRefresh) GetScope() string`

GetScope returns the Scope field if non-nil, zero value otherwise.

### GetScopeOk

`func (o *OauthAccessTokenResponseRefresh) GetScopeOk() (*string, bool)`

GetScopeOk returns a tuple with the Scope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScope

`func (o *OauthAccessTokenResponseRefresh) SetScope(v string)`

SetScope sets Scope field to given value.


### GetTokenType

`func (o *OauthAccessTokenResponseRefresh) GetTokenType() string`

GetTokenType returns the TokenType field if non-nil, zero value otherwise.

### GetTokenTypeOk

`func (o *OauthAccessTokenResponseRefresh) GetTokenTypeOk() (*string, bool)`

GetTokenTypeOk returns a tuple with the TokenType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokenType

`func (o *OauthAccessTokenResponseRefresh) SetTokenType(v string)`

SetTokenType sets TokenType field to given value.


### GetRefreshToken

`func (o *OauthAccessTokenResponseRefresh) GetRefreshToken() string`

GetRefreshToken returns the RefreshToken field if non-nil, zero value otherwise.

### GetRefreshTokenOk

`func (o *OauthAccessTokenResponseRefresh) GetRefreshTokenOk() (*string, bool)`

GetRefreshTokenOk returns a tuple with the RefreshToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshToken

`func (o *OauthAccessTokenResponseRefresh) SetRefreshToken(v string)`

SetRefreshToken sets RefreshToken field to given value.


### GetRefreshTokenExpiresAt

`func (o *OauthAccessTokenResponseRefresh) GetRefreshTokenExpiresAt() int32`

GetRefreshTokenExpiresAt returns the RefreshTokenExpiresAt field if non-nil, zero value otherwise.

### GetRefreshTokenExpiresAtOk

`func (o *OauthAccessTokenResponseRefresh) GetRefreshTokenExpiresAtOk() (*int32, bool)`

GetRefreshTokenExpiresAtOk returns a tuple with the RefreshTokenExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshTokenExpiresAt

`func (o *OauthAccessTokenResponseRefresh) SetRefreshTokenExpiresAt(v int32)`

SetRefreshTokenExpiresAt sets RefreshTokenExpiresAt field to given value.


### GetRefreshTokenExpiresIn

`func (o *OauthAccessTokenResponseRefresh) GetRefreshTokenExpiresIn() int32`

GetRefreshTokenExpiresIn returns the RefreshTokenExpiresIn field if non-nil, zero value otherwise.

### GetRefreshTokenExpiresInOk

`func (o *OauthAccessTokenResponseRefresh) GetRefreshTokenExpiresInOk() (*int32, bool)`

GetRefreshTokenExpiresInOk returns a tuple with the RefreshTokenExpiresIn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshTokenExpiresIn

`func (o *OauthAccessTokenResponseRefresh) SetRefreshTokenExpiresIn(v int32)`

SetRefreshTokenExpiresIn sets RefreshTokenExpiresIn field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


