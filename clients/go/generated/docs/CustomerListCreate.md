# CustomerListCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsNca** | Pointer to **bool** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] 
**ListType** | Pointer to [**UserListType**](UserListType.md) | Type of customer list (e.g., EMAIL, IDFA, MAID). | [optional] [default to EMAIL]
**Name** | **string** | Customer list name. | 
**Records** | Pointer to **string** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [optional] 
**RecordsV2** | Pointer to [**[]CustomerListRecordRow**](CustomerListRecordRow.md) | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. | [optional] 

## Methods

### NewCustomerListCreate

`func NewCustomerListCreate(name string, ) *CustomerListCreate`

NewCustomerListCreate instantiates a new CustomerListCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomerListCreateWithDefaults

`func NewCustomerListCreateWithDefaults() *CustomerListCreate`

NewCustomerListCreateWithDefaults instantiates a new CustomerListCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIsNca

`func (o *CustomerListCreate) GetIsNca() bool`

GetIsNca returns the IsNca field if non-nil, zero value otherwise.

### GetIsNcaOk

`func (o *CustomerListCreate) GetIsNcaOk() (*bool, bool)`

GetIsNcaOk returns a tuple with the IsNca field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsNca

`func (o *CustomerListCreate) SetIsNca(v bool)`

SetIsNca sets IsNca field to given value.

### HasIsNca

`func (o *CustomerListCreate) HasIsNca() bool`

HasIsNca returns a boolean if a field has been set.

### GetListType

`func (o *CustomerListCreate) GetListType() UserListType`

GetListType returns the ListType field if non-nil, zero value otherwise.

### GetListTypeOk

`func (o *CustomerListCreate) GetListTypeOk() (*UserListType, bool)`

GetListTypeOk returns a tuple with the ListType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetListType

`func (o *CustomerListCreate) SetListType(v UserListType)`

SetListType sets ListType field to given value.

### HasListType

`func (o *CustomerListCreate) HasListType() bool`

HasListType returns a boolean if a field has been set.

### GetName

`func (o *CustomerListCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CustomerListCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CustomerListCreate) SetName(v string)`

SetName sets Name field to given value.


### GetRecords

`func (o *CustomerListCreate) GetRecords() string`

GetRecords returns the Records field if non-nil, zero value otherwise.

### GetRecordsOk

`func (o *CustomerListCreate) GetRecordsOk() (*string, bool)`

GetRecordsOk returns a tuple with the Records field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecords

`func (o *CustomerListCreate) SetRecords(v string)`

SetRecords sets Records field to given value.

### HasRecords

`func (o *CustomerListCreate) HasRecords() bool`

HasRecords returns a boolean if a field has been set.

### GetRecordsV2

`func (o *CustomerListCreate) GetRecordsV2() []CustomerListRecordRow`

GetRecordsV2 returns the RecordsV2 field if non-nil, zero value otherwise.

### GetRecordsV2Ok

`func (o *CustomerListCreate) GetRecordsV2Ok() (*[]CustomerListRecordRow, bool)`

GetRecordsV2Ok returns a tuple with the RecordsV2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecordsV2

`func (o *CustomerListCreate) SetRecordsV2(v []CustomerListRecordRow)`

SetRecordsV2 sets RecordsV2 field to given value.

### HasRecordsV2

`func (o *CustomerListCreate) HasRecordsV2() bool`

HasRecordsV2 returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


