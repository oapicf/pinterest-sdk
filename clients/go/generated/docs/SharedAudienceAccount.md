# SharedAudienceAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountId** | **string** | Account ID (ad account or business ID). | 
**AccountName** | **string** | Account name. | 
**AccountType** | **string** | account type | 
**SharedOnTimestamp** | **int32** | Epoch timestamp in seconds for the shared audience event | 

## Methods

### NewSharedAudienceAccount

`func NewSharedAudienceAccount(accountId string, accountName string, accountType string, sharedOnTimestamp int32, ) *SharedAudienceAccount`

NewSharedAudienceAccount instantiates a new SharedAudienceAccount object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSharedAudienceAccountWithDefaults

`func NewSharedAudienceAccountWithDefaults() *SharedAudienceAccount`

NewSharedAudienceAccountWithDefaults instantiates a new SharedAudienceAccount object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccountId

`func (o *SharedAudienceAccount) GetAccountId() string`

GetAccountId returns the AccountId field if non-nil, zero value otherwise.

### GetAccountIdOk

`func (o *SharedAudienceAccount) GetAccountIdOk() (*string, bool)`

GetAccountIdOk returns a tuple with the AccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountId

`func (o *SharedAudienceAccount) SetAccountId(v string)`

SetAccountId sets AccountId field to given value.


### GetAccountName

`func (o *SharedAudienceAccount) GetAccountName() string`

GetAccountName returns the AccountName field if non-nil, zero value otherwise.

### GetAccountNameOk

`func (o *SharedAudienceAccount) GetAccountNameOk() (*string, bool)`

GetAccountNameOk returns a tuple with the AccountName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountName

`func (o *SharedAudienceAccount) SetAccountName(v string)`

SetAccountName sets AccountName field to given value.


### GetAccountType

`func (o *SharedAudienceAccount) GetAccountType() string`

GetAccountType returns the AccountType field if non-nil, zero value otherwise.

### GetAccountTypeOk

`func (o *SharedAudienceAccount) GetAccountTypeOk() (*string, bool)`

GetAccountTypeOk returns a tuple with the AccountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountType

`func (o *SharedAudienceAccount) SetAccountType(v string)`

SetAccountType sets AccountType field to given value.


### GetSharedOnTimestamp

`func (o *SharedAudienceAccount) GetSharedOnTimestamp() int32`

GetSharedOnTimestamp returns the SharedOnTimestamp field if non-nil, zero value otherwise.

### GetSharedOnTimestampOk

`func (o *SharedAudienceAccount) GetSharedOnTimestampOk() (*int32, bool)`

GetSharedOnTimestampOk returns a tuple with the SharedOnTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharedOnTimestamp

`func (o *SharedAudienceAccount) SetSharedOnTimestamp(v int32)`

SetSharedOnTimestamp sets SharedOnTimestamp field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


