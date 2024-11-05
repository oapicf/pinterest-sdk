# AdvancedAuctionItemsSubmitRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **string** | Catalog id pertaining to all items | 
**Items** | [**[]AdvancedAuctionItemsSubmitRecord**](AdvancedAuctionItemsSubmitRecord.md) | Array of item bid option operations | 

## Methods

### NewAdvancedAuctionItemsSubmitRequest

`func NewAdvancedAuctionItemsSubmitRequest(catalogId string, items []AdvancedAuctionItemsSubmitRecord, ) *AdvancedAuctionItemsSubmitRequest`

NewAdvancedAuctionItemsSubmitRequest instantiates a new AdvancedAuctionItemsSubmitRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvancedAuctionItemsSubmitRequestWithDefaults

`func NewAdvancedAuctionItemsSubmitRequestWithDefaults() *AdvancedAuctionItemsSubmitRequest`

NewAdvancedAuctionItemsSubmitRequestWithDefaults instantiates a new AdvancedAuctionItemsSubmitRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogId

`func (o *AdvancedAuctionItemsSubmitRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *AdvancedAuctionItemsSubmitRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *AdvancedAuctionItemsSubmitRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.


### GetItems

`func (o *AdvancedAuctionItemsSubmitRequest) GetItems() []AdvancedAuctionItemsSubmitRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *AdvancedAuctionItemsSubmitRequest) GetItemsOk() (*[]AdvancedAuctionItemsSubmitRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *AdvancedAuctionItemsSubmitRequest) SetItems(v []AdvancedAuctionItemsSubmitRecord)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


