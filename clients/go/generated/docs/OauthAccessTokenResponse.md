# OauthAccessTokenResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResponseType** | Pointer to **string** |  | [optional] 
**AccessToken** | **string** |  | 
**TokenType** | **string** |  | [default to "bearer"]
**ExpiresIn** | **int32** |  | 
**Scope** | **string** |  | 

## Methods

### NewOauthAccessTokenResponse

`func NewOauthAccessTokenResponse(accessToken string, tokenType string, expiresIn int32, scope string, ) *OauthAccessTokenResponse`

NewOauthAccessTokenResponse instantiates a new OauthAccessTokenResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOauthAccessTokenResponseWithDefaults

`func NewOauthAccessTokenResponseWithDefaults() *OauthAccessTokenResponse`

NewOauthAccessTokenResponseWithDefaults instantiates a new OauthAccessTokenResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResponseType

`func (o *OauthAccessTokenResponse) GetResponseType() string`

GetResponseType returns the ResponseType field if non-nil, zero value otherwise.

### GetResponseTypeOk

`func (o *OauthAccessTokenResponse) GetResponseTypeOk() (*string, bool)`

GetResponseTypeOk returns a tuple with the ResponseType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseType

`func (o *OauthAccessTokenResponse) SetResponseType(v string)`

SetResponseType sets ResponseType field to given value.

### HasResponseType

`func (o *OauthAccessTokenResponse) HasResponseType() bool`

HasResponseType returns a boolean if a field has been set.

### GetAccessToken

`func (o *OauthAccessTokenResponse) GetAccessToken() string`

GetAccessToken returns the AccessToken field if non-nil, zero value otherwise.

### GetAccessTokenOk

`func (o *OauthAccessTokenResponse) GetAccessTokenOk() (*string, bool)`

GetAccessTokenOk returns a tuple with the AccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccessToken

`func (o *OauthAccessTokenResponse) SetAccessToken(v string)`

SetAccessToken sets AccessToken field to given value.


### GetTokenType

`func (o *OauthAccessTokenResponse) GetTokenType() string`

GetTokenType returns the TokenType field if non-nil, zero value otherwise.

### GetTokenTypeOk

`func (o *OauthAccessTokenResponse) GetTokenTypeOk() (*string, bool)`

GetTokenTypeOk returns a tuple with the TokenType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokenType

`func (o *OauthAccessTokenResponse) SetTokenType(v string)`

SetTokenType sets TokenType field to given value.


### GetExpiresIn

`func (o *OauthAccessTokenResponse) GetExpiresIn() int32`

GetExpiresIn returns the ExpiresIn field if non-nil, zero value otherwise.

### GetExpiresInOk

`func (o *OauthAccessTokenResponse) GetExpiresInOk() (*int32, bool)`

GetExpiresInOk returns a tuple with the ExpiresIn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresIn

`func (o *OauthAccessTokenResponse) SetExpiresIn(v int32)`

SetExpiresIn sets ExpiresIn field to given value.


### GetScope

`func (o *OauthAccessTokenResponse) GetScope() string`

GetScope returns the Scope field if non-nil, zero value otherwise.

### GetScopeOk

`func (o *OauthAccessTokenResponse) GetScopeOk() (*string, bool)`

GetScopeOk returns a tuple with the Scope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScope

`func (o *OauthAccessTokenResponse) SetScope(v string)`

SetScope sets Scope field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


