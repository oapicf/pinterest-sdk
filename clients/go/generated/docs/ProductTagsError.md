# ProductTagsError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **int32** |  | 
**Details** | Pointer to [**IneligibleProductTagsErrorDetails**](IneligibleProductTagsErrorDetails.md) | Details about which product tags failed eligibility check. | [optional] 
**Message** | **string** |  | 

## Methods

### NewProductTagsError

`func NewProductTagsError(code int32, message string, ) *ProductTagsError`

NewProductTagsError instantiates a new ProductTagsError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProductTagsErrorWithDefaults

`func NewProductTagsErrorWithDefaults() *ProductTagsError`

NewProductTagsErrorWithDefaults instantiates a new ProductTagsError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *ProductTagsError) GetCode() int32`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *ProductTagsError) GetCodeOk() (*int32, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *ProductTagsError) SetCode(v int32)`

SetCode sets Code field to given value.


### GetDetails

`func (o *ProductTagsError) GetDetails() IneligibleProductTagsErrorDetails`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *ProductTagsError) GetDetailsOk() (*IneligibleProductTagsErrorDetails, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *ProductTagsError) SetDetails(v IneligibleProductTagsErrorDetails)`

SetDetails sets Details field to given value.

### HasDetails

`func (o *ProductTagsError) HasDetails() bool`

HasDetails returns a boolean if a field has been set.

### GetMessage

`func (o *ProductTagsError) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ProductTagsError) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ProductTagsError) SetMessage(v string)`

SetMessage sets Message field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


