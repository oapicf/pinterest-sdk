# AdvancedAuctionProcessedItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | Pointer to [**[]AdvancedAuctionOperationError**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] 

## Methods

### NewAdvancedAuctionProcessedItem

`func NewAdvancedAuctionProcessedItem() *AdvancedAuctionProcessedItem`

NewAdvancedAuctionProcessedItem instantiates a new AdvancedAuctionProcessedItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvancedAuctionProcessedItemWithDefaults

`func NewAdvancedAuctionProcessedItemWithDefaults() *AdvancedAuctionProcessedItem`

NewAdvancedAuctionProcessedItemWithDefaults instantiates a new AdvancedAuctionProcessedItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *AdvancedAuctionProcessedItem) GetErrors() []AdvancedAuctionOperationError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *AdvancedAuctionProcessedItem) GetErrorsOk() (*[]AdvancedAuctionOperationError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *AdvancedAuctionProcessedItem) SetErrors(v []AdvancedAuctionOperationError)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *AdvancedAuctionProcessedItem) HasErrors() bool`

HasErrors returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


