# ItemBatchRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | Pointer to **string** | The catalog item id in the merchant namespace | [optional] 
**Attributes** | Pointer to [**ItemAttributes**](ItemAttributes.md) |  | [optional] 

## Methods

### NewItemBatchRecord

`func NewItemBatchRecord() *ItemBatchRecord`

NewItemBatchRecord instantiates a new ItemBatchRecord object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemBatchRecordWithDefaults

`func NewItemBatchRecordWithDefaults() *ItemBatchRecord`

NewItemBatchRecordWithDefaults instantiates a new ItemBatchRecord object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *ItemBatchRecord) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *ItemBatchRecord) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *ItemBatchRecord) SetItemId(v string)`

SetItemId sets ItemId field to given value.

### HasItemId

`func (o *ItemBatchRecord) HasItemId() bool`

HasItemId returns a boolean if a field has been set.

### GetAttributes

`func (o *ItemBatchRecord) GetAttributes() ItemAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *ItemBatchRecord) GetAttributesOk() (*ItemAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *ItemBatchRecord) SetAttributes(v ItemAttributes)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *ItemBatchRecord) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


