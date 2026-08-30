# CatalogsRetailBatchRequestItemsItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | 
**ItemId** | **string** | The catalog item id in the merchant namespace | 
**Operation** | **string** |  | 
**UpdateMask** | Pointer to [**[]UpdateMaskFieldType**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 
**LastUpdatedTime** | Pointer to **int64** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] 

## Methods

### NewCatalogsRetailBatchRequestItemsItems

`func NewCatalogsRetailBatchRequestItemsItems(attributes ItemAttributesRequest, itemId string, operation string, ) *CatalogsRetailBatchRequestItemsItems`

NewCatalogsRetailBatchRequestItemsItems instantiates a new CatalogsRetailBatchRequestItemsItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailBatchRequestItemsItemsWithDefaults

`func NewCatalogsRetailBatchRequestItemsItemsWithDefaults() *CatalogsRetailBatchRequestItemsItems`

NewCatalogsRetailBatchRequestItemsItemsWithDefaults instantiates a new CatalogsRetailBatchRequestItemsItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttributes

`func (o *CatalogsRetailBatchRequestItemsItems) GetAttributes() ItemAttributesRequest`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsRetailBatchRequestItemsItems) GetAttributesOk() (*ItemAttributesRequest, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsRetailBatchRequestItemsItems) SetAttributes(v ItemAttributesRequest)`

SetAttributes sets Attributes field to given value.


### GetItemId

`func (o *CatalogsRetailBatchRequestItemsItems) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *CatalogsRetailBatchRequestItemsItems) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *CatalogsRetailBatchRequestItemsItems) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOperation

`func (o *CatalogsRetailBatchRequestItemsItems) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsRetailBatchRequestItemsItems) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsRetailBatchRequestItemsItems) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetUpdateMask

`func (o *CatalogsRetailBatchRequestItemsItems) GetUpdateMask() []UpdateMaskFieldType`

GetUpdateMask returns the UpdateMask field if non-nil, zero value otherwise.

### GetUpdateMaskOk

`func (o *CatalogsRetailBatchRequestItemsItems) GetUpdateMaskOk() (*[]UpdateMaskFieldType, bool)`

GetUpdateMaskOk returns a tuple with the UpdateMask field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateMask

`func (o *CatalogsRetailBatchRequestItemsItems) SetUpdateMask(v []UpdateMaskFieldType)`

SetUpdateMask sets UpdateMask field to given value.

### HasUpdateMask

`func (o *CatalogsRetailBatchRequestItemsItems) HasUpdateMask() bool`

HasUpdateMask returns a boolean if a field has been set.

### SetUpdateMaskNil

`func (o *CatalogsRetailBatchRequestItemsItems) SetUpdateMaskNil(b bool)`

 SetUpdateMaskNil sets the value for UpdateMask to be an explicit nil

### UnsetUpdateMask
`func (o *CatalogsRetailBatchRequestItemsItems) UnsetUpdateMask()`

UnsetUpdateMask ensures that no value is present for UpdateMask, not even an explicit nil
### GetLastUpdatedTime

`func (o *CatalogsRetailBatchRequestItemsItems) GetLastUpdatedTime() int64`

GetLastUpdatedTime returns the LastUpdatedTime field if non-nil, zero value otherwise.

### GetLastUpdatedTimeOk

`func (o *CatalogsRetailBatchRequestItemsItems) GetLastUpdatedTimeOk() (*int64, bool)`

GetLastUpdatedTimeOk returns a tuple with the LastUpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastUpdatedTime

`func (o *CatalogsRetailBatchRequestItemsItems) SetLastUpdatedTime(v int64)`

SetLastUpdatedTime sets LastUpdatedTime field to given value.

### HasLastUpdatedTime

`func (o *CatalogsRetailBatchRequestItemsItems) HasLastUpdatedTime() bool`

HasLastUpdatedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


