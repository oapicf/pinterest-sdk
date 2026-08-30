# LabelErrorData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Label ID. | [optional] 
**LabelType** | Pointer to [**NullableNullableLabelType**](NullableLabelType.md) |  | [optional] 
**Status** | Pointer to [**NullableNullableLabelStatus**](NullableLabelStatus.md) |  | [optional] 
**Value** | Pointer to **string** | Label name. 100-character limit. | [optional] 

## Methods

### NewLabelErrorData

`func NewLabelErrorData() *LabelErrorData`

NewLabelErrorData instantiates a new LabelErrorData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabelErrorDataWithDefaults

`func NewLabelErrorDataWithDefaults() *LabelErrorData`

NewLabelErrorDataWithDefaults instantiates a new LabelErrorData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *LabelErrorData) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LabelErrorData) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LabelErrorData) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *LabelErrorData) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLabelType

`func (o *LabelErrorData) GetLabelType() NullableLabelType`

GetLabelType returns the LabelType field if non-nil, zero value otherwise.

### GetLabelTypeOk

`func (o *LabelErrorData) GetLabelTypeOk() (*NullableLabelType, bool)`

GetLabelTypeOk returns a tuple with the LabelType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabelType

`func (o *LabelErrorData) SetLabelType(v NullableLabelType)`

SetLabelType sets LabelType field to given value.

### HasLabelType

`func (o *LabelErrorData) HasLabelType() bool`

HasLabelType returns a boolean if a field has been set.

### SetLabelTypeNil

`func (o *LabelErrorData) SetLabelTypeNil(b bool)`

 SetLabelTypeNil sets the value for LabelType to be an explicit nil

### UnsetLabelType
`func (o *LabelErrorData) UnsetLabelType()`

UnsetLabelType ensures that no value is present for LabelType, not even an explicit nil
### GetStatus

`func (o *LabelErrorData) GetStatus() NullableLabelStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *LabelErrorData) GetStatusOk() (*NullableLabelStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *LabelErrorData) SetStatus(v NullableLabelStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *LabelErrorData) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### SetStatusNil

`func (o *LabelErrorData) SetStatusNil(b bool)`

 SetStatusNil sets the value for Status to be an explicit nil

### UnsetStatus
`func (o *LabelErrorData) UnsetStatus()`

UnsetStatus ensures that no value is present for Status, not even an explicit nil
### GetValue

`func (o *LabelErrorData) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *LabelErrorData) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *LabelErrorData) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *LabelErrorData) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


