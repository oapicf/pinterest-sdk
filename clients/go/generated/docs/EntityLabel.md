# EntityLabel

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityId** | **string** | Entity ID to apply label to. | 
**EntityType** | Pointer to [**NullableLabelParentType**](LabelParentType.md) |  | [optional] 
**LabelId** | **string** | Label ID. | 
**Status** | Pointer to [**NullableEntityLabelStatus**](EntityLabelStatus.md) |  | [optional] 

## Methods

### NewEntityLabel

`func NewEntityLabel(entityId string, labelId string, ) *EntityLabel`

NewEntityLabel instantiates a new EntityLabel object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEntityLabelWithDefaults

`func NewEntityLabelWithDefaults() *EntityLabel`

NewEntityLabelWithDefaults instantiates a new EntityLabel object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntityId

`func (o *EntityLabel) GetEntityId() string`

GetEntityId returns the EntityId field if non-nil, zero value otherwise.

### GetEntityIdOk

`func (o *EntityLabel) GetEntityIdOk() (*string, bool)`

GetEntityIdOk returns a tuple with the EntityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityId

`func (o *EntityLabel) SetEntityId(v string)`

SetEntityId sets EntityId field to given value.


### GetEntityType

`func (o *EntityLabel) GetEntityType() LabelParentType`

GetEntityType returns the EntityType field if non-nil, zero value otherwise.

### GetEntityTypeOk

`func (o *EntityLabel) GetEntityTypeOk() (*LabelParentType, bool)`

GetEntityTypeOk returns a tuple with the EntityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityType

`func (o *EntityLabel) SetEntityType(v LabelParentType)`

SetEntityType sets EntityType field to given value.

### HasEntityType

`func (o *EntityLabel) HasEntityType() bool`

HasEntityType returns a boolean if a field has been set.

### SetEntityTypeNil

`func (o *EntityLabel) SetEntityTypeNil(b bool)`

 SetEntityTypeNil sets the value for EntityType to be an explicit nil

### UnsetEntityType
`func (o *EntityLabel) UnsetEntityType()`

UnsetEntityType ensures that no value is present for EntityType, not even an explicit nil
### GetLabelId

`func (o *EntityLabel) GetLabelId() string`

GetLabelId returns the LabelId field if non-nil, zero value otherwise.

### GetLabelIdOk

`func (o *EntityLabel) GetLabelIdOk() (*string, bool)`

GetLabelIdOk returns a tuple with the LabelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabelId

`func (o *EntityLabel) SetLabelId(v string)`

SetLabelId sets LabelId field to given value.


### GetStatus

`func (o *EntityLabel) GetStatus() EntityLabelStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *EntityLabel) GetStatusOk() (*EntityLabelStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *EntityLabel) SetStatus(v EntityLabelStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *EntityLabel) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### SetStatusNil

`func (o *EntityLabel) SetStatusNil(b bool)`

 SetStatusNil sets the value for Status to be an explicit nil

### UnsetStatus
`func (o *EntityLabel) UnsetStatus()`

UnsetStatus ensures that no value is present for Status, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


