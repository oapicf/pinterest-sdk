# LabelError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**Label**](Label.md) |  | [optional] 
**ErrorMessages** | Pointer to **[]string** |  | [optional] 

## Methods

### NewLabelError

`func NewLabelError() *LabelError`

NewLabelError instantiates a new LabelError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabelErrorWithDefaults

`func NewLabelErrorWithDefaults() *LabelError`

NewLabelErrorWithDefaults instantiates a new LabelError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *LabelError) GetData() Label`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *LabelError) GetDataOk() (*Label, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *LabelError) SetData(v Label)`

SetData sets Data field to given value.

### HasData

`func (o *LabelError) HasData() bool`

HasData returns a boolean if a field has been set.

### GetErrorMessages

`func (o *LabelError) GetErrorMessages() []string`

GetErrorMessages returns the ErrorMessages field if non-nil, zero value otherwise.

### GetErrorMessagesOk

`func (o *LabelError) GetErrorMessagesOk() (*[]string, bool)`

GetErrorMessagesOk returns a tuple with the ErrorMessages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrorMessages

`func (o *LabelError) SetErrorMessages(v []string)`

SetErrorMessages sets ErrorMessages field to given value.

### HasErrorMessages

`func (o *LabelError) HasErrorMessages() bool`

HasErrorMessages returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


