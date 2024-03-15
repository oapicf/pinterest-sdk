# OauthAccessTokenRequestRefresh

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RefreshToken** | **string** |  | 
**Scope** | Pointer to **string** |  | [optional] 
**RefreshOn** | Pointer to **bool** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;. | [optional] 

## Methods

### NewOauthAccessTokenRequestRefresh

`func NewOauthAccessTokenRequestRefresh(refreshToken string, ) *OauthAccessTokenRequestRefresh`

NewOauthAccessTokenRequestRefresh instantiates a new OauthAccessTokenRequestRefresh object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOauthAccessTokenRequestRefreshWithDefaults

`func NewOauthAccessTokenRequestRefreshWithDefaults() *OauthAccessTokenRequestRefresh`

NewOauthAccessTokenRequestRefreshWithDefaults instantiates a new OauthAccessTokenRequestRefresh object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRefreshToken

`func (o *OauthAccessTokenRequestRefresh) GetRefreshToken() string`

GetRefreshToken returns the RefreshToken field if non-nil, zero value otherwise.

### GetRefreshTokenOk

`func (o *OauthAccessTokenRequestRefresh) GetRefreshTokenOk() (*string, bool)`

GetRefreshTokenOk returns a tuple with the RefreshToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshToken

`func (o *OauthAccessTokenRequestRefresh) SetRefreshToken(v string)`

SetRefreshToken sets RefreshToken field to given value.


### GetScope

`func (o *OauthAccessTokenRequestRefresh) GetScope() string`

GetScope returns the Scope field if non-nil, zero value otherwise.

### GetScopeOk

`func (o *OauthAccessTokenRequestRefresh) GetScopeOk() (*string, bool)`

GetScopeOk returns a tuple with the Scope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScope

`func (o *OauthAccessTokenRequestRefresh) SetScope(v string)`

SetScope sets Scope field to given value.

### HasScope

`func (o *OauthAccessTokenRequestRefresh) HasScope() bool`

HasScope returns a boolean if a field has been set.

### GetRefreshOn

`func (o *OauthAccessTokenRequestRefresh) GetRefreshOn() bool`

GetRefreshOn returns the RefreshOn field if non-nil, zero value otherwise.

### GetRefreshOnOk

`func (o *OauthAccessTokenRequestRefresh) GetRefreshOnOk() (*bool, bool)`

GetRefreshOnOk returns a tuple with the RefreshOn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefreshOn

`func (o *OauthAccessTokenRequestRefresh) SetRefreshOn(v bool)`

SetRefreshOn sets RefreshOn field to given value.

### HasRefreshOn

`func (o *OauthAccessTokenRequestRefresh) HasRefreshOn() bool`

HasRefreshOn returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


