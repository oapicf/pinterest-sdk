# AdAccountCreateSubscriptionResponse

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

### NewAdAccountCreateSubscriptionResponse

`func NewAdAccountCreateSubscriptionResponse() *AdAccountCreateSubscriptionResponse`

NewAdAccountCreateSubscriptionResponse instantiates a new AdAccountCreateSubscriptionResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdAccountCreateSubscriptionResponseWithDefaults

`func NewAdAccountCreateSubscriptionResponseWithDefaults() *AdAccountCreateSubscriptionResponse`

NewAdAccountCreateSubscriptionResponseWithDefaults instantiates a new AdAccountCreateSubscriptionResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *AdAccountCreateSubscriptionResponse) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AdAccountCreateSubscriptionResponse) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AdAccountCreateSubscriptionResponse) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AdAccountCreateSubscriptionResponse) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetApiVersion

`func (o *AdAccountCreateSubscriptionResponse) GetApiVersion() string`

GetApiVersion returns the ApiVersion field if non-nil, zero value otherwise.

### GetApiVersionOk

`func (o *AdAccountCreateSubscriptionResponse) GetApiVersionOk() (*string, bool)`

GetApiVersionOk returns a tuple with the ApiVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiVersion

`func (o *AdAccountCreateSubscriptionResponse) SetApiVersion(v string)`

SetApiVersion sets ApiVersion field to given value.

### HasApiVersion

`func (o *AdAccountCreateSubscriptionResponse) HasApiVersion() bool`

HasApiVersion returns a boolean if a field has been set.

### GetCreatedTime

`func (o *AdAccountCreateSubscriptionResponse) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *AdAccountCreateSubscriptionResponse) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *AdAccountCreateSubscriptionResponse) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *AdAccountCreateSubscriptionResponse) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetCryptographicAlgorithm

`func (o *AdAccountCreateSubscriptionResponse) GetCryptographicAlgorithm() string`

GetCryptographicAlgorithm returns the CryptographicAlgorithm field if non-nil, zero value otherwise.

### GetCryptographicAlgorithmOk

`func (o *AdAccountCreateSubscriptionResponse) GetCryptographicAlgorithmOk() (*string, bool)`

GetCryptographicAlgorithmOk returns a tuple with the CryptographicAlgorithm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptographicAlgorithm

`func (o *AdAccountCreateSubscriptionResponse) SetCryptographicAlgorithm(v string)`

SetCryptographicAlgorithm sets CryptographicAlgorithm field to given value.

### HasCryptographicAlgorithm

`func (o *AdAccountCreateSubscriptionResponse) HasCryptographicAlgorithm() bool`

HasCryptographicAlgorithm returns a boolean if a field has been set.

### SetCryptographicAlgorithmNil

`func (o *AdAccountCreateSubscriptionResponse) SetCryptographicAlgorithmNil(b bool)`

 SetCryptographicAlgorithmNil sets the value for CryptographicAlgorithm to be an explicit nil

### UnsetCryptographicAlgorithm
`func (o *AdAccountCreateSubscriptionResponse) UnsetCryptographicAlgorithm()`

UnsetCryptographicAlgorithm ensures that no value is present for CryptographicAlgorithm, not even an explicit nil
### GetCryptographicKey

`func (o *AdAccountCreateSubscriptionResponse) GetCryptographicKey() string`

GetCryptographicKey returns the CryptographicKey field if non-nil, zero value otherwise.

### GetCryptographicKeyOk

`func (o *AdAccountCreateSubscriptionResponse) GetCryptographicKeyOk() (*string, bool)`

GetCryptographicKeyOk returns a tuple with the CryptographicKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCryptographicKey

`func (o *AdAccountCreateSubscriptionResponse) SetCryptographicKey(v string)`

SetCryptographicKey sets CryptographicKey field to given value.

### HasCryptographicKey

`func (o *AdAccountCreateSubscriptionResponse) HasCryptographicKey() bool`

HasCryptographicKey returns a boolean if a field has been set.

### SetCryptographicKeyNil

`func (o *AdAccountCreateSubscriptionResponse) SetCryptographicKeyNil(b bool)`

 SetCryptographicKeyNil sets the value for CryptographicKey to be an explicit nil

### UnsetCryptographicKey
`func (o *AdAccountCreateSubscriptionResponse) UnsetCryptographicKey()`

UnsetCryptographicKey ensures that no value is present for CryptographicKey, not even an explicit nil
### GetId

`func (o *AdAccountCreateSubscriptionResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdAccountCreateSubscriptionResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdAccountCreateSubscriptionResponse) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AdAccountCreateSubscriptionResponse) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLeadFormId

`func (o *AdAccountCreateSubscriptionResponse) GetLeadFormId() string`

GetLeadFormId returns the LeadFormId field if non-nil, zero value otherwise.

### GetLeadFormIdOk

`func (o *AdAccountCreateSubscriptionResponse) GetLeadFormIdOk() (*string, bool)`

GetLeadFormIdOk returns a tuple with the LeadFormId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadFormId

`func (o *AdAccountCreateSubscriptionResponse) SetLeadFormId(v string)`

SetLeadFormId sets LeadFormId field to given value.

### HasLeadFormId

`func (o *AdAccountCreateSubscriptionResponse) HasLeadFormId() bool`

HasLeadFormId returns a boolean if a field has been set.

### SetLeadFormIdNil

`func (o *AdAccountCreateSubscriptionResponse) SetLeadFormIdNil(b bool)`

 SetLeadFormIdNil sets the value for LeadFormId to be an explicit nil

### UnsetLeadFormId
`func (o *AdAccountCreateSubscriptionResponse) UnsetLeadFormId()`

UnsetLeadFormId ensures that no value is present for LeadFormId, not even an explicit nil
### GetUserAccountId

`func (o *AdAccountCreateSubscriptionResponse) GetUserAccountId() string`

GetUserAccountId returns the UserAccountId field if non-nil, zero value otherwise.

### GetUserAccountIdOk

`func (o *AdAccountCreateSubscriptionResponse) GetUserAccountIdOk() (*string, bool)`

GetUserAccountIdOk returns a tuple with the UserAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserAccountId

`func (o *AdAccountCreateSubscriptionResponse) SetUserAccountId(v string)`

SetUserAccountId sets UserAccountId field to given value.

### HasUserAccountId

`func (o *AdAccountCreateSubscriptionResponse) HasUserAccountId() bool`

HasUserAccountId returns a boolean if a field has been set.

### GetWebhookUrl

`func (o *AdAccountCreateSubscriptionResponse) GetWebhookUrl() string`

GetWebhookUrl returns the WebhookUrl field if non-nil, zero value otherwise.

### GetWebhookUrlOk

`func (o *AdAccountCreateSubscriptionResponse) GetWebhookUrlOk() (*string, bool)`

GetWebhookUrlOk returns a tuple with the WebhookUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebhookUrl

`func (o *AdAccountCreateSubscriptionResponse) SetWebhookUrl(v string)`

SetWebhookUrl sets WebhookUrl field to given value.

### HasWebhookUrl

`func (o *AdAccountCreateSubscriptionResponse) HasWebhookUrl() bool`

HasWebhookUrl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


