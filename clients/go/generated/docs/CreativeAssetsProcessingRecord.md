# CreativeAssetsProcessingRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreativeAssetsId** | Pointer to **string** | The catalog creative assets id in the merchant namespace | [optional] 
**Errors** | Pointer to [**[]ItemValidationEvent**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**Warnings** | Pointer to [**[]ItemValidationEvent**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 
**Status** | Pointer to [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 

## Methods

### NewCreativeAssetsProcessingRecord

`func NewCreativeAssetsProcessingRecord() *CreativeAssetsProcessingRecord`

NewCreativeAssetsProcessingRecord instantiates a new CreativeAssetsProcessingRecord object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreativeAssetsProcessingRecordWithDefaults

`func NewCreativeAssetsProcessingRecordWithDefaults() *CreativeAssetsProcessingRecord`

NewCreativeAssetsProcessingRecordWithDefaults instantiates a new CreativeAssetsProcessingRecord object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreativeAssetsId

`func (o *CreativeAssetsProcessingRecord) GetCreativeAssetsId() string`

GetCreativeAssetsId returns the CreativeAssetsId field if non-nil, zero value otherwise.

### GetCreativeAssetsIdOk

`func (o *CreativeAssetsProcessingRecord) GetCreativeAssetsIdOk() (*string, bool)`

GetCreativeAssetsIdOk returns a tuple with the CreativeAssetsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeAssetsId

`func (o *CreativeAssetsProcessingRecord) SetCreativeAssetsId(v string)`

SetCreativeAssetsId sets CreativeAssetsId field to given value.

### HasCreativeAssetsId

`func (o *CreativeAssetsProcessingRecord) HasCreativeAssetsId() bool`

HasCreativeAssetsId returns a boolean if a field has been set.

### GetErrors

`func (o *CreativeAssetsProcessingRecord) GetErrors() []ItemValidationEvent`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *CreativeAssetsProcessingRecord) GetErrorsOk() (*[]ItemValidationEvent, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *CreativeAssetsProcessingRecord) SetErrors(v []ItemValidationEvent)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *CreativeAssetsProcessingRecord) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetWarnings

`func (o *CreativeAssetsProcessingRecord) GetWarnings() []ItemValidationEvent`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CreativeAssetsProcessingRecord) GetWarningsOk() (*[]ItemValidationEvent, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CreativeAssetsProcessingRecord) SetWarnings(v []ItemValidationEvent)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CreativeAssetsProcessingRecord) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.

### GetStatus

`func (o *CreativeAssetsProcessingRecord) GetStatus() ItemProcessingStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CreativeAssetsProcessingRecord) GetStatusOk() (*ItemProcessingStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CreativeAssetsProcessingRecord) SetStatus(v ItemProcessingStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CreativeAssetsProcessingRecord) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


