# CustomerListUpdateWithRequiredBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OperationType** | [**UserListOperationType**](UserListOperationType.md) | Customer list update operation type (add or remove). Only valid in update request body. | 
**Records** | Pointer to **string** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [optional] 
**RecordsV2** | Pointer to [**[]CustomerListRecordRow**](CustomerListRecordRow.md) | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. | [optional] 

## Methods

### NewCustomerListUpdateWithRequiredBody

`func NewCustomerListUpdateWithRequiredBody(operationType UserListOperationType, ) *CustomerListUpdateWithRequiredBody`

NewCustomerListUpdateWithRequiredBody instantiates a new CustomerListUpdateWithRequiredBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomerListUpdateWithRequiredBodyWithDefaults

`func NewCustomerListUpdateWithRequiredBodyWithDefaults() *CustomerListUpdateWithRequiredBody`

NewCustomerListUpdateWithRequiredBodyWithDefaults instantiates a new CustomerListUpdateWithRequiredBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperationType

`func (o *CustomerListUpdateWithRequiredBody) GetOperationType() UserListOperationType`

GetOperationType returns the OperationType field if non-nil, zero value otherwise.

### GetOperationTypeOk

`func (o *CustomerListUpdateWithRequiredBody) GetOperationTypeOk() (*UserListOperationType, bool)`

GetOperationTypeOk returns a tuple with the OperationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationType

`func (o *CustomerListUpdateWithRequiredBody) SetOperationType(v UserListOperationType)`

SetOperationType sets OperationType field to given value.


### GetRecords

`func (o *CustomerListUpdateWithRequiredBody) GetRecords() string`

GetRecords returns the Records field if non-nil, zero value otherwise.

### GetRecordsOk

`func (o *CustomerListUpdateWithRequiredBody) GetRecordsOk() (*string, bool)`

GetRecordsOk returns a tuple with the Records field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecords

`func (o *CustomerListUpdateWithRequiredBody) SetRecords(v string)`

SetRecords sets Records field to given value.

### HasRecords

`func (o *CustomerListUpdateWithRequiredBody) HasRecords() bool`

HasRecords returns a boolean if a field has been set.

### GetRecordsV2

`func (o *CustomerListUpdateWithRequiredBody) GetRecordsV2() []CustomerListRecordRow`

GetRecordsV2 returns the RecordsV2 field if non-nil, zero value otherwise.

### GetRecordsV2Ok

`func (o *CustomerListUpdateWithRequiredBody) GetRecordsV2Ok() (*[]CustomerListRecordRow, bool)`

GetRecordsV2Ok returns a tuple with the RecordsV2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecordsV2

`func (o *CustomerListUpdateWithRequiredBody) SetRecordsV2(v []CustomerListRecordRow)`

SetRecordsV2 sets RecordsV2 field to given value.

### HasRecordsV2

`func (o *CustomerListUpdateWithRequiredBody) HasRecordsV2() bool`

HasRecordsV2 returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


