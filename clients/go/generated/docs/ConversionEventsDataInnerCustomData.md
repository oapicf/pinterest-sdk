# ConversionEventsDataInnerCustomData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | Pointer to **NullableString** | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. | [optional] 
**Value** | Pointer to **NullableString** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. | [optional] 
**ContentIds** | Pointer to **[]string** | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**ContentName** | Pointer to **NullableString** | The name of the page or product associated with the event. | [optional] 
**ContentCategory** | Pointer to **NullableString** | The category of the content associated with the event. | [optional] 
**ContentBrand** | Pointer to **NullableString** | The brand of the content associated with the event. | [optional] 
**Contents** | Pointer to [**[]ConversionEventsDataInnerCustomDataContentsInner**](ConversionEventsDataInnerCustomDataContentsInner.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**NumItems** | Pointer to **int64** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**OrderId** | Pointer to **NullableString** | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. | [optional] 
**SearchString** | Pointer to **NullableString** | The search string related to the user conversion event. | [optional] 
**OptOutType** | Pointer to **NullableString** | Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/limited-data-processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Help Center&lt;/a&gt; and &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;dev site&lt;/a&gt; for specific opt_out_type set up. | [optional] 
**Np** | Pointer to **NullableString** | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. | [optional] 

## Methods

### NewConversionEventsDataInnerCustomData

`func NewConversionEventsDataInnerCustomData() *ConversionEventsDataInnerCustomData`

NewConversionEventsDataInnerCustomData instantiates a new ConversionEventsDataInnerCustomData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventsDataInnerCustomDataWithDefaults

`func NewConversionEventsDataInnerCustomDataWithDefaults() *ConversionEventsDataInnerCustomData`

NewConversionEventsDataInnerCustomDataWithDefaults instantiates a new ConversionEventsDataInnerCustomData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCurrency

`func (o *ConversionEventsDataInnerCustomData) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *ConversionEventsDataInnerCustomData) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *ConversionEventsDataInnerCustomData) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *ConversionEventsDataInnerCustomData) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### SetCurrencyNil

`func (o *ConversionEventsDataInnerCustomData) SetCurrencyNil(b bool)`

 SetCurrencyNil sets the value for Currency to be an explicit nil

### UnsetCurrency
`func (o *ConversionEventsDataInnerCustomData) UnsetCurrency()`

UnsetCurrency ensures that no value is present for Currency, not even an explicit nil
### GetValue

`func (o *ConversionEventsDataInnerCustomData) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ConversionEventsDataInnerCustomData) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ConversionEventsDataInnerCustomData) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *ConversionEventsDataInnerCustomData) HasValue() bool`

HasValue returns a boolean if a field has been set.

### SetValueNil

`func (o *ConversionEventsDataInnerCustomData) SetValueNil(b bool)`

 SetValueNil sets the value for Value to be an explicit nil

### UnsetValue
`func (o *ConversionEventsDataInnerCustomData) UnsetValue()`

UnsetValue ensures that no value is present for Value, not even an explicit nil
### GetContentIds

`func (o *ConversionEventsDataInnerCustomData) GetContentIds() []string`

GetContentIds returns the ContentIds field if non-nil, zero value otherwise.

### GetContentIdsOk

`func (o *ConversionEventsDataInnerCustomData) GetContentIdsOk() (*[]string, bool)`

GetContentIdsOk returns a tuple with the ContentIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentIds

`func (o *ConversionEventsDataInnerCustomData) SetContentIds(v []string)`

SetContentIds sets ContentIds field to given value.

### HasContentIds

`func (o *ConversionEventsDataInnerCustomData) HasContentIds() bool`

HasContentIds returns a boolean if a field has been set.

### GetContentName

`func (o *ConversionEventsDataInnerCustomData) GetContentName() string`

GetContentName returns the ContentName field if non-nil, zero value otherwise.

### GetContentNameOk

`func (o *ConversionEventsDataInnerCustomData) GetContentNameOk() (*string, bool)`

GetContentNameOk returns a tuple with the ContentName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentName

`func (o *ConversionEventsDataInnerCustomData) SetContentName(v string)`

SetContentName sets ContentName field to given value.

### HasContentName

`func (o *ConversionEventsDataInnerCustomData) HasContentName() bool`

HasContentName returns a boolean if a field has been set.

### SetContentNameNil

`func (o *ConversionEventsDataInnerCustomData) SetContentNameNil(b bool)`

 SetContentNameNil sets the value for ContentName to be an explicit nil

### UnsetContentName
`func (o *ConversionEventsDataInnerCustomData) UnsetContentName()`

UnsetContentName ensures that no value is present for ContentName, not even an explicit nil
### GetContentCategory

`func (o *ConversionEventsDataInnerCustomData) GetContentCategory() string`

GetContentCategory returns the ContentCategory field if non-nil, zero value otherwise.

### GetContentCategoryOk

`func (o *ConversionEventsDataInnerCustomData) GetContentCategoryOk() (*string, bool)`

GetContentCategoryOk returns a tuple with the ContentCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentCategory

`func (o *ConversionEventsDataInnerCustomData) SetContentCategory(v string)`

SetContentCategory sets ContentCategory field to given value.

### HasContentCategory

`func (o *ConversionEventsDataInnerCustomData) HasContentCategory() bool`

HasContentCategory returns a boolean if a field has been set.

### SetContentCategoryNil

`func (o *ConversionEventsDataInnerCustomData) SetContentCategoryNil(b bool)`

 SetContentCategoryNil sets the value for ContentCategory to be an explicit nil

### UnsetContentCategory
`func (o *ConversionEventsDataInnerCustomData) UnsetContentCategory()`

UnsetContentCategory ensures that no value is present for ContentCategory, not even an explicit nil
### GetContentBrand

`func (o *ConversionEventsDataInnerCustomData) GetContentBrand() string`

GetContentBrand returns the ContentBrand field if non-nil, zero value otherwise.

### GetContentBrandOk

`func (o *ConversionEventsDataInnerCustomData) GetContentBrandOk() (*string, bool)`

GetContentBrandOk returns a tuple with the ContentBrand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentBrand

`func (o *ConversionEventsDataInnerCustomData) SetContentBrand(v string)`

SetContentBrand sets ContentBrand field to given value.

### HasContentBrand

`func (o *ConversionEventsDataInnerCustomData) HasContentBrand() bool`

HasContentBrand returns a boolean if a field has been set.

### SetContentBrandNil

`func (o *ConversionEventsDataInnerCustomData) SetContentBrandNil(b bool)`

 SetContentBrandNil sets the value for ContentBrand to be an explicit nil

### UnsetContentBrand
`func (o *ConversionEventsDataInnerCustomData) UnsetContentBrand()`

UnsetContentBrand ensures that no value is present for ContentBrand, not even an explicit nil
### GetContents

`func (o *ConversionEventsDataInnerCustomData) GetContents() []ConversionEventsDataInnerCustomDataContentsInner`

GetContents returns the Contents field if non-nil, zero value otherwise.

### GetContentsOk

`func (o *ConversionEventsDataInnerCustomData) GetContentsOk() (*[]ConversionEventsDataInnerCustomDataContentsInner, bool)`

GetContentsOk returns a tuple with the Contents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContents

`func (o *ConversionEventsDataInnerCustomData) SetContents(v []ConversionEventsDataInnerCustomDataContentsInner)`

SetContents sets Contents field to given value.

### HasContents

`func (o *ConversionEventsDataInnerCustomData) HasContents() bool`

HasContents returns a boolean if a field has been set.

### GetNumItems

`func (o *ConversionEventsDataInnerCustomData) GetNumItems() int64`

GetNumItems returns the NumItems field if non-nil, zero value otherwise.

### GetNumItemsOk

`func (o *ConversionEventsDataInnerCustomData) GetNumItemsOk() (*int64, bool)`

GetNumItemsOk returns a tuple with the NumItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumItems

`func (o *ConversionEventsDataInnerCustomData) SetNumItems(v int64)`

SetNumItems sets NumItems field to given value.

### HasNumItems

`func (o *ConversionEventsDataInnerCustomData) HasNumItems() bool`

HasNumItems returns a boolean if a field has been set.

### GetOrderId

`func (o *ConversionEventsDataInnerCustomData) GetOrderId() string`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *ConversionEventsDataInnerCustomData) GetOrderIdOk() (*string, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *ConversionEventsDataInnerCustomData) SetOrderId(v string)`

