# BusinessToAdAccountSharedAudience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **string** | Unique identifier of an audience | 
**Permissions** | Pointer to [**[]Role**](Role.md) | Permissions granted to the recipients. | [optional] [readonly] 
**RecipientAccountIds** | **[]string** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 

## Methods

### NewBusinessToAdAccountSharedAudience

`func NewBusinessToAdAccountSharedAudience(audienceId string, recipientAccountIds []string, ) *BusinessToAdAccountSharedAudience`

NewBusinessToAdAccountSharedAudience instantiates a new BusinessToAdAccountSharedAudience object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBusinessToAdAccountSharedAudienceWithDefaults

`func NewBusinessToAdAccountSharedAudienceWithDefaults() *BusinessToAdAccountSharedAudience`

NewBusinessToAdAccountSharedAudienceWithDefaults instantiates a new BusinessToAdAccountSharedAudience object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceId

`func (o *BusinessToAdAccountSharedAudience) GetAudienceId() string`

GetAudienceId returns the AudienceId field if non-nil, zero value otherwise.

### GetAudienceIdOk

`func (o *BusinessToAdAccountSharedAudience) GetAudienceIdOk() (*string, bool)`

GetAudienceIdOk returns a tuple with the AudienceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceId

`func (o *BusinessToAdAccountSharedAudience) SetAudienceId(v string)`

SetAudienceId sets AudienceId field to given value.


### GetPermissions

`func (o *BusinessToAdAccountSharedAudience) GetPermissions() []Role`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *BusinessToAdAccountSharedAudience) GetPermissionsOk() (*[]Role, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *BusinessToAdAccountSharedAudience) SetPermissions(v []Role)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *BusinessToAdAccountSharedAudience) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.

### GetRecipientAccountIds

`func (o *BusinessToAdAccountSharedAudience) GetRecipientAccountIds() []string`

GetRecipientAccountIds returns the RecipientAccountIds field if non-nil, zero value otherwise.

### GetRecipientAccountIdsOk

`func (o *BusinessToAdAccountSharedAudience) GetRecipientAccountIdsOk() (*[]string, bool)`

GetRecipientAccountIdsOk returns a tuple with the RecipientAccountIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientAccountIds

`func (o *BusinessToAdAccountSharedAudience) SetRecipientAccountIds(v []string)`

SetRecipientAccountIds sets RecipientAccountIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


