# CustomerList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Associated ad account ID. | [optional] [readonly] 
**CreatedTime** | Pointer to **float32** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**Exceptions** | Pointer to **map[string]interface{}** | Customer list errors. | [optional] [readonly] 
**Id** | **string** | Customer list ID. | [readonly] 
**IsNca** | Pointer to **bool** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] 
**Name** | **string** | Customer list name. | 
**NumBatches** | Pointer to **float32** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional] [readonly] 
**NumRemovedUserRecords** | Pointer to **float32** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional] [readonly] 
**NumUploadedUserRecords** | Pointer to **float32** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional] [readonly] 
**Status** | Pointer to [**CustomerListStatus**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. | [optional] [readonly] 
**Type** | Pointer to **string** | Always &#x60;customerlist&#x60;. | [optional] [readonly] 
**UpdatedTime** | Pointer to **float32** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

## Methods

### NewCustomerList

`func NewCustomerList(id string, name string, ) *CustomerList`

NewCustomerList instantiates a new CustomerList object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomerListWithDefaults

`func NewCustomerListWithDefaults() *CustomerList`

NewCustomerListWithDefaults instantiates a new CustomerList object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *CustomerList) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *CustomerList) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *CustomerList) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *CustomerList) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetCreatedTime

`func (o *CustomerList) GetCreatedTime() float32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *CustomerList) GetCreatedTimeOk() (*float32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *CustomerList) SetCreatedTime(v float32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *CustomerList) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetExceptions

`func (o *CustomerList) GetExceptions() map[string]interface{}`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *CustomerList) GetExceptionsOk() (*map[string]interface{}, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *CustomerList) SetExceptions(v map[string]interface{})`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *CustomerList) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.

### GetId

`func (o *CustomerList) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CustomerList) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CustomerList) SetId(v string)`

SetId sets Id field to given value.


### GetIsNca

`func (o *CustomerList) GetIsNca() bool`

GetIsNca returns the IsNca field if non-nil, zero value otherwise.

### GetIsNcaOk

`func (o *CustomerList) GetIsNcaOk() (*bool, bool)`

GetIsNcaOk returns a tuple with the IsNca field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsNca

`func (o *CustomerList) SetIsNca(v bool)`

SetIsNca sets IsNca field to given value.

### HasIsNca

`func (o *CustomerList) HasIsNca() bool`

HasIsNca returns a boolean if a field has been set.

### GetName

`func (o *CustomerList) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CustomerList) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CustomerList) SetName(v string)`

SetName sets Name field to given value.


### GetNumBatches

`func (o *CustomerList) GetNumBatches() float32`

GetNumBatches returns the NumBatches field if non-nil, zero value otherwise.

### GetNumBatchesOk

`func (o *CustomerList) GetNumBatchesOk() (*float32, bool)`

GetNumBatchesOk returns a tuple with the NumBatches field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumBatches

`func (o *CustomerList) SetNumBatches(v float32)`

SetNumBatches sets NumBatches field to given value.

### HasNumBatches

`func (o *CustomerList) HasNumBatches() bool`

HasNumBatches returns a boolean if a field has been set.

### GetNumRemovedUserRecords

`func (o *CustomerList) GetNumRemovedUserRecords() float32`

GetNumRemovedUserRecords returns the NumRemovedUserRecords field if non-nil, zero value otherwise.

### GetNumRemovedUserRecordsOk

`func (o *CustomerList) GetNumRemovedUserRecordsOk() (*float32, bool)`

GetNumRemovedUserRecordsOk returns a tuple with the NumRemovedUserRecords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumRemovedUserRecords

`func (o *CustomerList) SetNumRemovedUserRecords(v float32)`

SetNumRemovedUserRecords sets NumRemovedUserRecords field to given value.

### HasNumRemovedUserRecords

`func (o *CustomerList) HasNumRemovedUserRecords() bool`

HasNumRemovedUserRecords returns a boolean if a field has been set.

### GetNumUploadedUserRecords

`func (o *CustomerList) GetNumUploadedUserRecords() float32`

GetNumUploadedUserRecords returns the NumUploadedUserRecords field if non-nil, zero value otherwise.

### GetNumUploadedUserRecordsOk

`func (o *CustomerList) GetNumUploadedUserRecordsOk() (*float32, bool)`

GetNumUploadedUserRecordsOk returns a tuple with the NumUploadedUserRecords field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumUploadedUserRecords

`func (o *CustomerList) SetNumUploadedUserRecords(v float32)`

SetNumUploadedUserRecords sets NumUploadedUserRecords field to given value.

### HasNumUploadedUserRecords

`func (o *CustomerList) HasNumUploadedUserRecords() bool`

HasNumUploadedUserRecords returns a boolean if a field has been set.

### GetStatus

`func (o *CustomerList) GetStatus() CustomerListStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CustomerList) GetStatusOk() (*CustomerListStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CustomerList) SetStatus(v CustomerListStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CustomerList) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetType

`func (o *CustomerList) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CustomerList) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CustomerList) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *CustomerList) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUpdatedTime

`func (o *CustomerList) GetUpdatedTime() float32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *CustomerList) GetUpdatedTimeOk() (*float32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *CustomerList) SetUpdatedTime(v float32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *CustomerList) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


