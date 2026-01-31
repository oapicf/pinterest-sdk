# LabelUpdateRequestLabelsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Label ID. | 
**Status** | Pointer to [**NullableLabelStatus**](LabelStatus.md) |  | [optional] 
**Value** | Pointer to **string** | Label name. 100-character limit. | [optional] 

## Methods

### NewLabelUpdateRequestLabelsInner

`func NewLabelUpdateRequestLabelsInner(id string, ) *LabelUpdateRequestLabelsInner`

NewLabelUpdateRequestLabelsInner instantiates a new LabelUpdateRequestLabelsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabelUpdateRequestLabelsInnerWithDefaults

`func NewLabelUpdateRequestLabelsInnerWithDefaults() *LabelUpdateRequestLabelsInner`

NewLabelUpdateRequestLabelsInnerWithDefaults instantiates a new LabelUpdateRequestLabelsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *LabelUpdateRequestLabelsInner) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LabelUpdateRequestLabelsInner) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LabelUpdateRequestLabelsInner) SetId(v string)`

SetId sets Id field to given value.


### GetStatus

`func (o *LabelUpdateRequestLabelsInner) GetStatus() LabelStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *LabelUpdateRequestLabelsInner) GetStatusOk() (*LabelStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *LabelUpdateRequestLabelsInner) SetStatus(v LabelStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *LabelUpdateRequestLabelsInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### SetStatusNil

`func (o *LabelUpdateRequestLabelsInner) SetStatusNil(b bool)`

 SetStatusNil sets the value for Status to be an explicit nil

### UnsetStatus
`func (o *LabelUpdateRequestLabelsInner) UnsetStatus()`

UnsetStatus ensures that no value is present for Status, not even an explicit nil
### GetValue

`func (o *LabelUpdateRequestLabelsInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *LabelUpdateRequestLabelsInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *LabelUpdateRequestLabelsInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *LabelUpdateRequestLabelsInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


