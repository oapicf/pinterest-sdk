# LabelCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Labels** | [**[]LabelCreateRequestLabelsInner**](LabelCreateRequestLabelsInner.md) | Labels that you are applying to the campaign. | 
**ParentId** | **string** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | 

## Methods

### NewLabelCreateRequest

`func NewLabelCreateRequest(labels []LabelCreateRequestLabelsInner, parentId string, ) *LabelCreateRequest`

NewLabelCreateRequest instantiates a new LabelCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabelCreateRequestWithDefaults

`func NewLabelCreateRequestWithDefaults() *LabelCreateRequest`

NewLabelCreateRequestWithDefaults instantiates a new LabelCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLabels

`func (o *LabelCreateRequest) GetLabels() []LabelCreateRequestLabelsInner`

GetLabels returns the Labels field if non-nil, zero value otherwise.

### GetLabelsOk

`func (o *LabelCreateRequest) GetLabelsOk() (*[]LabelCreateRequestLabelsInner, bool)`

GetLabelsOk returns a tuple with the Labels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabels

`func (o *LabelCreateRequest) SetLabels(v []LabelCreateRequestLabelsInner)`

SetLabels sets Labels field to given value.


### GetParentId

`func (o *LabelCreateRequest) GetParentId() string`

GetParentId returns the ParentId field if non-nil, zero value otherwise.

### GetParentIdOk

`func (o *LabelCreateRequest) GetParentIdOk() (*string, bool)`

GetParentIdOk returns a tuple with the ParentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentId

`func (o *LabelCreateRequest) SetParentId(v string)`

SetParentId sets ParentId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


