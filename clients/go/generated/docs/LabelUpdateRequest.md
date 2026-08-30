# LabelUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Labels** | [**[]LabelUpdateItem**](LabelUpdateItem.md) | Labels that you are applying to the campaign. | 

## Methods

### NewLabelUpdateRequest

`func NewLabelUpdateRequest(labels []LabelUpdateItem, ) *LabelUpdateRequest`

NewLabelUpdateRequest instantiates a new LabelUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabelUpdateRequestWithDefaults

`func NewLabelUpdateRequestWithDefaults() *LabelUpdateRequest`

NewLabelUpdateRequestWithDefaults instantiates a new LabelUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLabels

`func (o *LabelUpdateRequest) GetLabels() []LabelUpdateItem`

GetLabels returns the Labels field if non-nil, zero value otherwise.

### GetLabelsOk

`func (o *LabelUpdateRequest) GetLabelsOk() (*[]LabelUpdateItem, bool)`

GetLabelsOk returns a tuple with the Labels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabels

`func (o *LabelUpdateRequest) SetLabels(v []LabelUpdateItem)`

SetLabels sets Labels field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


