# CatalogsItemValidationIssues

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemNumber** | **int32** | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | 
**ItemId** | **NullableString** | The merchant-created unique ID that represents the product. | 
**Errors** | [**CatalogsItemValidationErrors**](CatalogsItemValidationErrors.md) |  | 
**Warnings** | [**CatalogsItemValidationWarnings**](CatalogsItemValidationWarnings.md) |  | 

## Methods

### NewCatalogsItemValidationIssues

`func NewCatalogsItemValidationIssues(itemNumber int32, itemId NullableString, errors CatalogsItemValidationErrors, warnings CatalogsItemValidationWarnings, ) *CatalogsItemValidationIssues`

NewCatalogsItemValidationIssues instantiates a new CatalogsItemValidationIssues object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemValidationIssuesWithDefaults

`func NewCatalogsItemValidationIssuesWithDefaults() *CatalogsItemValidationIssues`

NewCatalogsItemValidationIssuesWithDefaults instantiates a new CatalogsItemValidationIssues object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemNumber

`func (o *CatalogsItemValidationIssues) GetItemNumber() int32`

GetItemNumber returns the ItemNumber field if non-nil, zero value otherwise.

### GetItemNumberOk

`func (o *CatalogsItemValidationIssues) GetItemNumberOk() (*int32, bool)`

GetItemNumberOk returns a tuple with the ItemNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemNumber

`func (o *CatalogsItemValidationIssues) SetItemNumber(v int32)`

SetItemNumber sets ItemNumber field to given value.


### GetItemId

`func (o *CatalogsItemValidationIssues) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *CatalogsItemValidationIssues) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *CatalogsItemValidationIssues) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### SetItemIdNil

`func (o *CatalogsItemValidationIssues) SetItemIdNil(b bool)`

 SetItemIdNil sets the value for ItemId to be an explicit nil

### UnsetItemId
`func (o *CatalogsItemValidationIssues) UnsetItemId()`

UnsetItemId ensures that no value is present for ItemId, not even an explicit nil
### GetErrors

`func (o *CatalogsItemValidationIssues) GetErrors() CatalogsItemValidationErrors`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *CatalogsItemValidationIssues) GetErrorsOk() (*CatalogsItemValidationErrors, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *CatalogsItemValidationIssues) SetErrors(v CatalogsItemValidationErrors)`

SetErrors sets Errors field to given value.


### GetWarnings

`func (o *CatalogsItemValidationIssues) GetWarnings() CatalogsItemValidationWarnings`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CatalogsItemValidationIssues) GetWarningsOk() (*CatalogsItemValidationWarnings, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CatalogsItemValidationIssues) SetWarnings(v CatalogsItemValidationWarnings)`

SetWarnings sets Warnings field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


