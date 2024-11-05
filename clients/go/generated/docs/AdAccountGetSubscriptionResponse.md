# AdAccountGetSubscriptionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LeadFormId** | Pointer to **NullableString** | Lead form ID. | [optional] 
**WebhookUrl** | Pointer to **string** | Standard HTTPS webhook URL. | [optional] 
**Id** | Pointer to **string** | Subscription ID. | [optional] 
**UserAccountId** | Pointer to **string** | User account used to subscribe lead data. | [optional] 
**AdAccountId** | Pointer to **string** | The Ad Account ID that this lead form belongs to. | [optional] 
**ApiVersion** | Pointer to **string** | API version. | [optional] 
**CryptographicKey** | Pointer to **NullableString** | Base64 encoded key for client to decrypt lead data. | [optional] 
**CryptographicAlgorithm** | Pointer to **NullableString** | Lead data encryption algorithm. | [optional] 
**CreatedTime** | Pointer to **int32** | Lead form creation time. Unix timestamp in milliseconds. | [optional] 

## Methods

### NewAdAccountGetSubscriptionResponse

`func NewAdAccountGetSubscriptionResponse() *AdAccountGetSubscriptionResponse`

NewAdAccountGetSubscriptionResponse instantiates a new AdAccountGetSubscriptionResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdAccountGetSubscriptionResponseWithDefaults

`func NewAdAccountGetSubscriptionResponseWithDefaults() *AdAccountGetSubscriptionResponse`

NewAdAccountGetSubscriptionResponseWithDefaults instantiates a new AdAccountGetSubscriptionResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLeadFormId

`func (o *AdAccountGetSubscriptionResponse) GetLeadFormId() string`

GetLeadFormId returns the LeadFormId field if non-nil, zero value otherwise.

### GetLeadFormIdOk

`func (o *AdAccountGetSubscriptionResponse) GetLeadFormIdOk() (*string, bool)`

GetLeadFormIdOk returns a tuple with the LeadFormId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadFormId

`func (o *AdAccountGetSubscriptionResponse) SetLeadFormId(v string)`

SetLeadFormId sets LeadFormId field to given value.

### HasLeadFormId

`func (o *AdAccountGetSubscriptionResponse) HasLeadFormId() bool`

HasLeadFormId returns a boolean if a field has been set.

### SetLeadFormIdNil

`func (o *AdAccountGetSubscriptionResponse) SetLeadFormIdNil(b bool)`

 SetLeadFormIdNil sets the value for LeadFormId to be an explicit nil

### UnsetLeadFormId
`func (o *AdAccountGetSubscriptionResponse) UnsetLeadFormId()`

UnsetLeadFormId ensures that no value is present for LeadFormId, not even an explicit nil
### GetWebhookUrl

`func (o *AdAccountGetSubscriptionResponse) GetWebhookUrl() string`

GetWebhookUrl returns the WebhookUrl field if non-nil, zero value otherwise.

### GetWebhookUrlOk

`func (o *AdAccountGetSubscriptionResponse) GetWebhookUrlOk() (*string, bool)`

GetWebhookUrlOk returns a tuple with the WebhookUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebhookUrl

`func (o *AdAccountGetSubscriptionResponse) SetWebhookUrl(v string)`

SetWebhookUrl sets WebhookUrl field to given value.

### HasWebhookUrl

`func (o *AdAccountGetSubscriptionResponse) HasWebhookUrl() bool`

HasWebhookUrl returns a boolean if a field has been set.

### GetId

`func (o *AdAccountGetSubscriptionResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdAccountGetSubscriptionResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdAccountGetSubscriptionResponse) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AdAccountGetSubscriptionResponse) HasId() bool`

HasId returns a boolean if a field has been set.

### GetUserAccountId

`func (o *AdAccountGetSubscriptionResponse) GetUserAccountId() string`

GetUserAccountId returns the UserAccountId field if non-nil, zero value otherwise.

### GetUserAccountIdOk

`func (o *AdAccountGetSubscriptionResponse) GetUserAccountIdOk() (*string, bool)`

GetUserAccountIdOk returns a tuple with the UserAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserAccountId

