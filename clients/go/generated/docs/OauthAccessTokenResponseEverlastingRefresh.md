# OauthAccessTokenResponseEverlastingRefresh

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
**RefreshTokenExpiresAt** | **int32** |  | 

## Methods

### NewOauthAccessTokenResponseEverlastingRefresh

`func NewOauthAccessTokenResponseEverlastingRefresh(accessToken string, tokenType string, expiresIn int32, scope string, refreshToken string, refreshTokenExpiresIn int32, refreshTokenExpiresAt int32, ) *OauthAccessTokenResponseEverlastingRefresh`

NewOauthAccessTokenResponseEverlastingRefresh instantiates a new OauthAccessTokenResponseEverlastingRefresh object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOauthAccessTokenResponseEverlastingRefreshWithDefaults

`func NewOauthAccessTokenResponseEverlastingRefreshWithDefaults() *OauthAccessTokenResponseEverlastingRefresh`

NewOauthAccessTokenResponseEverlastingRefreshWithDefaults instantiates a new OauthAccessTokenResponseEverlastingRefresh object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResponseType

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetResponseType() string`

GetResponseType returns the ResponseType field if non-nil, zero value otherwise.

### GetResponseTypeOk

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetResponseTypeOk() (*string, bool)`

GetResponseTypeOk returns a tuple with the ResponseType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseType

`func (o *OauthAccessTokenResponseEverlastingRefresh) SetResponseType(v string)`

SetResponseType sets ResponseType field to given value.

### HasResponseType

`func (o *OauthAccessTokenResponseEverlastingRefresh) HasResponseType() bool`

HasResponseType returns a boolean if a field has been set.

### GetAccessToken

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetAccessToken() string`

GetAccessToken returns the AccessToken field if non-nil, zero value otherwise.

### GetAccessTokenOk

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetAccessTokenOk() (*string, bool)`

GetAccessTokenOk returns a tuple with the AccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccessToken

`func (o *OauthAccessTokenResponseEverlastingRefresh) SetAccessToken(v string)`

SetAccessToken sets AccessToken field to given value.


### GetTokenType

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetTokenType() string`

GetTokenType returns the TokenType field if non-nil, zero value otherwise.

### GetTokenTypeOk

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetTokenTypeOk() (*string, bool)`

GetTokenTypeOk returns a tuple with the TokenType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokenType

`func (o *OauthAccessTokenResponseEverlastingRefresh) SetTokenType(v string)`

SetTokenType sets TokenType field to given value.


### GetExpiresIn

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetExpiresIn() int32`

GetExpiresIn returns the ExpiresIn field if non-nil, zero value otherwise.

### GetExpiresInOk

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetExpiresInOk() (*int32, bool)`

GetExpiresInOk returns a tuple with the ExpiresIn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresIn

`func (o *OauthAccessTokenResponseEverlastingRefresh) SetExpiresIn(v int32)`

SetExpiresIn sets ExpiresIn field to given value.


### GetScope

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetScope() string`

GetScope returns the Scope field if non-nil, zero value otherwise.

### GetScopeOk

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetScopeOk() (*string, bool)`

GetScopeOk returns a tuple with the Scope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScope

`func (o *OauthAccessTokenResponseEverlastingRefresh) SetScope(v string)`

SetScope sets Scope field to given value.


### GetRefreshToken

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetRefreshToken() string`

GetRefreshToken returns the RefreshToken field if non-nil, zero value otherwise.

### GetRefreshTokenOk

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetRefreshTokenOk() (*string, bool)`

GetRefreshTokenOk returns a tuple with the RefreshToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshToken

`func (o *OauthAccessTokenResponseEverlastingRefresh) SetRefreshToken(v string)`

SetRefreshToken sets RefreshToken field to given value.


### GetRefreshTokenExpiresIn

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetRefreshTokenExpiresIn() int32`

GetRefreshTokenExpiresIn returns the RefreshTokenExpiresIn field if non-nil, zero value otherwise.

### GetRefreshTokenExpiresInOk

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetRefreshTokenExpiresInOk() (*int32, bool)`

GetRefreshTokenExpiresInOk returns a tuple with the RefreshTokenExpiresIn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshTokenExpiresIn

`func (o *OauthAccessTokenResponseEverlastingRefresh) SetRefreshTokenExpiresIn(v int32)`

SetRefreshTokenExpiresIn sets RefreshTokenExpiresIn field to given value.


### GetRefreshTokenExpiresAt

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetRefreshTokenExpiresAt() int32`

GetRefreshTokenExpiresAt returns the RefreshTokenExpiresAt field if non-nil, zero value otherwise.

### GetRefreshTokenExpiresAtOk

`func (o *OauthAccessTokenResponseEverlastingRefresh) GetRefreshTokenExpiresAtOk() (*int32, bool)`

GetRefreshTokenExpiresAtOk returns a tuple with the RefreshTokenExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshTokenExpiresAt

`func (o *OauthAccessTokenResponseEverlastingRefresh) SetRefreshTokenExpiresAt(v int32)`

SetRefreshTokenExpiresAt sets RefreshTokenExpiresAt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


