# AdAccountToAdAccountSharedAudience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **string** | Unique identifier of an audience | 
**Permissions** | Pointer to [**[]Role**](Role.md) | Permissions granted to the recipients. | [optional] [readonly] 
**RecipientAccountIds** | **[]string** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 

## Methods

### NewAdAccountToAdAccountSharedAudience

`func NewAdAccountToAdAccountSharedAudience(audienceId string, recipientAccountIds []string, ) *AdAccountToAdAccountSharedAudience`

NewAdAccountToAdAccountSharedAudience instantiates a new AdAccountToAdAccountSharedAudience object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdAccountToAdAccountSharedAudienceWithDefaults

`func NewAdAccountToAdAccountSharedAudienceWithDefaults() *AdAccountToAdAccountSharedAudience`

NewAdAccountToAdAccountSharedAudienceWithDefaults instantiates a new AdAccountToAdAccountSharedAudience object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceId

`func (o *AdAccountToAdAccountSharedAudience) GetAudienceId() string`

GetAudienceId returns the AudienceId field if non-nil, zero value otherwise.

### GetAudienceIdOk

`func (o *AdAccountToAdAccountSharedAudience) GetAudienceIdOk() (*string, bool)`

GetAudienceIdOk returns a tuple with the AudienceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceId

`func (o *AdAccountToAdAccountSharedAudience) SetAudienceId(v string)`

SetAudienceId sets AudienceId field to given value.


### GetPermissions

`func (o *AdAccountToAdAccountSharedAudience) GetPermissions() []Role`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *AdAccountToAdAccountSharedAudience) GetPermissionsOk() (*[]Role, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *AdAccountToAdAccountSharedAudience) SetPermissions(v []Role)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *AdAccountToAdAccountSharedAudience) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.

### GetRecipientAccountIds

`func (o *AdAccountToAdAccountSharedAudience) GetRecipientAccountIds() []string`

GetRecipientAccountIds returns the RecipientAccountIds field if non-nil, zero value otherwise.

### GetRecipientAccountIdsOk

`func (o *AdAccountToAdAccountSharedAudience) GetRecipientAccountIdsOk() (*[]string, bool)`

GetRecipientAccountIdsOk returns a tuple with the RecipientAccountIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientAccountIds

`func (o *AdAccountToAdAccountSharedAudience) SetRecipientAccountIds(v []string)`

SetRecipientAccountIds sets RecipientAccountIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


