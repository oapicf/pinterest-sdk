# BusinessToBusinessSharedAudience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **string** | Unique identifier of an audience | 
**Permissions** | Pointer to [**[]Role**](Role.md) | Permissions granted to the recipients. | [optional] [readonly] 
**RecipientBusinessIds** | **[]string** | Business IDs to share with or revoke from (request) / that received the audience (response). | 

## Methods

### NewBusinessToBusinessSharedAudience

`func NewBusinessToBusinessSharedAudience(audienceId string, recipientBusinessIds []string, ) *BusinessToBusinessSharedAudience`

NewBusinessToBusinessSharedAudience instantiates a new BusinessToBusinessSharedAudience object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBusinessToBusinessSharedAudienceWithDefaults

`func NewBusinessToBusinessSharedAudienceWithDefaults() *BusinessToBusinessSharedAudience`

NewBusinessToBusinessSharedAudienceWithDefaults instantiates a new BusinessToBusinessSharedAudience object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceId

`func (o *BusinessToBusinessSharedAudience) GetAudienceId() string`

GetAudienceId returns the AudienceId field if non-nil, zero value otherwise.

### GetAudienceIdOk

`func (o *BusinessToBusinessSharedAudience) GetAudienceIdOk() (*string, bool)`

GetAudienceIdOk returns a tuple with the AudienceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceId

`func (o *BusinessToBusinessSharedAudience) SetAudienceId(v string)`

SetAudienceId sets AudienceId field to given value.


### GetPermissions

`func (o *BusinessToBusinessSharedAudience) GetPermissions() []Role`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *BusinessToBusinessSharedAudience) GetPermissionsOk() (*[]Role, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *BusinessToBusinessSharedAudience) SetPermissions(v []Role)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *BusinessToBusinessSharedAudience) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.

### GetRecipientBusinessIds

`func (o *BusinessToBusinessSharedAudience) GetRecipientBusinessIds() []string`

GetRecipientBusinessIds returns the RecipientBusinessIds field if non-nil, zero value otherwise.

### GetRecipientBusinessIdsOk

`func (o *BusinessToBusinessSharedAudience) GetRecipientBusinessIdsOk() (*[]string, bool)`

GetRecipientBusinessIdsOk returns a tuple with the RecipientBusinessIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientBusinessIds

`func (o *BusinessToBusinessSharedAudience) SetRecipientBusinessIds(v []string)`

SetRecipientBusinessIds sets RecipientBusinessIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


