# IntegrationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExternalBusinessId** | Pointer to **NullableString** | External business ID for the integration. | [optional] 
**ConnectedMerchantId** | Pointer to **string** |  | [optional] 
**ConnectedAdvertiserId** | Pointer to **string** |  | [optional] 
**ConnectedLbaId** | Pointer to **string** |  | [optional] 
**ConnectedTagId** | Pointer to **string** |  | [optional] 
**PartnerAccessToken** | Pointer to **string** |  | [optional] 
**PartnerRefreshToken** | Pointer to **string** |  | [optional] 
**PartnerPrimaryEmail** | Pointer to **string** |  | [optional] 
**PartnerAccessTokenExpiry** | Pointer to **int32** |  | [optional] 
**PartnerRefreshTokenExpiry** | Pointer to **int32** |  | [optional] 
**Scopes** | Pointer to **string** |  | [optional] 
**AdditionalId1** | Pointer to **string** |  | [optional] 
**PartnerMetadata** | Pointer to **string** |  | [optional] 

## Methods

### NewIntegrationRequest

`func NewIntegrationRequest() *IntegrationRequest`

NewIntegrationRequest instantiates a new IntegrationRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIntegrationRequestWithDefaults

`func NewIntegrationRequestWithDefaults() *IntegrationRequest`

NewIntegrationRequestWithDefaults instantiates a new IntegrationRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExternalBusinessId

`func (o *IntegrationRequest) GetExternalBusinessId() string`

GetExternalBusinessId returns the ExternalBusinessId field if non-nil, zero value otherwise.

### GetExternalBusinessIdOk

`func (o *IntegrationRequest) GetExternalBusinessIdOk() (*string, bool)`

GetExternalBusinessIdOk returns a tuple with the ExternalBusinessId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalBusinessId

`func (o *IntegrationRequest) SetExternalBusinessId(v string)`

SetExternalBusinessId sets ExternalBusinessId field to given value.

### HasExternalBusinessId

`func (o *IntegrationRequest) HasExternalBusinessId() bool`

HasExternalBusinessId returns a boolean if a field has been set.

### SetExternalBusinessIdNil

`func (o *IntegrationRequest) SetExternalBusinessIdNil(b bool)`

 SetExternalBusinessIdNil sets the value for ExternalBusinessId to be an explicit nil

### UnsetExternalBusinessId
`func (o *IntegrationRequest) UnsetExternalBusinessId()`

UnsetExternalBusinessId ensures that no value is present for ExternalBusinessId, not even an explicit nil
### GetConnectedMerchantId

`func (o *IntegrationRequest) GetConnectedMerchantId() string`

GetConnectedMerchantId returns the ConnectedMerchantId field if non-nil, zero value otherwise.

### GetConnectedMerchantIdOk

`func (o *IntegrationRequest) GetConnectedMerchantIdOk() (*string, bool)`

GetConnectedMerchantIdOk returns a tuple with the ConnectedMerchantId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedMerchantId

`func (o *IntegrationRequest) SetConnectedMerchantId(v string)`

SetConnectedMerchantId sets ConnectedMerchantId field to given value.

### HasConnectedMerchantId

`func (o *IntegrationRequest) HasConnectedMerchantId() bool`

HasConnectedMerchantId returns a boolean if a field has been set.

### GetConnectedAdvertiserId

`func (o *IntegrationRequest) GetConnectedAdvertiserId() string`

GetConnectedAdvertiserId returns the ConnectedAdvertiserId field if non-nil, zero value otherwise.

### GetConnectedAdvertiserIdOk

`func (o *IntegrationRequest) GetConnectedAdvertiserIdOk() (*string, bool)`

GetConnectedAdvertiserIdOk returns a tuple with the ConnectedAdvertiserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedAdvertiserId

`func (o *IntegrationRequest) SetConnectedAdvertiserId(v string)`

SetConnectedAdvertiserId sets ConnectedAdvertiserId field to given value.

