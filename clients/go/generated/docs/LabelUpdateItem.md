# LabelUpdateItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Label ID. | 
**Status** | Pointer to [**LabelStatus**](LabelStatus.md) |  | [optional] 
**Value** | Pointer to **string** | Label name. 100-character limit. | [optional] 

## Methods

### NewLabelUpdateItem

`func NewLabelUpdateItem(id string, ) *LabelUpdateItem`

NewLabelUpdateItem instantiates a new LabelUpdateItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabelUpdateItemWithDefaults

`func NewLabelUpdateItemWithDefaults() *LabelUpdateItem`

NewLabelUpdateItemWithDefaults instantiates a new LabelUpdateItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *LabelUpdateItem) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LabelUpdateItem) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LabelUpdateItem) SetId(v string)`

SetId sets Id field to given value.


### GetStatus

`func (o *LabelUpdateItem) GetStatus() LabelStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *LabelUpdateItem) GetStatusOk() (*LabelStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *LabelUpdateItem) SetStatus(v LabelStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *LabelUpdateItem) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetValue

`func (o *LabelUpdateItem) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *LabelUpdateItem) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *LabelUpdateItem) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *LabelUpdateItem) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


