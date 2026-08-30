# LocalInventoryOperationResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | Pointer to [**[]SupplementalItemValidationEvent**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**ItemId** | **string** | Catalog item id in the merchant namespace | 
**Status** | [**SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | 
**StoreCode** | **string** | Store code for the local inventory item | 
**SupplementalType** | **string** |  | 
**Warnings** | Pointer to [**[]SupplementalItemValidationEvent**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 

## Methods

### NewLocalInventoryOperationResult

`func NewLocalInventoryOperationResult(itemId string, status SupplementalItemProcessingStatus, storeCode string, supplementalType string, ) *LocalInventoryOperationResult`

NewLocalInventoryOperationResult instantiates a new LocalInventoryOperationResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalInventoryOperationResultWithDefaults

`func NewLocalInventoryOperationResultWithDefaults() *LocalInventoryOperationResult`

NewLocalInventoryOperationResultWithDefaults instantiates a new LocalInventoryOperationResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *LocalInventoryOperationResult) GetErrors() []SupplementalItemValidationEvent`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *LocalInventoryOperationResult) GetErrorsOk() (*[]SupplementalItemValidationEvent, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *LocalInventoryOperationResult) SetErrors(v []SupplementalItemValidationEvent)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *LocalInventoryOperationResult) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetItemId

`func (o *LocalInventoryOperationResult) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *LocalInventoryOperationResult) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *LocalInventoryOperationResult) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetStatus

`func (o *LocalInventoryOperationResult) GetStatus() SupplementalItemProcessingStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *LocalInventoryOperationResult) GetStatusOk() (*SupplementalItemProcessingStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *LocalInventoryOperationResult) SetStatus(v SupplementalItemProcessingStatus)`

SetStatus sets Status field to given value.


### GetStoreCode

`func (o *LocalInventoryOperationResult) GetStoreCode() string`

GetStoreCode returns the StoreCode field if non-nil, zero value otherwise.

### GetStoreCodeOk

`func (o *LocalInventoryOperationResult) GetStoreCodeOk() (*string, bool)`

GetStoreCodeOk returns a tuple with the StoreCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreCode

`func (o *LocalInventoryOperationResult) SetStoreCode(v string)`

SetStoreCode sets StoreCode field to given value.


### GetSupplementalType

`func (o *LocalInventoryOperationResult) GetSupplementalType() string`

GetSupplementalType returns the SupplementalType field if non-nil, zero value otherwise.

### GetSupplementalTypeOk

`func (o *LocalInventoryOperationResult) GetSupplementalTypeOk() (*string, bool)`

GetSupplementalTypeOk returns a tuple with the SupplementalType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupplementalType

`func (o *LocalInventoryOperationResult) SetSupplementalType(v string)`

SetSupplementalType sets SupplementalType field to given value.


### GetWarnings

`func (o *LocalInventoryOperationResult) GetWarnings() []SupplementalItemValidationEvent`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *LocalInventoryOperationResult) GetWarningsOk() (*[]SupplementalItemValidationEvent, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *LocalInventoryOperationResult) SetWarnings(v []SupplementalItemValidationEvent)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *LocalInventoryOperationResult) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


