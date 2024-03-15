# PinterestTagEventData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | Pointer to [**Currency**](Currency.md) |  | [optional] 
**LeadType** | Pointer to **string** | Promotion code. For example, \&quot;Newsletter\&quot;. | [optional] 
**LineItems** | Pointer to [**LineItem**](LineItem.md) |  | [optional] 
**OrderId** | Pointer to **string** | Order ID. For example, \&quot;X-151481\&quot;. | [optional] 
**OrderQuantity** | Pointer to **int32** | Order quantity. For example, 1. | [optional] 
**PageName** | Pointer to **string** | Page name. For example, \&quot;Our Favorite Pins on Pinterest\&quot;. | [optional] 
**PromoCode** | Pointer to **string** | Promotion code. For example, \&quot;WINTER10\&quot;. | [optional] 
**Property** | Pointer to **string** | Property. For example, \&quot;Athleta\&quot;. | [optional] 
**SearchQuery** | Pointer to **string** | Search query string. For example, \&quot;boots\&quot;. | [optional] 
**Value** | Pointer to **string** | Product value. For example, \&quot;199.98\&quot; | [optional] 
**VideoTitle** | Pointer to **string** | Video title. For example, \&quot;How to style your Parker Boots\&quot;. | [optional] 

## Methods

### NewPinterestTagEventData

`func NewPinterestTagEventData() *PinterestTagEventData`

NewPinterestTagEventData instantiates a new PinterestTagEventData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinterestTagEventDataWithDefaults

`func NewPinterestTagEventDataWithDefaults() *PinterestTagEventData`

NewPinterestTagEventDataWithDefaults instantiates a new PinterestTagEventData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCurrency

`func (o *PinterestTagEventData) GetCurrency() Currency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *PinterestTagEventData) GetCurrencyOk() (*Currency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *PinterestTagEventData) SetCurrency(v Currency)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *PinterestTagEventData) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetLeadType

`func (o *PinterestTagEventData) GetLeadType() string`

GetLeadType returns the LeadType field if non-nil, zero value otherwise.

### GetLeadTypeOk

`func (o *PinterestTagEventData) GetLeadTypeOk() (*string, bool)`

GetLeadTypeOk returns a tuple with the LeadType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadType

`func (o *PinterestTagEventData) SetLeadType(v string)`

SetLeadType sets LeadType field to given value.

### HasLeadType

`func (o *PinterestTagEventData) HasLeadType() bool`

HasLeadType returns a boolean if a field has been set.

### GetLineItems

`func (o *PinterestTagEventData) GetLineItems() LineItem`

GetLineItems returns the LineItems field if non-nil, zero value otherwise.

### GetLineItemsOk

`func (o *PinterestTagEventData) GetLineItemsOk() (*LineItem, bool)`

GetLineItemsOk returns a tuple with the LineItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLineItems

`func (o *PinterestTagEventData) SetLineItems(v LineItem)`

SetLineItems sets LineItems field to given value.

### HasLineItems

`func (o *PinterestTagEventData) HasLineItems() bool`

HasLineItems returns a boolean if a field has been set.

### GetOrderId

`func (o *PinterestTagEventData) GetOrderId() string`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *PinterestTagEventData) GetOrderIdOk() (*string, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *PinterestTagEventData) SetOrderId(v string)`

SetOrderId sets OrderId field to given value.

### HasOrderId

`func (o *PinterestTagEventData) HasOrderId() bool`

HasOrderId returns a boolean if a field has been set.

### GetOrderQuantity

`func (o *PinterestTagEventData) GetOrderQuantity() int32`

GetOrderQuantity returns the OrderQuantity field if non-nil, zero value otherwise.

### GetOrderQuantityOk

`func (o *PinterestTagEventData) GetOrderQuantityOk() (*int32, bool)`

GetOrderQuantityOk returns a tuple with the OrderQuantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderQuantity

`func (o *PinterestTagEventData) SetOrderQuantity(v int32)`

SetOrderQuantity sets OrderQuantity field to given value.

### HasOrderQuantity

`func (o *PinterestTagEventData) HasOrderQuantity() bool`

HasOrderQuantity returns a boolean if a field has been set.

### GetPageName

`func (o *PinterestTagEventData) GetPageName() string`

GetPageName returns the PageName field if non-nil, zero value otherwise.

### GetPageNameOk

`func (o *PinterestTagEventData) GetPageNameOk() (*string, bool)`

GetPageNameOk returns a tuple with the PageName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageName

`func (o *PinterestTagEventData) SetPageName(v string)`

SetPageName sets PageName field to given value.

### HasPageName

`func (o *PinterestTagEventData) HasPageName() bool`

HasPageName returns a boolean if a field has been set.

### GetPromoCode

`func (o *PinterestTagEventData) GetPromoCode() string`

GetPromoCode returns the PromoCode field if non-nil, zero value otherwise.

### GetPromoCodeOk

`func (o *PinterestTagEventData) GetPromoCodeOk() (*string, bool)`

GetPromoCodeOk returns a tuple with the PromoCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromoCode

`func (o *PinterestTagEventData) SetPromoCode(v string)`

SetPromoCode sets PromoCode field to given value.

### HasPromoCode

`func (o *PinterestTagEventData) HasPromoCode() bool`

HasPromoCode returns a boolean if a field has been set.

### GetProperty

`func (o *PinterestTagEventData) GetProperty() string`

GetProperty returns the Property field if non-nil, zero value otherwise.

### GetPropertyOk

`func (o *PinterestTagEventData) GetPropertyOk() (*string, bool)`

GetPropertyOk returns a tuple with the Property field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProperty

`func (o *PinterestTagEventData) SetProperty(v string)`

SetProperty sets Property field to given value.

### HasProperty

`func (o *PinterestTagEventData) HasProperty() bool`

HasProperty returns a boolean if a field has been set.

### GetSearchQuery

`func (o *PinterestTagEventData) GetSearchQuery() string`

GetSearchQuery returns the SearchQuery field if non-nil, zero value otherwise.

### GetSearchQueryOk

`func (o *PinterestTagEventData) GetSearchQueryOk() (*string, bool)`

GetSearchQueryOk returns a tuple with the SearchQuery field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchQuery

`func (o *PinterestTagEventData) SetSearchQuery(v string)`

SetSearchQuery sets SearchQuery field to given value.

### HasSearchQuery

`func (o *PinterestTagEventData) HasSearchQuery() bool`

HasSearchQuery returns a boolean if a field has been set.

### GetValue

`func (o *PinterestTagEventData) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *PinterestTagEventData) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *PinterestTagEventData) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *PinterestTagEventData) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetVideoTitle

`func (o *PinterestTagEventData) GetVideoTitle() string`

GetVideoTitle returns the VideoTitle field if non-nil, zero value otherwise.

### GetVideoTitleOk

`func (o *PinterestTagEventData) GetVideoTitleOk() (*string, bool)`

GetVideoTitleOk returns a tuple with the VideoTitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideoTitle

`func (o *PinterestTagEventData) SetVideoTitle(v string)`

SetVideoTitle sets VideoTitle field to given value.

### HasVideoTitle

`func (o *PinterestTagEventData) HasVideoTitle() bool`

HasVideoTitle returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


