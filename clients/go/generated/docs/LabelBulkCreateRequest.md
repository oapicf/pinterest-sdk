# LabelBulkCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Labels** | [**[]LabelCreateItem**](LabelCreateItem.md) | Labels that you are applying to the campaign. | 
**ParentId** | **string** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | 

## Methods

### NewLabelBulkCreateRequest

`func NewLabelBulkCreateRequest(labels []LabelCreateItem, parentId string, ) *LabelBulkCreateRequest`

NewLabelBulkCreateRequest instantiates a new LabelBulkCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabelBulkCreateRequestWithDefaults

`func NewLabelBulkCreateRequestWithDefaults() *LabelBulkCreateRequest`

NewLabelBulkCreateRequestWithDefaults instantiates a new LabelBulkCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLabels

`func (o *LabelBulkCreateRequest) GetLabels() []LabelCreateItem`

GetLabels returns the Labels field if non-nil, zero value otherwise.

### GetLabelsOk

`func (o *LabelBulkCreateRequest) GetLabelsOk() (*[]LabelCreateItem, bool)`

GetLabelsOk returns a tuple with the Labels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabels

`func (o *LabelBulkCreateRequest) SetLabels(v []LabelCreateItem)`

SetLabels sets Labels field to given value.


### GetParentId

`func (o *LabelBulkCreateRequest) GetParentId() string`

GetParentId returns the ParentId field if non-nil, zero value otherwise.

### GetParentIdOk

`func (o *LabelBulkCreateRequest) GetParentIdOk() (*string, bool)`

GetParentIdOk returns a tuple with the ParentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentId

`func (o *LabelBulkCreateRequest) SetParentId(v string)`

SetParentId sets ParentId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


