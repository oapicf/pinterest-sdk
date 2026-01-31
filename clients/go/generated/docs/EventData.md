# EventData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | Pointer to [**Currency**](Currency.md) | Currency. For example, &#39;USD&#39;. | [optional] 
**LeadType** | Pointer to **string** | Promotion code. For example, &#39;Newsletter&#39;. | [optional] 
**LineItems** | Pointer to [**LineItem**](LineItem.md) |  | [optional] 
**OrderId** | Pointer to **string** | Order ID. For example, &#39;X-151481&#39;. | [optional] 
**OrderQuantity** | Pointer to **int32** | Order quantity. For example, 1. | [optional] 
**PageName** | Pointer to **string** | Page name. For example, &#39;Our Favorite Pins on Pinterest&#39;. | [optional] 
**PromoCode** | Pointer to **string** | Promotion code. For example, &#39;WINTER10&#39;. | [optional] 
**Property** | Pointer to **string** | Property. For example, &#39;Athleta&#39;. | [optional] 
**SearchQuery** | Pointer to **string** | Search query string. For example, &#39;boots&#39;. | [optional] 
**Value** | Pointer to **string** | Product value. For example, &#39;199.98&#39;. | [optional] 
**VideoTitle** | Pointer to **string** | Video title. For example, &#39;How to style your Parker Boots&#39;. | [optional] 

## Methods

### NewEventData

`func NewEventData() *EventData`

NewEventData instantiates a new EventData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEventDataWithDefaults

`func NewEventDataWithDefaults() *EventData`

NewEventDataWithDefaults instantiates a new EventData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCurrency

`func (o *EventData) GetCurrency() Currency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *EventData) GetCurrencyOk() (*Currency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *EventData) SetCurrency(v Currency)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *EventData) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetLeadType

`func (o *EventData) GetLeadType() string`

GetLeadType returns the LeadType field if non-nil, zero value otherwise.

### GetLeadTypeOk

`func (o *EventData) GetLeadTypeOk() (*string, bool)`

GetLeadTypeOk returns a tuple with the LeadType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadType

`func (o *EventData) SetLeadType(v string)`

SetLeadType sets LeadType field to given value.

### HasLeadType

`func (o *EventData) HasLeadType() bool`

HasLeadType returns a boolean if a field has been set.

### GetLineItems

`func (o *EventData) GetLineItems() LineItem`

GetLineItems returns the LineItems field if non-nil, zero value otherwise.

### GetLineItemsOk

`func (o *EventData) GetLineItemsOk() (*LineItem, bool)`

GetLineItemsOk returns a tuple with the LineItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLineItems

`func (o *EventData) SetLineItems(v LineItem)`

SetLineItems sets LineItems field to given value.

### HasLineItems

`func (o *EventData) HasLineItems() bool`

HasLineItems returns a boolean if a field has been set.

### GetOrderId

`func (o *EventData) GetOrderId() string`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *EventData) GetOrderIdOk() (*string, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *EventData) SetOrderId(v string)`

SetOrderId sets OrderId field to given value.

### HasOrderId

`func (o *EventData) HasOrderId() bool`

HasOrderId returns a boolean if a field has been set.

### GetOrderQuantity

`func (o *EventData) GetOrderQuantity() int32`

GetOrderQuantity returns the OrderQuantity field if non-nil, zero value otherwise.

### GetOrderQuantityOk

`func (o *EventData) GetOrderQuantityOk() (*int32, bool)`

GetOrderQuantityOk returns a tuple with the OrderQuantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderQuantity

`func (o *EventData) SetOrderQuantity(v int32)`

SetOrderQuantity sets OrderQuantity field to given value.

### HasOrderQuantity

`func (o *EventData) HasOrderQuantity() bool`

HasOrderQuantity returns a boolean if a field has been set.

### GetPageName

`func (o *EventData) GetPageName() string`

GetPageName returns the PageName field if non-nil, zero value otherwise.

### GetPageNameOk

`func (o *EventData) GetPageNameOk() (*string, bool)`

GetPageNameOk returns a tuple with the PageName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageName

`func (o *EventData) SetPageName(v string)`

SetPageName sets PageName field to given value.

### HasPageName

`func (o *EventData) HasPageName() bool`

HasPageName returns a boolean if a field has been set.

### GetPromoCode

`func (o *EventData) GetPromoCode() string`

GetPromoCode returns the PromoCode field if non-nil, zero value otherwise.

### GetPromoCodeOk

`func (o *EventData) GetPromoCodeOk() (*string, bool)`

GetPromoCodeOk returns a tuple with the PromoCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromoCode

`func (o *EventData) SetPromoCode(v string)`

SetPromoCode sets PromoCode field to given value.

### HasPromoCode

`func (o *EventData) HasPromoCode() bool`

HasPromoCode returns a boolean if a field has been set.

### GetProperty

`func (o *EventData) GetProperty() string`

GetProperty returns the Property field if non-nil, zero value otherwise.

### GetPropertyOk

`func (o *EventData) GetPropertyOk() (*string, bool)`

GetPropertyOk returns a tuple with the Property field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProperty

`func (o *EventData) SetProperty(v string)`

SetProperty sets Property field to given value.

### HasProperty

`func (o *EventData) HasProperty() bool`

HasProperty returns a boolean if a field has been set.

### GetSearchQuery

`func (o *EventData) GetSearchQuery() string`

GetSearchQuery returns the SearchQuery field if non-nil, zero value otherwise.

### GetSearchQueryOk

`func (o *EventData) GetSearchQueryOk() (*string, bool)`

GetSearchQueryOk returns a tuple with the SearchQuery field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchQuery

`func (o *EventData) SetSearchQuery(v string)`

SetSearchQuery sets SearchQuery field to given value.

### HasSearchQuery

`func (o *EventData) HasSearchQuery() bool`

HasSearchQuery returns a boolean if a field has been set.

### GetValue

`func (o *EventData) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *EventData) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *EventData) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *EventData) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetVideoTitle

`func (o *EventData) GetVideoTitle() string`

GetVideoTitle returns the VideoTitle field if non-nil, zero value otherwise.

### GetVideoTitleOk

`func (o *EventData) GetVideoTitleOk() (*string, bool)`

GetVideoTitleOk returns a tuple with the VideoTitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideoTitle

`func (o *EventData) SetVideoTitle(v string)`

SetVideoTitle sets VideoTitle field to given value.

### HasVideoTitle

`func (o *EventData) HasVideoTitle() bool`

HasVideoTitle returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


