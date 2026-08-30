# Label

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Label ID. | 
**LabelType** | [**NullableNullableLabelType**](NullableLabelType.md) |  | 
**Status** | Pointer to [**NullableNullableLabelStatus**](NullableLabelStatus.md) |  | [optional] 
**Value** | **string** | Label name. 100-character limit. | 

## Methods

### NewLabel

`func NewLabel(id string, labelType NullableNullableLabelType, value string, ) *Label`

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


### GetLabelType

`func (o *Label) GetLabelType() NullableLabelType`

GetLabelType returns the LabelType field if non-nil, zero value otherwise.

### GetLabelTypeOk

`func (o *Label) GetLabelTypeOk() (*NullableLabelType, bool)`

GetLabelTypeOk returns a tuple with the LabelType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabelType

`func (o *Label) SetLabelType(v NullableLabelType)`

SetLabelType sets LabelType field to given value.


### SetLabelTypeNil

`func (o *Label) SetLabelTypeNil(b bool)`

 SetLabelTypeNil sets the value for LabelType to be an explicit nil

### UnsetLabelType
`func (o *Label) UnsetLabelType()`

UnsetLabelType ensures that no value is present for LabelType, not even an explicit nil
### GetStatus

`func (o *Label) GetStatus() NullableLabelStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Label) GetStatusOk() (*NullableLabelStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Label) SetStatus(v NullableLabelStatus)`

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



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