SetOrderId sets OrderId field to given value.

### HasOrderId

`func (o *ConversionEventsDataInnerCustomData) HasOrderId() bool`

HasOrderId returns a boolean if a field has been set.

### SetOrderIdNil

`func (o *ConversionEventsDataInnerCustomData) SetOrderIdNil(b bool)`

 SetOrderIdNil sets the value for OrderId to be an explicit nil

### UnsetOrderId
`func (o *ConversionEventsDataInnerCustomData) UnsetOrderId()`

UnsetOrderId ensures that no value is present for OrderId, not even an explicit nil
### GetSearchString

`func (o *ConversionEventsDataInnerCustomData) GetSearchString() string`

GetSearchString returns the SearchString field if non-nil, zero value otherwise.

### GetSearchStringOk

`func (o *ConversionEventsDataInnerCustomData) GetSearchStringOk() (*string, bool)`

GetSearchStringOk returns a tuple with the SearchString field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchString

`func (o *ConversionEventsDataInnerCustomData) SetSearchString(v string)`

SetSearchString sets SearchString field to given value.

### HasSearchString

`func (o *ConversionEventsDataInnerCustomData) HasSearchString() bool`

HasSearchString returns a boolean if a field has been set.

### SetSearchStringNil

`func (o *ConversionEventsDataInnerCustomData) SetSearchStringNil(b bool)`

 SetSearchStringNil sets the value for SearchString to be an explicit nil

