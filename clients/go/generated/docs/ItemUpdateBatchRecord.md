# ItemUpdateBatchRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | Pointer to **string** | The catalog item id in the merchant namespace | [optional] 
**Attributes** | Pointer to [**UpdatableItemAttributes**](UpdatableItemAttributes.md) |  | [optional] 
**UpdateMask** | Pointer to [**[]UpdateMaskFieldType**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 

## Methods

### NewItemUpdateBatchRecord

`func NewItemUpdateBatchRecord() *ItemUpdateBatchRecord`

NewItemUpdateBatchRecord instantiates a new ItemUpdateBatchRecord object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemUpdateBatchRecordWithDefaults

`func NewItemUpdateBatchRecordWithDefaults() *ItemUpdateBatchRecord`

NewItemUpdateBatchRecordWithDefaults instantiates a new ItemUpdateBatchRecord object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *ItemUpdateBatchRecord) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *ItemUpdateBatchRecord) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *ItemUpdateBatchRecord) SetItemId(v string)`

SetItemId sets ItemId field to given value.

### HasItemId

`func (o *ItemUpdateBatchRecord) HasItemId() bool`

HasItemId returns a boolean if a field has been set.

### GetAttributes

`func (o *ItemUpdateBatchRecord) GetAttributes() UpdatableItemAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *ItemUpdateBatchRecord) GetAttributesOk() (*UpdatableItemAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *ItemUpdateBatchRecord) SetAttributes(v UpdatableItemAttributes)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *ItemUpdateBatchRecord) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.

### GetUpdateMask

`func (o *ItemUpdateBatchRecord) GetUpdateMask() []UpdateMaskFieldType`

GetUpdateMask returns the UpdateMask field if non-nil, zero value otherwise.

### GetUpdateMaskOk

`func (o *ItemUpdateBatchRecord) GetUpdateMaskOk() (*[]UpdateMaskFieldType, bool)`

GetUpdateMaskOk returns a tuple with the UpdateMask field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateMask

`func (o *ItemUpdateBatchRecord) SetUpdateMask(v []UpdateMaskFieldType)`

SetUpdateMask sets UpdateMask field to given value.

### HasUpdateMask

`func (o *ItemUpdateBatchRecord) HasUpdateMask() bool`

HasUpdateMask returns a boolean if a field has been set.

### SetUpdateMaskNil

`func (o *ItemUpdateBatchRecord) SetUpdateMaskNil(b bool)`

 SetUpdateMaskNil sets the value for UpdateMask to be an explicit nil

### UnsetUpdateMask
`func (o *ItemUpdateBatchRecord) UnsetUpdateMask()`

UnsetUpdateMask ensures that no value is present for UpdateMask, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


