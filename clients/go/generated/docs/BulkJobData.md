# BulkJobData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResultUrl** | Pointer to **string** | Presigned s3 file url for the bulk request result. | [optional] 
**Status** | [**BulkRequestStatus**](BulkRequestStatus.md) |  | 
**WorkloadId** | Pointer to **int32** | Bulk Workload Id. | [optional] 

## Methods

### NewBulkJobData

`func NewBulkJobData(status BulkRequestStatus, ) *BulkJobData`

NewBulkJobData instantiates a new BulkJobData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkJobDataWithDefaults

`func NewBulkJobDataWithDefaults() *BulkJobData`

NewBulkJobDataWithDefaults instantiates a new BulkJobData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResultUrl

`func (o *BulkJobData) GetResultUrl() string`

GetResultUrl returns the ResultUrl field if non-nil, zero value otherwise.

### GetResultUrlOk

`func (o *BulkJobData) GetResultUrlOk() (*string, bool)`

GetResultUrlOk returns a tuple with the ResultUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResultUrl

`func (o *BulkJobData) SetResultUrl(v string)`

SetResultUrl sets ResultUrl field to given value.

### HasResultUrl

`func (o *BulkJobData) HasResultUrl() bool`

HasResultUrl returns a boolean if a field has been set.

### GetStatus

`func (o *BulkJobData) GetStatus() BulkRequestStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *BulkJobData) GetStatusOk() (*BulkRequestStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *BulkJobData) SetStatus(v BulkRequestStatus)`

SetStatus sets Status field to given value.


### GetWorkloadId

`func (o *BulkJobData) GetWorkloadId() int32`

GetWorkloadId returns the WorkloadId field if non-nil, zero value otherwise.

### GetWorkloadIdOk

`func (o *BulkJobData) GetWorkloadIdOk() (*int32, bool)`

GetWorkloadIdOk returns a tuple with the WorkloadId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkloadId

`func (o *BulkJobData) SetWorkloadId(v int32)`

SetWorkloadId sets WorkloadId field to given value.

### HasWorkloadId

`func (o *BulkJobData) HasWorkloadId() bool`

HasWorkloadId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


