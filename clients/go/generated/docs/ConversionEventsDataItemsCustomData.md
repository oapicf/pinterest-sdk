# ConversionEventsDataItemsCustomData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContentBrand** | Pointer to **NullableString** | The brand of the content associated with the event. | [optional] 
**ContentCategory** | Pointer to **NullableString** | The category of the content associated with the event. | [optional] 
**ContentIds** | Pointer to **[]string** | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] 
**ContentName** | Pointer to **NullableString** | The name of the page or product associated with the event. | [optional] 
**Contents** | Pointer to [**[]ConversionEventsDataItemsCustomDataContentsItems**](ConversionEventsDataItemsCustomDataContentsItems.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] 
**Currency** | Pointer to **NullableString** | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. | [optional] 
**ExternalMeasurementId** | Pointer to **NullableString** | Only use when instructed. | [optional] 
**ExternalMeasurementVendorId** | Pointer to **NullableInt32** | Only use when instructed. | [optional] 
**Np** | Pointer to **NullableString** | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. | [optional] 
**NumItems** | Pointer to **int64** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] 
**OptOutType** | Pointer to **NullableString** | Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter. | [optional] 
**OrderId** | Pointer to **NullableString** | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. | [optional] 
**PredictedLtv** | Pointer to **NullableString** | Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. | [optional] 
**SearchString** | Pointer to **NullableString** | The search string related to the user conversion event. | [optional] 
**Value** | Pointer to **NullableString** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. | [optional] 

## Methods

### NewConversionEventsDataItemsCustomData

`func NewConversionEventsDataItemsCustomData() *ConversionEventsDataItemsCustomData`

NewConversionEventsDataItemsCustomData instantiates a new ConversionEventsDataItemsCustomData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventsDataItemsCustomDataWithDefaults

`func NewConversionEventsDataItemsCustomDataWithDefaults() *ConversionEventsDataItemsCustomData`

NewConversionEventsDataItemsCustomDataWithDefaults instantiates a new ConversionEventsDataItemsCustomData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContentBrand

`func (o *ConversionEventsDataItemsCustomData) GetContentBrand() string`

GetContentBrand returns the ContentBrand field if non-nil, zero value otherwise.

### GetContentBrandOk

`func (o *ConversionEventsDataItemsCustomData) GetContentBrandOk() (*string, bool)`

GetContentBrandOk returns a tuple with the ContentBrand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentBrand

`func (o *ConversionEventsDataItemsCustomData) SetContentBrand(v string)`

SetContentBrand sets ContentBrand field to given value.

### HasContentBrand

`func (o *ConversionEventsDataItemsCustomData) HasContentBrand() bool`

HasContentBrand returns a boolean if a field has been set.

### SetContentBrandNil

`func (o *ConversionEventsDataItemsCustomData) SetContentBrandNil(b bool)`

 SetContentBrandNil sets the value for ContentBrand to be an explicit nil

### UnsetContentBrand
`func (o *ConversionEventsDataItemsCustomData) UnsetContentBrand()`

UnsetContentBrand ensures that no value is present for ContentBrand, not even an explicit nil
### GetContentCategory

`func (o *ConversionEventsDataItemsCustomData) GetContentCategory() string`

GetContentCategory returns the ContentCategory field if non-nil, zero value otherwise.

### GetContentCategoryOk

`func (o *ConversionEventsDataItemsCustomData) GetContentCategoryOk() (*string, bool)`

GetContentCategoryOk returns a tuple with the ContentCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentCategory

`func (o *ConversionEventsDataItemsCustomData) SetContentCategory(v string)`

SetContentCategory sets ContentCategory field to given value.

### HasContentCategory

`func (o *ConversionEventsDataItemsCustomData) HasContentCategory() bool`

HasContentCategory returns a boolean if a field has been set.

### SetContentCategoryNil

`func (o *ConversionEventsDataItemsCustomData) SetContentCategoryNil(b bool)`

 SetContentCategoryNil sets the value for ContentCategory to be an explicit nil

### UnsetContentCategory
`func (o *ConversionEventsDataItemsCustomData) UnsetContentCategory()`

