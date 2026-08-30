# LocalInventoryItemsBatchCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operations** | [**[]LocalInventoryOperation**](LocalInventoryOperation.md) | Array of inventory operations. Up to 1000 items per request. | 

## Methods

### NewLocalInventoryItemsBatchCreate

`func NewLocalInventoryItemsBatchCreate(operations []LocalInventoryOperation, ) *LocalInventoryItemsBatchCreate`

NewLocalInventoryItemsBatchCreate instantiates a new LocalInventoryItemsBatchCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalInventoryItemsBatchCreateWithDefaults

`func NewLocalInventoryItemsBatchCreateWithDefaults() *LocalInventoryItemsBatchCreate`

NewLocalInventoryItemsBatchCreateWithDefaults instantiates a new LocalInventoryItemsBatchCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperations

`func (o *LocalInventoryItemsBatchCreate) GetOperations() []LocalInventoryOperation`

GetOperations returns the Operations field if non-nil, zero value otherwise.

### GetOperationsOk

`func (o *LocalInventoryItemsBatchCreate) GetOperationsOk() (*[]LocalInventoryOperation, bool)`

GetOperationsOk returns a tuple with the Operations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperations

`func (o *LocalInventoryItemsBatchCreate) SetOperations(v []LocalInventoryOperation)`

SetOperations sets Operations field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


