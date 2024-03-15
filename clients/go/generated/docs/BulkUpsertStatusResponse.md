# BulkUpsertStatusResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**BulkUpsertStatus**](BulkUpsertStatus.md) |  | [optional] 
**ResultUrl** | Pointer to **string** |  | [optional] 

## Methods

### NewBulkUpsertStatusResponse

`func NewBulkUpsertStatusResponse() *BulkUpsertStatusResponse`

NewBulkUpsertStatusResponse instantiates a new BulkUpsertStatusResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkUpsertStatusResponseWithDefaults

`func NewBulkUpsertStatusResponseWithDefaults() *BulkUpsertStatusResponse`

NewBulkUpsertStatusResponseWithDefaults instantiates a new BulkUpsertStatusResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *BulkUpsertStatusResponse) GetStatus() BulkUpsertStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *BulkUpsertStatusResponse) GetStatusOk() (*BulkUpsertStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *BulkUpsertStatusResponse) SetStatus(v BulkUpsertStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *BulkUpsertStatusResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResultUrl

`func (o *BulkUpsertStatusResponse) GetResultUrl() string`

GetResultUrl returns the ResultUrl field if non-nil, zero value otherwise.

### GetResultUrlOk

`func (o *BulkUpsertStatusResponse) GetResultUrlOk() (*string, bool)`

GetResultUrlOk returns a tuple with the ResultUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResultUrl

`func (o *BulkUpsertStatusResponse) SetResultUrl(v string)`

SetResultUrl sets ResultUrl field to given value.

### HasResultUrl

`func (o *BulkUpsertStatusResponse) HasResultUrl() bool`

HasResultUrl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