UnsetContentCategory ensures that no value is present for ContentCategory, not even an explicit nil
### GetContentIds

`func (o *ConversionEventsDataItemsCustomData) GetContentIds() []string`

GetContentIds returns the ContentIds field if non-nil, zero value otherwise.

### GetContentIdsOk

`func (o *ConversionEventsDataItemsCustomData) GetContentIdsOk() (*[]string, bool)`

GetContentIdsOk returns a tuple with the ContentIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentIds

`func (o *ConversionEventsDataItemsCustomData) SetContentIds(v []string)`

SetContentIds sets ContentIds field to given value.

### HasContentIds

`func (o *ConversionEventsDataItemsCustomData) HasContentIds() bool`

HasContentIds returns a boolean if a field has been set.

### GetContentName

`func (o *ConversionEventsDataItemsCustomData) GetContentName() string`

GetContentName returns the ContentName field if non-nil, zero value otherwise.

### GetContentNameOk

`func (o *ConversionEventsDataItemsCustomData) GetContentNameOk() (*string, bool)`

GetContentNameOk returns a tuple with the ContentName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentName

`func (o *ConversionEventsDataItemsCustomData) SetContentName(v string)`

SetContentName sets ContentName field to given value.

### HasContentName

`func (o *ConversionEventsDataItemsCustomData) HasContentName() bool`

HasContentName returns a boolean if a field has been set.

### SetContentNameNil

`func (o *ConversionEventsDataItemsCustomData) SetContentNameNil(b bool)`

 SetContentNameNil sets the value for ContentName to be an explicit nil

### UnsetContentName
`func (o *ConversionEventsDataItemsCustomData) UnsetContentName()`

UnsetContentName ensures that no value is present for ContentName, not even an explicit nil
### GetContents

`func (o *ConversionEventsDataItemsCustomData) GetContents() []ConversionEventsDataItemsCustomDataContentsItems`

GetContents returns the Contents field if non-nil, zero value otherwise.

### GetContentsOk

`func (o *ConversionEventsDataItemsCustomData) GetContentsOk() (*[]ConversionEventsDataItemsCustomDataContentsItems, bool)`

GetContentsOk returns a tuple with the Contents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContents

`func (o *ConversionEventsDataItemsCustomData) SetContents(v []ConversionEventsDataItemsCustomDataContentsItems)`

SetContents sets Contents field to given value.

### HasContents

`func (o *ConversionEventsDataItemsCustomData) HasContents() bool`

HasContents returns a boolean if a field has been set.

### GetCurrency

