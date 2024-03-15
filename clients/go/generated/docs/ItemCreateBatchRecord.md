# ItemCreateBatchRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | Pointer to **string** | The catalog item id in the merchant namespace | [optional] 
**Attributes** | Pointer to [**ItemAttributes**](ItemAttributes.md) |  | [optional] 

## Methods

### NewItemCreateBatchRecord

`func NewItemCreateBatchRecord() *ItemCreateBatchRecord`

NewItemCreateBatchRecord instantiates a new ItemCreateBatchRecord object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemCreateBatchRecordWithDefaults

`func NewItemCreateBatchRecordWithDefaults() *ItemCreateBatchRecord`

NewItemCreateBatchRecordWithDefaults instantiates a new ItemCreateBatchRecord object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *ItemCreateBatchRecord) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *ItemCreateBatchRecord) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *ItemCreateBatchRecord) SetItemId(v string)`

SetItemId sets ItemId field to given value.

### HasItemId

`func (o *ItemCreateBatchRecord) HasItemId() bool`

HasItemId returns a boolean if a field has been set.

### GetAttributes

`func (o *ItemCreateBatchRecord) GetAttributes() ItemAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *ItemCreateBatchRecord) GetAttributesOk() (*ItemAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *ItemCreateBatchRecord) SetAttributes(v ItemAttributes)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *ItemCreateBatchRecord) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


