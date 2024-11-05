# AdvancedAuctionItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | Pointer to **string** | Response object of item bid options | [optional] 
**Items** | Pointer to [**[]AdvancedAuctionItem**](AdvancedAuctionItem.md) | Array with item bid options | [optional] 

## Methods

### NewAdvancedAuctionItems

`func NewAdvancedAuctionItems() *AdvancedAuctionItems`

NewAdvancedAuctionItems instantiates a new AdvancedAuctionItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvancedAuctionItemsWithDefaults

`func NewAdvancedAuctionItemsWithDefaults() *AdvancedAuctionItems`

NewAdvancedAuctionItemsWithDefaults instantiates a new AdvancedAuctionItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogId

`func (o *AdvancedAuctionItems) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *AdvancedAuctionItems) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *AdvancedAuctionItems) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *AdvancedAuctionItems) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### GetItems

`func (o *AdvancedAuctionItems) GetItems() []AdvancedAuctionItem`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *AdvancedAuctionItems) GetItemsOk() (*[]AdvancedAuctionItem, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *AdvancedAuctionItems) SetItems(v []AdvancedAuctionItem)`

SetItems sets Items field to given value.

### HasItems

`func (o *AdvancedAuctionItems) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


