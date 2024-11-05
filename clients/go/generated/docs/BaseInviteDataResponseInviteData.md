# BaseInviteDataResponseInviteData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteExpiration** | Pointer to **int32** | The date and time when the invite/request will expire. Returned in milliseconds. | [optional] 
**InviteStatus** | Pointer to **string** | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. | [optional] 
**InviteType** | Pointer to **string** | The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets. | [optional] 
**LastUpdatedTime** | Pointer to **int32** | The date and time the invite/request was last updated. Returned in milliseconds. | [optional] 
**SentAt** | Pointer to **int32** | The date and time the invite/request was sent/created. Returned in milliseconds. | [optional] 

## Methods

### NewBaseInviteDataResponseInviteData

`func NewBaseInviteDataResponseInviteData() *BaseInviteDataResponseInviteData`

NewBaseInviteDataResponseInviteData instantiates a new BaseInviteDataResponseInviteData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBaseInviteDataResponseInviteDataWithDefaults

`func NewBaseInviteDataResponseInviteDataWithDefaults() *BaseInviteDataResponseInviteData`

NewBaseInviteDataResponseInviteDataWithDefaults instantiates a new BaseInviteDataResponseInviteData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInviteExpiration

`func (o *BaseInviteDataResponseInviteData) GetInviteExpiration() int32`

GetInviteExpiration returns the InviteExpiration field if non-nil, zero value otherwise.

### GetInviteExpirationOk

`func (o *BaseInviteDataResponseInviteData) GetInviteExpirationOk() (*int32, bool)`

GetInviteExpirationOk returns a tuple with the InviteExpiration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteExpiration

`func (o *BaseInviteDataResponseInviteData) SetInviteExpiration(v int32)`

SetInviteExpiration sets InviteExpiration field to given value.

### HasInviteExpiration

`func (o *BaseInviteDataResponseInviteData) HasInviteExpiration() bool`

HasInviteExpiration returns a boolean if a field has been set.

### GetInviteStatus

`func (o *BaseInviteDataResponseInviteData) GetInviteStatus() string`

GetInviteStatus returns the InviteStatus field if non-nil, zero value otherwise.

### GetInviteStatusOk

`func (o *BaseInviteDataResponseInviteData) GetInviteStatusOk() (*string, bool)`

GetInviteStatusOk returns a tuple with the InviteStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteStatus

`func (o *BaseInviteDataResponseInviteData) SetInviteStatus(v string)`

SetInviteStatus sets InviteStatus field to given value.

### HasInviteStatus

`func (o *BaseInviteDataResponseInviteData) HasInviteStatus() bool`

HasInviteStatus returns a boolean if a field has been set.

### GetInviteType

`func (o *BaseInviteDataResponseInviteData) GetInviteType() string`

GetInviteType returns the InviteType field if non-nil, zero value otherwise.

### GetInviteTypeOk

`func (o *BaseInviteDataResponseInviteData) GetInviteTypeOk() (*string, bool)`

GetInviteTypeOk returns a tuple with the InviteType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteType

`func (o *BaseInviteDataResponseInviteData) SetInviteType(v string)`

SetInviteType sets InviteType field to given value.

### HasInviteType

`func (o *BaseInviteDataResponseInviteData) HasInviteType() bool`

HasInviteType returns a boolean if a field has been set.

### GetLastUpdatedTime

`func (o *BaseInviteDataResponseInviteData) GetLastUpdatedTime() int32`

GetLastUpdatedTime returns the LastUpdatedTime field if non-nil, zero value otherwise.

### GetLastUpdatedTimeOk

`func (o *BaseInviteDataResponseInviteData) GetLastUpdatedTimeOk() (*int32, bool)`

GetLastUpdatedTimeOk returns a tuple with the LastUpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastUpdatedTime

`func (o *BaseInviteDataResponseInviteData) SetLastUpdatedTime(v int32)`

SetLastUpdatedTime sets LastUpdatedTime field to given value.

### HasLastUpdatedTime

`func (o *BaseInviteDataResponseInviteData) HasLastUpdatedTime() bool`

HasLastUpdatedTime returns a boolean if a field has been set.

### GetSentAt

`func (o *BaseInviteDataResponseInviteData) GetSentAt() int32`

GetSentAt returns the SentAt field if non-nil, zero value otherwise.

### GetSentAtOk

`func (o *BaseInviteDataResponseInviteData) GetSentAtOk() (*int32, bool)`

GetSentAtOk returns a tuple with the SentAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSentAt

`func (o *BaseInviteDataResponseInviteData) SetSentAt(v int32)`

SetSentAt sets SentAt field to given value.

### HasSentAt

`func (o *BaseInviteDataResponseInviteData) HasSentAt() bool`

HasSentAt returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


