# LabelBulkUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Label ID. | 
**Status** | Pointer to **string** | Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity. | [optional] 
**Value** | Pointer to **string** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; value field will be deprecated. Label name. 100-character limit. | [optional] 

## Methods

### NewLabelBulkUpdateRequest

`func NewLabelBulkUpdateRequest(id string, ) *LabelBulkUpdateRequest`

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


### GetStatus

`func (o *LabelBulkUpdateRequest) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *LabelBulkUpdateRequest) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *LabelBulkUpdateRequest) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *LabelBulkUpdateRequest) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetValue

`func (o *LabelBulkUpdateRequest) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *LabelBulkUpdateRequest) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *LabelBulkUpdateRequest) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *LabelBulkUpdateRequest) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


