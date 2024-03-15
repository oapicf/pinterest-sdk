# BulkUpsertRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Create** | Pointer to [**BulkUpsertRequestCreate**](BulkUpsertRequestCreate.md) |  | [optional] 
**Update** | Pointer to [**BulkUpsertRequestUpdate**](BulkUpsertRequestUpdate.md) |  | [optional] 

## Methods

### NewBulkUpsertRequest

`func NewBulkUpsertRequest() *BulkUpsertRequest`

NewBulkUpsertRequest instantiates a new BulkUpsertRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBulkUpsertRequestWithDefaults

`func NewBulkUpsertRequestWithDefaults() *BulkUpsertRequest`

NewBulkUpsertRequestWithDefaults instantiates a new BulkUpsertRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreate

`func (o *BulkUpsertRequest) GetCreate() BulkUpsertRequestCreate`

GetCreate returns the Create field if non-nil, zero value otherwise.

### GetCreateOk

`func (o *BulkUpsertRequest) GetCreateOk() (*BulkUpsertRequestCreate, bool)`

GetCreateOk returns a tuple with the Create field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreate

`func (o *BulkUpsertRequest) SetCreate(v BulkUpsertRequestCreate)`

SetCreate sets Create field to given value.

### HasCreate

`func (o *BulkUpsertRequest) HasCreate() bool`

HasCreate returns a boolean if a field has been set.

### GetUpdate

`func (o *BulkUpsertRequest) GetUpdate() BulkUpsertRequestUpdate`

GetUpdate returns the Update field if non-nil, zero value otherwise.

### GetUpdateOk

`func (o *BulkUpsertRequest) GetUpdateOk() (*BulkUpsertRequestUpdate, bool)`

GetUpdateOk returns a tuple with the Update field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdate

`func (o *BulkUpsertRequest) SetUpdate(v BulkUpsertRequestUpdate)`

SetUpdate sets Update field to given value.

### HasUpdate

`func (o *BulkUpsertRequest) HasUpdate() bool`

HasUpdate returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


