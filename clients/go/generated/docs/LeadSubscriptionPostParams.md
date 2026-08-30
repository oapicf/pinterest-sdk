# LeadSubscriptionPostParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | The Ad Account ID that this lead form belongs to. | [optional] 
**ApiVersion** | Pointer to **string** | API version. | [optional] 
**CreatedTime** | Pointer to **int32** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 
**CryptographicAlgorithm** | Pointer to **NullableString** | Lead data encryption algorithm. | [optional] 
**CryptographicKey** | Pointer to **NullableString** | Base64 encoded key for client to decrypt lead data. | [optional] 
**Id** | Pointer to **string** | Subscription ID. | [optional] 
**LeadFormId** | Pointer to **NullableString** | Lead form ID. | [optional] 
**UserAccountId** | Pointer to **string** | User account used to subscribe lead data. | [optional] 
**WebhookUrl** | Pointer to **string** | Standard HTTPS webhook URL. | [optional] 
**PartnerAccessToken** | Pointer to **string** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**PartnerMetadata** | Pointer to [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] 
**PartnerRefreshToken** | Pointer to **string** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 

## Methods

### NewLeadSubscriptionPostParams

`func NewLeadSubscriptionPostParams() *LeadSubscriptionPostParams`

NewLeadSubscriptionPostParams instantiates a new LeadSubscriptionPostParams object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadSubscriptionPostParamsWithDefaults

`func NewLeadSubscriptionPostParamsWithDefaults() *LeadSubscriptionPostParams`

NewLeadSubscriptionPostParamsWithDefaults instantiates a new LeadSubscriptionPostParams object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *LeadSubscriptionPostParams) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *LeadSubscriptionPostParams) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *LeadSubscriptionPostParams) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *LeadSubscriptionPostParams) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetApiVersion

`func (o *LeadSubscriptionPostParams) GetApiVersion() string`

GetApiVersion returns the ApiVersion field if non-nil, zero value otherwise.

### GetApiVersionOk

`func (o *LeadSubscriptionPostParams) GetApiVersionOk() (*string, bool)`

GetApiVersionOk returns a tuple with the ApiVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiVersion

`func (o *LeadSubscriptionPostParams) SetApiVersion(v string)`

SetApiVersion sets ApiVersion field to given value.

### HasApiVersion

`func (o *LeadSubscriptionPostParams) HasApiVersion() bool`

HasApiVersion returns a boolean if a field has been set.

### GetCreatedTime

`func (o *LeadSubscriptionPostParams) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *LeadSubscriptionPostParams) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *LeadSubscriptionPostParams) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *LeadSubscriptionPostParams) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetCryptographicAlgorithm

`func (o *LeadSubscriptionPostParams) GetCryptographicAlgorithm() string`

GetCryptographicAlgorithm returns the CryptographicAlgorithm field if non-nil, zero value otherwise.

### GetCryptographicAlgorithmOk

`func (o *LeadSubscriptionPostParams) GetCryptographicAlgorithmOk() (*string, bool)`

GetCryptographicAlgorithmOk returns a tuple with the CryptographicAlgorithm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptographicAlgorithm

`func (o *LeadSubscriptionPostParams) SetCryptographicAlgorithm(v string)`

SetCryptographicAlgorithm sets CryptographicAlgorithm field to given value.

### HasCryptographicAlgorithm

`func (o *LeadSubscriptionPostParams) HasCryptographicAlgorithm() bool`

HasCryptographicAlgorithm returns a boolean if a field has been set.

### SetCryptographicAlgorithmNil

`func (o *LeadSubscriptionPostParams) SetCryptographicAlgorithmNil(b bool)`

 SetCryptographicAlgorithmNil sets the value for CryptographicAlgorithm to be an explicit nil

### UnsetCryptographicAlgorithm
`func (o *LeadSubscriptionPostParams) UnsetCryptographicAlgorithm()`

UnsetCryptographicAlgorithm ensures that no value is present for CryptographicAlgorithm, not even an explicit nil
### GetCryptographicKey

`func (o *LeadSubscriptionPostParams) GetCryptographicKey() string`

GetCryptographicKey returns the CryptographicKey field if non-nil, zero value otherwise.

### GetCryptographicKeyOk

`func (o *LeadSubscriptionPostParams) GetCryptographicKeyOk() (*string, bool)`

GetCryptographicKeyOk returns a tuple with the CryptographicKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptographicKey

`func (o *LeadSubscriptionPostParams) SetCryptographicKey(v string)`

SetCryptographicKey sets CryptographicKey field to given value.

### HasCryptographicKey

`func (o *LeadSubscriptionPostParams) HasCryptographicKey() bool`

HasCryptographicKey returns a boolean if a field has been set.

### SetCryptographicKeyNil

`func (o *LeadSubscriptionPostParams) SetCryptographicKeyNil(b bool)`

 SetCryptographicKeyNil sets the value for CryptographicKey to be an explicit nil

### UnsetCryptographicKey
`func (o *LeadSubscriptionPostParams) UnsetCryptographicKey()`

UnsetCryptographicKey ensures that no value is present for CryptographicKey, not even an explicit nil
### GetId

`func (o *LeadSubscriptionPostParams) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LeadSubscriptionPostParams) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LeadSubscriptionPostParams) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *LeadSubscriptionPostParams) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLeadFormId

