# CatalogsReportFeedIngestionFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportType** | **string** |  | 
**FeedId** | **string** | ID of the feed entity. | 
**ProcessingResultId** | Pointer to **string** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] 

## Methods

### NewCatalogsReportFeedIngestionFilter

`func NewCatalogsReportFeedIngestionFilter(reportType string, feedId string, ) *CatalogsReportFeedIngestionFilter`

NewCatalogsReportFeedIngestionFilter instantiates a new CatalogsReportFeedIngestionFilter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsReportFeedIngestionFilterWithDefaults

`func NewCatalogsReportFeedIngestionFilterWithDefaults() *CatalogsReportFeedIngestionFilter`

NewCatalogsReportFeedIngestionFilterWithDefaults instantiates a new CatalogsReportFeedIngestionFilter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReportType

`func (o *CatalogsReportFeedIngestionFilter) GetReportType() string`

GetReportType returns the ReportType field if non-nil, zero value otherwise.

### GetReportTypeOk

`func (o *CatalogsReportFeedIngestionFilter) GetReportTypeOk() (*string, bool)`

GetReportTypeOk returns a tuple with the ReportType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportType

`func (o *CatalogsReportFeedIngestionFilter) SetReportType(v string)`

SetReportType sets ReportType field to given value.


### GetFeedId

`func (o *CatalogsReportFeedIngestionFilter) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsReportFeedIngestionFilter) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsReportFeedIngestionFilter) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### GetProcessingResultId

`func (o *CatalogsReportFeedIngestionFilter) GetProcessingResultId() string`

GetProcessingResultId returns the ProcessingResultId field if non-nil, zero value otherwise.

### GetProcessingResultIdOk

`func (o *CatalogsReportFeedIngestionFilter) GetProcessingResultIdOk() (*string, bool)`

GetProcessingResultIdOk returns a tuple with the ProcessingResultId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessingResultId

`func (o *CatalogsReportFeedIngestionFilter) SetProcessingResultId(v string)`

SetProcessingResultId sets ProcessingResultId field to given value.

### HasProcessingResultId

`func (o *CatalogsReportFeedIngestionFilter) HasProcessingResultId() bool`

HasProcessingResultId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


