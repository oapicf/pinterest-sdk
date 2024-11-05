# AdvancedAuctionItemsGetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **string** | Catalog id pertaining to the retail item | 
**Items** | [**[]AdvancedAuctionItemsGetRecord**](AdvancedAuctionItemsGetRecord.md) | A list of retail catalog items to fetch bid options for | 

## Methods

### NewAdvancedAuctionItemsGetRequest

`func NewAdvancedAuctionItemsGetRequest(catalogId string, items []AdvancedAuctionItemsGetRecord, ) *AdvancedAuctionItemsGetRequest`

NewAdvancedAuctionItemsGetRequest instantiates a new AdvancedAuctionItemsGetRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvancedAuctionItemsGetRequestWithDefaults

`func NewAdvancedAuctionItemsGetRequestWithDefaults() *AdvancedAuctionItemsGetRequest`

NewAdvancedAuctionItemsGetRequestWithDefaults instantiates a new AdvancedAuctionItemsGetRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogId

`func (o *AdvancedAuctionItemsGetRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *AdvancedAuctionItemsGetRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *AdvancedAuctionItemsGetRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.


### GetItems

`func (o *AdvancedAuctionItemsGetRequest) GetItems() []AdvancedAuctionItemsGetRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *AdvancedAuctionItemsGetRequest) GetItemsOk() (*[]AdvancedAuctionItemsGetRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *AdvancedAuctionItemsGetRequest) SetItems(v []AdvancedAuctionItemsGetRecord)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


