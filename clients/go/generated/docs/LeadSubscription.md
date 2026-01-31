# LeadSubscription

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

## Methods

### NewLeadSubscription

`func NewLeadSubscription() *LeadSubscription`

NewLeadSubscription instantiates a new LeadSubscription object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadSubscriptionWithDefaults

`func NewLeadSubscriptionWithDefaults() *LeadSubscription`

NewLeadSubscriptionWithDefaults instantiates a new LeadSubscription object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *LeadSubscription) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *LeadSubscription) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *LeadSubscription) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *LeadSubscription) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetApiVersion

`func (o *LeadSubscription) GetApiVersion() string`

GetApiVersion returns the ApiVersion field if non-nil, zero value otherwise.

### GetApiVersionOk

`func (o *LeadSubscription) GetApiVersionOk() (*string, bool)`

GetApiVersionOk returns a tuple with the ApiVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiVersion

`func (o *LeadSubscription) SetApiVersion(v string)`

SetApiVersion sets ApiVersion field to given value.

### HasApiVersion

`func (o *LeadSubscription) HasApiVersion() bool`

HasApiVersion returns a boolean if a field has been set.

### GetCreatedTime

`func (o *LeadSubscription) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *LeadSubscription) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *LeadSubscription) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *LeadSubscription) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetCryptographicAlgorithm

`func (o *LeadSubscription) GetCryptographicAlgorithm() string`

GetCryptographicAlgorithm returns the CryptographicAlgorithm field if non-nil, zero value otherwise.

### GetCryptographicAlgorithmOk

`func (o *LeadSubscription) GetCryptographicAlgorithmOk() (*string, bool)`

GetCryptographicAlgorithmOk returns a tuple with the CryptographicAlgorithm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptographicAlgorithm

`func (o *LeadSubscription) SetCryptographicAlgorithm(v string)`

SetCryptographicAlgorithm sets CryptographicAlgorithm field to given value.

### HasCryptographicAlgorithm

`func (o *LeadSubscription) HasCryptographicAlgorithm() bool`

HasCryptographicAlgorithm returns a boolean if a field has been set.

### SetCryptographicAlgorithmNil

`func (o *LeadSubscription) SetCryptographicAlgorithmNil(b bool)`

 SetCryptographicAlgorithmNil sets the value for CryptographicAlgorithm to be an explicit nil

### UnsetCryptographicAlgorithm
`func (o *LeadSubscription) UnsetCryptographicAlgorithm()`

UnsetCryptographicAlgorithm ensures that no value is present for CryptographicAlgorithm, not even an explicit nil
### GetCryptographicKey

`func (o *LeadSubscription) GetCryptographicKey() string`

GetCryptographicKey returns the CryptographicKey field if non-nil, zero value otherwise.

### GetCryptographicKeyOk

`func (o *LeadSubscription) GetCryptographicKeyOk() (*string, bool)`

GetCryptographicKeyOk returns a tuple with the CryptographicKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptographicKey

`func (o *LeadSubscription) SetCryptographicKey(v string)`

SetCryptographicKey sets CryptographicKey field to given value.

### HasCryptographicKey

`func (o *LeadSubscription) HasCryptographicKey() bool`

HasCryptographicKey returns a boolean if a field has been set.

### SetCryptographicKeyNil

`func (o *LeadSubscription) SetCryptographicKeyNil(b bool)`

 SetCryptographicKeyNil sets the value for CryptographicKey to be an explicit nil

### UnsetCryptographicKey
`func (o *LeadSubscription) UnsetCryptographicKey()`

UnsetCryptographicKey ensures that no value is present for CryptographicKey, not even an explicit nil
### GetId

`func (o *LeadSubscription) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LeadSubscription) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LeadSubscription) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *LeadSubscription) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLeadFormId

`func (o *LeadSubscription) GetLeadFormId() string`

GetLeadFormId returns the LeadFormId field if non-nil, zero value otherwise.

### GetLeadFormIdOk

`func (o *LeadSubscription) GetLeadFormIdOk() (*string, bool)`

GetLeadFormIdOk returns a tuple with the LeadFormId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadFormId

`func (o *LeadSubscription) SetLeadFormId(v string)`

SetLeadFormId sets LeadFormId field to given value.

### HasLeadFormId

`func (o *LeadSubscription) HasLeadFormId() bool`

HasLeadFormId returns a boolean if a field has been set.

### SetLeadFormIdNil

`func (o *LeadSubscription) SetLeadFormIdNil(b bool)`

 SetLeadFormIdNil sets the value for LeadFormId to be an explicit nil

### UnsetLeadFormId
`func (o *LeadSubscription) UnsetLeadFormId()`

UnsetLeadFormId ensures that no value is present for LeadFormId, not even an explicit nil
### GetUserAccountId

`func (o *LeadSubscription) GetUserAccountId() string`

GetUserAccountId returns the UserAccountId field if non-nil, zero value otherwise.

### GetUserAccountIdOk

`func (o *LeadSubscription) GetUserAccountIdOk() (*string, bool)`

GetUserAccountIdOk returns a tuple with the UserAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserAccountId

`func (o *LeadSubscription) SetUserAccountId(v string)`

SetUserAccountId sets UserAccountId field to given value.

### HasUserAccountId

`func (o *LeadSubscription) HasUserAccountId() bool`

HasUserAccountId returns a boolean if a field has been set.

### GetWebhookUrl

`func (o *LeadSubscription) GetWebhookUrl() string`

GetWebhookUrl returns the WebhookUrl field if non-nil, zero value otherwise.

### GetWebhookUrlOk

`func (o *LeadSubscription) GetWebhookUrlOk() (*string, bool)`

GetWebhookUrlOk returns a tuple with the WebhookUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebhookUrl

`func (o *LeadSubscription) SetWebhookUrl(v string)`

SetWebhookUrl sets WebhookUrl field to given value.

### HasWebhookUrl

`func (o *LeadSubscription) HasWebhookUrl() bool`

HasWebhookUrl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


