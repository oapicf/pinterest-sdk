# AudienceUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Ad account ID. | [optional] 
**Name** | Pointer to **string** | Audience name. | [optional] 
**Rule** | Pointer to [**AudienceRule**](AudienceRule.md) |  | [optional] 
**Description** | Pointer to **string** | Audience description. | [optional] 
**OperationType** | Pointer to [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | [optional] [default to UPDATE]

## Methods

### NewAudienceUpdateRequest

`func NewAudienceUpdateRequest() *AudienceUpdateRequest`

NewAudienceUpdateRequest instantiates a new AudienceUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAudienceUpdateRequestWithDefaults

`func NewAudienceUpdateRequestWithDefaults() *AudienceUpdateRequest`

NewAudienceUpdateRequestWithDefaults instantiates a new AudienceUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *AudienceUpdateRequest) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AudienceUpdateRequest) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AudienceUpdateRequest) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AudienceUpdateRequest) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetName

`func (o *AudienceUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AudienceUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AudienceUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AudienceUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRule

`func (o *AudienceUpdateRequest) GetRule() AudienceRule`

GetRule returns the Rule field if non-nil, zero value otherwise.

### GetRuleOk

`func (o *AudienceUpdateRequest) GetRuleOk() (*AudienceRule, bool)`

GetRuleOk returns a tuple with the Rule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRule

`func (o *AudienceUpdateRequest) SetRule(v AudienceRule)`

SetRule sets Rule field to given value.

### HasRule

`func (o *AudienceUpdateRequest) HasRule() bool`

HasRule returns a boolean if a field has been set.

### GetDescription

`func (o *AudienceUpdateRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *AudienceUpdateRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *AudienceUpdateRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *AudienceUpdateRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetOperationType

`func (o *AudienceUpdateRequest) GetOperationType() AudienceUpdateOperationType`

GetOperationType returns the OperationType field if non-nil, zero value otherwise.

### GetOperationTypeOk

`func (o *AudienceUpdateRequest) GetOperationTypeOk() (*AudienceUpdateOperationType, bool)`

GetOperationTypeOk returns a tuple with the OperationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationType

`func (o *AudienceUpdateRequest) SetOperationType(v AudienceUpdateOperationType)`

SetOperationType sets OperationType field to given value.

### HasOperationType

`func (o *AudienceUpdateRequest) HasOperationType() bool`

HasOperationType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


