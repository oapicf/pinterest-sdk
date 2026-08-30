# LocalInventoryItemsBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchId** | **string** | Id of the batch operation | [readonly] 
**CompletedTime** | Pointer to **time.Time** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**CreatedTime** | **time.Time** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [readonly] 
**OperationResults** | [**[]SupplementalOperationResult**](SupplementalOperationResult.md) | Array of operation results | [readonly] 
**Status** | [**SupplementalItemBatchOperationStatus**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] 

## Methods

### NewLocalInventoryItemsBatch

`func NewLocalInventoryItemsBatch(batchId string, createdTime time.Time, operationResults []SupplementalOperationResult, status SupplementalItemBatchOperationStatus, ) *LocalInventoryItemsBatch`

NewLocalInventoryItemsBatch instantiates a new LocalInventoryItemsBatch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalInventoryItemsBatchWithDefaults

`func NewLocalInventoryItemsBatchWithDefaults() *LocalInventoryItemsBatch`

NewLocalInventoryItemsBatchWithDefaults instantiates a new LocalInventoryItemsBatch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBatchId

`func (o *LocalInventoryItemsBatch) GetBatchId() string`

GetBatchId returns the BatchId field if non-nil, zero value otherwise.

### GetBatchIdOk

`func (o *LocalInventoryItemsBatch) GetBatchIdOk() (*string, bool)`

GetBatchIdOk returns a tuple with the BatchId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBatchId

`func (o *LocalInventoryItemsBatch) SetBatchId(v string)`

SetBatchId sets BatchId field to given value.


### GetCompletedTime

`func (o *LocalInventoryItemsBatch) GetCompletedTime() time.Time`

GetCompletedTime returns the CompletedTime field if non-nil, zero value otherwise.

### GetCompletedTimeOk

`func (o *LocalInventoryItemsBatch) GetCompletedTimeOk() (*time.Time, bool)`

GetCompletedTimeOk returns a tuple with the CompletedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedTime

`func (o *LocalInventoryItemsBatch) SetCompletedTime(v time.Time)`

SetCompletedTime sets CompletedTime field to given value.

### HasCompletedTime

`func (o *LocalInventoryItemsBatch) HasCompletedTime() bool`

HasCompletedTime returns a boolean if a field has been set.

### GetCreatedTime

`func (o *LocalInventoryItemsBatch) GetCreatedTime() time.Time`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *LocalInventoryItemsBatch) GetCreatedTimeOk() (*time.Time, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *LocalInventoryItemsBatch) SetCreatedTime(v time.Time)`

SetCreatedTime sets CreatedTime field to given value.


### GetOperationResults

`func (o *LocalInventoryItemsBatch) GetOperationResults() []SupplementalOperationResult`

GetOperationResults returns the OperationResults field if non-nil, zero value otherwise.

### GetOperationResultsOk

`func (o *LocalInventoryItemsBatch) GetOperationResultsOk() (*[]SupplementalOperationResult, bool)`

GetOperationResultsOk returns a tuple with the OperationResults field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationResults

`func (o *LocalInventoryItemsBatch) SetOperationResults(v []SupplementalOperationResult)`

SetOperationResults sets OperationResults field to given value.


### GetStatus

`func (o *LocalInventoryItemsBatch) GetStatus() SupplementalItemBatchOperationStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *LocalInventoryItemsBatch) GetStatusOk() (*SupplementalItemBatchOperationStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *LocalInventoryItemsBatch) SetStatus(v SupplementalItemBatchOperationStatus)`

SetStatus sets Status field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