`func (o *AdAccountGetSubscriptionResponse) SetUserAccountId(v string)`

SetUserAccountId sets UserAccountId field to given value.

### HasUserAccountId

`func (o *AdAccountGetSubscriptionResponse) HasUserAccountId() bool`

HasUserAccountId returns a boolean if a field has been set.

### GetAdAccountId

`func (o *AdAccountGetSubscriptionResponse) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AdAccountGetSubscriptionResponse) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AdAccountGetSubscriptionResponse) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AdAccountGetSubscriptionResponse) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetApiVersion

`func (o *AdAccountGetSubscriptionResponse) GetApiVersion() string`

GetApiVersion returns the ApiVersion field if non-nil, zero value otherwise.

### GetApiVersionOk

`func (o *AdAccountGetSubscriptionResponse) GetApiVersionOk() (*string, bool)`

GetApiVersionOk returns a tuple with the ApiVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiVersion

`func (o *AdAccountGetSubscriptionResponse) SetApiVersion(v string)`

SetApiVersion sets ApiVersion field to given value.

### HasApiVersion

`func (o *AdAccountGetSubscriptionResponse) HasApiVersion() bool`

HasApiVersion returns a boolean if a field has been set.

### GetCryptographicKey

`func (o *AdAccountGetSubscriptionResponse) GetCryptographicKey() string`

GetCryptographicKey returns the CryptographicKey field if non-nil, zero value otherwise.

### GetCryptographicKeyOk

`func (o *AdAccountGetSubscriptionResponse) GetCryptographicKeyOk() (*string, bool)`

GetCryptographicKeyOk returns a tuple with the CryptographicKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptographicKey

`func (o *AdAccountGetSubscriptionResponse) SetCryptographicKey(v string)`

SetCryptographicKey sets CryptographicKey field to given value.

### HasCryptographicKey

`func (o *AdAccountGetSubscriptionResponse) HasCryptographicKey() bool`

HasCryptographicKey returns a boolean if a field has been set.

### SetCryptographicKeyNil

`func (o *AdAccountGetSubscriptionResponse) SetCryptographicKeyNil(b bool)`

 SetCryptographicKeyNil sets the value for CryptographicKey to be an explicit nil

### UnsetCryptographicKey
`func (o *AdAccountGetSubscriptionResponse) UnsetCryptographicKey()`

UnsetCryptographicKey ensures that no value is present for CryptographicKey, not even an explicit nil
### GetCryptographicAlgorithm

`func (o *AdAccountGetSubscriptionResponse) GetCryptographicAlgorithm() string`

GetCryptographicAlgorithm returns the CryptographicAlgorithm field if non-nil, zero value otherwise.

### GetCryptographicAlgorithmOk

`func (o *AdAccountGetSubscriptionResponse) GetCryptographicAlgorithmOk() (*string, bool)`

GetCryptographicAlgorithmOk returns a tuple with the CryptographicAlgorithm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptographicAlgorithm

`func (o *AdAccountGetSubscriptionResponse) SetCryptographicAlgorithm(v string)`

SetCryptographicAlgorithm sets CryptographicAlgorithm field to given value.

### HasCryptographicAlgorithm

`func (o *AdAccountGetSubscriptionResponse) HasCryptographicAlgorithm() bool`

HasCryptographicAlgorithm returns a boolean if a field has been set.

### SetCryptographicAlgorithmNil

`func (o *AdAccountGetSubscriptionResponse) SetCryptographicAlgorithmNil(b bool)`

 SetCryptographicAlgorithmNil sets the value for CryptographicAlgorithm to be an explicit nil

### UnsetCryptographicAlgorithm
`func (o *AdAccountGetSubscriptionResponse) UnsetCryptographicAlgorithm()`

UnsetCryptographicAlgorithm ensures that no value is present for CryptographicAlgorithm, not even an explicit nil
### GetCreatedTime

`func (o *AdAccountGetSubscriptionResponse) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *AdAccountGetSubscriptionResponse) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *AdAccountGetSubscriptionResponse) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *AdAccountGetSubscriptionResponse) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


