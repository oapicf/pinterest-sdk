# ConversionEventsDataInnerCustomDataContentsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**ItemPrice** | Pointer to **string** | The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**Quantity** | Pointer to **int64** | The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**ItemName** | Pointer to **string** | The name of a product. | [optional] 
**ItemCategory** | Pointer to **string** | The category of a product. | [optional] 
**ItemBrand** | Pointer to **string** | The brand of a product. | [optional] 

## Methods

### NewConversionEventsDataInnerCustomDataContentsInner

`func NewConversionEventsDataInnerCustomDataContentsInner() *ConversionEventsDataInnerCustomDataContentsInner`

NewConversionEventsDataInnerCustomDataContentsInner instantiates a new ConversionEventsDataInnerCustomDataContentsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventsDataInnerCustomDataContentsInnerWithDefaults

`func NewConversionEventsDataInnerCustomDataContentsInnerWithDefaults() *ConversionEventsDataInnerCustomDataContentsInner`

NewConversionEventsDataInnerCustomDataContentsInnerWithDefaults instantiates a new ConversionEventsDataInnerCustomDataContentsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ConversionEventsDataInnerCustomDataContentsInner) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ConversionEventsDataInnerCustomDataContentsInner) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ConversionEventsDataInnerCustomDataContentsInner) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *ConversionEventsDataInnerCustomDataContentsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetItemPrice

`func (o *ConversionEventsDataInnerCustomDataContentsInner) GetItemPrice() string`

GetItemPrice returns the ItemPrice field if non-nil, zero value otherwise.

### GetItemPriceOk

`func (o *ConversionEventsDataInnerCustomDataContentsInner) GetItemPriceOk() (*string, bool)`

GetItemPriceOk returns a tuple with the ItemPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemPrice

`func (o *ConversionEventsDataInnerCustomDataContentsInner) SetItemPrice(v string)`

SetItemPrice sets ItemPrice field to given value.

### HasItemPrice

`func (o *ConversionEventsDataInnerCustomDataContentsInner) HasItemPrice() bool`

HasItemPrice returns a boolean if a field has been set.

### GetQuantity

`func (o *ConversionEventsDataInnerCustomDataContentsInner) GetQuantity() int64`

GetQuantity returns the Quantity field if non-nil, zero value otherwise.

### GetQuantityOk

`func (o *ConversionEventsDataInnerCustomDataContentsInner) GetQuantityOk() (*int64, bool)`

GetQuantityOk returns a tuple with the Quantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuantity

`func (o *ConversionEventsDataInnerCustomDataContentsInner) SetQuantity(v int64)`

SetQuantity sets Quantity field to given value.

### HasQuantity

`func (o *ConversionEventsDataInnerCustomDataContentsInner) HasQuantity() bool`

HasQuantity returns a boolean if a field has been set.

### GetItemName

`func (o *ConversionEventsDataInnerCustomDataContentsInner) GetItemName() string`

GetItemName returns the ItemName field if non-nil, zero value otherwise.

### GetItemNameOk

`func (o *ConversionEventsDataInnerCustomDataContentsInner) GetItemNameOk() (*string, bool)`

GetItemNameOk returns a tuple with the ItemName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemName

`func (o *ConversionEventsDataInnerCustomDataContentsInner) SetItemName(v string)`

SetItemName sets ItemName field to given value.

### HasItemName

`func (o *ConversionEventsDataInnerCustomDataContentsInner) HasItemName() bool`

HasItemName returns a boolean if a field has been set.

### GetItemCategory

`func (o *ConversionEventsDataInnerCustomDataContentsInner) GetItemCategory() string`

GetItemCategory returns the ItemCategory field if non-nil, zero value otherwise.

### GetItemCategoryOk

`func (o *ConversionEventsDataInnerCustomDataContentsInner) GetItemCategoryOk() (*string, bool)`

GetItemCategoryOk returns a tuple with the ItemCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemCategory

`func (o *ConversionEventsDataInnerCustomDataContentsInner) SetItemCategory(v string)`

SetItemCategory sets ItemCategory field to given value.

### HasItemCategory

`func (o *ConversionEventsDataInnerCustomDataContentsInner) HasItemCategory() bool`

HasItemCategory returns a boolean if a field has been set.

### GetItemBrand

`func (o *ConversionEventsDataInnerCustomDataContentsInner) GetItemBrand() string`

GetItemBrand returns the ItemBrand field if non-nil, zero value otherwise.

### GetItemBrandOk

`func (o *ConversionEventsDataInnerCustomDataContentsInner) GetItemBrandOk() (*string, bool)`

GetItemBrandOk returns a tuple with the ItemBrand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemBrand

`func (o *ConversionEventsDataInnerCustomDataContentsInner) SetItemBrand(v string)`

SetItemBrand sets ItemBrand field to given value.

### HasItemBrand

`func (o *ConversionEventsDataInnerCustomDataContentsInner) HasItemBrand() bool`

HasItemBrand returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


