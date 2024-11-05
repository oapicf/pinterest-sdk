# AdvancedAuctionKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **string** | The catalog retail item id in the merchant namespace | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 

## Methods

### NewAdvancedAuctionKey

`func NewAdvancedAuctionKey(itemId string, country Country, language Language, ) *AdvancedAuctionKey`

NewAdvancedAuctionKey instantiates a new AdvancedAuctionKey object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvancedAuctionKeyWithDefaults

`func NewAdvancedAuctionKeyWithDefaults() *AdvancedAuctionKey`

NewAdvancedAuctionKeyWithDefaults instantiates a new AdvancedAuctionKey object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *AdvancedAuctionKey) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *AdvancedAuctionKey) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *AdvancedAuctionKey) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetCountry

`func (o *AdvancedAuctionKey) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AdvancedAuctionKey) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AdvancedAuctionKey) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLanguage

`func (o *AdvancedAuctionKey) GetLanguage() Language`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *AdvancedAuctionKey) GetLanguageOk() (*Language, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *AdvancedAuctionKey) SetLanguage(v Language)`

SetLanguage sets Language field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


