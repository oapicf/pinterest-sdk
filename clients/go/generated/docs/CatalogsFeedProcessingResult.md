# CatalogsFeedProcessingResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **time.Time** |  | 
**Id** | **string** |  | 
**UpdatedAt** | **time.Time** |  | 
**IngestionDetails** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  | 
**Status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | 
**ProductCounts** | [**NullableCatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  | 
**ValidationDetails** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  | 

## Methods

### NewCatalogsFeedProcessingResult

`func NewCatalogsFeedProcessingResult(createdAt time.Time, id string, updatedAt time.Time, ingestionDetails CatalogsFeedIngestionDetails, status CatalogsFeedProcessingStatus, productCounts NullableCatalogsFeedProductCounts, validationDetails CatalogsFeedValidationDetails, ) *CatalogsFeedProcessingResult`

NewCatalogsFeedProcessingResult instantiates a new CatalogsFeedProcessingResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsFeedProcessingResultWithDefaults

`func NewCatalogsFeedProcessingResultWithDefaults() *CatalogsFeedProcessingResult`

NewCatalogsFeedProcessingResultWithDefaults instantiates a new CatalogsFeedProcessingResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreatedAt

`func (o *CatalogsFeedProcessingResult) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *CatalogsFeedProcessingResult) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *CatalogsFeedProcessingResult) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetId

`func (o *CatalogsFeedProcessingResult) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CatalogsFeedProcessingResult) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CatalogsFeedProcessingResult) SetId(v string)`

SetId sets Id field to given value.


### GetUpdatedAt

`func (o *CatalogsFeedProcessingResult) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *CatalogsFeedProcessingResult) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *CatalogsFeedProcessingResult) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.


### GetIngestionDetails

`func (o *CatalogsFeedProcessingResult) GetIngestionDetails() CatalogsFeedIngestionDetails`

GetIngestionDetails returns the IngestionDetails field if non-nil, zero value otherwise.

### GetIngestionDetailsOk

`func (o *CatalogsFeedProcessingResult) GetIngestionDetailsOk() (*CatalogsFeedIngestionDetails, bool)`

GetIngestionDetailsOk returns a tuple with the IngestionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIngestionDetails

`func (o *CatalogsFeedProcessingResult) SetIngestionDetails(v CatalogsFeedIngestionDetails)`

SetIngestionDetails sets IngestionDetails field to given value.


### GetStatus

`func (o *CatalogsFeedProcessingResult) GetStatus() CatalogsFeedProcessingStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogsFeedProcessingResult) GetStatusOk() (*CatalogsFeedProcessingStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogsFeedProcessingResult) SetStatus(v CatalogsFeedProcessingStatus)`

SetStatus sets Status field to given value.


### GetProductCounts

`func (o *CatalogsFeedProcessingResult) GetProductCounts() CatalogsFeedProductCounts`

GetProductCounts returns the ProductCounts field if non-nil, zero value otherwise.

### GetProductCountsOk

`func (o *CatalogsFeedProcessingResult) GetProductCountsOk() (*CatalogsFeedProductCounts, bool)`

GetProductCountsOk returns a tuple with the ProductCounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductCounts

`func (o *CatalogsFeedProcessingResult) SetProductCounts(v CatalogsFeedProductCounts)`

SetProductCounts sets ProductCounts field to given value.


### SetProductCountsNil

`func (o *CatalogsFeedProcessingResult) SetProductCountsNil(b bool)`

 SetProductCountsNil sets the value for ProductCounts to be an explicit nil

### UnsetProductCounts
`func (o *CatalogsFeedProcessingResult) UnsetProductCounts()`

UnsetProductCounts ensures that no value is present for ProductCounts, not even an explicit nil
### GetValidationDetails

`func (o *CatalogsFeedProcessingResult) GetValidationDetails() CatalogsFeedValidationDetails`

GetValidationDetails returns the ValidationDetails field if non-nil, zero value otherwise.

### GetValidationDetailsOk

`func (o *CatalogsFeedProcessingResult) GetValidationDetailsOk() (*CatalogsFeedValidationDetails, bool)`

GetValidationDetailsOk returns a tuple with the ValidationDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationDetails

`func (o *CatalogsFeedProcessingResult) SetValidationDetails(v CatalogsFeedValidationDetails)`

SetValidationDetails sets ValidationDetails field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


