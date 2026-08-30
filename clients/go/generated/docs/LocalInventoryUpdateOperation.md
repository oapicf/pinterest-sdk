# LocalInventoryUpdateOperation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**RetailLocalInventoryItemAttributesOptional**](RetailLocalInventoryItemAttributesOptional.md) |  | 
**ItemId** | **string** | Catalog item id in the merchant namespace | 
**Operation** | **string** |  | 
**StoreCode** | **string** | Store code for the local inventory item | 

## Methods

### NewLocalInventoryUpdateOperation

`func NewLocalInventoryUpdateOperation(attributes RetailLocalInventoryItemAttributesOptional, itemId string, operation string, storeCode string, ) *LocalInventoryUpdateOperation`

NewLocalInventoryUpdateOperation instantiates a new LocalInventoryUpdateOperation object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalInventoryUpdateOperationWithDefaults

`func NewLocalInventoryUpdateOperationWithDefaults() *LocalInventoryUpdateOperation`

NewLocalInventoryUpdateOperationWithDefaults instantiates a new LocalInventoryUpdateOperation object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttributes

`func (o *LocalInventoryUpdateOperation) GetAttributes() RetailLocalInventoryItemAttributesOptional`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *LocalInventoryUpdateOperation) GetAttributesOk() (*RetailLocalInventoryItemAttributesOptional, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *LocalInventoryUpdateOperation) SetAttributes(v RetailLocalInventoryItemAttributesOptional)`

SetAttributes sets Attributes field to given value.


### GetItemId

`func (o *LocalInventoryUpdateOperation) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *LocalInventoryUpdateOperation) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *LocalInventoryUpdateOperation) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOperation

`func (o *LocalInventoryUpdateOperation) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *LocalInventoryUpdateOperation) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *LocalInventoryUpdateOperation) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetStoreCode

`func (o *LocalInventoryUpdateOperation) GetStoreCode() string`

GetStoreCode returns the StoreCode field if non-nil, zero value otherwise.

### GetStoreCodeOk

`func (o *LocalInventoryUpdateOperation) GetStoreCodeOk() (*string, bool)`

GetStoreCodeOk returns a tuple with the StoreCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreCode

`func (o *LocalInventoryUpdateOperation) SetStoreCode(v string)`

SetStoreCode sets StoreCode field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


