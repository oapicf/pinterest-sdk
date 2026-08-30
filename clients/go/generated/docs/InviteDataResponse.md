# InviteDataResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteExpiration** | Pointer to **int32** | The date and time when the invite/request will expire. Returned in milliseconds. | [optional] 
**InviteStatus** | Pointer to **string** | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. | [optional] 
**InviteType** | Pointer to **string** | The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets. | [optional] 
**LastUpdatedTime** | Pointer to **int32** | The date and time the invite/request was last updated. Returned in milliseconds. | [optional] 
**SentAt** | Pointer to **int32** | The date and time the invite/request was sent/created. Returned in milliseconds. | [optional] 

## Methods

### NewInviteDataResponse

`func NewInviteDataResponse() *InviteDataResponse`

NewInviteDataResponse instantiates a new InviteDataResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInviteDataResponseWithDefaults

`func NewInviteDataResponseWithDefaults() *InviteDataResponse`

NewInviteDataResponseWithDefaults instantiates a new InviteDataResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInviteExpiration

`func (o *InviteDataResponse) GetInviteExpiration() int32`

GetInviteExpiration returns the InviteExpiration field if non-nil, zero value otherwise.

### GetInviteExpirationOk

`func (o *InviteDataResponse) GetInviteExpirationOk() (*int32, bool)`

GetInviteExpirationOk returns a tuple with the InviteExpiration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteExpiration

`func (o *InviteDataResponse) SetInviteExpiration(v int32)`

SetInviteExpiration sets InviteExpiration field to given value.

### HasInviteExpiration

`func (o *InviteDataResponse) HasInviteExpiration() bool`

HasInviteExpiration returns a boolean if a field has been set.

### GetInviteStatus

`func (o *InviteDataResponse) GetInviteStatus() string`

GetInviteStatus returns the InviteStatus field if non-nil, zero value otherwise.

### GetInviteStatusOk

`func (o *InviteDataResponse) GetInviteStatusOk() (*string, bool)`

GetInviteStatusOk returns a tuple with the InviteStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteStatus

`func (o *InviteDataResponse) SetInviteStatus(v string)`

SetInviteStatus sets InviteStatus field to given value.

### HasInviteStatus

`func (o *InviteDataResponse) HasInviteStatus() bool`

HasInviteStatus returns a boolean if a field has been set.

### GetInviteType

`func (o *InviteDataResponse) GetInviteType() string`

GetInviteType returns the InviteType field if non-nil, zero value otherwise.

### GetInviteTypeOk

`func (o *InviteDataResponse) GetInviteTypeOk() (*string, bool)`

GetInviteTypeOk returns a tuple with the InviteType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteType

`func (o *InviteDataResponse) SetInviteType(v string)`

SetInviteType sets InviteType field to given value.

### HasInviteType

`func (o *InviteDataResponse) HasInviteType() bool`

HasInviteType returns a boolean if a field has been set.

### GetLastUpdatedTime

`func (o *InviteDataResponse) GetLastUpdatedTime() int32`

GetLastUpdatedTime returns the LastUpdatedTime field if non-nil, zero value otherwise.

### GetLastUpdatedTimeOk

`func (o *InviteDataResponse) GetLastUpdatedTimeOk() (*int32, bool)`

GetLastUpdatedTimeOk returns a tuple with the LastUpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastUpdatedTime

`func (o *InviteDataResponse) SetLastUpdatedTime(v int32)`

SetLastUpdatedTime sets LastUpdatedTime field to given value.

### HasLastUpdatedTime

`func (o *InviteDataResponse) HasLastUpdatedTime() bool`

HasLastUpdatedTime returns a boolean if a field has been set.

### GetSentAt

`func (o *InviteDataResponse) GetSentAt() int32`

GetSentAt returns the SentAt field if non-nil, zero value otherwise.

### GetSentAtOk

`func (o *InviteDataResponse) GetSentAtOk() (*int32, bool)`

GetSentAtOk returns a tuple with the SentAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSentAt

`func (o *InviteDataResponse) SetSentAt(v int32)`

SetSentAt sets SentAt field to given value.

### HasSentAt

`func (o *InviteDataResponse) HasSentAt() bool`

HasSentAt returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


