# CustomerListUpload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | Advertiser ID. | 
**CreationTime** | **int32** | Customer List Upload creation_time. Epoch (seconds). | 
**CustomerListId** | **string** | ID of the customer list associated with this upload. | 
**ErrorCounts** | Pointer to [**[]ErrorDetail**](ErrorDetail.md) | Error counts by error code | [optional] 
**Id** | **string** | Customer List Upload ID. | 
**Operation** | [**UserListOperationType**](UserListOperationType.md) |  | 
**RecordCounts** | Pointer to [**NullableRecordCounts**](RecordCounts.md) |  | [optional] 
**State** | **string** | Workload processing state | 
**UpdatedTime** | **int32** | Customer List Upload updated_time. Epoch (seconds). | 

## Methods

### NewCustomerListUpload

`func NewCustomerListUpload(adAccountId string, creationTime int32, customerListId string, id string, operation UserListOperationType, state string, updatedTime int32, ) *CustomerListUpload`

NewCustomerListUpload instantiates a new CustomerListUpload object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomerListUploadWithDefaults

`func NewCustomerListUploadWithDefaults() *CustomerListUpload`

NewCustomerListUploadWithDefaults instantiates a new CustomerListUpload object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *CustomerListUpload) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *CustomerListUpload) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *CustomerListUpload) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.


### GetCreationTime

`func (o *CustomerListUpload) GetCreationTime() int32`

GetCreationTime returns the CreationTime field if non-nil, zero value otherwise.

### GetCreationTimeOk

`func (o *CustomerListUpload) GetCreationTimeOk() (*int32, bool)`

GetCreationTimeOk returns a tuple with the CreationTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreationTime

`func (o *CustomerListUpload) SetCreationTime(v int32)`

SetCreationTime sets CreationTime field to given value.


### GetCustomerListId

`func (o *CustomerListUpload) GetCustomerListId() string`

GetCustomerListId returns the CustomerListId field if non-nil, zero value otherwise.

### GetCustomerListIdOk

`func (o *CustomerListUpload) GetCustomerListIdOk() (*string, bool)`

GetCustomerListIdOk returns a tuple with the CustomerListId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerListId

`func (o *CustomerListUpload) SetCustomerListId(v string)`

SetCustomerListId sets CustomerListId field to given value.


### GetErrorCounts

`func (o *CustomerListUpload) GetErrorCounts() []ErrorDetail`

GetErrorCounts returns the ErrorCounts field if non-nil, zero value otherwise.

### GetErrorCountsOk

`func (o *CustomerListUpload) GetErrorCountsOk() (*[]ErrorDetail, bool)`

GetErrorCountsOk returns a tuple with the ErrorCounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrorCounts

`func (o *CustomerListUpload) SetErrorCounts(v []ErrorDetail)`

SetErrorCounts sets ErrorCounts field to given value.

### HasErrorCounts

`func (o *CustomerListUpload) HasErrorCounts() bool`

HasErrorCounts returns a boolean if a field has been set.

### SetErrorCountsNil

`func (o *CustomerListUpload) SetErrorCountsNil(b bool)`

 SetErrorCountsNil sets the value for ErrorCounts to be an explicit nil

### UnsetErrorCounts
`func (o *CustomerListUpload) UnsetErrorCounts()`

UnsetErrorCounts ensures that no value is present for ErrorCounts, not even an explicit nil
### GetId

`func (o *CustomerListUpload) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CustomerListUpload) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CustomerListUpload) SetId(v string)`

SetId sets Id field to given value.


### GetOperation

`func (o *CustomerListUpload) GetOperation() UserListOperationType`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CustomerListUpload) GetOperationOk() (*UserListOperationType, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CustomerListUpload) SetOperation(v UserListOperationType)`

SetOperation sets Operation field to given value.


### GetRecordCounts

`func (o *CustomerListUpload) GetRecordCounts() RecordCounts`

GetRecordCounts returns the RecordCounts field if non-nil, zero value otherwise.

### GetRecordCountsOk

`func (o *CustomerListUpload) GetRecordCountsOk() (*RecordCounts, bool)`

GetRecordCountsOk returns a tuple with the RecordCounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecordCounts

`func (o *CustomerListUpload) SetRecordCounts(v RecordCounts)`

SetRecordCounts sets RecordCounts field to given value.

### HasRecordCounts

`func (o *CustomerListUpload) HasRecordCounts() bool`

HasRecordCounts returns a boolean if a field has been set.

### SetRecordCountsNil

`func (o *CustomerListUpload) SetRecordCountsNil(b bool)`

 SetRecordCountsNil sets the value for RecordCounts to be an explicit nil

### UnsetRecordCounts
`func (o *CustomerListUpload) UnsetRecordCounts()`

UnsetRecordCounts ensures that no value is present for RecordCounts, not even an explicit nil
### GetState

`func (o *CustomerListUpload) GetState() string`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *CustomerListUpload) GetStateOk() (*string, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *CustomerListUpload) SetState(v string)`

SetState sets State field to given value.


### GetUpdatedTime

`func (o *CustomerListUpload) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *CustomerListUpload) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *CustomerListUpload) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