### HasConnectedAdvertiserId

`func (o *IntegrationRequest) HasConnectedAdvertiserId() bool`

HasConnectedAdvertiserId returns a boolean if a field has been set.

### GetConnectedLbaId

`func (o *IntegrationRequest) GetConnectedLbaId() string`

GetConnectedLbaId returns the ConnectedLbaId field if non-nil, zero value otherwise.

### GetConnectedLbaIdOk

`func (o *IntegrationRequest) GetConnectedLbaIdOk() (*string, bool)`

GetConnectedLbaIdOk returns a tuple with the ConnectedLbaId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedLbaId

`func (o *IntegrationRequest) SetConnectedLbaId(v string)`

SetConnectedLbaId sets ConnectedLbaId field to given value.

### HasConnectedLbaId

`func (o *IntegrationRequest) HasConnectedLbaId() bool`

HasConnectedLbaId returns a boolean if a field has been set.

### GetConnectedTagId

`func (o *IntegrationRequest) GetConnectedTagId() string`

GetConnectedTagId returns the ConnectedTagId field if non-nil, zero value otherwise.

### GetConnectedTagIdOk

`func (o *IntegrationRequest) GetConnectedTagIdOk() (*string, bool)`

GetConnectedTagIdOk returns a tuple with the ConnectedTagId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedTagId

`func (o *IntegrationRequest) SetConnectedTagId(v string)`

SetConnectedTagId sets ConnectedTagId field to given value.

### HasConnectedTagId

`func (o *IntegrationRequest) HasConnectedTagId() bool`

HasConnectedTagId returns a boolean if a field has been set.

### GetPartnerAccessToken

`func (o *IntegrationRequest) GetPartnerAccessToken() string`

GetPartnerAccessToken returns the PartnerAccessToken field if non-nil, zero value otherwise.

### GetPartnerAccessTokenOk

`func (o *IntegrationRequest) GetPartnerAccessTokenOk() (*string, bool)`

GetPartnerAccessTokenOk returns a tuple with the PartnerAccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerAccessToken

`func (o *IntegrationRequest) SetPartnerAccessToken(v string)`

SetPartnerAccessToken sets PartnerAccessToken field to given value.

### HasPartnerAccessToken

`func (o *IntegrationRequest) HasPartnerAccessToken() bool`

HasPartnerAccessToken returns a boolean if a field has been set.

### GetPartnerRefreshToken

`func (o *IntegrationRequest) GetPartnerRefreshToken() string`

GetPartnerRefreshToken returns the PartnerRefreshToken field if non-nil, zero value otherwise.

### GetPartnerRefreshTokenOk

`func (o *IntegrationRequest) GetPartnerRefreshTokenOk() (*string, bool)`

GetPartnerRefreshTokenOk returns a tuple with the PartnerRefreshToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerRefreshToken

`func (o *IntegrationRequest) SetPartnerRefreshToken(v string)`

SetPartnerRefreshToken sets PartnerRefreshToken field to given value.

### HasPartnerRefreshToken

`func (o *IntegrationRequest) HasPartnerRefreshToken() bool`

HasPartnerRefreshToken returns a boolean if a field has been set.

### GetPartnerPrimaryEmail

`func (o *IntegrationRequest) GetPartnerPrimaryEmail() string`

GetPartnerPrimaryEmail returns the PartnerPrimaryEmail field if non-nil, zero value otherwise.

### GetPartnerPrimaryEmailOk

`func (o *IntegrationRequest) GetPartnerPrimaryEmailOk() (*string, bool)`

GetPartnerPrimaryEmailOk returns a tuple with the PartnerPrimaryEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerPrimaryEmail

`func (o *IntegrationRequest) SetPartnerPrimaryEmail(v string)`

SetPartnerPrimaryEmail sets PartnerPrimaryEmail field to given value.

### HasPartnerPrimaryEmail

`func (o *IntegrationRequest) HasPartnerPrimaryEmail() bool`

