# ConversionEventsDataItemsCustomDataContentsItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] 
**ItemBrand** | Pointer to **string** | The brand of a product. | [optional] 
**ItemBrandId** | Pointer to **string** | The brand ID of a product. | [optional] 
**ItemCategory** | Pointer to **string** | The category of a product. | [optional] 
**ItemName** | Pointer to **string** | The name of a product. | [optional] 
**ItemPrice** | Pointer to **string** | The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] 
**Quantity** | Pointer to **int64** | The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] 

## Methods

### NewConversionEventsDataItemsCustomDataContentsItems

`func NewConversionEventsDataItemsCustomDataContentsItems() *ConversionEventsDataItemsCustomDataContentsItems`

NewConversionEventsDataItemsCustomDataContentsItems instantiates a new ConversionEventsDataItemsCustomDataContentsItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventsDataItemsCustomDataContentsItemsWithDefaults

`func NewConversionEventsDataItemsCustomDataContentsItemsWithDefaults() *ConversionEventsDataItemsCustomDataContentsItems`

NewConversionEventsDataItemsCustomDataContentsItemsWithDefaults instantiates a new ConversionEventsDataItemsCustomDataContentsItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ConversionEventsDataItemsCustomDataContentsItems) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *ConversionEventsDataItemsCustomDataContentsItems) HasId() bool`

HasId returns a boolean if a field has been set.

### GetItemBrand

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetItemBrand() string`

GetItemBrand returns the ItemBrand field if non-nil, zero value otherwise.

### GetItemBrandOk

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetItemBrandOk() (*string, bool)`

GetItemBrandOk returns a tuple with the ItemBrand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemBrand

`func (o *ConversionEventsDataItemsCustomDataContentsItems) SetItemBrand(v string)`

SetItemBrand sets ItemBrand field to given value.

### HasItemBrand

`func (o *ConversionEventsDataItemsCustomDataContentsItems) HasItemBrand() bool`

HasItemBrand returns a boolean if a field has been set.

### GetItemBrandId

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetItemBrandId() string`

GetItemBrandId returns the ItemBrandId field if non-nil, zero value otherwise.

### GetItemBrandIdOk

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetItemBrandIdOk() (*string, bool)`

GetItemBrandIdOk returns a tuple with the ItemBrandId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemBrandId

`func (o *ConversionEventsDataItemsCustomDataContentsItems) SetItemBrandId(v string)`

SetItemBrandId sets ItemBrandId field to given value.

### HasItemBrandId

`func (o *ConversionEventsDataItemsCustomDataContentsItems) HasItemBrandId() bool`

HasItemBrandId returns a boolean if a field has been set.

### GetItemCategory

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetItemCategory() string`

GetItemCategory returns the ItemCategory field if non-nil, zero value otherwise.

### GetItemCategoryOk

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetItemCategoryOk() (*string, bool)`

GetItemCategoryOk returns a tuple with the ItemCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemCategory

`func (o *ConversionEventsDataItemsCustomDataContentsItems) SetItemCategory(v string)`

SetItemCategory sets ItemCategory field to given value.

### HasItemCategory

`func (o *ConversionEventsDataItemsCustomDataContentsItems) HasItemCategory() bool`

HasItemCategory returns a boolean if a field has been set.

### GetItemName

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetItemName() string`

GetItemName returns the ItemName field if non-nil, zero value otherwise.

### GetItemNameOk

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetItemNameOk() (*string, bool)`

GetItemNameOk returns a tuple with the ItemName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemName

`func (o *ConversionEventsDataItemsCustomDataContentsItems) SetItemName(v string)`

SetItemName sets ItemName field to given value.

### HasItemName

`func (o *ConversionEventsDataItemsCustomDataContentsItems) HasItemName() bool`

HasItemName returns a boolean if a field has been set.

### GetItemPrice

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetItemPrice() string`

GetItemPrice returns the ItemPrice field if non-nil, zero value otherwise.

### GetItemPriceOk

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetItemPriceOk() (*string, bool)`

GetItemPriceOk returns a tuple with the ItemPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemPrice

`func (o *ConversionEventsDataItemsCustomDataContentsItems) SetItemPrice(v string)`

SetItemPrice sets ItemPrice field to given value.

### HasItemPrice

`func (o *ConversionEventsDataItemsCustomDataContentsItems) HasItemPrice() bool`

HasItemPrice returns a boolean if a field has been set.

### GetQuantity

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetQuantity() int64`

GetQuantity returns the Quantity field if non-nil, zero value otherwise.

### GetQuantityOk

`func (o *ConversionEventsDataItemsCustomDataContentsItems) GetQuantityOk() (*int64, bool)`

GetQuantityOk returns a tuple with the Quantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuantity

`func (o *ConversionEventsDataItemsCustomDataContentsItems) SetQuantity(v int64)`

SetQuantity sets Quantity field to given value.

### HasQuantity

`func (o *ConversionEventsDataItemsCustomDataContentsItems) HasQuantity() bool`

HasQuantity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


