# IntegrationMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** |  | [optional] 
**ExternalBusinessId** | Pointer to **string** |  | [optional] 
**ConnectedMerchantId** | Pointer to **string** |  | [optional] 
**ConnectedUserId** | Pointer to **string** |  | [optional] [readonly] 
**ConnectedAdvertiserId** | Pointer to **string** |  | [optional] [readonly] 
**ConnectedLbaId** | Pointer to **string** |  | [optional] 
**ConnectedTagId** | Pointer to **string** |  | [optional] 
**PartnerAccessTokenExpiry** | Pointer to **float32** |  | [optional] 
**PartnerRefreshTokenExpiry** | Pointer to **float32** |  | [optional] 
**Scopes** | Pointer to **string** |  | [optional] 
**CreatedTimestamp** | Pointer to **float32** |  | [optional] 
**UpdatedTimestamp** | Pointer to **float32** |  | [optional] 
**AdditionalId1** | Pointer to **string** |  | [optional] 
**PartnerMetadata** | Pointer to **string** |  | [optional] 

## Methods

### NewIntegrationMetadata

`func NewIntegrationMetadata() *IntegrationMetadata`

NewIntegrationMetadata instantiates a new IntegrationMetadata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIntegrationMetadataWithDefaults

`func NewIntegrationMetadataWithDefaults() *IntegrationMetadata`

