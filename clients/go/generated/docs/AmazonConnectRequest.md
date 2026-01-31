# AmazonConnectRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AmazonStorefrontId** | Pointer to **string** | The Amazon storefront id | [optional] 
**AmazonStorefrontName** | **string** | The Amazon storefront name | 
**AmazonStorefrontUrl** | **string** | The Amazon storefront url | 
**AmazonUserId** | Pointer to **string** | The Amazon user id | [optional] 
**IsAmazonAccountLinked** | **bool** | The Amazon account linking status | 
**OneTimePasscode** | Pointer to **string** | The one time passcode for Pinterest-initiated linking requests | [optional] 
**PinterestUserId** | Pointer to **string** | The Pinterest user id for Amazon-initiated linking requests | [optional] 

## Methods

### NewAmazonConnectRequest

`func NewAmazonConnectRequest(amazonStorefrontName string, amazonStorefrontUrl string, isAmazonAccountLinked bool, ) *AmazonConnectRequest`

NewAmazonConnectRequest instantiates a new AmazonConnectRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAmazonConnectRequestWithDefaults

`func NewAmazonConnectRequestWithDefaults() *AmazonConnectRequest`

NewAmazonConnectRequestWithDefaults instantiates a new AmazonConnectRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAmazonStorefrontId

`func (o *AmazonConnectRequest) GetAmazonStorefrontId() string`

GetAmazonStorefrontId returns the AmazonStorefrontId field if non-nil, zero value otherwise.

### GetAmazonStorefrontIdOk

`func (o *AmazonConnectRequest) GetAmazonStorefrontIdOk() (*string, bool)`

GetAmazonStorefrontIdOk returns a tuple with the AmazonStorefrontId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmazonStorefrontId

`func (o *AmazonConnectRequest) SetAmazonStorefrontId(v string)`

SetAmazonStorefrontId sets AmazonStorefrontId field to given value.

### HasAmazonStorefrontId

`func (o *AmazonConnectRequest) HasAmazonStorefrontId() bool`

HasAmazonStorefrontId returns a boolean if a field has been set.

### GetAmazonStorefrontName

`func (o *AmazonConnectRequest) GetAmazonStorefrontName() string`

GetAmazonStorefrontName returns the AmazonStorefrontName field if non-nil, zero value otherwise.

### GetAmazonStorefrontNameOk

`func (o *AmazonConnectRequest) GetAmazonStorefrontNameOk() (*string, bool)`

GetAmazonStorefrontNameOk returns a tuple with the AmazonStorefrontName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmazonStorefrontName

`func (o *AmazonConnectRequest) SetAmazonStorefrontName(v string)`

SetAmazonStorefrontName sets AmazonStorefrontName field to given value.


### GetAmazonStorefrontUrl

`func (o *AmazonConnectRequest) GetAmazonStorefrontUrl() string`

GetAmazonStorefrontUrl returns the AmazonStorefrontUrl field if non-nil, zero value otherwise.

### GetAmazonStorefrontUrlOk

`func (o *AmazonConnectRequest) GetAmazonStorefrontUrlOk() (*string, bool)`

GetAmazonStorefrontUrlOk returns a tuple with the AmazonStorefrontUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmazonStorefrontUrl

`func (o *AmazonConnectRequest) SetAmazonStorefrontUrl(v string)`

SetAmazonStorefrontUrl sets AmazonStorefrontUrl field to given value.


### GetAmazonUserId

`func (o *AmazonConnectRequest) GetAmazonUserId() string`

GetAmazonUserId returns the AmazonUserId field if non-nil, zero value otherwise.

### GetAmazonUserIdOk

`func (o *AmazonConnectRequest) GetAmazonUserIdOk() (*string, bool)`

GetAmazonUserIdOk returns a tuple with the AmazonUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmazonUserId

`func (o *AmazonConnectRequest) SetAmazonUserId(v string)`

SetAmazonUserId sets AmazonUserId field to given value.

### HasAmazonUserId

`func (o *AmazonConnectRequest) HasAmazonUserId() bool`

HasAmazonUserId returns a boolean if a field has been set.

### GetIsAmazonAccountLinked

`func (o *AmazonConnectRequest) GetIsAmazonAccountLinked() bool`

GetIsAmazonAccountLinked returns the IsAmazonAccountLinked field if non-nil, zero value otherwise.

### GetIsAmazonAccountLinkedOk

`func (o *AmazonConnectRequest) GetIsAmazonAccountLinkedOk() (*bool, bool)`

GetIsAmazonAccountLinkedOk returns a tuple with the IsAmazonAccountLinked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAmazonAccountLinked

`func (o *AmazonConnectRequest) SetIsAmazonAccountLinked(v bool)`

SetIsAmazonAccountLinked sets IsAmazonAccountLinked field to given value.


### GetOneTimePasscode

`func (o *AmazonConnectRequest) GetOneTimePasscode() string`

GetOneTimePasscode returns the OneTimePasscode field if non-nil, zero value otherwise.

### GetOneTimePasscodeOk

`func (o *AmazonConnectRequest) GetOneTimePasscodeOk() (*string, bool)`

GetOneTimePasscodeOk returns a tuple with the OneTimePasscode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOneTimePasscode

`func (o *AmazonConnectRequest) SetOneTimePasscode(v string)`

SetOneTimePasscode sets OneTimePasscode field to given value.

### HasOneTimePasscode

`func (o *AmazonConnectRequest) HasOneTimePasscode() bool`

HasOneTimePasscode returns a boolean if a field has been set.

### GetPinterestUserId

`func (o *AmazonConnectRequest) GetPinterestUserId() string`

GetPinterestUserId returns the PinterestUserId field if non-nil, zero value otherwise.

### GetPinterestUserIdOk

`func (o *AmazonConnectRequest) GetPinterestUserIdOk() (*string, bool)`

GetPinterestUserIdOk returns a tuple with the PinterestUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinterestUserId

`func (o *AmazonConnectRequest) SetPinterestUserId(v string)`

SetPinterestUserId sets PinterestUserId field to given value.

### HasPinterestUserId

`func (o *AmazonConnectRequest) HasPinterestUserId() bool`

HasPinterestUserId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