`func (o *LeadSubscriptionPostParams) GetLeadFormId() string`

GetLeadFormId returns the LeadFormId field if non-nil, zero value otherwise.

### GetLeadFormIdOk

`func (o *LeadSubscriptionPostParams) GetLeadFormIdOk() (*string, bool)`

GetLeadFormIdOk returns a tuple with the LeadFormId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadFormId

`func (o *LeadSubscriptionPostParams) SetLeadFormId(v string)`

SetLeadFormId sets LeadFormId field to given value.

### HasLeadFormId

`func (o *LeadSubscriptionPostParams) HasLeadFormId() bool`

HasLeadFormId returns a boolean if a field has been set.

### SetLeadFormIdNil

`func (o *LeadSubscriptionPostParams) SetLeadFormIdNil(b bool)`

 SetLeadFormIdNil sets the value for LeadFormId to be an explicit nil

### UnsetLeadFormId
`func (o *LeadSubscriptionPostParams) UnsetLeadFormId()`

UnsetLeadFormId ensures that no value is present for LeadFormId, not even an explicit nil
### GetUserAccountId

`func (o *LeadSubscriptionPostParams) GetUserAccountId() string`

GetUserAccountId returns the UserAccountId field if non-nil, zero value otherwise.

### GetUserAccountIdOk

`func (o *LeadSubscriptionPostParams) GetUserAccountIdOk() (*string, bool)`

GetUserAccountIdOk returns a tuple with the UserAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserAccountId

`func (o *LeadSubscriptionPostParams) SetUserAccountId(v string)`

SetUserAccountId sets UserAccountId field to given value.

### HasUserAccountId

`func (o *LeadSubscriptionPostParams) HasUserAccountId() bool`

HasUserAccountId returns a boolean if a field has been set.

### GetWebhookUrl

`func (o *LeadSubscriptionPostParams) GetWebhookUrl() string`

GetWebhookUrl returns the WebhookUrl field if non-nil, zero value otherwise.

### GetWebhookUrlOk

`func (o *LeadSubscriptionPostParams) GetWebhookUrlOk() (*string, bool)`

GetWebhookUrlOk returns a tuple with the WebhookUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebhookUrl

`func (o *LeadSubscriptionPostParams) SetWebhookUrl(v string)`

SetWebhookUrl sets WebhookUrl field to given value.

### HasWebhookUrl

`func (o *LeadSubscriptionPostParams) HasWebhookUrl() bool`

HasWebhookUrl returns a boolean if a field has been set.

### GetPartnerAccessToken

`func (o *LeadSubscriptionPostParams) GetPartnerAccessToken() string`

GetPartnerAccessToken returns the PartnerAccessToken field if non-nil, zero value otherwise.

### GetPartnerAccessTokenOk

`func (o *LeadSubscriptionPostParams) GetPartnerAccessTokenOk() (*string, bool)`

GetPartnerAccessTokenOk returns a tuple with the PartnerAccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerAccessToken

`func (o *LeadSubscriptionPostParams) SetPartnerAccessToken(v string)`

SetPartnerAccessToken sets PartnerAccessToken field to given value.

### HasPartnerAccessToken

`func (o *LeadSubscriptionPostParams) HasPartnerAccessToken() bool`

HasPartnerAccessToken returns a boolean if a field has been set.

### GetPartnerMetadata

`func (o *LeadSubscriptionPostParams) GetPartnerMetadata() PartnerMetadata`

GetPartnerMetadata returns the PartnerMetadata field if non-nil, zero value otherwise.

### GetPartnerMetadataOk

`func (o *LeadSubscriptionPostParams) GetPartnerMetadataOk() (*PartnerMetadata, bool)`

GetPartnerMetadataOk returns a tuple with the PartnerMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerMetadata

`func (o *LeadSubscriptionPostParams) SetPartnerMetadata(v PartnerMetadata)`

SetPartnerMetadata sets PartnerMetadata field to given value.

### HasPartnerMetadata

`func (o *LeadSubscriptionPostParams) HasPartnerMetadata() bool`

HasPartnerMetadata returns a boolean if a field has been set.

### GetPartnerRefreshToken

`func (o *LeadSubscriptionPostParams) GetPartnerRefreshToken() string`

GetPartnerRefreshToken returns the PartnerRefreshToken field if non-nil, zero value otherwise.

### GetPartnerRefreshTokenOk

`func (o *LeadSubscriptionPostParams) GetPartnerRefreshTokenOk() (*string, bool)`

GetPartnerRefreshTokenOk returns a tuple with the PartnerRefreshToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerRefreshToken

`func (o *LeadSubscriptionPostParams) SetPartnerRefreshToken(v string)`

SetPartnerRefreshToken sets PartnerRefreshToken field to given value.

### HasPartnerRefreshToken

`func (o *LeadSubscriptionPostParams) HasPartnerRefreshToken() bool`

HasPartnerRefreshToken returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


