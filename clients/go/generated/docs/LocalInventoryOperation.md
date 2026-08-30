# LocalInventoryOperation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**RetailLocalInventoryItemAttributes**](RetailLocalInventoryItemAttributes.md) |  | 
**ItemId** | **string** | Catalog item id in the merchant namespace | 
**Operation** | **string** |  | 
**StoreCode** | **string** | Store code for the local inventory item | 

## Methods

### NewLocalInventoryOperation

`func NewLocalInventoryOperation(attributes RetailLocalInventoryItemAttributes, itemId string, operation string, storeCode string, ) *LocalInventoryOperation`

NewLocalInventoryOperation instantiates a new LocalInventoryOperation object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalInventoryOperationWithDefaults

`func NewLocalInventoryOperationWithDefaults() *LocalInventoryOperation`

NewLocalInventoryOperationWithDefaults instantiates a new LocalInventoryOperation object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttributes

`func (o *LocalInventoryOperation) GetAttributes() RetailLocalInventoryItemAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *LocalInventoryOperation) GetAttributesOk() (*RetailLocalInventoryItemAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *LocalInventoryOperation) SetAttributes(v RetailLocalInventoryItemAttributes)`

SetAttributes sets Attributes field to given value.


### GetItemId

`func (o *LocalInventoryOperation) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *LocalInventoryOperation) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *LocalInventoryOperation) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOperation

`func (o *LocalInventoryOperation) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *LocalInventoryOperation) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *LocalInventoryOperation) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetStoreCode

`func (o *LocalInventoryOperation) GetStoreCode() string`

GetStoreCode returns the StoreCode field if non-nil, zero value otherwise.

### GetStoreCodeOk

`func (o *LocalInventoryOperation) GetStoreCodeOk() (*string, bool)`

GetStoreCodeOk returns a tuple with the StoreCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreCode

`func (o *LocalInventoryOperation) SetStoreCode(v string)`

SetStoreCode sets StoreCode field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


