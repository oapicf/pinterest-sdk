# ItemProcessingRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | Pointer to **string** | The catalog item id in the merchant namespace | [optional] 
**Errors** | Pointer to [**[]ItemValidationEvent**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**Warnings** | Pointer to [**[]ItemValidationEvent**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 
**Status** | Pointer to [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 

## Methods

### NewItemProcessingRecord

`func NewItemProcessingRecord() *ItemProcessingRecord`

NewItemProcessingRecord instantiates a new ItemProcessingRecord object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemProcessingRecordWithDefaults

`func NewItemProcessingRecordWithDefaults() *ItemProcessingRecord`

NewItemProcessingRecordWithDefaults instantiates a new ItemProcessingRecord object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *ItemProcessingRecord) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *ItemProcessingRecord) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *ItemProcessingRecord) SetItemId(v string)`

SetItemId sets ItemId field to given value.

### HasItemId

`func (o *ItemProcessingRecord) HasItemId() bool`

HasItemId returns a boolean if a field has been set.

### GetErrors

`func (o *ItemProcessingRecord) GetErrors() []ItemValidationEvent`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *ItemProcessingRecord) GetErrorsOk() (*[]ItemValidationEvent, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *ItemProcessingRecord) SetErrors(v []ItemValidationEvent)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *ItemProcessingRecord) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetWarnings

`func (o *ItemProcessingRecord) GetWarnings() []ItemValidationEvent`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ItemProcessingRecord) GetWarningsOk() (*[]ItemValidationEvent, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ItemProcessingRecord) SetWarnings(v []ItemValidationEvent)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ItemProcessingRecord) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.

### GetStatus

`func (o *ItemProcessingRecord) GetStatus() ItemProcessingStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ItemProcessingRecord) GetStatusOk() (*ItemProcessingStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ItemProcessingRecord) SetStatus(v ItemProcessingStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ItemProcessingRecord) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


