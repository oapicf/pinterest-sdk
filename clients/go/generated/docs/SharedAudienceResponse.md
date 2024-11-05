# SharedAudienceResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | Pointer to **string** | Audience ID that was shared | [optional] 
**Permissions** | Pointer to [**[]Role**](Role.md) |  | [optional] 
**RecipientAccountIds** | Pointer to **[]string** | Account IDs that received the audience | [optional] 

## Methods

### NewSharedAudienceResponse

`func NewSharedAudienceResponse() *SharedAudienceResponse`

NewSharedAudienceResponse instantiates a new SharedAudienceResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSharedAudienceResponseWithDefaults

`func NewSharedAudienceResponseWithDefaults() *SharedAudienceResponse`

NewSharedAudienceResponseWithDefaults instantiates a new SharedAudienceResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceId

`func (o *SharedAudienceResponse) GetAudienceId() string`

GetAudienceId returns the AudienceId field if non-nil, zero value otherwise.

### GetAudienceIdOk

`func (o *SharedAudienceResponse) GetAudienceIdOk() (*string, bool)`

GetAudienceIdOk returns a tuple with the AudienceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceId

`func (o *SharedAudienceResponse) SetAudienceId(v string)`

SetAudienceId sets AudienceId field to given value.

### HasAudienceId

`func (o *SharedAudienceResponse) HasAudienceId() bool`

HasAudienceId returns a boolean if a field has been set.

### GetPermissions

`func (o *SharedAudienceResponse) GetPermissions() []Role`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *SharedAudienceResponse) GetPermissionsOk() (*[]Role, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *SharedAudienceResponse) SetPermissions(v []Role)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *SharedAudienceResponse) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.

### GetRecipientAccountIds

`func (o *SharedAudienceResponse) GetRecipientAccountIds() []string`

GetRecipientAccountIds returns the RecipientAccountIds field if non-nil, zero value otherwise.

### GetRecipientAccountIdsOk

`func (o *SharedAudienceResponse) GetRecipientAccountIdsOk() (*[]string, bool)`

GetRecipientAccountIdsOk returns a tuple with the RecipientAccountIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientAccountIds

`func (o *SharedAudienceResponse) SetRecipientAccountIds(v []string)`

SetRecipientAccountIds sets RecipientAccountIds field to given value.

### HasRecipientAccountIds

`func (o *SharedAudienceResponse) HasRecipientAccountIds() bool`

HasRecipientAccountIds returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


