# CatalogsFeedProcessingResultFields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IngestionDetails** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  | 
**Status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | 
**ProductCounts** | [**NullableCatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  | 
**ValidationDetails** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  | 

## Methods

### NewCatalogsFeedProcessingResultFields

`func NewCatalogsFeedProcessingResultFields(ingestionDetails CatalogsFeedIngestionDetails, status CatalogsFeedProcessingStatus, productCounts NullableCatalogsFeedProductCounts, validationDetails CatalogsFeedValidationDetails, ) *CatalogsFeedProcessingResultFields`

NewCatalogsFeedProcessingResultFields instantiates a new CatalogsFeedProcessingResultFields object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsFeedProcessingResultFieldsWithDefaults

`func NewCatalogsFeedProcessingResultFieldsWithDefaults() *CatalogsFeedProcessingResultFields`

NewCatalogsFeedProcessingResultFieldsWithDefaults instantiates a new CatalogsFeedProcessingResultFields object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIngestionDetails

`func (o *CatalogsFeedProcessingResultFields) GetIngestionDetails() CatalogsFeedIngestionDetails`

GetIngestionDetails returns the IngestionDetails field if non-nil, zero value otherwise.

### GetIngestionDetailsOk

`func (o *CatalogsFeedProcessingResultFields) GetIngestionDetailsOk() (*CatalogsFeedIngestionDetails, bool)`

GetIngestionDetailsOk returns a tuple with the IngestionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIngestionDetails

`func (o *CatalogsFeedProcessingResultFields) SetIngestionDetails(v CatalogsFeedIngestionDetails)`

SetIngestionDetails sets IngestionDetails field to given value.


### GetStatus

`func (o *CatalogsFeedProcessingResultFields) GetStatus() CatalogsFeedProcessingStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsFeedProcessingResultFields) GetStatusOk() (*CatalogsFeedProcessingStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsFeedProcessingResultFields) SetStatus(v CatalogsFeedProcessingStatus)`

SetStatus sets Status field to given value.


### GetProductCounts

`func (o *CatalogsFeedProcessingResultFields) GetProductCounts() CatalogsFeedProductCounts`

GetProductCounts returns the ProductCounts field if non-nil, zero value otherwise.

### GetProductCountsOk

`func (o *CatalogsFeedProcessingResultFields) GetProductCountsOk() (*CatalogsFeedProductCounts, bool)`

GetProductCountsOk returns a tuple with the ProductCounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductCounts

`func (o *CatalogsFeedProcessingResultFields) SetProductCounts(v CatalogsFeedProductCounts)`

SetProductCounts sets ProductCounts field to given value.


### SetProductCountsNil

`func (o *CatalogsFeedProcessingResultFields) SetProductCountsNil(b bool)`

 SetProductCountsNil sets the value for ProductCounts to be an explicit nil

### UnsetProductCounts
`func (o *CatalogsFeedProcessingResultFields) UnsetProductCounts()`

UnsetProductCounts ensures that no value is present for ProductCounts, not even an explicit nil
### GetValidationDetails

`func (o *CatalogsFeedProcessingResultFields) GetValidationDetails() CatalogsFeedValidationDetails`

GetValidationDetails returns the ValidationDetails field if non-nil, zero value otherwise.

### GetValidationDetailsOk

`func (o *CatalogsFeedProcessingResultFields) GetValidationDetailsOk() (*CatalogsFeedValidationDetails, bool)`

GetValidationDetailsOk returns a tuple with the ValidationDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationDetails

`func (o *CatalogsFeedProcessingResultFields) SetValidationDetails(v CatalogsFeedValidationDetails)`

SetValidationDetails sets ValidationDetails field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


