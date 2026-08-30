# AppsflyerAudienceSyncCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContainerId** | **string** | The container ID of the audience | 
**UrlAdidSha256** | Pointer to **string** | The pre-signed URL for SHA256 hashed GAID/IDFA file | [optional] 
**UrlEmailSha256** | Pointer to **string** | The pre-signed URL for SHA256 hashed email file | [optional] 

## Methods

### NewAppsflyerAudienceSyncCreate

`func NewAppsflyerAudienceSyncCreate(containerId string, ) *AppsflyerAudienceSyncCreate`

NewAppsflyerAudienceSyncCreate instantiates a new AppsflyerAudienceSyncCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAppsflyerAudienceSyncCreateWithDefaults

`func NewAppsflyerAudienceSyncCreateWithDefaults() *AppsflyerAudienceSyncCreate`

NewAppsflyerAudienceSyncCreateWithDefaults instantiates a new AppsflyerAudienceSyncCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContainerId

`func (o *AppsflyerAudienceSyncCreate) GetContainerId() string`

GetContainerId returns the ContainerId field if non-nil, zero value otherwise.

### GetContainerIdOk

`func (o *AppsflyerAudienceSyncCreate) GetContainerIdOk() (*string, bool)`

GetContainerIdOk returns a tuple with the ContainerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContainerId

`func (o *AppsflyerAudienceSyncCreate) SetContainerId(v string)`

SetContainerId sets ContainerId field to given value.


### GetUrlAdidSha256

`func (o *AppsflyerAudienceSyncCreate) GetUrlAdidSha256() string`

GetUrlAdidSha256 returns the UrlAdidSha256 field if non-nil, zero value otherwise.

### GetUrlAdidSha256Ok

`func (o *AppsflyerAudienceSyncCreate) GetUrlAdidSha256Ok() (*string, bool)`

GetUrlAdidSha256Ok returns a tuple with the UrlAdidSha256 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrlAdidSha256

`func (o *AppsflyerAudienceSyncCreate) SetUrlAdidSha256(v string)`

SetUrlAdidSha256 sets UrlAdidSha256 field to given value.

### HasUrlAdidSha256

`func (o *AppsflyerAudienceSyncCreate) HasUrlAdidSha256() bool`

HasUrlAdidSha256 returns a boolean if a field has been set.

### GetUrlEmailSha256

`func (o *AppsflyerAudienceSyncCreate) GetUrlEmailSha256() string`

GetUrlEmailSha256 returns the UrlEmailSha256 field if non-nil, zero value otherwise.

### GetUrlEmailSha256Ok

`func (o *AppsflyerAudienceSyncCreate) GetUrlEmailSha256Ok() (*string, bool)`

GetUrlEmailSha256Ok returns a tuple with the UrlEmailSha256 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrlEmailSha256

`func (o *AppsflyerAudienceSyncCreate) SetUrlEmailSha256(v string)`

SetUrlEmailSha256 sets UrlEmailSha256 field to given value.

### HasUrlEmailSha256

`func (o *AppsflyerAudienceSyncCreate) HasUrlEmailSha256() bool`

HasUrlEmailSha256 returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


