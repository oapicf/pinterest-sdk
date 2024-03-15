# CustomerListRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Customer list name. | 
**Records** | **string** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 
**ListType** | Pointer to [**UserListType**](UserListType.md) |  | [optional] [default to EMAIL]
**Exceptions** | Pointer to **map[string]interface{}** | Customer list errors. | [optional] 

## Methods

### NewCustomerListRequest

`func NewCustomerListRequest(name string, records string, ) *CustomerListRequest`

NewCustomerListRequest instantiates a new CustomerListRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomerListRequestWithDefaults

`func NewCustomerListRequestWithDefaults() *CustomerListRequest`

NewCustomerListRequestWithDefaults instantiates a new CustomerListRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CustomerListRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CustomerListRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CustomerListRequest) SetName(v string)`

SetName sets Name field to given value.


### GetRecords

`func (o *CustomerListRequest) GetRecords() string`

GetRecords returns the Records field if non-nil, zero value otherwise.

### GetRecordsOk

`func (o *CustomerListRequest) GetRecordsOk() (*string, bool)`

GetRecordsOk returns a tuple with the Records field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecords

`func (o *CustomerListRequest) SetRecords(v string)`

SetRecords sets Records field to given value.


### GetListType

`func (o *CustomerListRequest) GetListType() UserListType`

GetListType returns the ListType field if non-nil, zero value otherwise.

### GetListTypeOk

`func (o *CustomerListRequest) GetListTypeOk() (*UserListType, bool)`

GetListTypeOk returns a tuple with the ListType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetListType

`func (o *CustomerListRequest) SetListType(v UserListType)`

SetListType sets ListType field to given value.

### HasListType

`func (o *CustomerListRequest) HasListType() bool`

HasListType returns a boolean if a field has been set.

### GetExceptions

`func (o *CustomerListRequest) GetExceptions() map[string]interface{}`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *CustomerListRequest) GetExceptionsOk() (*map[string]interface{}, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *CustomerListRequest) SetExceptions(v map[string]interface{})`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *CustomerListRequest) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