NewIntegrationMetadataWithDefaults instantiates a new IntegrationMetadata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *IntegrationMetadata) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *IntegrationMetadata) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *IntegrationMetadata) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *IntegrationMetadata) HasId() bool`

HasId returns a boolean if a field has been set.

### GetExternalBusinessId

`func (o *IntegrationMetadata) GetExternalBusinessId() string`

GetExternalBusinessId returns the ExternalBusinessId field if non-nil, zero value otherwise.

### GetExternalBusinessIdOk

`func (o *IntegrationMetadata) GetExternalBusinessIdOk() (*string, bool)`

GetExternalBusinessIdOk returns a tuple with the ExternalBusinessId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalBusinessId

`func (o *IntegrationMetadata) SetExternalBusinessId(v string)`

SetExternalBusinessId sets ExternalBusinessId field to given value.

### HasExternalBusinessId

`func (o *IntegrationMetadata) HasExternalBusinessId() bool`

HasExternalBusinessId returns a boolean if a field has been set.

### GetConnectedMerchantId

`func (o *IntegrationMetadata) GetConnectedMerchantId() string`

GetConnectedMerchantId returns the ConnectedMerchantId field if non-nil, zero value otherwise.

### GetConnectedMerchantIdOk

`func (o *IntegrationMetadata) GetConnectedMerchantIdOk() (*string, bool)`

GetConnectedMerchantIdOk returns a tuple with the ConnectedMerchantId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedMerchantId

`func (o *IntegrationMetadata) SetConnectedMerchantId(v string)`

SetConnectedMerchantId sets ConnectedMerchantId field to given value.

### HasConnectedMerchantId

`func (o *IntegrationMetadata) HasConnectedMerchantId() bool`

HasConnectedMerchantId returns a boolean if a field has been set.

### GetConnectedUserId

`func (o *IntegrationMetadata) GetConnectedUserId() string`

GetConnectedUserId returns the ConnectedUserId field if non-nil, zero value otherwise.

### GetConnectedUserIdOk

`func (o *IntegrationMetadata) GetConnectedUserIdOk() (*string, bool)`

GetConnectedUserIdOk returns a tuple with the ConnectedUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedUserId

`func (o *IntegrationMetadata) SetConnectedUserId(v string)`

SetConnectedUserId sets ConnectedUserId field to given value.

### HasConnectedUserId

`func (o *IntegrationMetadata) HasConnectedUserId() bool`

HasConnectedUserId returns a boolean if a field has been set.

### GetConnectedAdvertiserId

`func (o *IntegrationMetadata) GetConnectedAdvertiserId() string`

GetConnectedAdvertiserId returns the ConnectedAdvertiserId field if non-nil, zero value otherwise.

### GetConnectedAdvertiserIdOk

`func (o *IntegrationMetadata) GetConnectedAdvertiserIdOk() (*string, bool)`

GetConnectedAdvertiserIdOk returns a tuple with the ConnectedAdvertiserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedAdvertiserId

`func (o *IntegrationMetadata) SetConnectedAdvertiserId(v string)`

SetConnectedAdvertiserId sets ConnectedAdvertiserId field to given value.

### HasConnectedAdvertiserId

`func (o *IntegrationMetadata) HasConnectedAdvertiserId() bool`

HasConnectedAdvertiserId returns a boolean if a field has been set.

### GetConnectedLbaId

`func (o *IntegrationMetadata) GetConnectedLbaId() string`

GetConnectedLbaId returns the ConnectedLbaId field if non-nil, zero value otherwise.

### GetConnectedLbaIdOk

`func (o *IntegrationMetadata) GetConnectedLbaIdOk() (*string, bool)`

GetConnectedLbaIdOk returns a tuple with the ConnectedLbaId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedLbaId

`func (o *IntegrationMetadata) SetConnectedLbaId(v string)`

SetConnectedLbaId sets ConnectedLbaId field to given value.

### HasConnectedLbaId

`func (o *IntegrationMetadata) HasConnectedLbaId() bool`

HasConnectedLbaId returns a boolean if a field has been set.

### GetConnectedTagId

`func (o *IntegrationMetadata) GetConnectedTagId() string`

GetConnectedTagId returns the ConnectedTagId field if non-nil, zero value otherwise.

### GetConnectedTagIdOk

`func (o *IntegrationMetadata) GetConnectedTagIdOk() (*string, bool)`

GetConnectedTagIdOk returns a tuple with the ConnectedTagId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedTagId

`func (o *IntegrationMetadata) SetConnectedTagId(v string)`

SetConnectedTagId sets ConnectedTagId field to given value.

### HasConnectedTagId

`func (o *IntegrationMetadata) HasConnectedTagId() bool`

HasConnectedTagId returns a boolean if a field has been set.

### GetPartnerAccessTokenExpiry

`func (o *IntegrationMetadata) GetPartnerAccessTokenExpiry() float32`

GetPartnerAccessTokenExpiry returns the PartnerAccessTokenExpiry field if non-nil, zero value otherwise.

### GetPartnerAccessTokenExpiryOk

`func (o *IntegrationMetadata) GetPartnerAccessTokenExpiryOk() (*float32, bool)`

GetPartnerAccessTokenExpiryOk returns a tuple with the PartnerAccessTokenExpiry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerAccessTokenExpiry

`func (o *IntegrationMetadata) SetPartnerAccessTokenExpiry(v float32)`

SetPartnerAccessTokenExpiry sets PartnerAccessTokenExpiry field to given value.

### HasPartnerAccessTokenExpiry

`func (o *IntegrationMetadata) HasPartnerAccessTokenExpiry() bool`

HasPartnerAccessTokenExpiry returns a boolean if a field has been set.

### GetPartnerRefreshTokenExpiry

`func (o *IntegrationMetadata) GetPartnerRefreshTokenExpiry() float32`

GetPartnerRefreshTokenExpiry returns the PartnerRefreshTokenExpiry field if non-nil, zero value otherwise.

### GetPartnerRefreshTokenExpiryOk

`func (o *IntegrationMetadata) GetPartnerRefreshTokenExpiryOk() (*float32, bool)`

GetPartnerRefreshTokenExpiryOk returns a tuple with the PartnerRefreshTokenExpiry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerRefreshTokenExpiry

`func (o *IntegrationMetadata) SetPartnerRefreshTokenExpiry(v float32)`

SetPartnerRefreshTokenExpiry sets PartnerRefreshTokenExpiry field to given value.

### HasPartnerRefreshTokenExpiry

`func (o *IntegrationMetadata) HasPartnerRefreshTokenExpiry() bool`

HasPartnerRefreshTokenExpiry returns a boolean if a field has been set.

### GetScopes

`func (o *IntegrationMetadata) GetScopes() string`

GetScopes returns the Scopes field if non-nil, zero value otherwise.

### GetScopesOk

`func (o *IntegrationMetadata) GetScopesOk() (*string, bool)`

GetScopesOk returns a tuple with the Scopes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScopes

`func (o *IntegrationMetadata) SetScopes(v string)`

SetScopes sets Scopes field to given value.

### HasScopes

`func (o *IntegrationMetadata) HasScopes() bool`

HasScopes returns a boolean if a field has been set.

### GetCreatedTimestamp

`func (o *IntegrationMetadata) GetCreatedTimestamp() float32`

GetCreatedTimestamp returns the CreatedTimestamp field if non-nil, zero value otherwise.

### GetCreatedTimestampOk

`func (o *IntegrationMetadata) GetCreatedTimestampOk() (*float32, bool)`

GetCreatedTimestampOk returns a tuple with the CreatedTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTimestamp

`func (o *IntegrationMetadata) SetCreatedTimestamp(v float32)`

SetCreatedTimestamp sets CreatedTimestamp field to given value.

### HasCreatedTimestamp

`func (o *IntegrationMetadata) HasCreatedTimestamp() bool`

HasCreatedTimestamp returns a boolean if a field has been set.

### GetUpdatedTimestamp

`func (o *IntegrationMetadata) GetUpdatedTimestamp() float32`

GetUpdatedTimestamp returns the UpdatedTimestamp field if non-nil, zero value otherwise.

### GetUpdatedTimestampOk

`func (o *IntegrationMetadata) GetUpdatedTimestampOk() (*float32, bool)`

GetUpdatedTimestampOk returns a tuple with the UpdatedTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTimestamp

`func (o *IntegrationMetadata) SetUpdatedTimestamp(v float32)`

SetUpdatedTimestamp sets UpdatedTimestamp field to given value.

### HasUpdatedTimestamp

`func (o *IntegrationMetadata) HasUpdatedTimestamp() bool`

HasUpdatedTimestamp returns a boolean if a field has been set.

### GetAdditionalId1

`func (o *IntegrationMetadata) GetAdditionalId1() string`

GetAdditionalId1 returns the AdditionalId1 field if non-nil, zero value otherwise.

### GetAdditionalId1Ok

`func (o *IntegrationMetadata) GetAdditionalId1Ok() (*string, bool)`

GetAdditionalId1Ok returns a tuple with the AdditionalId1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalId1

`func (o *IntegrationMetadata) SetAdditionalId1(v string)`

SetAdditionalId1 sets AdditionalId1 field to given value.

### HasAdditionalId1

`func (o *IntegrationMetadata) HasAdditionalId1() bool`

HasAdditionalId1 returns a boolean if a field has been set.

### GetPartnerMetadata

`func (o *IntegrationMetadata) GetPartnerMetadata() string`

GetPartnerMetadata returns the PartnerMetadata field if non-nil, zero value otherwise.

### GetPartnerMetadataOk

`func (o *IntegrationMetadata) GetPartnerMetadataOk() (*string, bool)`

GetPartnerMetadataOk returns a tuple with the PartnerMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerMetadata

`func (o *IntegrationMetadata) SetPartnerMetadata(v string)`

SetPartnerMetadata sets PartnerMetadata field to given value.

### HasPartnerMetadata

`func (o *IntegrationMetadata) HasPartnerMetadata() bool`

HasPartnerMetadata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


