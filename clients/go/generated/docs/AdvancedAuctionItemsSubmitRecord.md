# AdvancedAuctionItemsSubmitRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | [**AdvancedAuctionOperation**](AdvancedAuctionOperation.md) |  | 
**ItemId** | **string** | The catalog retail item id in the merchant namespace | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 
**BidOptions** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 
**UpdateMask** | [**[]UpdateMaskBidOptionField**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. | 

## Methods

### NewAdvancedAuctionItemsSubmitRecord

`func NewAdvancedAuctionItemsSubmitRecord(operation AdvancedAuctionOperation, itemId string, country Country, language Language, bidOptions AdvancedAuctionBidOptions, updateMask []UpdateMaskBidOptionField, ) *AdvancedAuctionItemsSubmitRecord`

NewAdvancedAuctionItemsSubmitRecord instantiates a new AdvancedAuctionItemsSubmitRecord object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvancedAuctionItemsSubmitRecordWithDefaults

`func NewAdvancedAuctionItemsSubmitRecordWithDefaults() *AdvancedAuctionItemsSubmitRecord`

NewAdvancedAuctionItemsSubmitRecordWithDefaults instantiates a new AdvancedAuctionItemsSubmitRecord object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *AdvancedAuctionItemsSubmitRecord) GetOperation() AdvancedAuctionOperation`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *AdvancedAuctionItemsSubmitRecord) GetOperationOk() (*AdvancedAuctionOperation, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *AdvancedAuctionItemsSubmitRecord) SetOperation(v AdvancedAuctionOperation)`

SetOperation sets Operation field to given value.


### GetItemId

`func (o *AdvancedAuctionItemsSubmitRecord) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *AdvancedAuctionItemsSubmitRecord) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *AdvancedAuctionItemsSubmitRecord) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetCountry

`func (o *AdvancedAuctionItemsSubmitRecord) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AdvancedAuctionItemsSubmitRecord) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AdvancedAuctionItemsSubmitRecord) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLanguage

`func (o *AdvancedAuctionItemsSubmitRecord) GetLanguage() Language`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *AdvancedAuctionItemsSubmitRecord) GetLanguageOk() (*Language, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *AdvancedAuctionItemsSubmitRecord) SetLanguage(v Language)`

SetLanguage sets Language field to given value.


### GetBidOptions

`func (o *AdvancedAuctionItemsSubmitRecord) GetBidOptions() AdvancedAuctionBidOptions`

GetBidOptions returns the BidOptions field if non-nil, zero value otherwise.

### GetBidOptionsOk

`func (o *AdvancedAuctionItemsSubmitRecord) GetBidOptionsOk() (*AdvancedAuctionBidOptions, bool)`

GetBidOptionsOk returns a tuple with the BidOptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidOptions

`func (o *AdvancedAuctionItemsSubmitRecord) SetBidOptions(v AdvancedAuctionBidOptions)`

SetBidOptions sets BidOptions field to given value.


### GetUpdateMask

`func (o *AdvancedAuctionItemsSubmitRecord) GetUpdateMask() []UpdateMaskBidOptionField`

GetUpdateMask returns the UpdateMask field if non-nil, zero value otherwise.

### GetUpdateMaskOk

`func (o *AdvancedAuctionItemsSubmitRecord) GetUpdateMaskOk() (*[]UpdateMaskBidOptionField, bool)`

GetUpdateMaskOk returns a tuple with the UpdateMask field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateMask

`func (o *AdvancedAuctionItemsSubmitRecord) SetUpdateMask(v []UpdateMaskBidOptionField)`

SetUpdateMask sets UpdateMask field to given value.


### SetUpdateMaskNil

`func (o *AdvancedAuctionItemsSubmitRecord) SetUpdateMaskNil(b bool)`

 SetUpdateMaskNil sets the value for UpdateMask to be an explicit nil

### UnsetUpdateMask
`func (o *AdvancedAuctionItemsSubmitRecord) UnsetUpdateMask()`

UnsetUpdateMask ensures that no value is present for UpdateMask, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


