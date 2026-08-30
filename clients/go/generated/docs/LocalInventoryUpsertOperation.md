# LocalInventoryUpsertOperation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**RetailLocalInventoryItemAttributes**](RetailLocalInventoryItemAttributes.md) |  | 
**ItemId** | **string** | Catalog item id in the merchant namespace | 
**Operation** | **string** |  | 
**StoreCode** | **string** | Store code for the local inventory item | 

## Methods

### NewLocalInventoryUpsertOperation

`func NewLocalInventoryUpsertOperation(attributes RetailLocalInventoryItemAttributes, itemId string, operation string, storeCode string, ) *LocalInventoryUpsertOperation`

NewLocalInventoryUpsertOperation instantiates a new LocalInventoryUpsertOperation object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalInventoryUpsertOperationWithDefaults

`func NewLocalInventoryUpsertOperationWithDefaults() *LocalInventoryUpsertOperation`

NewLocalInventoryUpsertOperationWithDefaults instantiates a new LocalInventoryUpsertOperation object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttributes

`func (o *LocalInventoryUpsertOperation) GetAttributes() RetailLocalInventoryItemAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *LocalInventoryUpsertOperation) GetAttributesOk() (*RetailLocalInventoryItemAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *LocalInventoryUpsertOperation) SetAttributes(v RetailLocalInventoryItemAttributes)`

SetAttributes sets Attributes field to given value.


### GetItemId

`func (o *LocalInventoryUpsertOperation) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *LocalInventoryUpsertOperation) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *LocalInventoryUpsertOperation) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOperation

`func (o *LocalInventoryUpsertOperation) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *LocalInventoryUpsertOperation) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *LocalInventoryUpsertOperation) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetStoreCode

`func (o *LocalInventoryUpsertOperation) GetStoreCode() string`

GetStoreCode returns the StoreCode field if non-nil, zero value otherwise.

### GetStoreCodeOk

`func (o *LocalInventoryUpsertOperation) GetStoreCodeOk() (*string, bool)`

GetStoreCodeOk returns a tuple with the StoreCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreCode

`func (o *LocalInventoryUpsertOperation) SetStoreCode(v string)`

SetStoreCode sets StoreCode field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


