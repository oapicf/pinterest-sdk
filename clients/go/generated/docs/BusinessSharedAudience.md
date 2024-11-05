# BusinessSharedAudience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **string** | Unique identifier of an audience | 
**OperationType** | [**OperationType**](OperationType.md) |  | 
**RecipientBusinessIds** | **[]string** | List of business IDs to share with or revoke from. | 

## Methods

### NewBusinessSharedAudience

`func NewBusinessSharedAudience(audienceId string, operationType OperationType, recipientBusinessIds []string, ) *BusinessSharedAudience`

NewBusinessSharedAudience instantiates a new BusinessSharedAudience object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBusinessSharedAudienceWithDefaults

`func NewBusinessSharedAudienceWithDefaults() *BusinessSharedAudience`

NewBusinessSharedAudienceWithDefaults instantiates a new BusinessSharedAudience object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceId

`func (o *BusinessSharedAudience) GetAudienceId() string`

GetAudienceId returns the AudienceId field if non-nil, zero value otherwise.

### GetAudienceIdOk

`func (o *BusinessSharedAudience) GetAudienceIdOk() (*string, bool)`

GetAudienceIdOk returns a tuple with the AudienceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceId

`func (o *BusinessSharedAudience) SetAudienceId(v string)`

SetAudienceId sets AudienceId field to given value.


### GetOperationType

`func (o *BusinessSharedAudience) GetOperationType() OperationType`

GetOperationType returns the OperationType field if non-nil, zero value otherwise.

### GetOperationTypeOk

`func (o *BusinessSharedAudience) GetOperationTypeOk() (*OperationType, bool)`

GetOperationTypeOk returns a tuple with the OperationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationType

`func (o *BusinessSharedAudience) SetOperationType(v OperationType)`

SetOperationType sets OperationType field to given value.


### GetRecipientBusinessIds

`func (o *BusinessSharedAudience) GetRecipientBusinessIds() []string`

GetRecipientBusinessIds returns the RecipientBusinessIds field if non-nil, zero value otherwise.

### GetRecipientBusinessIdsOk

`func (o *BusinessSharedAudience) GetRecipientBusinessIdsOk() (*[]string, bool)`

GetRecipientBusinessIdsOk returns a tuple with the RecipientBusinessIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientBusinessIds

`func (o *BusinessSharedAudience) SetRecipientBusinessIds(v []string)`

SetRecipientBusinessIds sets RecipientBusinessIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


