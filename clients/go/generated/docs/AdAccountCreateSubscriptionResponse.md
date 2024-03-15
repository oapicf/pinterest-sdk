# AdAccountCreateSubscriptionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Subscription ID. | [optional] 
**CryptographicKey** | Pointer to **string** | Base64 encoded key for client to decrypt lead data. | [optional] 
**CryptographicAlgorithm** | Pointer to **string** | Lead data encryption algorithm. | [optional] 
**CreatedTime** | Pointer to **int32** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 

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


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


