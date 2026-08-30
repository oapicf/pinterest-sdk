# LabelBulkUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Label ID. | 
**ParentId** | **string** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | 
**Status** | [**LabelStatusBulkUpdate**](LabelStatusBulkUpdate.md) |  | 

## Methods

### NewLabelBulkUpdateRequest

`func NewLabelBulkUpdateRequest(id string, parentId string, status LabelStatusBulkUpdate, ) *LabelBulkUpdateRequest`

NewLabelBulkUpdateRequest instantiates a new LabelBulkUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabelBulkUpdateRequestWithDefaults

`func NewLabelBulkUpdateRequestWithDefaults() *LabelBulkUpdateRequest`

NewLabelBulkUpdateRequestWithDefaults instantiates a new LabelBulkUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *LabelBulkUpdateRequest) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LabelBulkUpdateRequest) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LabelBulkUpdateRequest) SetId(v string)`

SetId sets Id field to given value.


### GetParentId

`func (o *LabelBulkUpdateRequest) GetParentId() string`

GetParentId returns the ParentId field if non-nil, zero value otherwise.

### GetParentIdOk

`func (o *LabelBulkUpdateRequest) GetParentIdOk() (*string, bool)`

GetParentIdOk returns a tuple with the ParentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentId

`func (o *LabelBulkUpdateRequest) SetParentId(v string)`

SetParentId sets ParentId field to given value.


### GetStatus

`func (o *LabelBulkUpdateRequest) GetStatus() LabelStatusBulkUpdate`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *LabelBulkUpdateRequest) GetStatusOk() (*LabelStatusBulkUpdate, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *LabelBulkUpdateRequest) SetStatus(v LabelStatusBulkUpdate)`

SetStatus sets Status field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


