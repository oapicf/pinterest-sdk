# AdvancedAuctionItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**ItemId** | **string** | The catalog retail item id in the merchant namespace | 
**Language** | [**Language**](Language.md) |  | 
**BidOptions** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 

## Methods

### NewAdvancedAuctionItem

`func NewAdvancedAuctionItem(country Country, itemId string, language Language, bidOptions AdvancedAuctionBidOptions, ) *AdvancedAuctionItem`

NewAdvancedAuctionItem instantiates a new AdvancedAuctionItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvancedAuctionItemWithDefaults

`func NewAdvancedAuctionItemWithDefaults() *AdvancedAuctionItem`

NewAdvancedAuctionItemWithDefaults instantiates a new AdvancedAuctionItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *AdvancedAuctionItem) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AdvancedAuctionItem) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AdvancedAuctionItem) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetItemId

`func (o *AdvancedAuctionItem) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *AdvancedAuctionItem) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *AdvancedAuctionItem) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetLanguage

`func (o *AdvancedAuctionItem) GetLanguage() Language`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *AdvancedAuctionItem) GetLanguageOk() (*Language, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *AdvancedAuctionItem) SetLanguage(v Language)`

SetLanguage sets Language field to given value.


### GetBidOptions

`func (o *AdvancedAuctionItem) GetBidOptions() AdvancedAuctionBidOptions`

GetBidOptions returns the BidOptions field if non-nil, zero value otherwise.

### GetBidOptionsOk

`func (o *AdvancedAuctionItem) GetBidOptionsOk() (*AdvancedAuctionBidOptions, bool)`

GetBidOptionsOk returns a tuple with the BidOptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidOptions

`func (o *AdvancedAuctionItem) SetBidOptions(v AdvancedAuctionBidOptions)`

SetBidOptions sets BidOptions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


