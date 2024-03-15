# HotelProcessingRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HotelId** | Pointer to **string** | The catalog hotel id in the merchant namespace | [optional] 
**Errors** | Pointer to [**[]ItemValidationEvent**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**Warnings** | Pointer to [**[]ItemValidationEvent**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 
**Status** | Pointer to [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 

## Methods

### NewHotelProcessingRecord

`func NewHotelProcessingRecord() *HotelProcessingRecord`

NewHotelProcessingRecord instantiates a new HotelProcessingRecord object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewHotelProcessingRecordWithDefaults

`func NewHotelProcessingRecordWithDefaults() *HotelProcessingRecord`

NewHotelProcessingRecordWithDefaults instantiates a new HotelProcessingRecord object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHotelId

`func (o *HotelProcessingRecord) GetHotelId() string`

GetHotelId returns the HotelId field if non-nil, zero value otherwise.

### GetHotelIdOk

`func (o *HotelProcessingRecord) GetHotelIdOk() (*string, bool)`

GetHotelIdOk returns a tuple with the HotelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelId

`func (o *HotelProcessingRecord) SetHotelId(v string)`

SetHotelId sets HotelId field to given value.

### HasHotelId

`func (o *HotelProcessingRecord) HasHotelId() bool`

HasHotelId returns a boolean if a field has been set.

### GetErrors

`func (o *HotelProcessingRecord) GetErrors() []ItemValidationEvent`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *HotelProcessingRecord) GetErrorsOk() (*[]ItemValidationEvent, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *HotelProcessingRecord) SetErrors(v []ItemValidationEvent)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *HotelProcessingRecord) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetWarnings

`func (o *HotelProcessingRecord) GetWarnings() []ItemValidationEvent`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *HotelProcessingRecord) GetWarningsOk() (*[]ItemValidationEvent, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *HotelProcessingRecord) SetWarnings(v []ItemValidationEvent)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *HotelProcessingRecord) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.

### GetStatus

`func (o *HotelProcessingRecord) GetStatus() ItemProcessingStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *HotelProcessingRecord) GetStatusOk() (*ItemProcessingStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *HotelProcessingRecord) SetStatus(v ItemProcessingStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *HotelProcessingRecord) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


