# CatalogsReportAllItemsFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | Pointer to **string** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 
**ReportType** | **string** |  | 

## Methods

### NewCatalogsReportAllItemsFilter

`func NewCatalogsReportAllItemsFilter(reportType string, ) *CatalogsReportAllItemsFilter`

NewCatalogsReportAllItemsFilter instantiates a new CatalogsReportAllItemsFilter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsReportAllItemsFilterWithDefaults

`func NewCatalogsReportAllItemsFilterWithDefaults() *CatalogsReportAllItemsFilter`

NewCatalogsReportAllItemsFilterWithDefaults instantiates a new CatalogsReportAllItemsFilter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogId

`func (o *CatalogsReportAllItemsFilter) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsReportAllItemsFilter) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsReportAllItemsFilter) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsReportAllItemsFilter) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### GetReportType

`func (o *CatalogsReportAllItemsFilter) GetReportType() string`

GetReportType returns the ReportType field if non-nil, zero value otherwise.

### GetReportTypeOk

`func (o *CatalogsReportAllItemsFilter) GetReportTypeOk() (*string, bool)`

GetReportTypeOk returns a tuple with the ReportType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportType

`func (o *CatalogsReportAllItemsFilter) SetReportType(v string)`

SetReportType sets ReportType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


