# CatalogsItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | Pointer to [**[]ItemBatchRecord**](ItemBatchRecord.md) | Array with catalogs items | [optional] 

## Methods

### NewCatalogsItems

`func NewCatalogsItems() *CatalogsItems`

NewCatalogsItems instantiates a new CatalogsItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemsWithDefaults

`func NewCatalogsItemsWithDefaults() *CatalogsItems`

NewCatalogsItemsWithDefaults instantiates a new CatalogsItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *CatalogsItems) GetItems() []ItemBatchRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsItems) GetItemsOk() (*[]ItemBatchRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsItems) SetItems(v []ItemBatchRecord)`

SetItems sets Items field to given value.

### HasItems

`func (o *CatalogsItems) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


