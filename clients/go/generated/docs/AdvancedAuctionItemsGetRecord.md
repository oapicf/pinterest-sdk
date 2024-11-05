# AdvancedAuctionItemsGetRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **string** | The catalog retail item id in the merchant namespace | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 

## Methods

### NewAdvancedAuctionItemsGetRecord

`func NewAdvancedAuctionItemsGetRecord(itemId string, country Country, language Language, ) *AdvancedAuctionItemsGetRecord`

NewAdvancedAuctionItemsGetRecord instantiates a new AdvancedAuctionItemsGetRecord object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvancedAuctionItemsGetRecordWithDefaults

`func NewAdvancedAuctionItemsGetRecordWithDefaults() *AdvancedAuctionItemsGetRecord`

NewAdvancedAuctionItemsGetRecordWithDefaults instantiates a new AdvancedAuctionItemsGetRecord object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *AdvancedAuctionItemsGetRecord) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *AdvancedAuctionItemsGetRecord) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *AdvancedAuctionItemsGetRecord) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetCountry

`func (o *AdvancedAuctionItemsGetRecord) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AdvancedAuctionItemsGetRecord) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AdvancedAuctionItemsGetRecord) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLanguage

`func (o *AdvancedAuctionItemsGetRecord) GetLanguage() Language`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *AdvancedAuctionItemsGetRecord) GetLanguageOk() (*Language, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *AdvancedAuctionItemsGetRecord) SetLanguage(v Language)`

SetLanguage sets Language field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


