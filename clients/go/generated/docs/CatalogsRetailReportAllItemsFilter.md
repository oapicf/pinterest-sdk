# CatalogsRetailReportAllItemsFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | Pointer to **string** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 
**ProductGroupId** | Pointer to **string** | Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. | [optional] 
**ReportType** | **string** |  | 

## Methods

### NewCatalogsRetailReportAllItemsFilter

`func NewCatalogsRetailReportAllItemsFilter(reportType string, ) *CatalogsRetailReportAllItemsFilter`

NewCatalogsRetailReportAllItemsFilter instantiates a new CatalogsRetailReportAllItemsFilter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailReportAllItemsFilterWithDefaults

`func NewCatalogsRetailReportAllItemsFilterWithDefaults() *CatalogsRetailReportAllItemsFilter`

NewCatalogsRetailReportAllItemsFilterWithDefaults instantiates a new CatalogsRetailReportAllItemsFilter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogId

`func (o *CatalogsRetailReportAllItemsFilter) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsRetailReportAllItemsFilter) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsRetailReportAllItemsFilter) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsRetailReportAllItemsFilter) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### GetProductGroupId

`func (o *CatalogsRetailReportAllItemsFilter) GetProductGroupId() string`

GetProductGroupId returns the ProductGroupId field if non-nil, zero value otherwise.

### GetProductGroupIdOk

`func (o *CatalogsRetailReportAllItemsFilter) GetProductGroupIdOk() (*string, bool)`

GetProductGroupIdOk returns a tuple with the ProductGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductGroupId

`func (o *CatalogsRetailReportAllItemsFilter) SetProductGroupId(v string)`

SetProductGroupId sets ProductGroupId field to given value.

### HasProductGroupId

`func (o *CatalogsRetailReportAllItemsFilter) HasProductGroupId() bool`

HasProductGroupId returns a boolean if a field has been set.

### GetReportType

`func (o *CatalogsRetailReportAllItemsFilter) GetReportType() string`

GetReportType returns the ReportType field if non-nil, zero value otherwise.

### GetReportTypeOk

`func (o *CatalogsRetailReportAllItemsFilter) GetReportTypeOk() (*string, bool)`

GetReportTypeOk returns a tuple with the ReportType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportType

`func (o *CatalogsRetailReportAllItemsFilter) SetReportType(v string)`

SetReportType sets ReportType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


