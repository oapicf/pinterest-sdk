# SupplementalOperationResult

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

### NewSupplementalOperationResult

`func NewSupplementalOperationResult(itemId string, status SupplementalItemProcessingStatus, storeCode string, supplementalType string, ) *SupplementalOperationResult`

NewSupplementalOperationResult instantiates a new SupplementalOperationResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSupplementalOperationResultWithDefaults

`func NewSupplementalOperationResultWithDefaults() *SupplementalOperationResult`

NewSupplementalOperationResultWithDefaults instantiates a new SupplementalOperationResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *SupplementalOperationResult) GetErrors() []SupplementalItemValidationEvent`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *SupplementalOperationResult) GetErrorsOk() (*[]SupplementalItemValidationEvent, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *SupplementalOperationResult) SetErrors(v []SupplementalItemValidationEvent)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *SupplementalOperationResult) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetItemId

`func (o *SupplementalOperationResult) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *SupplementalOperationResult) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *SupplementalOperationResult) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetStatus

`func (o *SupplementalOperationResult) GetStatus() SupplementalItemProcessingStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *SupplementalOperationResult) GetStatusOk() (*SupplementalItemProcessingStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *SupplementalOperationResult) SetStatus(v SupplementalItemProcessingStatus)`

SetStatus sets Status field to given value.


### GetStoreCode

`func (o *SupplementalOperationResult) GetStoreCode() string`

GetStoreCode returns the StoreCode field if non-nil, zero value otherwise.

### GetStoreCodeOk

`func (o *SupplementalOperationResult) GetStoreCodeOk() (*string, bool)`

GetStoreCodeOk returns a tuple with the StoreCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreCode

`func (o *SupplementalOperationResult) SetStoreCode(v string)`

SetStoreCode sets StoreCode field to given value.


### GetSupplementalType

`func (o *SupplementalOperationResult) GetSupplementalType() string`

GetSupplementalType returns the SupplementalType field if non-nil, zero value otherwise.

### GetSupplementalTypeOk

`func (o *SupplementalOperationResult) GetSupplementalTypeOk() (*string, bool)`

GetSupplementalTypeOk returns a tuple with the SupplementalType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupplementalType

`func (o *SupplementalOperationResult) SetSupplementalType(v string)`

SetSupplementalType sets SupplementalType field to given value.


### GetWarnings

`func (o *SupplementalOperationResult) GetWarnings() []SupplementalItemValidationEvent`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *SupplementalOperationResult) GetWarningsOk() (*[]SupplementalItemValidationEvent, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *SupplementalOperationResult) SetWarnings(v []SupplementalItemValidationEvent)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *SupplementalOperationResult) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


