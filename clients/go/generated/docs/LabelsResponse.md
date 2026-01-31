# LabelsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | Pointer to [**[]LabelError**](LabelError.md) | Labels that were not successfully applied. | [optional] 
**Labels** | Pointer to [**[]Label**](Label.md) |  | [optional] 

## Methods

### NewLabelsResponse

`func NewLabelsResponse() *LabelsResponse`

NewLabelsResponse instantiates a new LabelsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLabelsResponseWithDefaults

`func NewLabelsResponseWithDefaults() *LabelsResponse`

NewLabelsResponseWithDefaults instantiates a new LabelsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *LabelsResponse) GetErrors() []LabelError`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *LabelsResponse) GetErrorsOk() (*[]LabelError, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *LabelsResponse) SetErrors(v []LabelError)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *LabelsResponse) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetLabels

`func (o *LabelsResponse) GetLabels() []Label`

GetLabels returns the Labels field if non-nil, zero value otherwise.

### GetLabelsOk

`func (o *LabelsResponse) GetLabelsOk() (*[]Label, bool)`

GetLabelsOk returns a tuple with the Labels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabels

`func (o *LabelsResponse) SetLabels(v []Label)`

SetLabels sets Labels field to given value.

### HasLabels

`func (o *LabelsResponse) HasLabels() bool`

HasLabels returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


