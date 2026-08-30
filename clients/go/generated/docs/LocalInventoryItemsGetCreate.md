# LocalInventoryItemsGetCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemFilters** | [**[]ItemIdStoreCodePair**](ItemIdStoreCodePair.md) | Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items. | 

## Methods

### NewLocalInventoryItemsGetCreate

`func NewLocalInventoryItemsGetCreate(itemFilters []ItemIdStoreCodePair, ) *LocalInventoryItemsGetCreate`

NewLocalInventoryItemsGetCreate instantiates a new LocalInventoryItemsGetCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalInventoryItemsGetCreateWithDefaults

`func NewLocalInventoryItemsGetCreateWithDefaults() *LocalInventoryItemsGetCreate`

NewLocalInventoryItemsGetCreateWithDefaults instantiates a new LocalInventoryItemsGetCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemFilters

`func (o *LocalInventoryItemsGetCreate) GetItemFilters() []ItemIdStoreCodePair`

GetItemFilters returns the ItemFilters field if non-nil, zero value otherwise.

### GetItemFiltersOk

`func (o *LocalInventoryItemsGetCreate) GetItemFiltersOk() (*[]ItemIdStoreCodePair, bool)`

GetItemFiltersOk returns a tuple with the ItemFilters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemFilters

`func (o *LocalInventoryItemsGetCreate) SetItemFilters(v []ItemIdStoreCodePair)`

SetItemFilters sets ItemFilters field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


