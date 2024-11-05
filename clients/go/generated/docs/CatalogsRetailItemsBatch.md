# CatalogsRetailItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchId** | Pointer to **string** | Id of the catalogs items batch | [optional] 
**CreatedTime** | Pointer to **time.Time** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**CompletedTime** | Pointer to **NullableTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**Status** | Pointer to [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Items** | Pointer to [**[]ItemProcessingRecord**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 

## Methods

### NewCatalogsRetailItemsBatch

`func NewCatalogsRetailItemsBatch(catalogType CatalogsType, ) *CatalogsRetailItemsBatch`

NewCatalogsRetailItemsBatch instantiates a new CatalogsRetailItemsBatch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailItemsBatchWithDefaults

`func NewCatalogsRetailItemsBatchWithDefaults() *CatalogsRetailItemsBatch`

NewCatalogsRetailItemsBatchWithDefaults instantiates a new CatalogsRetailItemsBatch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBatchId

`func (o *CatalogsRetailItemsBatch) GetBatchId() string`

GetBatchId returns the BatchId field if non-nil, zero value otherwise.

### GetBatchIdOk

`func (o *CatalogsRetailItemsBatch) GetBatchIdOk() (*string, bool)`

GetBatchIdOk returns a tuple with the BatchId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBatchId

`func (o *CatalogsRetailItemsBatch) SetBatchId(v string)`

SetBatchId sets BatchId field to given value.

### HasBatchId

`func (o *CatalogsRetailItemsBatch) HasBatchId() bool`

HasBatchId returns a boolean if a field has been set.

### GetCreatedTime

`func (o *CatalogsRetailItemsBatch) GetCreatedTime() time.Time`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *CatalogsRetailItemsBatch) GetCreatedTimeOk() (*time.Time, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *CatalogsRetailItemsBatch) SetCreatedTime(v time.Time)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *CatalogsRetailItemsBatch) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetCompletedTime

`func (o *CatalogsRetailItemsBatch) GetCompletedTime() time.Time`

GetCompletedTime returns the CompletedTime field if non-nil, zero value otherwise.

### GetCompletedTimeOk

`func (o *CatalogsRetailItemsBatch) GetCompletedTimeOk() (*time.Time, bool)`

GetCompletedTimeOk returns a tuple with the CompletedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedTime

`func (o *CatalogsRetailItemsBatch) SetCompletedTime(v time.Time)`

SetCompletedTime sets CompletedTime field to given value.

### HasCompletedTime

`func (o *CatalogsRetailItemsBatch) HasCompletedTime() bool`

HasCompletedTime returns a boolean if a field has been set.

### SetCompletedTimeNil

`func (o *CatalogsRetailItemsBatch) SetCompletedTimeNil(b bool)`

 SetCompletedTimeNil sets the value for CompletedTime to be an explicit nil

### UnsetCompletedTime
`func (o *CatalogsRetailItemsBatch) UnsetCompletedTime()`

UnsetCompletedTime ensures that no value is present for CompletedTime, not even an explicit nil
### GetStatus

`func (o *CatalogsRetailItemsBatch) GetStatus() BatchOperationStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsRetailItemsBatch) GetStatusOk() (*BatchOperationStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsRetailItemsBatch) SetStatus(v BatchOperationStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CatalogsRetailItemsBatch) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCatalogType

`func (o *CatalogsRetailItemsBatch) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailItemsBatch) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailItemsBatch) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetItems

`func (o *CatalogsRetailItemsBatch) GetItems() []ItemProcessingRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsRetailItemsBatch) GetItemsOk() (*[]ItemProcessingRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsRetailItemsBatch) SetItems(v []ItemProcessingRecord)`

SetItems sets Items field to given value.

### HasItems

`func (o *CatalogsRetailItemsBatch) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