### UnsetSearchString
`func (o *ConversionEventsDataInnerCustomData) UnsetSearchString()`

UnsetSearchString ensures that no value is present for SearchString, not even an explicit nil
### GetOptOutType

`func (o *ConversionEventsDataInnerCustomData) GetOptOutType() string`

GetOptOutType returns the OptOutType field if non-nil, zero value otherwise.

### GetOptOutTypeOk

`func (o *ConversionEventsDataInnerCustomData) GetOptOutTypeOk() (*string, bool)`

GetOptOutTypeOk returns a tuple with the OptOutType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptOutType

`func (o *ConversionEventsDataInnerCustomData) SetOptOutType(v string)`

SetOptOutType sets OptOutType field to given value.

### HasOptOutType

`func (o *ConversionEventsDataInnerCustomData) HasOptOutType() bool`

HasOptOutType returns a boolean if a field has been set.

### SetOptOutTypeNil

`func (o *ConversionEventsDataInnerCustomData) SetOptOutTypeNil(b bool)`

 SetOptOutTypeNil sets the value for OptOutType to be an explicit nil

### UnsetOptOutType
`func (o *ConversionEventsDataInnerCustomData) UnsetOptOutType()`

UnsetOptOutType ensures that no value is present for OptOutType, not even an explicit nil
### GetNp

`func (o *ConversionEventsDataInnerCustomData) GetNp() string`

GetNp returns the Np field if non-nil, zero value otherwise.

### GetNpOk

`func (o *ConversionEventsDataInnerCustomData) GetNpOk() (*string, bool)`

GetNpOk returns a tuple with the Np field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNp

`func (o *ConversionEventsDataInnerCustomData) SetNp(v string)`

SetNp sets Np field to given value.

### HasNp

`func (o *ConversionEventsDataInnerCustomData) HasNp() bool`

HasNp returns a boolean if a field has been set.

### SetNpNil

`func (o *ConversionEventsDataInnerCustomData) SetNpNil(b bool)`

 SetNpNil sets the value for Np to be an explicit nil

### UnsetNp
`func (o *ConversionEventsDataInnerCustomData) UnsetNp()`

UnsetNp ensures that no value is present for Np, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


