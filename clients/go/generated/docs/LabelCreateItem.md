# LabelCreateItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LabelType** | [**LabelType**](LabelType.md) |  | 
**Value** | **string** | Label name. 100-character limit. | 

## Methods

### NewLabelCreateItem

`func NewLabelCreateItem(labelType LabelType, value string, ) *LabelCreateItem`

NewLabelCreateItem instantiates a new LabelCreateItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabelCreateItemWithDefaults

`func NewLabelCreateItemWithDefaults() *LabelCreateItem`

NewLabelCreateItemWithDefaults instantiates a new LabelCreateItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLabelType

`func (o *LabelCreateItem) GetLabelType() LabelType`

GetLabelType returns the LabelType field if non-nil, zero value otherwise.

### GetLabelTypeOk

`func (o *LabelCreateItem) GetLabelTypeOk() (*LabelType, bool)`

GetLabelTypeOk returns a tuple with the LabelType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabelType

`func (o *LabelCreateItem) SetLabelType(v LabelType)`

SetLabelType sets LabelType field to given value.


### GetValue

`func (o *LabelCreateItem) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *LabelCreateItem) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *LabelCreateItem) SetValue(v string)`

SetValue sets Value field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


