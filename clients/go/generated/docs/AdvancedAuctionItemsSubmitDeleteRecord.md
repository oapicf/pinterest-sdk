# AdvancedAuctionItemsSubmitDeleteRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Errors** | Pointer to [**[]AdvancedAuctionOperationError**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] 
**ItemId** | **string** | The catalog retail item id in the merchant namespace | 
**Language** | [**Language**](Language.md) |  | 
**Operation** | **string** |  | 

## Methods

### NewAdvancedAuctionItemsSubmitDeleteRecord

`func NewAdvancedAuctionItemsSubmitDeleteRecord(country Country, itemId string, language Language, operation string, ) *AdvancedAuctionItemsSubmitDeleteRecord`

NewAdvancedAuctionItemsSubmitDeleteRecord instantiates a new AdvancedAuctionItemsSubmitDeleteRecord object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvancedAuctionItemsSubmitDeleteRecordWithDefaults

`func NewAdvancedAuctionItemsSubmitDeleteRecordWithDefaults() *AdvancedAuctionItemsSubmitDeleteRecord`

NewAdvancedAuctionItemsSubmitDeleteRecordWithDefaults instantiates a new AdvancedAuctionItemsSubmitDeleteRecord object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetErrors

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) GetErrors() []AdvancedAuctionOperationError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) GetErrorsOk() (*[]AdvancedAuctionOperationError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) SetErrors(v []AdvancedAuctionOperationError)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetItemId

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetLanguage

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) GetLanguage() Language`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) GetLanguageOk() (*Language, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) SetLanguage(v Language)`

SetLanguage sets Language field to given value.


### GetOperation

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *AdvancedAuctionItemsSubmitDeleteRecord) SetOperation(v string)`

SetOperation sets Operation field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


