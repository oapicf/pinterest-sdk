# CustomerListUploadCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | [**UserListOperationType**](UserListOperationType.md) |  | 
**TotalParts** | **int32** | Number of parts to upload the file in. | 

## Methods

### NewCustomerListUploadCreateRequest

`func NewCustomerListUploadCreateRequest(operation UserListOperationType, totalParts int32, ) *CustomerListUploadCreateRequest`

NewCustomerListUploadCreateRequest instantiates a new CustomerListUploadCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomerListUploadCreateRequestWithDefaults

`func NewCustomerListUploadCreateRequestWithDefaults() *CustomerListUploadCreateRequest`

NewCustomerListUploadCreateRequestWithDefaults instantiates a new CustomerListUploadCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *CustomerListUploadCreateRequest) GetOperation() UserListOperationType`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CustomerListUploadCreateRequest) GetOperationOk() (*UserListOperationType, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CustomerListUploadCreateRequest) SetOperation(v UserListOperationType)`

SetOperation sets Operation field to given value.


### GetTotalParts

`func (o *CustomerListUploadCreateRequest) GetTotalParts() int32`

GetTotalParts returns the TotalParts field if non-nil, zero value otherwise.

### GetTotalPartsOk

`func (o *CustomerListUploadCreateRequest) GetTotalPartsOk() (*int32, bool)`

GetTotalPartsOk returns a tuple with the TotalParts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalParts

`func (o *CustomerListUploadCreateRequest) SetTotalParts(v int32)`

SetTotalParts sets TotalParts field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


