# LabelCreateRequestLabelsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LabelType** | [**NullableLabelType**](LabelType.md) |  | 
**Value** | **string** | Label name. 100-character limit. | 

## Methods

### NewLabelCreateRequestLabelsInner

`func NewLabelCreateRequestLabelsInner(labelType NullableLabelType, value string, ) *LabelCreateRequestLabelsInner`

NewLabelCreateRequestLabelsInner instantiates a new LabelCreateRequestLabelsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabelCreateRequestLabelsInnerWithDefaults

`func NewLabelCreateRequestLabelsInnerWithDefaults() *LabelCreateRequestLabelsInner`

NewLabelCreateRequestLabelsInnerWithDefaults instantiates a new LabelCreateRequestLabelsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLabelType

`func (o *LabelCreateRequestLabelsInner) GetLabelType() LabelType`

GetLabelType returns the LabelType field if non-nil, zero value otherwise.

### GetLabelTypeOk

`func (o *LabelCreateRequestLabelsInner) GetLabelTypeOk() (*LabelType, bool)`

GetLabelTypeOk returns a tuple with the LabelType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabelType

`func (o *LabelCreateRequestLabelsInner) SetLabelType(v LabelType)`

SetLabelType sets LabelType field to given value.


### SetLabelTypeNil

`func (o *LabelCreateRequestLabelsInner) SetLabelTypeNil(b bool)`

 SetLabelTypeNil sets the value for LabelType to be an explicit nil

### UnsetLabelType
`func (o *LabelCreateRequestLabelsInner) UnsetLabelType()`

UnsetLabelType ensures that no value is present for LabelType, not even an explicit nil
### GetValue

`func (o *LabelCreateRequestLabelsInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *LabelCreateRequestLabelsInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *LabelCreateRequestLabelsInner) SetValue(v string)`

SetValue sets Value field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


