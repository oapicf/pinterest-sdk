# BusinessSharedAudienceResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | Pointer to **string** | Audience ID that was shared | [optional] 
**Permissions** | Pointer to [**[]Role**](Role.md) |  | [optional] 
**RecipientBusinessIds** | Pointer to **[]string** | Business IDs that received the audience | [optional] 

## Methods

### NewBusinessSharedAudienceResponse

`func NewBusinessSharedAudienceResponse() *BusinessSharedAudienceResponse`

NewBusinessSharedAudienceResponse instantiates a new BusinessSharedAudienceResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBusinessSharedAudienceResponseWithDefaults

`func NewBusinessSharedAudienceResponseWithDefaults() *BusinessSharedAudienceResponse`

NewBusinessSharedAudienceResponseWithDefaults instantiates a new BusinessSharedAudienceResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceId

`func (o *BusinessSharedAudienceResponse) GetAudienceId() string`

GetAudienceId returns the AudienceId field if non-nil, zero value otherwise.

### GetAudienceIdOk

`func (o *BusinessSharedAudienceResponse) GetAudienceIdOk() (*string, bool)`

GetAudienceIdOk returns a tuple with the AudienceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceId

`func (o *BusinessSharedAudienceResponse) SetAudienceId(v string)`

SetAudienceId sets AudienceId field to given value.

### HasAudienceId

`func (o *BusinessSharedAudienceResponse) HasAudienceId() bool`

HasAudienceId returns a boolean if a field has been set.

### GetPermissions

`func (o *BusinessSharedAudienceResponse) GetPermissions() []Role`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *BusinessSharedAudienceResponse) GetPermissionsOk() (*[]Role, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *BusinessSharedAudienceResponse) SetPermissions(v []Role)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *BusinessSharedAudienceResponse) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.

### GetRecipientBusinessIds

`func (o *BusinessSharedAudienceResponse) GetRecipientBusinessIds() []string`

GetRecipientBusinessIds returns the RecipientBusinessIds field if non-nil, zero value otherwise.

### GetRecipientBusinessIdsOk

`func (o *BusinessSharedAudienceResponse) GetRecipientBusinessIdsOk() (*[]string, bool)`

GetRecipientBusinessIdsOk returns a tuple with the RecipientBusinessIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientBusinessIds

`func (o *BusinessSharedAudienceResponse) SetRecipientBusinessIds(v []string)`

SetRecipientBusinessIds sets RecipientBusinessIds field to given value.

### HasRecipientBusinessIds

`func (o *BusinessSharedAudienceResponse) HasRecipientBusinessIds() bool`

HasRecipientBusinessIds returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


