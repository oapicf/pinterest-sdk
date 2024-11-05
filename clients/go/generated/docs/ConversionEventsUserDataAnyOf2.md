# ConversionEventsUserDataAnyOf2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Em** | Pointer to **[]string** | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**HashedMaids** | Pointer to **[]string** | Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**ClientIpAddress** | **string** | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | 
**ClientUserAgent** | **string** | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | 

## Methods

### NewConversionEventsUserDataAnyOf2

`func NewConversionEventsUserDataAnyOf2(clientIpAddress string, clientUserAgent string, ) *ConversionEventsUserDataAnyOf2`

NewConversionEventsUserDataAnyOf2 instantiates a new ConversionEventsUserDataAnyOf2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventsUserDataAnyOf2WithDefaults

`func NewConversionEventsUserDataAnyOf2WithDefaults() *ConversionEventsUserDataAnyOf2`

NewConversionEventsUserDataAnyOf2WithDefaults instantiates a new ConversionEventsUserDataAnyOf2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEm

`func (o *ConversionEventsUserDataAnyOf2) GetEm() []string`

GetEm returns the Em field if non-nil, zero value otherwise.

### GetEmOk

`func (o *ConversionEventsUserDataAnyOf2) GetEmOk() (*[]string, bool)`

GetEmOk returns a tuple with the Em field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEm

`func (o *ConversionEventsUserDataAnyOf2) SetEm(v []string)`

SetEm sets Em field to given value.

### HasEm

`func (o *ConversionEventsUserDataAnyOf2) HasEm() bool`

HasEm returns a boolean if a field has been set.

### GetHashedMaids

`func (o *ConversionEventsUserDataAnyOf2) GetHashedMaids() []string`

GetHashedMaids returns the HashedMaids field if non-nil, zero value otherwise.

### GetHashedMaidsOk

`func (o *ConversionEventsUserDataAnyOf2) GetHashedMaidsOk() (*[]string, bool)`

GetHashedMaidsOk returns a tuple with the HashedMaids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHashedMaids

`func (o *ConversionEventsUserDataAnyOf2) SetHashedMaids(v []string)`

SetHashedMaids sets HashedMaids field to given value.

### HasHashedMaids

`func (o *ConversionEventsUserDataAnyOf2) HasHashedMaids() bool`

HasHashedMaids returns a boolean if a field has been set.

### GetClientIpAddress

`func (o *ConversionEventsUserDataAnyOf2) GetClientIpAddress() string`

GetClientIpAddress returns the ClientIpAddress field if non-nil, zero value otherwise.

### GetClientIpAddressOk

`func (o *ConversionEventsUserDataAnyOf2) GetClientIpAddressOk() (*string, bool)`

GetClientIpAddressOk returns a tuple with the ClientIpAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientIpAddress

`func (o *ConversionEventsUserDataAnyOf2) SetClientIpAddress(v string)`

SetClientIpAddress sets ClientIpAddress field to given value.


### GetClientUserAgent

`func (o *ConversionEventsUserDataAnyOf2) GetClientUserAgent() string`

GetClientUserAgent returns the ClientUserAgent field if non-nil, zero value otherwise.

### GetClientUserAgentOk

`func (o *ConversionEventsUserDataAnyOf2) GetClientUserAgentOk() (*string, bool)`

GetClientUserAgentOk returns a tuple with the ClientUserAgent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientUserAgent

`func (o *ConversionEventsUserDataAnyOf2) SetClientUserAgent(v string)`

SetClientUserAgent sets ClientUserAgent field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


