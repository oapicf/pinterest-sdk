# CustomerListUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OperationType** | [**UserListOperationType**](UserListOperationType.md) |  | 
**Records** | **string** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 

## Methods

### NewCustomerListUpdateRequest

`func NewCustomerListUpdateRequest(operationType UserListOperationType, records string, ) *CustomerListUpdateRequest`

NewCustomerListUpdateRequest instantiates a new CustomerListUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomerListUpdateRequestWithDefaults

`func NewCustomerListUpdateRequestWithDefaults() *CustomerListUpdateRequest`

NewCustomerListUpdateRequestWithDefaults instantiates a new CustomerListUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperationType

`func (o *CustomerListUpdateRequest) GetOperationType() UserListOperationType`

GetOperationType returns the OperationType field if non-nil, zero value otherwise.

### GetOperationTypeOk

`func (o *CustomerListUpdateRequest) GetOperationTypeOk() (*UserListOperationType, bool)`

GetOperationTypeOk returns a tuple with the OperationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationType

`func (o *CustomerListUpdateRequest) SetOperationType(v UserListOperationType)`

SetOperationType sets OperationType field to given value.


### GetRecords

`func (o *CustomerListUpdateRequest) GetRecords() string`

GetRecords returns the Records field if non-nil, zero value otherwise.

### GetRecordsOk

`func (o *CustomerListUpdateRequest) GetRecordsOk() (*string, bool)`

GetRecordsOk returns a tuple with the Records field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecords

`func (o *CustomerListUpdateRequest) SetRecords(v string)`

SetRecords sets Records field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


