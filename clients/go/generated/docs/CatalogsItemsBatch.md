# CatalogsItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**BatchId** | Pointer to **string** | Id of the catalogs items batch | [optional] 
**CreatedTime** | Pointer to **time.Time** | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**CompletedTime** | Pointer to **NullableTime** | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**Status** | Pointer to [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 
**Items** | Pointer to [**[]HotelProcessingRecord**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 

## Methods

### NewCatalogsItemsBatch

`func NewCatalogsItemsBatch(catalogType CatalogsType, ) *CatalogsItemsBatch`

NewCatalogsItemsBatch instantiates a new CatalogsItemsBatch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemsBatchWithDefaults

`func NewCatalogsItemsBatchWithDefaults() *CatalogsItemsBatch`

NewCatalogsItemsBatchWithDefaults instantiates a new CatalogsItemsBatch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsItemsBatch) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsItemsBatch) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsItemsBatch) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetBatchId

`func (o *CatalogsItemsBatch) GetBatchId() string`

GetBatchId returns the BatchId field if non-nil, zero value otherwise.

### GetBatchIdOk

`func (o *CatalogsItemsBatch) GetBatchIdOk() (*string, bool)`

GetBatchIdOk returns a tuple with the BatchId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBatchId

`func (o *CatalogsItemsBatch) SetBatchId(v string)`

SetBatchId sets BatchId field to given value.

### HasBatchId

`func (o *CatalogsItemsBatch) HasBatchId() bool`

HasBatchId returns a boolean if a field has been set.

### GetCreatedTime

`func (o *CatalogsItemsBatch) GetCreatedTime() time.Time`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *CatalogsItemsBatch) GetCreatedTimeOk() (*time.Time, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *CatalogsItemsBatch) SetCreatedTime(v time.Time)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *CatalogsItemsBatch) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetCompletedTime

`func (o *CatalogsItemsBatch) GetCompletedTime() time.Time`

GetCompletedTime returns the CompletedTime field if non-nil, zero value otherwise.

### GetCompletedTimeOk

`func (o *CatalogsItemsBatch) GetCompletedTimeOk() (*time.Time, bool)`

GetCompletedTimeOk returns a tuple with the CompletedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedTime

`func (o *CatalogsItemsBatch) SetCompletedTime(v time.Time)`

SetCompletedTime sets CompletedTime field to given value.

### HasCompletedTime

`func (o *CatalogsItemsBatch) HasCompletedTime() bool`

HasCompletedTime returns a boolean if a field has been set.

### SetCompletedTimeNil

`func (o *CatalogsItemsBatch) SetCompletedTimeNil(b bool)`

 SetCompletedTimeNil sets the value for CompletedTime to be an explicit nil

### UnsetCompletedTime
`func (o *CatalogsItemsBatch) UnsetCompletedTime()`

UnsetCompletedTime ensures that no value is present for CompletedTime, not even an explicit nil
### GetStatus

`func (o *CatalogsItemsBatch) GetStatus() BatchOperationStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsItemsBatch) GetStatusOk() (*BatchOperationStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsItemsBatch) SetStatus(v BatchOperationStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CatalogsItemsBatch) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetItems

`func (o *CatalogsItemsBatch) GetItems() []HotelProcessingRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsItemsBatch) GetItemsOk() (*[]HotelProcessingRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsItemsBatch) SetItems(v []HotelProcessingRecord)`

SetItems sets Items field to given value.

### HasItems

`func (o *CatalogsItemsBatch) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


