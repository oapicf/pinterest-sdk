# CatalogsHotelItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchId** | Pointer to **string** | Id of the catalogs items batch | [optional] 
**CreatedTime** | Pointer to **time.Time** | Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**CompletedTime** | Pointer to **NullableTime** | Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD | [optional] [readonly] 
**Status** | Pointer to [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Items** | Pointer to [**[]HotelProcessingRecord**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 

## Methods

### NewCatalogsHotelItemsBatch

`func NewCatalogsHotelItemsBatch(catalogType CatalogsType, ) *CatalogsHotelItemsBatch`

NewCatalogsHotelItemsBatch instantiates a new CatalogsHotelItemsBatch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelItemsBatchWithDefaults

`func NewCatalogsHotelItemsBatchWithDefaults() *CatalogsHotelItemsBatch`

NewCatalogsHotelItemsBatchWithDefaults instantiates a new CatalogsHotelItemsBatch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBatchId

`func (o *CatalogsHotelItemsBatch) GetBatchId() string`

GetBatchId returns the BatchId field if non-nil, zero value otherwise.

### GetBatchIdOk

`func (o *CatalogsHotelItemsBatch) GetBatchIdOk() (*string, bool)`

GetBatchIdOk returns a tuple with the BatchId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBatchId

`func (o *CatalogsHotelItemsBatch) SetBatchId(v string)`

SetBatchId sets BatchId field to given value.

### HasBatchId

`func (o *CatalogsHotelItemsBatch) HasBatchId() bool`

HasBatchId returns a boolean if a field has been set.

### GetCreatedTime

`func (o *CatalogsHotelItemsBatch) GetCreatedTime() time.Time`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *CatalogsHotelItemsBatch) GetCreatedTimeOk() (*time.Time, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *CatalogsHotelItemsBatch) SetCreatedTime(v time.Time)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *CatalogsHotelItemsBatch) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetCompletedTime

`func (o *CatalogsHotelItemsBatch) GetCompletedTime() time.Time`

GetCompletedTime returns the CompletedTime field if non-nil, zero value otherwise.

### GetCompletedTimeOk

`func (o *CatalogsHotelItemsBatch) GetCompletedTimeOk() (*time.Time, bool)`

GetCompletedTimeOk returns a tuple with the CompletedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedTime

`func (o *CatalogsHotelItemsBatch) SetCompletedTime(v time.Time)`

SetCompletedTime sets CompletedTime field to given value.

### HasCompletedTime

`func (o *CatalogsHotelItemsBatch) HasCompletedTime() bool`

HasCompletedTime returns a boolean if a field has been set.

### SetCompletedTimeNil

`func (o *CatalogsHotelItemsBatch) SetCompletedTimeNil(b bool)`

 SetCompletedTimeNil sets the value for CompletedTime to be an explicit nil

### UnsetCompletedTime
`func (o *CatalogsHotelItemsBatch) UnsetCompletedTime()`

UnsetCompletedTime ensures that no value is present for CompletedTime, not even an explicit nil
### GetStatus

`func (o *CatalogsHotelItemsBatch) GetStatus() BatchOperationStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsHotelItemsBatch) GetStatusOk() (*BatchOperationStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsHotelItemsBatch) SetStatus(v BatchOperationStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CatalogsHotelItemsBatch) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCatalogType

`func (o *CatalogsHotelItemsBatch) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsHotelItemsBatch) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsHotelItemsBatch) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetItems

`func (o *CatalogsHotelItemsBatch) GetItems() []HotelProcessingRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsHotelItemsBatch) GetItemsOk() (*[]HotelProcessingRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsHotelItemsBatch) SetItems(v []HotelProcessingRecord)`

SetItems sets Items field to given value.

### HasItems

`func (o *CatalogsHotelItemsBatch) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


