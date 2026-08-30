# LocalInventoryDeleteOperation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **string** | Catalog item id in the merchant namespace | 
**Operation** | **string** |  | 
**StoreCode** | **string** | Store code for the local inventory item | 

## Methods

### NewLocalInventoryDeleteOperation

`func NewLocalInventoryDeleteOperation(itemId string, operation string, storeCode string, ) *LocalInventoryDeleteOperation`

NewLocalInventoryDeleteOperation instantiates a new LocalInventoryDeleteOperation object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalInventoryDeleteOperationWithDefaults

`func NewLocalInventoryDeleteOperationWithDefaults() *LocalInventoryDeleteOperation`

NewLocalInventoryDeleteOperationWithDefaults instantiates a new LocalInventoryDeleteOperation object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *LocalInventoryDeleteOperation) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *LocalInventoryDeleteOperation) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *LocalInventoryDeleteOperation) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOperation

`func (o *LocalInventoryDeleteOperation) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *LocalInventoryDeleteOperation) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *LocalInventoryDeleteOperation) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetStoreCode

`func (o *LocalInventoryDeleteOperation) GetStoreCode() string`

GetStoreCode returns the StoreCode field if non-nil, zero value otherwise.

### GetStoreCodeOk

`func (o *LocalInventoryDeleteOperation) GetStoreCodeOk() (*string, bool)`

GetStoreCodeOk returns a tuple with the StoreCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStoreCode

`func (o *LocalInventoryDeleteOperation) SetStoreCode(v string)`

SetStoreCode sets StoreCode field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


