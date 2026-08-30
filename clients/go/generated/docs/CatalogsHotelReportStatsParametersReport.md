# CatalogsHotelReportStatsParametersReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedId** | **string** | ID of the feed entity. | 
**ProcessingResultId** | Pointer to **string** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] 
**ReportType** | **string** |  | 
**CatalogId** | Pointer to **string** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 

## Methods

### NewCatalogsHotelReportStatsParametersReport

`func NewCatalogsHotelReportStatsParametersReport(feedId string, reportType string, ) *CatalogsHotelReportStatsParametersReport`

NewCatalogsHotelReportStatsParametersReport instantiates a new CatalogsHotelReportStatsParametersReport object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelReportStatsParametersReportWithDefaults

`func NewCatalogsHotelReportStatsParametersReportWithDefaults() *CatalogsHotelReportStatsParametersReport`

NewCatalogsHotelReportStatsParametersReportWithDefaults instantiates a new CatalogsHotelReportStatsParametersReport object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedId

`func (o *CatalogsHotelReportStatsParametersReport) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsHotelReportStatsParametersReport) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsHotelReportStatsParametersReport) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### GetProcessingResultId

`func (o *CatalogsHotelReportStatsParametersReport) GetProcessingResultId() string`

GetProcessingResultId returns the ProcessingResultId field if non-nil, zero value otherwise.

### GetProcessingResultIdOk

`func (o *CatalogsHotelReportStatsParametersReport) GetProcessingResultIdOk() (*string, bool)`

GetProcessingResultIdOk returns a tuple with the ProcessingResultId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessingResultId

`func (o *CatalogsHotelReportStatsParametersReport) SetProcessingResultId(v string)`

SetProcessingResultId sets ProcessingResultId field to given value.

### HasProcessingResultId

`func (o *CatalogsHotelReportStatsParametersReport) HasProcessingResultId() bool`

HasProcessingResultId returns a boolean if a field has been set.

### GetReportType

`func (o *CatalogsHotelReportStatsParametersReport) GetReportType() string`

GetReportType returns the ReportType field if non-nil, zero value otherwise.

### GetReportTypeOk

`func (o *CatalogsHotelReportStatsParametersReport) GetReportTypeOk() (*string, bool)`

GetReportTypeOk returns a tuple with the ReportType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportType

`func (o *CatalogsHotelReportStatsParametersReport) SetReportType(v string)`

SetReportType sets ReportType field to given value.


### GetCatalogId

`func (o *CatalogsHotelReportStatsParametersReport) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsHotelReportStatsParametersReport) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsHotelReportStatsParametersReport) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsHotelReportStatsParametersReport) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


