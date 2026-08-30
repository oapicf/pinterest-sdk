# CatalogsRetailReportParametersReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedId** | **string** | ID of the feed entity. | 
**ProcessingResultId** | Pointer to **string** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] 
**ReportType** | **string** |  | 
**CatalogId** | Pointer to **string** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 
**ProductGroupId** | Pointer to **string** | Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. | [optional] 

## Methods

### NewCatalogsRetailReportParametersReport

`func NewCatalogsRetailReportParametersReport(feedId string, reportType string, ) *CatalogsRetailReportParametersReport`

NewCatalogsRetailReportParametersReport instantiates a new CatalogsRetailReportParametersReport object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailReportParametersReportWithDefaults

`func NewCatalogsRetailReportParametersReportWithDefaults() *CatalogsRetailReportParametersReport`

NewCatalogsRetailReportParametersReportWithDefaults instantiates a new CatalogsRetailReportParametersReport object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedId

`func (o *CatalogsRetailReportParametersReport) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsRetailReportParametersReport) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsRetailReportParametersReport) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### GetProcessingResultId

`func (o *CatalogsRetailReportParametersReport) GetProcessingResultId() string`

GetProcessingResultId returns the ProcessingResultId field if non-nil, zero value otherwise.

### GetProcessingResultIdOk

`func (o *CatalogsRetailReportParametersReport) GetProcessingResultIdOk() (*string, bool)`

GetProcessingResultIdOk returns a tuple with the ProcessingResultId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessingResultId

`func (o *CatalogsRetailReportParametersReport) SetProcessingResultId(v string)`

SetProcessingResultId sets ProcessingResultId field to given value.

### HasProcessingResultId

`func (o *CatalogsRetailReportParametersReport) HasProcessingResultId() bool`

HasProcessingResultId returns a boolean if a field has been set.

### GetReportType

`func (o *CatalogsRetailReportParametersReport) GetReportType() string`

GetReportType returns the ReportType field if non-nil, zero value otherwise.

### GetReportTypeOk

`func (o *CatalogsRetailReportParametersReport) GetReportTypeOk() (*string, bool)`

GetReportTypeOk returns a tuple with the ReportType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportType

`func (o *CatalogsRetailReportParametersReport) SetReportType(v string)`

SetReportType sets ReportType field to given value.


### GetCatalogId

`func (o *CatalogsRetailReportParametersReport) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsRetailReportParametersReport) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsRetailReportParametersReport) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsRetailReportParametersReport) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### GetProductGroupId

`func (o *CatalogsRetailReportParametersReport) GetProductGroupId() string`

GetProductGroupId returns the ProductGroupId field if non-nil, zero value otherwise.

### GetProductGroupIdOk

`func (o *CatalogsRetailReportParametersReport) GetProductGroupIdOk() (*string, bool)`

GetProductGroupIdOk returns a tuple with the ProductGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductGroupId

`func (o *CatalogsRetailReportParametersReport) SetProductGroupId(v string)`

SetProductGroupId sets ProductGroupId field to given value.

### HasProductGroupId

`func (o *CatalogsRetailReportParametersReport) HasProductGroupId() bool`

HasProductGroupId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


