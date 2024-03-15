# IntegrationRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** |  | [optional] 
**ExternalBusinessId** | Pointer to **NullableString** |  | [optional] 
**ConnectedMerchantId** | Pointer to **NullableString** |  | [optional] 
**ConnectedUserId** | Pointer to **string** |  | [optional] [readonly] 
**ConnectedAdvertiserId** | Pointer to **NullableString** |  | [optional] [readonly] 
**ConnectedLbaId** | Pointer to **NullableString** |  | [optional] 
**ConnectedTagId** | Pointer to **NullableString** |  | [optional] 
**PartnerAccessToken** | Pointer to **NullableString** |  | [optional] 
**PartnerRefreshToken** | Pointer to **NullableString** |  | [optional] 
**PartnerPrimaryEmail** | Pointer to **NullableString** |  | [optional] 
**PartnerAccessTokenExpiry** | Pointer to **NullableInt32** |  | [optional] 
**PartnerRefreshTokenExpiry** | Pointer to **NullableInt32** |  | [optional] 
**Scopes** | Pointer to **NullableString** |  | [optional] 
**PartnerMetadata** | Pointer to **NullableString** |  | [optional] 
**AdditionalId1** | Pointer to **NullableString** |  | [optional] 
**CreatedTime** | Pointer to **int32** |  | [optional] 
**UpdatedTime** | Pointer to **int32** |  | [optional] 

## Methods

### NewIntegrationRecord

`func NewIntegrationRecord() *IntegrationRecord`

NewIntegrationRecord instantiates a new IntegrationRecord object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIntegrationRecordWithDefaults

`func NewIntegrationRecordWithDefaults() *IntegrationRecord`

