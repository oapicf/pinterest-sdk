# AdvancedAuctionProcessedItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | Pointer to **string** | Catalog id pertaining to all items | [optional] 
**Items** | Pointer to [**[]AdvancedAuctionProcessedItem**](AdvancedAuctionProcessedItem.md) | Array of advanced auction processed items | [optional] 

## Methods

### NewAdvancedAuctionProcessedItems

`func NewAdvancedAuctionProcessedItems() *AdvancedAuctionProcessedItems`

NewAdvancedAuctionProcessedItems instantiates a new AdvancedAuctionProcessedItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvancedAuctionProcessedItemsWithDefaults

`func NewAdvancedAuctionProcessedItemsWithDefaults() *AdvancedAuctionProcessedItems`

NewAdvancedAuctionProcessedItemsWithDefaults instantiates a new AdvancedAuctionProcessedItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogId

`func (o *AdvancedAuctionProcessedItems) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *AdvancedAuctionProcessedItems) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *AdvancedAuctionProcessedItems) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *AdvancedAuctionProcessedItems) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### GetItems

`func (o *AdvancedAuctionProcessedItems) GetItems() []AdvancedAuctionProcessedItem`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *AdvancedAuctionProcessedItems) GetItemsOk() (*[]AdvancedAuctionProcessedItem, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *AdvancedAuctionProcessedItems) SetItems(v []AdvancedAuctionProcessedItem)`

SetItems sets Items field to given value.

### HasItems

`func (o *AdvancedAuctionProcessedItems) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


