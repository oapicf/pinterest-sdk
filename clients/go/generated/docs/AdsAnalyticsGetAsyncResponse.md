# AdsAnalyticsGetAsyncResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportStatus** | Pointer to [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] 
**Url** | Pointer to **NullableString** |  | [optional] 
**Size** | Pointer to **NullableFloat32** |  | [optional] 

## Methods

### NewAdsAnalyticsGetAsyncResponse

`func NewAdsAnalyticsGetAsyncResponse() *AdsAnalyticsGetAsyncResponse`

NewAdsAnalyticsGetAsyncResponse instantiates a new AdsAnalyticsGetAsyncResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdsAnalyticsGetAsyncResponseWithDefaults

`func NewAdsAnalyticsGetAsyncResponseWithDefaults() *AdsAnalyticsGetAsyncResponse`

NewAdsAnalyticsGetAsyncResponseWithDefaults instantiates a new AdsAnalyticsGetAsyncResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReportStatus

`func (o *AdsAnalyticsGetAsyncResponse) GetReportStatus() BulkReportingJobStatus`

GetReportStatus returns the ReportStatus field if non-nil, zero value otherwise.

### GetReportStatusOk

`func (o *AdsAnalyticsGetAsyncResponse) GetReportStatusOk() (*BulkReportingJobStatus, bool)`

GetReportStatusOk returns a tuple with the ReportStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportStatus

`func (o *AdsAnalyticsGetAsyncResponse) SetReportStatus(v BulkReportingJobStatus)`

SetReportStatus sets ReportStatus field to given value.

### HasReportStatus

`func (o *AdsAnalyticsGetAsyncResponse) HasReportStatus() bool`

HasReportStatus returns a boolean if a field has been set.

### GetUrl

`func (o *AdsAnalyticsGetAsyncResponse) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *AdsAnalyticsGetAsyncResponse) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *AdsAnalyticsGetAsyncResponse) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *AdsAnalyticsGetAsyncResponse) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### SetUrlNil

`func (o *AdsAnalyticsGetAsyncResponse) SetUrlNil(b bool)`

 SetUrlNil sets the value for Url to be an explicit nil

### UnsetUrl
`func (o *AdsAnalyticsGetAsyncResponse) UnsetUrl()`

UnsetUrl ensures that no value is present for Url, not even an explicit nil
### GetSize

`func (o *AdsAnalyticsGetAsyncResponse) GetSize() float32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *AdsAnalyticsGetAsyncResponse) GetSizeOk() (*float32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *AdsAnalyticsGetAsyncResponse) SetSize(v float32)`

SetSize sets Size field to given value.

### HasSize

`func (o *AdsAnalyticsGetAsyncResponse) HasSize() bool`

HasSize returns a boolean if a field has been set.

### SetSizeNil

`func (o *AdsAnalyticsGetAsyncResponse) SetSizeNil(b bool)`

 SetSizeNil sets the value for Size to be an explicit nil

### UnsetSize
`func (o *AdsAnalyticsGetAsyncResponse) UnsetSize()`

UnsetSize ensures that no value is present for Size, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


