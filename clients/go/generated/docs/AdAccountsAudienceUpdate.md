# AdAccountsAudienceUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Ad account ID. | [optional] 
**AudienceType** | Pointer to [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**Description** | Pointer to **NullableString** | Audience description. | [optional] 
**Name** | Pointer to **string** | Audience name. | [optional] 
**OperationType** | Pointer to [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) | Audience operation type (update or remove). Only valid in update request body. | [optional] 
**Rule** | Pointer to [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 

## Methods

### NewAdAccountsAudienceUpdate

`func NewAdAccountsAudienceUpdate() *AdAccountsAudienceUpdate`

NewAdAccountsAudienceUpdate instantiates a new AdAccountsAudienceUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdAccountsAudienceUpdateWithDefaults

`func NewAdAccountsAudienceUpdateWithDefaults() *AdAccountsAudienceUpdate`

NewAdAccountsAudienceUpdateWithDefaults instantiates a new AdAccountsAudienceUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *AdAccountsAudienceUpdate) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AdAccountsAudienceUpdate) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AdAccountsAudienceUpdate) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AdAccountsAudienceUpdate) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetAudienceType

`func (o *AdAccountsAudienceUpdate) GetAudienceType() AudienceType`

GetAudienceType returns the AudienceType field if non-nil, zero value otherwise.

### GetAudienceTypeOk

`func (o *AdAccountsAudienceUpdate) GetAudienceTypeOk() (*AudienceType, bool)`

GetAudienceTypeOk returns a tuple with the AudienceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceType

`func (o *AdAccountsAudienceUpdate) SetAudienceType(v AudienceType)`

SetAudienceType sets AudienceType field to given value.

### HasAudienceType

`func (o *AdAccountsAudienceUpdate) HasAudienceType() bool`

HasAudienceType returns a boolean if a field has been set.

### GetDescription

`func (o *AdAccountsAudienceUpdate) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *AdAccountsAudienceUpdate) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *AdAccountsAudienceUpdate) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *AdAccountsAudienceUpdate) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *AdAccountsAudienceUpdate) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *AdAccountsAudienceUpdate) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetName

`func (o *AdAccountsAudienceUpdate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdAccountsAudienceUpdate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdAccountsAudienceUpdate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdAccountsAudienceUpdate) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOperationType

`func (o *AdAccountsAudienceUpdate) GetOperationType() AudienceUpdateOperationType`

GetOperationType returns the OperationType field if non-nil, zero value otherwise.

### GetOperationTypeOk

`func (o *AdAccountsAudienceUpdate) GetOperationTypeOk() (*AudienceUpdateOperationType, bool)`

GetOperationTypeOk returns a tuple with the OperationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationType

`func (o *AdAccountsAudienceUpdate) SetOperationType(v AudienceUpdateOperationType)`

SetOperationType sets OperationType field to given value.

### HasOperationType

`func (o *AdAccountsAudienceUpdate) HasOperationType() bool`

HasOperationType returns a boolean if a field has been set.

### GetRule

`func (o *AdAccountsAudienceUpdate) GetRule() AdAccountsAudienceRule`

GetRule returns the Rule field if non-nil, zero value otherwise.

### GetRuleOk

`func (o *AdAccountsAudienceUpdate) GetRuleOk() (*AdAccountsAudienceRule, bool)`

GetRuleOk returns a tuple with the Rule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRule

`func (o *AdAccountsAudienceUpdate) SetRule(v AdAccountsAudienceRule)`

SetRule sets Rule field to given value.

### HasRule

`func (o *AdAccountsAudienceUpdate) HasRule() bool`

HasRule returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