`func (o *ConversionEventsDataItemsCustomData) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *ConversionEventsDataItemsCustomData) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *ConversionEventsDataItemsCustomData) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *ConversionEventsDataItemsCustomData) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### SetCurrencyNil

`func (o *ConversionEventsDataItemsCustomData) SetCurrencyNil(b bool)`

 SetCurrencyNil sets the value for Currency to be an explicit nil

### UnsetCurrency
`func (o *ConversionEventsDataItemsCustomData) UnsetCurrency()`

UnsetCurrency ensures that no value is present for Currency, not even an explicit nil
### GetExternalMeasurementId

`func (o *ConversionEventsDataItemsCustomData) GetExternalMeasurementId() string`

GetExternalMeasurementId returns the ExternalMeasurementId field if non-nil, zero value otherwise.

### GetExternalMeasurementIdOk

`func (o *ConversionEventsDataItemsCustomData) GetExternalMeasurementIdOk() (*string, bool)`

GetExternalMeasurementIdOk returns a tuple with the ExternalMeasurementId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalMeasurementId

`func (o *ConversionEventsDataItemsCustomData) SetExternalMeasurementId(v string)`

SetExternalMeasurementId sets ExternalMeasurementId field to given value.

### HasExternalMeasurementId

`func (o *ConversionEventsDataItemsCustomData) HasExternalMeasurementId() bool`

HasExternalMeasurementId returns a boolean if a field has been set.

### SetExternalMeasurementIdNil

`func (o *ConversionEventsDataItemsCustomData) SetExternalMeasurementIdNil(b bool)`

 SetExternalMeasurementIdNil sets the value for ExternalMeasurementId to be an explicit nil

### UnsetExternalMeasurementId
`func (o *ConversionEventsDataItemsCustomData) UnsetExternalMeasurementId()`

UnsetExternalMeasurementId ensures that no value is present for ExternalMeasurementId, not even an explicit nil
### GetExternalMeasurementVendorId

`func (o *ConversionEventsDataItemsCustomData) GetExternalMeasurementVendorId() int32`

GetExternalMeasurementVendorId returns the ExternalMeasurementVendorId field if non-nil, zero value otherwise.

### GetExternalMeasurementVendorIdOk

`func (o *ConversionEventsDataItemsCustomData) GetExternalMeasurementVendorIdOk() (*int32, bool)`

GetExternalMeasurementVendorIdOk returns a tuple with the ExternalMeasurementVendorId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalMeasurementVendorId

`func (o *ConversionEventsDataItemsCustomData) SetExternalMeasurementVendorId(v int32)`

SetExternalMeasurementVendorId sets ExternalMeasurementVendorId field to given value.

### HasExternalMeasurementVendorId

`func (o *ConversionEventsDataItemsCustomData) HasExternalMeasurementVendorId() bool`

HasExternalMeasurementVendorId returns a boolean if a field has been set.

### SetExternalMeasurementVendorIdNil

`func (o *ConversionEventsDataItemsCustomData) SetExternalMeasurementVendorIdNil(b bool)`

 SetExternalMeasurementVendorIdNil sets the value for ExternalMeasurementVendorId to be an explicit nil

### UnsetExternalMeasurementVendorId
`func (o *ConversionEventsDataItemsCustomData) UnsetExternalMeasurementVendorId()`

UnsetExternalMeasurementVendorId ensures that no value is present for ExternalMeasurementVendorId, not even an explicit nil
### GetNp

`func (o *ConversionEventsDataItemsCustomData) GetNp() string`

GetNp returns the Np field if non-nil, zero value otherwise.

### GetNpOk

`func (o *ConversionEventsDataItemsCustomData) GetNpOk() (*string, bool)`

GetNpOk returns a tuple with the Np field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNp

`func (o *ConversionEventsDataItemsCustomData) SetNp(v string)`

SetNp sets Np field to given value.

### HasNp

`func (o *ConversionEventsDataItemsCustomData) HasNp() bool`

HasNp returns a boolean if a field has been set.

### SetNpNil

`func (o *ConversionEventsDataItemsCustomData) SetNpNil(b bool)`

 SetNpNil sets the value for Np to be an explicit nil

### UnsetNp
`func (o *ConversionEventsDataItemsCustomData) UnsetNp()`

UnsetNp ensures that no value is present for Np, not even an explicit nil
### GetNumItems

`func (o *ConversionEventsDataItemsCustomData) GetNumItems() int64`

GetNumItems returns the NumItems field if non-nil, zero value otherwise.

### GetNumItemsOk

`func (o *ConversionEventsDataItemsCustomData) GetNumItemsOk() (*int64, bool)`

GetNumItemsOk returns a tuple with the NumItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumItems

`func (o *ConversionEventsDataItemsCustomData) SetNumItems(v int64)`

SetNumItems sets NumItems field to given value.

### HasNumItems

`func (o *ConversionEventsDataItemsCustomData) HasNumItems() bool`

HasNumItems returns a boolean if a field has been set.

### GetOptOutType

`func (o *ConversionEventsDataItemsCustomData) GetOptOutType() string`

GetOptOutType returns the OptOutType field if non-nil, zero value otherwise.

### GetOptOutTypeOk

`func (o *ConversionEventsDataItemsCustomData) GetOptOutTypeOk() (*string, bool)`

GetOptOutTypeOk returns a tuple with the OptOutType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptOutType

`func (o *ConversionEventsDataItemsCustomData) SetOptOutType(v string)`

SetOptOutType sets OptOutType field to given value.

### HasOptOutType

`func (o *ConversionEventsDataItemsCustomData) HasOptOutType() bool`

HasOptOutType returns a boolean if a field has been set.

### SetOptOutTypeNil

`func (o *ConversionEventsDataItemsCustomData) SetOptOutTypeNil(b bool)`

 SetOptOutTypeNil sets the value for OptOutType to be an explicit nil

### UnsetOptOutType
`func (o *ConversionEventsDataItemsCustomData) UnsetOptOutType()`

UnsetOptOutType ensures that no value is present for OptOutType, not even an explicit nil
### GetOrderId

`func (o *ConversionEventsDataItemsCustomData) GetOrderId() string`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *ConversionEventsDataItemsCustomData) GetOrderIdOk() (*string, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *ConversionEventsDataItemsCustomData) SetOrderId(v string)`