NewIntegrationRecordWithDefaults instantiates a new IntegrationRecord object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *IntegrationRecord) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *IntegrationRecord) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *IntegrationRecord) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *IntegrationRecord) HasId() bool`

HasId returns a boolean if a field has been set.

### GetExternalBusinessId

`func (o *IntegrationRecord) GetExternalBusinessId() string`

GetExternalBusinessId returns the ExternalBusinessId field if non-nil, zero value otherwise.

### GetExternalBusinessIdOk

`func (o *IntegrationRecord) GetExternalBusinessIdOk() (*string, bool)`

GetExternalBusinessIdOk returns a tuple with the ExternalBusinessId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalBusinessId

`func (o *IntegrationRecord) SetExternalBusinessId(v string)`

SetExternalBusinessId sets ExternalBusinessId field to given value.

### HasExternalBusinessId

`func (o *IntegrationRecord) HasExternalBusinessId() bool`

HasExternalBusinessId returns a boolean if a field has been set.

### SetExternalBusinessIdNil

`func (o *IntegrationRecord) SetExternalBusinessIdNil(b bool)`

 SetExternalBusinessIdNil sets the value for ExternalBusinessId to be an explicit nil

### UnsetExternalBusinessId
`func (o *IntegrationRecord) UnsetExternalBusinessId()`

UnsetExternalBusinessId ensures that no value is present for ExternalBusinessId, not even an explicit nil
### GetConnectedMerchantId

`func (o *IntegrationRecord) GetConnectedMerchantId() string`

GetConnectedMerchantId returns the ConnectedMerchantId field if non-nil, zero value otherwise.

### GetConnectedMerchantIdOk

`func (o *IntegrationRecord) GetConnectedMerchantIdOk() (*string, bool)`

GetConnectedMerchantIdOk returns a tuple with the ConnectedMerchantId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedMerchantId

`func (o *IntegrationRecord) SetConnectedMerchantId(v string)`

SetConnectedMerchantId sets ConnectedMerchantId field to given value.

### HasConnectedMerchantId

`func (o *IntegrationRecord) HasConnectedMerchantId() bool`

HasConnectedMerchantId returns a boolean if a field has been set.

### SetConnectedMerchantIdNil

`func (o *IntegrationRecord) SetConnectedMerchantIdNil(b bool)`

 SetConnectedMerchantIdNil sets the value for ConnectedMerchantId to be an explicit nil

### UnsetConnectedMerchantId
`func (o *IntegrationRecord) UnsetConnectedMerchantId()`

UnsetConnectedMerchantId ensures that no value is present for ConnectedMerchantId, not even an explicit nil
### GetConnectedUserId

`func (o *IntegrationRecord) GetConnectedUserId() string`

GetConnectedUserId returns the ConnectedUserId field if non-nil, zero value otherwise.

### GetConnectedUserIdOk

`func (o *IntegrationRecord) GetConnectedUserIdOk() (*string, bool)`

GetConnectedUserIdOk returns a tuple with the ConnectedUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedUserId

`func (o *IntegrationRecord) SetConnectedUserId(v string)`

SetConnectedUserId sets ConnectedUserId field to given value.

### HasConnectedUserId

`func (o *IntegrationRecord) HasConnectedUserId() bool`

HasConnectedUserId returns a boolean if a field has been set.

### GetConnectedAdvertiserId

`func (o *IntegrationRecord) GetConnectedAdvertiserId() string`

GetConnectedAdvertiserId returns the ConnectedAdvertiserId field if non-nil, zero value otherwise.

### GetConnectedAdvertiserIdOk

`func (o *IntegrationRecord) GetConnectedAdvertiserIdOk() (*string, bool)`

GetConnectedAdvertiserIdOk returns a tuple with the ConnectedAdvertiserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedAdvertiserId

`func (o *IntegrationRecord) SetConnectedAdvertiserId(v string)`

SetConnectedAdvertiserId sets ConnectedAdvertiserId field to given value.

### HasConnectedAdvertiserId

`func (o *IntegrationRecord) HasConnectedAdvertiserId() bool`

HasConnectedAdvertiserId returns a boolean if a field has been set.

### SetConnectedAdvertiserIdNil

`func (o *IntegrationRecord) SetConnectedAdvertiserIdNil(b bool)`

 SetConnectedAdvertiserIdNil sets the value for ConnectedAdvertiserId to be an explicit nil

### UnsetConnectedAdvertiserId
`func (o *IntegrationRecord) UnsetConnectedAdvertiserId()`

UnsetConnectedAdvertiserId ensures that no value is present for ConnectedAdvertiserId, not even an explicit nil
### GetConnectedLbaId

`func (o *IntegrationRecord) GetConnectedLbaId() string`

GetConnectedLbaId returns the ConnectedLbaId field if non-nil, zero value otherwise.

### GetConnectedLbaIdOk

`func (o *IntegrationRecord) GetConnectedLbaIdOk() (*string, bool)`

GetConnectedLbaIdOk returns a tuple with the ConnectedLbaId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedLbaId

`func (o *IntegrationRecord) SetConnectedLbaId(v string)`

SetConnectedLbaId sets ConnectedLbaId field to given value.

### HasConnectedLbaId

`func (o *IntegrationRecord) HasConnectedLbaId() bool`

HasConnectedLbaId returns a boolean if a field has been set.

### SetConnectedLbaIdNil

`func (o *IntegrationRecord) SetConnectedLbaIdNil(b bool)`

 SetConnectedLbaIdNil sets the value for ConnectedLbaId to be an explicit nil

### UnsetConnectedLbaId
`func (o *IntegrationRecord) UnsetConnectedLbaId()`

UnsetConnectedLbaId ensures that no value is present for ConnectedLbaId, not even an explicit nil
### GetConnectedTagId

`func (o *IntegrationRecord) GetConnectedTagId() string`

GetConnectedTagId returns the ConnectedTagId field if non-nil, zero value otherwise.

### GetConnectedTagIdOk

`func (o *IntegrationRecord) GetConnectedTagIdOk() (*string, bool)`

GetConnectedTagIdOk returns a tuple with the ConnectedTagId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedTagId

`func (o *IntegrationRecord) SetConnectedTagId(v string)`

SetConnectedTagId sets ConnectedTagId field to given value.

### HasConnectedTagId

`func (o *IntegrationRecord) HasConnectedTagId() bool`

HasConnectedTagId returns a boolean if a field has been set.

### SetConnectedTagIdNil

`func (o *IntegrationRecord) SetConnectedTagIdNil(b bool)`

 SetConnectedTagIdNil sets the value for ConnectedTagId to be an explicit nil

### UnsetConnectedTagId
`func (o *IntegrationRecord) UnsetConnectedTagId()`

UnsetConnectedTagId ensures that no value is present for ConnectedTagId, not even an explicit nil
### GetPartnerAccessToken

`func (o *IntegrationRecord) GetPartnerAccessToken() string`

GetPartnerAccessToken returns the PartnerAccessToken field if non-nil, zero value otherwise.

### GetPartnerAccessTokenOk

`func (o *IntegrationRecord) GetPartnerAccessTokenOk() (*string, bool)`

GetPartnerAccessTokenOk returns a tuple with the PartnerAccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerAccessToken

`func (o *IntegrationRecord) SetPartnerAccessToken(v string)`

SetPartnerAccessToken sets PartnerAccessToken field to given value.

### HasPartnerAccessToken

`func (o *IntegrationRecord) HasPartnerAccessToken() bool`

HasPartnerAccessToken returns a boolean if a field has been set.

### SetPartnerAccessTokenNil

`func (o *IntegrationRecord) SetPartnerAccessTokenNil(b bool)`

 SetPartnerAccessTokenNil sets the value for PartnerAccessToken to be an explicit nil

### UnsetPartnerAccessToken
`func (o *IntegrationRecord) UnsetPartnerAccessToken()`

UnsetPartnerAccessToken ensures that no value is present for PartnerAccessToken, not even an explicit nil
### GetPartnerRefreshToken

`func (o *IntegrationRecord) GetPartnerRefreshToken() string`

GetPartnerRefreshToken returns the PartnerRefreshToken field if non-nil, zero value otherwise.

### GetPartnerRefreshTokenOk

`func (o *IntegrationRecord) GetPartnerRefreshTokenOk() (*string, bool)`

GetPartnerRefreshTokenOk returns a tuple with the PartnerRefreshToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerRefreshToken

`func (o *IntegrationRecord) SetPartnerRefreshToken(v string)`

SetPartnerRefreshToken sets PartnerRefreshToken field to given value.

### HasPartnerRefreshToken

`func (o *IntegrationRecord) HasPartnerRefreshToken() bool`

HasPartnerRefreshToken returns a boolean if a field has been set.

### SetPartnerRefreshTokenNil

`func (o *IntegrationRecord) SetPartnerRefreshTokenNil(b bool)`

 SetPartnerRefreshTokenNil sets the value for PartnerRefreshToken to be an explicit nil

### UnsetPartnerRefreshToken
`func (o *IntegrationRecord) UnsetPartnerRefreshToken()`

UnsetPartnerRefreshToken ensures that no value is present for PartnerRefreshToken, not even an explicit nil
### GetPartnerPrimaryEmail

`func (o *IntegrationRecord) GetPartnerPrimaryEmail() string`

GetPartnerPrimaryEmail returns the PartnerPrimaryEmail field if non-nil, zero value otherwise.

### GetPartnerPrimaryEmailOk

`func (o *IntegrationRecord) GetPartnerPrimaryEmailOk() (*string, bool)`

GetPartnerPrimaryEmailOk returns a tuple with the PartnerPrimaryEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerPrimaryEmail

`func (o *IntegrationRecord) SetPartnerPrimaryEmail(v string)`

SetPartnerPrimaryEmail sets PartnerPrimaryEmail field to given value.

### HasPartnerPrimaryEmail

`func (o *IntegrationRecord) HasPartnerPrimaryEmail() bool`

HasPartnerPrimaryEmail returns a boolean if a field has been set.

### SetPartnerPrimaryEmailNil

`func (o *IntegrationRecord) SetPartnerPrimaryEmailNil(b bool)`

 SetPartnerPrimaryEmailNil sets the value for PartnerPrimaryEmail to be an explicit nil

### UnsetPartnerPrimaryEmail
`func (o *IntegrationRecord) UnsetPartnerPrimaryEmail()`

UnsetPartnerPrimaryEmail ensures that no value is present for PartnerPrimaryEmail, not even an explicit nil
### GetPartnerAccessTokenExpiry

`func (o *IntegrationRecord) GetPartnerAccessTokenExpiry() int32`

GetPartnerAccessTokenExpiry returns the PartnerAccessTokenExpiry field if non-nil, zero value otherwise.

### GetPartnerAccessTokenExpiryOk

`func (o *IntegrationRecord) GetPartnerAccessTokenExpiryOk() (*int32, bool)`

GetPartnerAccessTokenExpiryOk returns a tuple with the PartnerAccessTokenExpiry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerAccessTokenExpiry

`func (o *IntegrationRecord) SetPartnerAccessTokenExpiry(v int32)`

SetPartnerAccessTokenExpiry sets PartnerAccessTokenExpiry field to given value.

### HasPartnerAccessTokenExpiry

`func (o *IntegrationRecord) HasPartnerAccessTokenExpiry() bool`

HasPartnerAccessTokenExpiry returns a boolean if a field has been set.

### SetPartnerAccessTokenExpiryNil

`func (o *IntegrationRecord) SetPartnerAccessTokenExpiryNil(b bool)`

 SetPartnerAccessTokenExpiryNil sets the value for PartnerAccessTokenExpiry to be an explicit nil

### UnsetPartnerAccessTokenExpiry
`func (o *IntegrationRecord) UnsetPartnerAccessTokenExpiry()`

UnsetPartnerAccessTokenExpiry ensures that no value is present for PartnerAccessTokenExpiry, not even an explicit nil
### GetPartnerRefreshTokenExpiry

`func (o *IntegrationRecord) GetPartnerRefreshTokenExpiry() int32`

GetPartnerRefreshTokenExpiry returns the PartnerRefreshTokenExpiry field if non-nil, zero value otherwise.

### GetPartnerRefreshTokenExpiryOk

`func (o *IntegrationRecord) GetPartnerRefreshTokenExpiryOk() (*int32, bool)`

GetPartnerRefreshTokenExpiryOk returns a tuple with the PartnerRefreshTokenExpiry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerRefreshTokenExpiry

`func (o *IntegrationRecord) SetPartnerRefreshTokenExpiry(v int32)`

SetPartnerRefreshTokenExpiry sets PartnerRefreshTokenExpiry field to given value.

### HasPartnerRefreshTokenExpiry

`func (o *IntegrationRecord) HasPartnerRefreshTokenExpiry() bool`

HasPartnerRefreshTokenExpiry returns a boolean if a field has been set.

### SetPartnerRefreshTokenExpiryNil

`func (o *IntegrationRecord) SetPartnerRefreshTokenExpiryNil(b bool)`

 SetPartnerRefreshTokenExpiryNil sets the value for PartnerRefreshTokenExpiry to be an explicit nil

### UnsetPartnerRefreshTokenExpiry
`func (o *IntegrationRecord) UnsetPartnerRefreshTokenExpiry()`

UnsetPartnerRefreshTokenExpiry ensures that no value is present for PartnerRefreshTokenExpiry, not even an explicit nil
### GetScopes

`func (o *IntegrationRecord) GetScopes() string`

GetScopes returns the Scopes field if non-nil, zero value otherwise.

### GetScopesOk

`func (o *IntegrationRecord) GetScopesOk() (*string, bool)`

GetScopesOk returns a tuple with the Scopes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScopes

`func (o *IntegrationRecord) SetScopes(v string)`

SetScopes sets Scopes field to given value.

### HasScopes

`func (o *IntegrationRecord) HasScopes() bool`

HasScopes returns a boolean if a field has been set.

### SetScopesNil

`func (o *IntegrationRecord) SetScopesNil(b bool)`

 SetScopesNil sets the value for Scopes to be an explicit nil

### UnsetScopes
`func (o *IntegrationRecord) UnsetScopes()`

UnsetScopes ensures that no value is present for Scopes, not even an explicit nil
### GetPartnerMetadata

`func (o *IntegrationRecord) GetPartnerMetadata() string`

GetPartnerMetadata returns the PartnerMetadata field if non-nil, zero value otherwise.

### GetPartnerMetadataOk

`func (o *IntegrationRecord) GetPartnerMetadataOk() (*string, bool)`

GetPartnerMetadataOk returns a tuple with the PartnerMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerMetadata

`func (o *IntegrationRecord) SetPartnerMetadata(v string)`

SetPartnerMetadata sets PartnerMetadata field to given value.

### HasPartnerMetadata

`func (o *IntegrationRecord) HasPartnerMetadata() bool`

HasPartnerMetadata returns a boolean if a field has been set.

### SetPartnerMetadataNil

`func (o *IntegrationRecord) SetPartnerMetadataNil(b bool)`

 SetPartnerMetadataNil sets the value for PartnerMetadata to be an explicit nil

### UnsetPartnerMetadata
`func (o *IntegrationRecord) UnsetPartnerMetadata()`

UnsetPartnerMetadata ensures that no value is present for PartnerMetadata, not even an explicit nil
### GetAdditionalId1

`func (o *IntegrationRecord) GetAdditionalId1() string`

GetAdditionalId1 returns the AdditionalId1 field if non-nil, zero value otherwise.

### GetAdditionalId1Ok

`func (o *IntegrationRecord) GetAdditionalId1Ok() (*string, bool)`

GetAdditionalId1Ok returns a tuple with the AdditionalId1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalId1

`func (o *IntegrationRecord) SetAdditionalId1(v string)`

SetAdditionalId1 sets AdditionalId1 field to given value.

### HasAdditionalId1

`func (o *IntegrationRecord) HasAdditionalId1() bool`

HasAdditionalId1 returns a boolean if a field has been set.

### SetAdditionalId1Nil

`func (o *IntegrationRecord) SetAdditionalId1Nil(b bool)`

 SetAdditionalId1Nil sets the value for AdditionalId1 to be an explicit nil

### UnsetAdditionalId1
`func (o *IntegrationRecord) UnsetAdditionalId1()`

UnsetAdditionalId1 ensures that no value is present for AdditionalId1, not even an explicit nil
### GetCreatedTime

`func (o *IntegrationRecord) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *IntegrationRecord) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *IntegrationRecord) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *IntegrationRecord) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetUpdatedTime

`func (o *IntegrationRecord) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *IntegrationRecord) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *IntegrationRecord) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *IntegrationRecord) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


