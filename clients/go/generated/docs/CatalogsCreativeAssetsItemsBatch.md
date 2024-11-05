# CatalogsCreativeAssetsItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchId** | Pointer to **string** | Id of the catalogs items batch | [optional] 
**CreatedTime** | Pointer to **time.Time** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**CompletedTime** | Pointer to **NullableTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**Status** | Pointer to [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Items** | Pointer to [**[]CreativeAssetsProcessingRecord**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 

## Methods

### NewCatalogsCreativeAssetsItemsBatch

`func NewCatalogsCreativeAssetsItemsBatch(catalogType CatalogsType, ) *CatalogsCreativeAssetsItemsBatch`

NewCatalogsCreativeAssetsItemsBatch instantiates a new CatalogsCreativeAssetsItemsBatch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreativeAssetsItemsBatchWithDefaults

`func NewCatalogsCreativeAssetsItemsBatchWithDefaults() *CatalogsCreativeAssetsItemsBatch`

NewCatalogsCreativeAssetsItemsBatchWithDefaults instantiates a new CatalogsCreativeAssetsItemsBatch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBatchId

`func (o *CatalogsCreativeAssetsItemsBatch) GetBatchId() string`

GetBatchId returns the BatchId field if non-nil, zero value otherwise.

### GetBatchIdOk

`func (o *CatalogsCreativeAssetsItemsBatch) GetBatchIdOk() (*string, bool)`

GetBatchIdOk returns a tuple with the BatchId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBatchId

`func (o *CatalogsCreativeAssetsItemsBatch) SetBatchId(v string)`

SetBatchId sets BatchId field to given value.

### HasBatchId

`func (o *CatalogsCreativeAssetsItemsBatch) HasBatchId() bool`

HasBatchId returns a boolean if a field has been set.

### GetCreatedTime

`func (o *CatalogsCreativeAssetsItemsBatch) GetCreatedTime() time.Time`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *CatalogsCreativeAssetsItemsBatch) GetCreatedTimeOk() (*time.Time, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *CatalogsCreativeAssetsItemsBatch) SetCreatedTime(v time.Time)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *CatalogsCreativeAssetsItemsBatch) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetCompletedTime

`func (o *CatalogsCreativeAssetsItemsBatch) GetCompletedTime() time.Time`

GetCompletedTime returns the CompletedTime field if non-nil, zero value otherwise.

### GetCompletedTimeOk

`func (o *CatalogsCreativeAssetsItemsBatch) GetCompletedTimeOk() (*time.Time, bool)`

GetCompletedTimeOk returns a tuple with the CompletedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedTime

`func (o *CatalogsCreativeAssetsItemsBatch) SetCompletedTime(v time.Time)`

SetCompletedTime sets CompletedTime field to given value.

### HasCompletedTime

`func (o *CatalogsCreativeAssetsItemsBatch) HasCompletedTime() bool`

HasCompletedTime returns a boolean if a field has been set.

### SetCompletedTimeNil

`func (o *CatalogsCreativeAssetsItemsBatch) SetCompletedTimeNil(b bool)`

 SetCompletedTimeNil sets the value for CompletedTime to be an explicit nil

### UnsetCompletedTime
`func (o *CatalogsCreativeAssetsItemsBatch) UnsetCompletedTime()`

UnsetCompletedTime ensures that no value is present for CompletedTime, not even an explicit nil
### GetStatus

`func (o *CatalogsCreativeAssetsItemsBatch) GetStatus() BatchOperationStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsCreativeAssetsItemsBatch) GetStatusOk() (*BatchOperationStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsCreativeAssetsItemsBatch) SetStatus(v BatchOperationStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CatalogsCreativeAssetsItemsBatch) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCatalogType

`func (o *CatalogsCreativeAssetsItemsBatch) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsCreativeAssetsItemsBatch) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsCreativeAssetsItemsBatch) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetItems

`func (o *CatalogsCreativeAssetsItemsBatch) GetItems() []CreativeAssetsProcessingRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsCreativeAssetsItemsBatch) GetItemsOk() (*[]CreativeAssetsProcessingRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsCreativeAssetsItemsBatch) SetItems(v []CreativeAssetsProcessingRecord)`

SetItems sets Items field to given value.

### HasItems

`func (o *CatalogsCreativeAssetsItemsBatch) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


