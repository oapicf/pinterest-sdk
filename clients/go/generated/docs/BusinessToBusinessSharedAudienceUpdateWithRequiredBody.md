# BusinessToBusinessSharedAudienceUpdateWithRequiredBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **string** | Unique identifier of an audience | 
**OperationType** | [**OperationType**](OperationType.md) |  | 
**RecipientBusinessIds** | **[]string** | Business IDs to share with or revoke from (request) / that received the audience (response). | 

## Methods

### NewBusinessToBusinessSharedAudienceUpdateWithRequiredBody

`func NewBusinessToBusinessSharedAudienceUpdateWithRequiredBody(audienceId string, operationType OperationType, recipientBusinessIds []string, ) *BusinessToBusinessSharedAudienceUpdateWithRequiredBody`

NewBusinessToBusinessSharedAudienceUpdateWithRequiredBody instantiates a new BusinessToBusinessSharedAudienceUpdateWithRequiredBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBusinessToBusinessSharedAudienceUpdateWithRequiredBodyWithDefaults

`func NewBusinessToBusinessSharedAudienceUpdateWithRequiredBodyWithDefaults() *BusinessToBusinessSharedAudienceUpdateWithRequiredBody`

NewBusinessToBusinessSharedAudienceUpdateWithRequiredBodyWithDefaults instantiates a new BusinessToBusinessSharedAudienceUpdateWithRequiredBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceId

`func (o *BusinessToBusinessSharedAudienceUpdateWithRequiredBody) GetAudienceId() string`

GetAudienceId returns the AudienceId field if non-nil, zero value otherwise.

### GetAudienceIdOk

`func (o *BusinessToBusinessSharedAudienceUpdateWithRequiredBody) GetAudienceIdOk() (*string, bool)`

GetAudienceIdOk returns a tuple with the AudienceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceId

`func (o *BusinessToBusinessSharedAudienceUpdateWithRequiredBody) SetAudienceId(v string)`

SetAudienceId sets AudienceId field to given value.


### GetOperationType

`func (o *BusinessToBusinessSharedAudienceUpdateWithRequiredBody) GetOperationType() OperationType`

GetOperationType returns the OperationType field if non-nil, zero value otherwise.

### GetOperationTypeOk

`func (o *BusinessToBusinessSharedAudienceUpdateWithRequiredBody) GetOperationTypeOk() (*OperationType, bool)`

GetOperationTypeOk returns a tuple with the OperationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationType

`func (o *BusinessToBusinessSharedAudienceUpdateWithRequiredBody) SetOperationType(v OperationType)`

SetOperationType sets OperationType field to given value.


### GetRecipientBusinessIds

`func (o *BusinessToBusinessSharedAudienceUpdateWithRequiredBody) GetRecipientBusinessIds() []string`

GetRecipientBusinessIds returns the RecipientBusinessIds field if non-nil, zero value otherwise.

### GetRecipientBusinessIdsOk

`func (o *BusinessToBusinessSharedAudienceUpdateWithRequiredBody) GetRecipientBusinessIdsOk() (*[]string, bool)`

GetRecipientBusinessIdsOk returns a tuple with the RecipientBusinessIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientBusinessIds

`func (o *BusinessToBusinessSharedAudienceUpdateWithRequiredBody) SetRecipientBusinessIds(v []string)`

SetRecipientBusinessIds sets RecipientBusinessIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


