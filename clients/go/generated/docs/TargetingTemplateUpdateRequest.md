# TargetingTemplateUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Targeting template ID | 
**OperationType** | **string** |  | 
**TargetingAttributes** | Pointer to [**TargetingSpec**](TargetingSpec.md) |  | [optional] 

## Methods

### NewTargetingTemplateUpdateRequest

`func NewTargetingTemplateUpdateRequest(id string, operationType string, ) *TargetingTemplateUpdateRequest`

NewTargetingTemplateUpdateRequest instantiates a new TargetingTemplateUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTargetingTemplateUpdateRequestWithDefaults

`func NewTargetingTemplateUpdateRequestWithDefaults() *TargetingTemplateUpdateRequest`

NewTargetingTemplateUpdateRequestWithDefaults instantiates a new TargetingTemplateUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *TargetingTemplateUpdateRequest) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TargetingTemplateUpdateRequest) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TargetingTemplateUpdateRequest) SetId(v string)`

SetId sets Id field to given value.


### GetOperationType

`func (o *TargetingTemplateUpdateRequest) GetOperationType() string`

GetOperationType returns the OperationType field if non-nil, zero value otherwise.

### GetOperationTypeOk

`func (o *TargetingTemplateUpdateRequest) GetOperationTypeOk() (*string, bool)`

GetOperationTypeOk returns a tuple with the OperationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationType

`func (o *TargetingTemplateUpdateRequest) SetOperationType(v string)`

SetOperationType sets OperationType field to given value.


### GetTargetingAttributes

`func (o *TargetingTemplateUpdateRequest) GetTargetingAttributes() TargetingSpec`

GetTargetingAttributes returns the TargetingAttributes field if non-nil, zero value otherwise.

### GetTargetingAttributesOk

`func (o *TargetingTemplateUpdateRequest) GetTargetingAttributesOk() (*TargetingSpec, bool)`

GetTargetingAttributesOk returns a tuple with the TargetingAttributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingAttributes

`func (o *TargetingTemplateUpdateRequest) SetTargetingAttributes(v TargetingSpec)`

SetTargetingAttributes sets TargetingAttributes field to given value.

### HasTargetingAttributes

`func (o *TargetingTemplateUpdateRequest) HasTargetingAttributes() bool`

HasTargetingAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


