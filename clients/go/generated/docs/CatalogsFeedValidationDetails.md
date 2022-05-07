# CatalogsFeedValidationDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**CatalogsFeedValidationErrors**](CatalogsFeedValidationErrors.md) |  | 
**Warnings** | [**CatalogsFeedValidationWarnings**](CatalogsFeedValidationWarnings.md) |  | 

## Methods

### NewCatalogsFeedValidationDetails

`func NewCatalogsFeedValidationDetails(errors CatalogsFeedValidationErrors, warnings CatalogsFeedValidationWarnings, ) *CatalogsFeedValidationDetails`

NewCatalogsFeedValidationDetails instantiates a new CatalogsFeedValidationDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsFeedValidationDetailsWithDefaults

`func NewCatalogsFeedValidationDetailsWithDefaults() *CatalogsFeedValidationDetails`

NewCatalogsFeedValidationDetailsWithDefaults instantiates a new CatalogsFeedValidationDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetErrors

`func (o *CatalogsFeedValidationDetails) GetErrors() CatalogsFeedValidationErrors`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *CatalogsFeedValidationDetails) GetErrorsOk() (*CatalogsFeedValidationErrors, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *CatalogsFeedValidationDetails) SetErrors(v CatalogsFeedValidationErrors)`

SetErrors sets Errors field to given value.


### GetWarnings

`func (o *CatalogsFeedValidationDetails) GetWarnings() CatalogsFeedValidationWarnings`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CatalogsFeedValidationDetails) GetWarningsOk() (*CatalogsFeedValidationWarnings, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CatalogsFeedValidationDetails) SetWarnings(v CatalogsFeedValidationWarnings)`

SetWarnings sets Warnings field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