SetOrderId sets OrderId field to given value.

### HasOrderId

`func (o *ConversionEventsDataItemsCustomData) HasOrderId() bool`

HasOrderId returns a boolean if a field has been set.

### SetOrderIdNil

`func (o *ConversionEventsDataItemsCustomData) SetOrderIdNil(b bool)`

 SetOrderIdNil sets the value for OrderId to be an explicit nil

### UnsetOrderId
`func (o *ConversionEventsDataItemsCustomData) UnsetOrderId()`

UnsetOrderId ensures that no value is present for OrderId, not even an explicit nil
### GetPredictedLtv

`func (o *ConversionEventsDataItemsCustomData) GetPredictedLtv() string`

GetPredictedLtv returns the PredictedLtv field if non-nil, zero value otherwise.

### GetPredictedLtvOk

`func (o *ConversionEventsDataItemsCustomData) GetPredictedLtvOk() (*string, bool)`

GetPredictedLtvOk returns a tuple with the PredictedLtv field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPredictedLtv

`func (o *ConversionEventsDataItemsCustomData) SetPredictedLtv(v string)`

SetPredictedLtv sets PredictedLtv field to given value.

### HasPredictedLtv

`func (o *ConversionEventsDataItemsCustomData) HasPredictedLtv() bool`

HasPredictedLtv returns a boolean if a field has been set.

### SetPredictedLtvNil

`func (o *ConversionEventsDataItemsCustomData) SetPredictedLtvNil(b bool)`

 SetPredictedLtvNil sets the value for PredictedLtv to be an explicit nil

### UnsetPredictedLtv
`func (o *ConversionEventsDataItemsCustomData) UnsetPredictedLtv()`

UnsetPredictedLtv ensures that no value is present for PredictedLtv, not even an explicit nil
### GetSearchString

`func (o *ConversionEventsDataItemsCustomData) GetSearchString() string`

GetSearchString returns the SearchString field if non-nil, zero value otherwise.

### GetSearchStringOk

`func (o *ConversionEventsDataItemsCustomData) GetSearchStringOk() (*string, bool)`

GetSearchStringOk returns a tuple with the SearchString field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchString

`func (o *ConversionEventsDataItemsCustomData) SetSearchString(v string)`

SetSearchString sets SearchString field to given value.

### HasSearchString

`func (o *ConversionEventsDataItemsCustomData) HasSearchString() bool`

HasSearchString returns a boolean if a field has been set.

### SetSearchStringNil

`func (o *ConversionEventsDataItemsCustomData) SetSearchStringNil(b bool)`

 SetSearchStringNil sets the value for SearchString to be an explicit nil

### UnsetSearchString
`func (o *ConversionEventsDataItemsCustomData) UnsetSearchString()`

UnsetSearchString ensures that no value is present for SearchString, not even an explicit nil
### GetValue

`func (o *ConversionEventsDataItemsCustomData) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ConversionEventsDataItemsCustomData) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ConversionEventsDataItemsCustomData) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *ConversionEventsDataItemsCustomData) HasValue() bool`

HasValue returns a boolean if a field has been set.

### SetValueNil

`func (o *ConversionEventsDataItemsCustomData) SetValueNil(b bool)`

 SetValueNil sets the value for Value to be an explicit nil

### UnsetValue
`func (o *ConversionEventsDataItemsCustomData) UnsetValue()`

UnsetValue ensures that no value is present for Value, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


