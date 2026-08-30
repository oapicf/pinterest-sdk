# AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **string** | Unique identifier of an audience | 
**OperationType** | [**OperationType**](OperationType.md) |  | 
**RecipientAccountIds** | **[]string** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 

## Methods

### NewAdAccountToAdAccountSharedAudienceUpdateWithRequiredBody

`func NewAdAccountToAdAccountSharedAudienceUpdateWithRequiredBody(audienceId string, operationType OperationType, recipientAccountIds []string, ) *AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody`

NewAdAccountToAdAccountSharedAudienceUpdateWithRequiredBody instantiates a new AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyWithDefaults

`func NewAdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyWithDefaults() *AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody`

NewAdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyWithDefaults instantiates a new AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceId

`func (o *AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody) GetAudienceId() string`

GetAudienceId returns the AudienceId field if non-nil, zero value otherwise.

### GetAudienceIdOk

`func (o *AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody) GetAudienceIdOk() (*string, bool)`

GetAudienceIdOk returns a tuple with the AudienceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceId

`func (o *AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody) SetAudienceId(v string)`

SetAudienceId sets AudienceId field to given value.


### GetOperationType

`func (o *AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody) GetOperationType() OperationType`

GetOperationType returns the OperationType field if non-nil, zero value otherwise.

### GetOperationTypeOk

`func (o *AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody) GetOperationTypeOk() (*OperationType, bool)`

GetOperationTypeOk returns a tuple with the OperationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationType

`func (o *AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody) SetOperationType(v OperationType)`

SetOperationType sets OperationType field to given value.


### GetRecipientAccountIds

`func (o *AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody) GetRecipientAccountIds() []string`

GetRecipientAccountIds returns the RecipientAccountIds field if non-nil, zero value otherwise.

### GetRecipientAccountIdsOk

`func (o *AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody) GetRecipientAccountIdsOk() (*[]string, bool)`

GetRecipientAccountIdsOk returns a tuple with the RecipientAccountIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientAccountIds

`func (o *AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody) SetRecipientAccountIds(v []string)`

SetRecipientAccountIds sets RecipientAccountIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