HasPartnerPrimaryEmail returns a boolean if a field has been set.

### GetPartnerAccessTokenExpiry

`func (o *IntegrationRequest) GetPartnerAccessTokenExpiry() int32`

GetPartnerAccessTokenExpiry returns the PartnerAccessTokenExpiry field if non-nil, zero value otherwise.

### GetPartnerAccessTokenExpiryOk

`func (o *IntegrationRequest) GetPartnerAccessTokenExpiryOk() (*int32, bool)`

GetPartnerAccessTokenExpiryOk returns a tuple with the PartnerAccessTokenExpiry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerAccessTokenExpiry

`func (o *IntegrationRequest) SetPartnerAccessTokenExpiry(v int32)`

SetPartnerAccessTokenExpiry sets PartnerAccessTokenExpiry field to given value.

### HasPartnerAccessTokenExpiry

`func (o *IntegrationRequest) HasPartnerAccessTokenExpiry() bool`

HasPartnerAccessTokenExpiry returns a boolean if a field has been set.

### GetPartnerRefreshTokenExpiry

`func (o *IntegrationRequest) GetPartnerRefreshTokenExpiry() int32`

GetPartnerRefreshTokenExpiry returns the PartnerRefreshTokenExpiry field if non-nil, zero value otherwise.

### GetPartnerRefreshTokenExpiryOk

`func (o *IntegrationRequest) GetPartnerRefreshTokenExpiryOk() (*int32, bool)`

GetPartnerRefreshTokenExpiryOk returns a tuple with the PartnerRefreshTokenExpiry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerRefreshTokenExpiry

`func (o *IntegrationRequest) SetPartnerRefreshTokenExpiry(v int32)`

SetPartnerRefreshTokenExpiry sets PartnerRefreshTokenExpiry field to given value.

### HasPartnerRefreshTokenExpiry

`func (o *IntegrationRequest) HasPartnerRefreshTokenExpiry() bool`

HasPartnerRefreshTokenExpiry returns a boolean if a field has been set.

### GetScopes

`func (o *IntegrationRequest) GetScopes() string`

GetScopes returns the Scopes field if non-nil, zero value otherwise.

### GetScopesOk

`func (o *IntegrationRequest) GetScopesOk() (*string, bool)`

GetScopesOk returns a tuple with the Scopes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScopes

`func (o *IntegrationRequest) SetScopes(v string)`

SetScopes sets Scopes field to given value.

### HasScopes

`func (o *IntegrationRequest) HasScopes() bool`

HasScopes returns a boolean if a field has been set.

### GetAdditionalId1

`func (o *IntegrationRequest) GetAdditionalId1() string`

GetAdditionalId1 returns the AdditionalId1 field if non-nil, zero value otherwise.

### GetAdditionalId1Ok

`func (o *IntegrationRequest) GetAdditionalId1Ok() (*string, bool)`

GetAdditionalId1Ok returns a tuple with the AdditionalId1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalId1

`func (o *IntegrationRequest) SetAdditionalId1(v string)`

SetAdditionalId1 sets AdditionalId1 field to given value.

### HasAdditionalId1

`func (o *IntegrationRequest) HasAdditionalId1() bool`

HasAdditionalId1 returns a boolean if a field has been set.

### GetPartnerMetadata

`func (o *IntegrationRequest) GetPartnerMetadata() string`

GetPartnerMetadata returns the PartnerMetadata field if non-nil, zero value otherwise.

### GetPartnerMetadataOk

`func (o *IntegrationRequest) GetPartnerMetadataOk() (*string, bool)`

GetPartnerMetadataOk returns a tuple with the PartnerMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerMetadata

`func (o *IntegrationRequest) SetPartnerMetadata(v string)`

SetPartnerMetadata sets PartnerMetadata field to given value.

### HasPartnerMetadata

`func (o *IntegrationRequest) HasPartnerMetadata() bool`

HasPartnerMetadata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


