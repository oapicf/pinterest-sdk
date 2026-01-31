# CatalogsRetailBatchRequestItemsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | 
**ItemId** | **string** | The catalog item id in the merchant namespace | 
**Operation** | **string** |  | 
**UpdateMask** | Pointer to [**[]UpdateMaskFieldType**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 
**LastUpdatedTime** | Pointer to **int64** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] 

## Methods

### NewCatalogsRetailBatchRequestItemsInner

`func NewCatalogsRetailBatchRequestItemsInner(attributes ItemAttributesRequest, itemId string, operation string, ) *CatalogsRetailBatchRequestItemsInner`

NewCatalogsRetailBatchRequestItemsInner instantiates a new CatalogsRetailBatchRequestItemsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailBatchRequestItemsInnerWithDefaults

`func NewCatalogsRetailBatchRequestItemsInnerWithDefaults() *CatalogsRetailBatchRequestItemsInner`

NewCatalogsRetailBatchRequestItemsInnerWithDefaults instantiates a new CatalogsRetailBatchRequestItemsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttributes

`func (o *CatalogsRetailBatchRequestItemsInner) GetAttributes() ItemAttributesRequest`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsRetailBatchRequestItemsInner) GetAttributesOk() (*ItemAttributesRequest, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsRetailBatchRequestItemsInner) SetAttributes(v ItemAttributesRequest)`

SetAttributes sets Attributes field to given value.


### GetItemId

`func (o *CatalogsRetailBatchRequestItemsInner) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *CatalogsRetailBatchRequestItemsInner) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *CatalogsRetailBatchRequestItemsInner) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOperation

`func (o *CatalogsRetailBatchRequestItemsInner) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsRetailBatchRequestItemsInner) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsRetailBatchRequestItemsInner) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetUpdateMask

`func (o *CatalogsRetailBatchRequestItemsInner) GetUpdateMask() []UpdateMaskFieldType`

GetUpdateMask returns the UpdateMask field if non-nil, zero value otherwise.

### GetUpdateMaskOk

`func (o *CatalogsRetailBatchRequestItemsInner) GetUpdateMaskOk() (*[]UpdateMaskFieldType, bool)`

GetUpdateMaskOk returns a tuple with the UpdateMask field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateMask

`func (o *CatalogsRetailBatchRequestItemsInner) SetUpdateMask(v []UpdateMaskFieldType)`

SetUpdateMask sets UpdateMask field to given value.

### HasUpdateMask

`func (o *CatalogsRetailBatchRequestItemsInner) HasUpdateMask() bool`

HasUpdateMask returns a boolean if a field has been set.

### SetUpdateMaskNil

`func (o *CatalogsRetailBatchRequestItemsInner) SetUpdateMaskNil(b bool)`

 SetUpdateMaskNil sets the value for UpdateMask to be an explicit nil

### UnsetUpdateMask
`func (o *CatalogsRetailBatchRequestItemsInner) UnsetUpdateMask()`

UnsetUpdateMask ensures that no value is present for UpdateMask, not even an explicit nil
### GetLastUpdatedTime

`func (o *CatalogsRetailBatchRequestItemsInner) GetLastUpdatedTime() int64`

GetLastUpdatedTime returns the LastUpdatedTime field if non-nil, zero value otherwise.

### GetLastUpdatedTimeOk

`func (o *CatalogsRetailBatchRequestItemsInner) GetLastUpdatedTimeOk() (*int64, bool)`

GetLastUpdatedTimeOk returns a tuple with the LastUpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastUpdatedTime

`func (o *CatalogsRetailBatchRequestItemsInner) SetLastUpdatedTime(v int64)`

SetLastUpdatedTime sets LastUpdatedTime field to given value.

### HasLastUpdatedTime

`func (o *CatalogsRetailBatchRequestItemsInner) HasLastUpdatedTime() bool`

HasLastUpdatedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


