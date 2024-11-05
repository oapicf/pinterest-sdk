# CatalogsHotelReportParametersReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportType** | Pointer to **string** |  | [optional] 
**FeedId** | **string** | ID of the feed entity. | 
**ProcessingResultId** | Pointer to **string** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] 
**CatalogId** | Pointer to **string** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 

## Methods

### NewCatalogsHotelReportParametersReport

`func NewCatalogsHotelReportParametersReport(feedId string, ) *CatalogsHotelReportParametersReport`

NewCatalogsHotelReportParametersReport instantiates a new CatalogsHotelReportParametersReport object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelReportParametersReportWithDefaults

`func NewCatalogsHotelReportParametersReportWithDefaults() *CatalogsHotelReportParametersReport`

NewCatalogsHotelReportParametersReportWithDefaults instantiates a new CatalogsHotelReportParametersReport object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReportType

`func (o *CatalogsHotelReportParametersReport) GetReportType() string`

GetReportType returns the ReportType field if non-nil, zero value otherwise.

### GetReportTypeOk

`func (o *CatalogsHotelReportParametersReport) GetReportTypeOk() (*string, bool)`

GetReportTypeOk returns a tuple with the ReportType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportType

`func (o *CatalogsHotelReportParametersReport) SetReportType(v string)`

SetReportType sets ReportType field to given value.

### HasReportType

`func (o *CatalogsHotelReportParametersReport) HasReportType() bool`

HasReportType returns a boolean if a field has been set.

### GetFeedId

`func (o *CatalogsHotelReportParametersReport) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsHotelReportParametersReport) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsHotelReportParametersReport) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### GetProcessingResultId

`func (o *CatalogsHotelReportParametersReport) GetProcessingResultId() string`

GetProcessingResultId returns the ProcessingResultId field if non-nil, zero value otherwise.

### GetProcessingResultIdOk

`func (o *CatalogsHotelReportParametersReport) GetProcessingResultIdOk() (*string, bool)`

GetProcessingResultIdOk returns a tuple with the ProcessingResultId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessingResultId

`func (o *CatalogsHotelReportParametersReport) SetProcessingResultId(v string)`

SetProcessingResultId sets ProcessingResultId field to given value.

### HasProcessingResultId

`func (o *CatalogsHotelReportParametersReport) HasProcessingResultId() bool`

HasProcessingResultId returns a boolean if a field has been set.

### GetCatalogId

`func (o *CatalogsHotelReportParametersReport) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsHotelReportParametersReport) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsHotelReportParametersReport) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsHotelReportParametersReport) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


