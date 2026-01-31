# Label

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Label ID. | [optional] 
**LabelType** | Pointer to [**NullableLabelType**](LabelType.md) |  | [optional] 
**ParentId** | Pointer to **string** | Label parent entity ID. | [optional] 
**ParentType** | Pointer to **NullableString** | Label parent entity type. | [optional] 
**Status** | Pointer to [**NullableLabelStatus**](LabelStatus.md) |  | [optional] 
**Value** | Pointer to **string** | Label name. | [optional] 

## Methods

### NewLabel

`func NewLabel() *Label`

NewLabel instantiates a new Label object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabelWithDefaults

`func NewLabelWithDefaults() *Label`

NewLabelWithDefaults instantiates a new Label object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Label) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Label) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Label) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *Label) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLabelType

`func (o *Label) GetLabelType() LabelType`

GetLabelType returns the LabelType field if non-nil, zero value otherwise.

### GetLabelTypeOk

`func (o *Label) GetLabelTypeOk() (*LabelType, bool)`

GetLabelTypeOk returns a tuple with the LabelType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabelType

`func (o *Label) SetLabelType(v LabelType)`

SetLabelType sets LabelType field to given value.

### HasLabelType

`func (o *Label) HasLabelType() bool`

HasLabelType returns a boolean if a field has been set.

### SetLabelTypeNil

`func (o *Label) SetLabelTypeNil(b bool)`

 SetLabelTypeNil sets the value for LabelType to be an explicit nil

### UnsetLabelType
`func (o *Label) UnsetLabelType()`

UnsetLabelType ensures that no value is present for LabelType, not even an explicit nil
### GetParentId

`func (o *Label) GetParentId() string`

GetParentId returns the ParentId field if non-nil, zero value otherwise.

### GetParentIdOk

`func (o *Label) GetParentIdOk() (*string, bool)`

GetParentIdOk returns a tuple with the ParentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentId

`func (o *Label) SetParentId(v string)`

SetParentId sets ParentId field to given value.

### HasParentId

`func (o *Label) HasParentId() bool`

HasParentId returns a boolean if a field has been set.

### GetParentType

`func (o *Label) GetParentType() string`

GetParentType returns the ParentType field if non-nil, zero value otherwise.

### GetParentTypeOk

`func (o *Label) GetParentTypeOk() (*string, bool)`

GetParentTypeOk returns a tuple with the ParentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentType

`func (o *Label) SetParentType(v string)`

SetParentType sets ParentType field to given value.

### HasParentType

`func (o *Label) HasParentType() bool`

HasParentType returns a boolean if a field has been set.

### SetParentTypeNil

`func (o *Label) SetParentTypeNil(b bool)`

 SetParentTypeNil sets the value for ParentType to be an explicit nil

### UnsetParentType
`func (o *Label) UnsetParentType()`

UnsetParentType ensures that no value is present for ParentType, not even an explicit nil
### GetStatus

`func (o *Label) GetStatus() LabelStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Label) GetStatusOk() (*LabelStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Label) SetStatus(v LabelStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Label) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### SetStatusNil

`func (o *Label) SetStatusNil(b bool)`

 SetStatusNil sets the value for Status to be an explicit nil

### UnsetStatus
`func (o *Label) UnsetStatus()`

UnsetStatus ensures that no value is present for Status, not even an explicit nil
### GetValue

`func (o *Label) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *Label) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *Label) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *Label) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


