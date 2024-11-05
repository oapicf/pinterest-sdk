# ConversionEventsUserDataAnyOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Em** | Pointer to **[]string** | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**HashedMaids** | **[]string** | Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | 
**ClientIpAddress** | Pointer to **string** | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] 
**ClientUserAgent** | Pointer to **string** | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] 

## Methods

### NewConversionEventsUserDataAnyOf1

`func NewConversionEventsUserDataAnyOf1(hashedMaids []string, ) *ConversionEventsUserDataAnyOf1`

NewConversionEventsUserDataAnyOf1 instantiates a new ConversionEventsUserDataAnyOf1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventsUserDataAnyOf1WithDefaults

`func NewConversionEventsUserDataAnyOf1WithDefaults() *ConversionEventsUserDataAnyOf1`

NewConversionEventsUserDataAnyOf1WithDefaults instantiates a new ConversionEventsUserDataAnyOf1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEm

`func (o *ConversionEventsUserDataAnyOf1) GetEm() []string`

GetEm returns the Em field if non-nil, zero value otherwise.

### GetEmOk

`func (o *ConversionEventsUserDataAnyOf1) GetEmOk() (*[]string, bool)`

GetEmOk returns a tuple with the Em field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEm

`func (o *ConversionEventsUserDataAnyOf1) SetEm(v []string)`

SetEm sets Em field to given value.

### HasEm

`func (o *ConversionEventsUserDataAnyOf1) HasEm() bool`

HasEm returns a boolean if a field has been set.

### GetHashedMaids

`func (o *ConversionEventsUserDataAnyOf1) GetHashedMaids() []string`

GetHashedMaids returns the HashedMaids field if non-nil, zero value otherwise.

### GetHashedMaidsOk

`func (o *ConversionEventsUserDataAnyOf1) GetHashedMaidsOk() (*[]string, bool)`

GetHashedMaidsOk returns a tuple with the HashedMaids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHashedMaids

`func (o *ConversionEventsUserDataAnyOf1) SetHashedMaids(v []string)`

SetHashedMaids sets HashedMaids field to given value.


### GetClientIpAddress

`func (o *ConversionEventsUserDataAnyOf1) GetClientIpAddress() string`

GetClientIpAddress returns the ClientIpAddress field if non-nil, zero value otherwise.

### GetClientIpAddressOk

`func (o *ConversionEventsUserDataAnyOf1) GetClientIpAddressOk() (*string, bool)`

GetClientIpAddressOk returns a tuple with the ClientIpAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientIpAddress

`func (o *ConversionEventsUserDataAnyOf1) SetClientIpAddress(v string)`

SetClientIpAddress sets ClientIpAddress field to given value.

### HasClientIpAddress

`func (o *ConversionEventsUserDataAnyOf1) HasClientIpAddress() bool`

HasClientIpAddress returns a boolean if a field has been set.

### GetClientUserAgent

`func (o *ConversionEventsUserDataAnyOf1) GetClientUserAgent() string`

GetClientUserAgent returns the ClientUserAgent field if non-nil, zero value otherwise.

### GetClientUserAgentOk

`func (o *ConversionEventsUserDataAnyOf1) GetClientUserAgentOk() (*string, bool)`

GetClientUserAgentOk returns a tuple with the ClientUserAgent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientUserAgent

`func (o *ConversionEventsUserDataAnyOf1) SetClientUserAgent(v string)`

SetClientUserAgent sets ClientUserAgent field to given value.

### HasClientUserAgent

`func (o *ConversionEventsUserDataAnyOf1) HasClientUserAgent() bool`

HasClientUserAgent returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


