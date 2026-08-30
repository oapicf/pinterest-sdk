# LocalInventoryItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdLink** | Pointer to **string** | Ad link for the item | [optional] 
**Availability** | Pointer to [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] 
**CreatedAt** | **int64** | The millisecond timestamp when the local inventory item was created | 
**ItemId** | **string** | The catalog item id in the merchant namespace | 
**LastUpdatedTime** | **int64** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | 
**Price** | Pointer to **string** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**SalePrice** | Pointer to **string** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**StoreMetadata** | [**StoreMetadata**](StoreMetadata.md) | Store metadata for this local inventory item | 

## Methods

### NewLocalInventoryItemResponse

`func NewLocalInventoryItemResponse(createdAt int64, itemId string, lastUpdatedTime int64, storeMetadata StoreMetadata, ) *LocalInventoryItemResponse`

NewLocalInventoryItemResponse instantiates a new LocalInventoryItemResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalInventoryItemResponseWithDefaults

`func NewLocalInventoryItemResponseWithDefaults() *LocalInventoryItemResponse`

NewLocalInventoryItemResponseWithDefaults instantiates a new LocalInventoryItemResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdLink

`func (o *LocalInventoryItemResponse) GetAdLink() string`

GetAdLink returns the AdLink field if non-nil, zero value otherwise.

### GetAdLinkOk

`func (o *LocalInventoryItemResponse) GetAdLinkOk() (*string, bool)`

GetAdLinkOk returns a tuple with the AdLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdLink

`func (o *LocalInventoryItemResponse) SetAdLink(v string)`

SetAdLink sets AdLink field to given value.

### HasAdLink

`func (o *LocalInventoryItemResponse) HasAdLink() bool`

HasAdLink returns a boolean if a field has been set.

### GetAvailability

`func (o *LocalInventoryItemResponse) GetAvailability() ItemAvailability`

GetAvailability returns the Availability field if non-nil, zero value otherwise.

### GetAvailabilityOk

`func (o *LocalInventoryItemResponse) GetAvailabilityOk() (*ItemAvailability, bool)`

GetAvailabilityOk returns a tuple with the Availability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailability

`func (o *LocalInventoryItemResponse) SetAvailability(v ItemAvailability)`

SetAvailability sets Availability field to given value.

### HasAvailability

`func (o *LocalInventoryItemResponse) HasAvailability() bool`

HasAvailability returns a boolean if a field has been set.

### GetCreatedAt

`func (o *LocalInventoryItemResponse) GetCreatedAt() int64`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *LocalInventoryItemResponse) GetCreatedAtOk() (*int64, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *LocalInventoryItemResponse) SetCreatedAt(v int64)`

SetCreatedAt sets CreatedAt field to given value.


### GetItemId

`func (o *LocalInventoryItemResponse) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *LocalInventoryItemResponse) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *LocalInventoryItemResponse) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetLastUpdatedTime

`func (o *LocalInventoryItemResponse) GetLastUpdatedTime() int64`

GetLastUpdatedTime returns the LastUpdatedTime field if non-nil, zero value otherwise.

### GetLastUpdatedTimeOk

`func (o *LocalInventoryItemResponse) GetLastUpdatedTimeOk() (*int64, bool)`

GetLastUpdatedTimeOk returns a tuple with the LastUpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastUpdatedTime

`func (o *LocalInventoryItemResponse) SetLastUpdatedTime(v int64)`

SetLastUpdatedTime sets LastUpdatedTime field to given value.


### GetPrice

`func (o *LocalInventoryItemResponse) GetPrice() string`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *LocalInventoryItemResponse) GetPriceOk() (*string, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *LocalInventoryItemResponse) SetPrice(v string)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *LocalInventoryItemResponse) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetSalePrice

`func (o *LocalInventoryItemResponse) GetSalePrice() string`

GetSalePrice returns the SalePrice field if non-nil, zero value otherwise.

### GetSalePriceOk

`func (o *LocalInventoryItemResponse) GetSalePriceOk() (*string, bool)`

GetSalePriceOk returns a tuple with the SalePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalePrice

`func (o *LocalInventoryItemResponse) SetSalePrice(v string)`

SetSalePrice sets SalePrice field to given value.

### HasSalePrice

`func (o *LocalInventoryItemResponse) HasSalePrice() bool`

HasSalePrice returns a boolean if a field has been set.

### GetStoreMetadata

`func (o *LocalInventoryItemResponse) GetStoreMetadata() StoreMetadata`

GetStoreMetadata returns the StoreMetadata field if non-nil, zero value otherwise.

### GetStoreMetadataOk

`func (o *LocalInventoryItemResponse) GetStoreMetadataOk() (*StoreMetadata, bool)`

GetStoreMetadataOk returns a tuple with the StoreMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreMetadata

`func (o *LocalInventoryItemResponse) SetStoreMetadata(v StoreMetadata)`

SetStoreMetadata sets StoreMetadata field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


