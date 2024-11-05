# BaseInviteDataResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Unique identifier of the invite/request. | [optional] 
**InviteData** | Pointer to [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] 
**IsReceivedInvite** | Pointer to **bool** | Indicates whether the invite/request was received. | [optional] 
**User** | Pointer to [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 

## Methods

### NewBaseInviteDataResponse

`func NewBaseInviteDataResponse() *BaseInviteDataResponse`

NewBaseInviteDataResponse instantiates a new BaseInviteDataResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBaseInviteDataResponseWithDefaults

`func NewBaseInviteDataResponseWithDefaults() *BaseInviteDataResponse`

NewBaseInviteDataResponseWithDefaults instantiates a new BaseInviteDataResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *BaseInviteDataResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BaseInviteDataResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BaseInviteDataResponse) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *BaseInviteDataResponse) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInviteData

`func (o *BaseInviteDataResponse) GetInviteData() BaseInviteDataResponseInviteData`

GetInviteData returns the InviteData field if non-nil, zero value otherwise.

### GetInviteDataOk

`func (o *BaseInviteDataResponse) GetInviteDataOk() (*BaseInviteDataResponseInviteData, bool)`

GetInviteDataOk returns a tuple with the InviteData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteData

`func (o *BaseInviteDataResponse) SetInviteData(v BaseInviteDataResponseInviteData)`

SetInviteData sets InviteData field to given value.

### HasInviteData

`func (o *BaseInviteDataResponse) HasInviteData() bool`

HasInviteData returns a boolean if a field has been set.

### GetIsReceivedInvite

`func (o *BaseInviteDataResponse) GetIsReceivedInvite() bool`

GetIsReceivedInvite returns the IsReceivedInvite field if non-nil, zero value otherwise.

### GetIsReceivedInviteOk

`func (o *BaseInviteDataResponse) GetIsReceivedInviteOk() (*bool, bool)`

GetIsReceivedInviteOk returns a tuple with the IsReceivedInvite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsReceivedInvite

`func (o *BaseInviteDataResponse) SetIsReceivedInvite(v bool)`

SetIsReceivedInvite sets IsReceivedInvite field to given value.

### HasIsReceivedInvite

`func (o *BaseInviteDataResponse) HasIsReceivedInvite() bool`

HasIsReceivedInvite returns a boolean if a field has been set.

### GetUser

`func (o *BaseInviteDataResponse) GetUser() BusinessAccessUserSummary`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *BaseInviteDataResponse) GetUserOk() (*BusinessAccessUserSummary, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *BaseInviteDataResponse) SetUser(v BusinessAccessUserSummary)`

SetUser sets User field to given value.

### HasUser

`func (o *BaseInviteDataResponse) HasUser() bool`

HasUser returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


