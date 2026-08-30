# TargetingTemplateUpdateRequestReadOrUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Targeting template ID | 
**OperationType** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | 
**TargetingAttributes** | Pointer to [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | [optional] 

## Methods

### NewTargetingTemplateUpdateRequestReadOrUpdate

`func NewTargetingTemplateUpdateRequestReadOrUpdate(id string, operationType AudienceUpdateOperationType, ) *TargetingTemplateUpdateRequestReadOrUpdate`

NewTargetingTemplateUpdateRequestReadOrUpdate instantiates a new TargetingTemplateUpdateRequestReadOrUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTargetingTemplateUpdateRequestReadOrUpdateWithDefaults

`func NewTargetingTemplateUpdateRequestReadOrUpdateWithDefaults() *TargetingTemplateUpdateRequestReadOrUpdate`

NewTargetingTemplateUpdateRequestReadOrUpdateWithDefaults instantiates a new TargetingTemplateUpdateRequestReadOrUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *TargetingTemplateUpdateRequestReadOrUpdate) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TargetingTemplateUpdateRequestReadOrUpdate) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TargetingTemplateUpdateRequestReadOrUpdate) SetId(v string)`

SetId sets Id field to given value.


### GetOperationType

`func (o *TargetingTemplateUpdateRequestReadOrUpdate) GetOperationType() AudienceUpdateOperationType`

GetOperationType returns the OperationType field if non-nil, zero value otherwise.

### GetOperationTypeOk

`func (o *TargetingTemplateUpdateRequestReadOrUpdate) GetOperationTypeOk() (*AudienceUpdateOperationType, bool)`

GetOperationTypeOk returns a tuple with the OperationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationType

`func (o *TargetingTemplateUpdateRequestReadOrUpdate) SetOperationType(v AudienceUpdateOperationType)`

SetOperationType sets OperationType field to given value.


### GetTargetingAttributes

`func (o *TargetingTemplateUpdateRequestReadOrUpdate) GetTargetingAttributes() TargetingSpecOptimal`

GetTargetingAttributes returns the TargetingAttributes field if non-nil, zero value otherwise.

### GetTargetingAttributesOk

`func (o *TargetingTemplateUpdateRequestReadOrUpdate) GetTargetingAttributesOk() (*TargetingSpecOptimal, bool)`

GetTargetingAttributesOk returns a tuple with the TargetingAttributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingAttributes

`func (o *TargetingTemplateUpdateRequestReadOrUpdate) SetTargetingAttributes(v TargetingSpecOptimal)`

SetTargetingAttributes sets TargetingAttributes field to given value.

### HasTargetingAttributes

`func (o *TargetingTemplateUpdateRequestReadOrUpdate) HasTargetingAttributes() bool`

HasTargetingAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


